package UmbrellaCorp.UmbrellaTravel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("UmbrellaCorp.UmbrellaTravel.ReiseVerwaltung")
public class UmbrellaTravelApplication 
{
	public static void main(String[] args) {
		SpringApplication.run(UmbrellaTravelApplication.class, args);
	}

}
