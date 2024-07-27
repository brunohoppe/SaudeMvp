package com.proj.saudemvp;

import com.proj.saudemvp.model.Remedio;
import com.proj.saudemvp.repository.RemedioRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {

    @Bean
    CommandLineRunner initDatabase(RemedioRepository repository) {

        return args -> {
//            repository.save(new Remedio("Tylenol", "asd"));
//            repository.save(new Remedio("Tylenol2", "dasd"));
        };
    }
}
