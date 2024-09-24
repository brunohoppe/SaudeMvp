package com.proj.saudemvp;

import com.proj.saudemvp.model.Alergia;
import com.proj.saudemvp.model.Remedio;
import com.proj.saudemvp.model.TiposAlergia;
import com.proj.saudemvp.repository.AlergiaRepository;
import com.proj.saudemvp.repository.RemedioRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {

    @Bean
    CommandLineRunner initDatabase(RemedioRepository remedioRepository, AlergiaRepository alergiaRepository) {

        return args -> {
            remedioRepository.save(new Remedio("Tylenol", "asd"));
            remedioRepository.save(new Remedio("Tylenol2", "dasd"));
            alergiaRepository.save(new Alergia("AS", TiposAlergia.MEDICAMENTOSA));
            alergiaRepository.save(new Alergia("Dipirona", TiposAlergia.MEDICAMENTOSA));
        };
    }
}
