package br.com.victor.userapi.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.GenerationType.IDENTITY;
import static lombok.EqualsAndHashCode.Include;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity(name = "TB_USER") // Indica que a classe é uma entidade JPA e será mapeada para a tabela "TB_USER"
public class User {

    @Include
    @Id // Indica que o atributo é a chave primária da entidade
    @GeneratedValue(strategy = IDENTITY) // Define a estratégia de geração automática do valor da chave primária
    private Long id;
    private String name;
    private String email;
    private String password;
    private Double hourlyPrice;
}
