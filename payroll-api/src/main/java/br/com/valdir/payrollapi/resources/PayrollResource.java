package br.com.valdir.payrollapi.resources;

import br.com.valdir.payrollapi.domain.Payroll;
import br.com.valdir.payrollapi.services.PayrollService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor // Gera automaticamente um construtor com os argumentos obrigatórios
@RestController // Indica que a classe é um controlador REST
@RequestMapping(value = "/api/payments") // Mapeia as URLs que serão tratadas por este controlador

public class PayrollResource {

    private final PayrollService service; // Injeção de dependência do serviço de folha de pagamento

    @GetMapping(value = "/{workerId}") // Mapeia a URL para a requisição GET
    public ResponseEntity<Payroll> getPayment(@PathVariable Long workerId, @RequestBody Payroll payment) {
        // Método que trata a requisição GET para obter o pagamento de um trabalhador
        return ResponseEntity.ok().body(service.getPayment(workerId, payment)); // Retorna o pagamento obtido
    }
}