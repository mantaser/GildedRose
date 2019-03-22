package com.gildedrose;

        import com.gildedrose.entities.BasicItem;
        import com.gildedrose.models.*;
        import com.gildedrose.repositories.BasicItemRepository;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.boot.CommandLineRunner;
        import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

    private final BasicItemRepository repository;

    @Autowired
    public Application(BasicItemRepository repository) {
        this.repository = repository;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        repository.deleteAll();
//
        //save a couple of basicItems
//        repository.save(new BasicItem("+5 Dexterity Vest", 10, 20));
        repository.save(new AgedBrie("Aged Brie", 4, 1));
//        repository.save(new BasicItem("Elixir of the Mongoose", 5, 7));
//        repository.save(new BasicItem("Sulfuras, Hand of Ragnaros", 0, 80));
//        repository.save(new BasicItem("Backstage passes to a TAFKAL80ETC concert", 15, 20));
//        repository.save(new BasicItem("Conjured Mana Cake", 3, 6));
//        repository.save(new DexterityVest("+5 Dexterity Vest", 10, 20));
//        repository.save(new AgedBrie("Aged Brie", 4, 1));
//        repository.save(new ElixirMongoose("Elixir of the Mongoose", 5, 7));
//        repository.save(new Sulfuras("Sulfuras, Hand of Ragnaros", 0, 80));
//        repository.save(new BackstagePasses("Backstage passes to a TAFKAL80ETC concert", 15, 20));
//        repository.save(new ConjuredManaCake("Conjured Mana Cake", 3, 6));

        //fetch all basicItems
        System.out.println("BasicItems found with findAll()");
        System.out.println("-------------------------------");
        for(BasicItem item : repository.findAll()){
            System.out.println(item);
        }
        System.out.println();

        // fetch an individual item
        System.out.println("BasicItems found with findByName('Aged Brie')");
        System.out.println("-------------------------------");
        System.out.println(repository.findByName("Elixir of the Mongoose"));
        System.out.println();


    }
}
