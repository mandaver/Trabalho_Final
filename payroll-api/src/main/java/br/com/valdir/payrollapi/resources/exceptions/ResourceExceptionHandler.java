package br.com.valdir.payrollapi.resources.exceptions;

import br.com.valdir.payrollapi.services.exceptions.ObjectNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;

@ControllerAdvice // Classe responsável por tratar exceções em todos os controllers
public class ResourceExceptionHandler {

    @ExceptionHandler(ObjectNotFoundException.class) // Trata a exceção do tipo ObjectNotFoundException
    public ResponseEntity<StandardError> objectNotFound(ObjectNotFoundException ex, HttpServletRequest request) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                new StandardError(
                        LocalDateTime.now(), // Data e hora atual
                        ex.getMessage(), // Mensagem da exceção
                        HttpStatus.NOT_FOUND.value(), // Código HTTP de resposta
                        request.getRequestURI()) // URI da requisição
        );
    }
}
