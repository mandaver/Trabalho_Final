package br.com.victor.userapi.resources.exceptions;

// Importação da classe de exceção específica
import br.com.victor.userapi.services.exceptions.ObjectNotFoundException;

// Importação das classes do Spring Framework para tratamento de exceções HTTP
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

// Importação das classes do Servlet para lidar com solicitações HTTP
import javax.servlet.http.HttpServletRequest;

// Importação da classe para trabalhar com data e hora
import java.time.LocalDateTime;

@ControllerAdvice // Indica que é uma classe de tratamento de exceções global para os controladores
public class ResourceExceptionHandler {

    @ExceptionHandler(ObjectNotFoundException.class) // Indica que este método trata a exceção do tipo ObjectNotFoundException
    public ResponseEntity<StandardError> objectNotFound(ObjectNotFoundException ex, HttpServletRequest request) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                new StandardError(
                        LocalDateTime.now(),
                        ex.getMessage(),
                        HttpStatus.NOT_FOUND.value(),
                        request.getRequestURI())
        );
    }
}
