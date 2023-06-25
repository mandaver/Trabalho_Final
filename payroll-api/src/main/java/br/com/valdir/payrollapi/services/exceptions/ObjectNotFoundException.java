package br.com.valdir.payrollapi.services.exceptions;

public class ObjectNotFoundException extends RuntimeException{

    public ObjectNotFoundException(String message) {
        super(message); // Chama o construtor da superclasse RuntimeException com a mensagem de erro
    }
}