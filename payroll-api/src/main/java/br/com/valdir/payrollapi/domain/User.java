package br.com.victor.payrollapi.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter // Gera automaticamente o método getter para o atributo
@Setter // Gera automaticamente o método setter para o atributo
@AllArgsConstructor // Gera automaticamente um construtor com todos os argumentos
@NoArgsConstructor // Gera automaticamente um construtor vazio

public class User {

    private Long id; // ID do usuário
    private String name; // Nome do usuário
    private String email; // Email do usuário
    private String password; // Senha do usuário
    private Double hourlyPrice; // Preço por hora do usuário
}
