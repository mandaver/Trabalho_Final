package br.com.victor.userapi.resources.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class StandardError {

    private LocalDateTime timestamp; // Data e hora em que ocorreu o erro
    private String error; // Descrição do erro
    private Integer status; // Código de status HTTP relacionado ao erro
    private String path; // Caminho da solicitação que resultou no erro
}
