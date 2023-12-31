package br.com.victor.userapi;

import br.com.victor.userapi.domain.User;
import br.com.victor.userapi.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.util.List;

@SpringBootApplication
@EnableEurekaClient
public class UserApiApplication implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(UserApiApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception { // Ao executar a aplicação, é chamado o método run
        // Aqui, estamos inserindo um usuário inicial no banco de dados
        userRepository.saveAll(List.of(
                new User(null, "Victor Roberto", "victor@mail.com", "123", 30.0)
        ));
    }
}
