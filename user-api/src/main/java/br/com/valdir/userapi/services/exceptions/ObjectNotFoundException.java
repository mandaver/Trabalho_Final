package br.com.valdir.userapi.services.exceptions;

public class ObjectNotFoundException extends RuntimeException{ // Construtor que recebe uma mensagem de erro e repassa para a superclasse RuntimeException

    public ObjectNotFoundException(String message) {
        super(message);
    }
}
