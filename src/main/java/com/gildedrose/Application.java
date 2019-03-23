package com.gildedrose;

        import com.gildedrose.entities.*;
        import com.gildedrose.repositories.ItemRepository;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.boot.CommandLineRunner;
        import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

    private final ItemRepository repository;

    @Autowired
    public Application(ItemRepository repository) {
        this.repository = repository;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {


       repository.deleteAll();

//        save a couple of basicItems
//        repository.save(new DexterityVest( 10, 20));
//        repository.save(new AgedBrie( 4, 1));
//        repository.save(new ElixirMongoose( 5, 7));
//        repository.save(new Sulfuras( 0, 80));
//        repository.save(new BackstagePasses( 15, 20));
//        repository.save(new BackstagePasses( 10, 49));
//        repository.save(new BackstagePasses( 5, 49));
//        // this conjured item does not work properly yet
//        repository.save(new ConjuredManaCake( 3, 6));
//        repository.save(new ConjuredManaCake( 5, 50));
//        repository.save(new ConjuredManaCake(7, 25));

        //fetch all basicItems
        System.out.println("BasicItems found with findAll()");
        System.out.println("-------------------------------");

        for(Item item : repository.findAll()){
            System.out.println(item);
            item.outputSample();
        }

    }
}
