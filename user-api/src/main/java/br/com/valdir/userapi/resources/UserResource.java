package br.com.valdir.userapi.resources;
// Declaração da interface UserResource, que representa os recursos relacionados aos usuários na API
import br.com.valdir.userapi.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface UserResource {

    // Método para buscar um usuário pelo ID
    @GetMapping(value = "/{id}")
    ResponseEntity<User> findById(@PathVariable Long id);

    // Método para buscar todos os usuários
    @GetMapping
    ResponseEntity<List<User>> findAll();
}
