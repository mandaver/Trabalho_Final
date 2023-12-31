package br.com.victor.userapi.services.impl;

import br.com.victor.userapi.domain.User;
import br.com.victor.userapi.repositories.UserRepository;
import br.com.victor.userapi.services.UserService;
import br.com.victor.userapi.services.exceptions.ObjectNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repository;
    private final Environment env;

    // Método para buscar um usuário por ID
    @Override
    public User findById(Long id) {
        log.info("USER_SERVICE ::: Get request on " + env.getProperty("local.server.port") + " port");
        return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Object not found")); //Chama o método findById do repositório para buscar um usuário pelo ID e Lança uma exceção ObjectNotFoundException se o usuário não for encontrado.
    }

    // Método para buscar todos os usuários
    @Override
    public List<User> findAll() {
        return repository.findAll();
    }
}
