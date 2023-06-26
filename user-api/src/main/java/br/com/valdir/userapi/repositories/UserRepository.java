package br.com.victor.userapi.repositories;

import br.com.victor.userapi.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Indica que a interface é um repositório
public interface UserRepository extends JpaRepository<User, Long> {
}
