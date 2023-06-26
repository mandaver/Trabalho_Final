package br.com.victor.payrollapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication // Indica que a classe é a classe principal da aplicação Spring Boot
@EnableFeignClients // Habilita o uso de clientes Feign para integração com as outras APIs
@EnableEurekaClient // Habilita o cliente Eureka para registro no servidor Eureka
public class PayrollApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(PayrollApiApplication.class, args); // Inicia a aplicação Spring Boot
    }

}
