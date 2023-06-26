package br.com.victor.userapi.services;

import br.com.victor.userapi.domain.User;

import java.util.List;

public interface UserService {
    User findById(Long id);    // Método para buscar um usuário por ID
    List<User> findAll();   // Método para buscar todos os usuários
}
