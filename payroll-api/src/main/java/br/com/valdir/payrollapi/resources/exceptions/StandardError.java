package br.com.victor.payrollapi.resources.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter // Gera automaticamente o método getter para os atributos da classe
@AllArgsConstructor // Gera automaticamente um construtor com todos os argumentos
public class StandardError {

    private LocalDateTime timestamp; // Data e hora do erro
    private String error; // Mensagem de erro
    private Integer status; // Código HTTP de resposta
    private String path; // Caminho da requisição que gerou o erro
}
