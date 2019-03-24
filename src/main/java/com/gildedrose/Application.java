package com.gildedrose;

import com.gildedrose.repositories.ItemRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableAsync
public class Application{

    private final ItemRepository repository;

    public Application(ItemRepository repository) {
        this.repository = repository;
    }


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

    }



}
