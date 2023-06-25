package br.com.valdir.payrollapi.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter // Gera automaticamente o método getter para o atributo
@Setter // Gera automaticamente o método setter para o atributo
@AllArgsConstructor // Gera automaticamente um construtor com todos os argumentos

public class Payroll {

    private String workerName; // Nome do trabalhador
    private String description; // Descrição da folha de pagamento
    private Double hourlyPrice; // Preço por hora do trabalhador
    private Double workedHours; // Horas trabalhadas pelo trabalhador
    private Double totalPayment; // Pagamento total da folha de pagamento
}