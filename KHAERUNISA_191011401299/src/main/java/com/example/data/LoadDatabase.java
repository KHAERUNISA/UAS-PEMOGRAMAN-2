package com.example.data;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(DataRepository repository) {
        return args -> {
            log.info("Preloading" + repository.save(new Data(1234567L, "Icha","Bogor",
                    "HRD", "0 %", 4300000L )));
            log.info("Preloading" + repository.save(new Data(1234567L, "Febri", "Bobor",
                    "Operator", "0 %", 4500000L )));
            log.info("Preloading" + repository.save(new Data(1242465L, "Nisa", "Bogor",
                    "HRD", "2.5%", 5000000L )));
        };
    }
}
