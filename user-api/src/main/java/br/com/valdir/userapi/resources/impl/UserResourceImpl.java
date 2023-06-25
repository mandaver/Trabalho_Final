package br.com.valdir.userapi.resources.impl;

import br.com.valdir.userapi.domain.User;
import br.com.valdir.userapi.resources.UserResource;
import br.com.valdir.userapi.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api/users") // Define o mapeamento da URL base para as operações relacionadas aos usuários
public class UserResourceImpl implements UserResource {

    private final UserService service; // Referência para o serviço UserService

    @Override
    public ResponseEntity<User> findById(Long id) {
        return ResponseEntity.ok().body(service.findById(id)); // Retorna a resposta HTTP com o usuário encontrado pelo ID
    }

    @Override
    public ResponseEntity<List<User>> findAll() {
        return ResponseEntity.ok().body(service.findAll()); // Retorna a resposta HTTP com a lista de todos os usuários
    }
}