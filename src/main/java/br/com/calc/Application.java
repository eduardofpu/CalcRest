package br.com.calc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/*
 * 
http://localhost:8080/calculadora/soma?valA=2&valB=3
http://localhost:8080/calculadora/subtrai?valA=2&valB=3
http://localhost:8080/calculadora/multiplica?valA=2&valB=3
http://localhost:8080/calculadora/divide?valA=2&valB=3

*/
@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan(basePackages = {"br.com.calc"})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}