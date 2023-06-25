package br.com.valdir.apigateway;

//  Importações das classes necessárias do Spring Boot e do Netflix Eureka para serem utilizadas neste arquivo.
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiGatewayApplication.class, args);
        //  Inicia a aplicação Spring Boot
    }

}