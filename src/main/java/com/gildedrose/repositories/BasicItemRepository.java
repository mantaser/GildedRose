package com.gildedrose.repositories;

import com.gildedrose.entities.BasicItem;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BasicItemRepository extends MongoRepository<BasicItem, String> {

    BasicItem findByName(String name);

}
