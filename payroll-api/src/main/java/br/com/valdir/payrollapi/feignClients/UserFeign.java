package br.com.valdir.payrollapi.feignClients;

import br.com.valdir.payrollapi.domain.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "user-api") // Cliente Feign para integração com a API de usuários
public interface UserFeign {

    @GetMapping(value = "/api/users/{id}") // Requisição GET para obter um usuário por ID
    ResponseEntity<User> findById(@PathVariable Long id);

    @GetMapping // Requisição GET para obter todos os usuários
    ResponseEntity<List<User>> findAll();
}