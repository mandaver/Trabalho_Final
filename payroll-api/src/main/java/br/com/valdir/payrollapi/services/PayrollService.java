package br.com.victor.payrollapi.services;

import br.com.victor.payrollapi.domain.Payroll;
import br.com.victor.payrollapi.feignClients.UserFeign;
import br.com.victor.payrollapi.services.exceptions.ObjectNotFoundException;
import feign.FeignException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.Objects;

@RequiredArgsConstructor // Gera automaticamente um construtor com os argumentos obrigatórios
@Slf4j // Gera automaticamente um logger SLF4J para a classe
@Service // Indica que a classe é um serviço
public class PayrollService {

    private final Environment env; // Acesso ao ambiente da aplicação
    private final UserFeign feign; // Cliente Feign para integração com a API de usuários

    public Payroll getPayment(Long workerId, Payroll payroll) {
        log.info("PAYROLL_SERVICE ::: Get request on " + env.getProperty("local.server.port") + " port");
        // Registro de uma mensagem de log informativa

        try {
            var user = feign.findById(workerId).getBody(); // Chamada para obter um usuário pelo ID
            if (Objects.nonNull(user)) {
                // Se o usuário existir, cria um objeto de folha de pagamento com os dados do usuário e da folha de pagamento recebida
                return new Payroll(
                        user.getName(),
                        payroll.getDescription(),
                        user.getHourlyPrice(),
                        payroll.getWorkedHours(),
                        payroll.getWorkedHours() * user.getHourlyPrice()
                );
            }
        } catch (FeignException.NotFound ex) {
            // Trata a exceção específica quando o usuário não é encontrado
            throw new ObjectNotFoundException("Object not found");
        } catch (Exception ex) {
            // Trata outras exceções genéricas
            throw new IllegalArgumentException("Illegal argument exception");
        }

        return null; // Retorna nulo caso não seja possível obter o pagamento
    }
}
