package com.gildedrose.repositories;

import com.gildedrose.entities.Item;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ItemRepository extends MongoRepository<Item, String> {

    Item findByName(String name);

}
