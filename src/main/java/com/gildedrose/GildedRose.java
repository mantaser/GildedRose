package com.gildedrose;

// inventory tracking system
// problem : goods are constantly degrading in quality as they approach their sell by date

// Your task is to add the new feature to our system so that we can begin selling a new category of items.

//	- All items have a SellIn value which denotes the number of days we have to sell the item
//  - All items have a Quality value which denotes how valuable the item is
//  - At the end of each day our system lowers both values for every item

//    - Once the sell by date has passed, Quality degrades twice as fast
//    - The Quality of an item is never negative
//    - "Aged Brie" actually increases in Quality the older it gets
//    - The Quality of an item is never more than 50
//    - "Sulfuras", being a legendary item, never has to be sold or decreases in Quality
//    - "Backstage passes", like aged brie, increases in Quality as its SellIn value approaches;
//    Quality increases by 2 when there are 10 days or less and by 3 when there are 5 days or less but
//    Quality drops to 0 after the concert

//We have recently signed a supplier of conjured items. This requires an update to our system:
//- "Conjured" items degrade in Quality twice as fast as normal items

//    Feel free to make any changes to the UpdateQuality method and add any new code as long as everything
//    still works correctly. However, do not alter the Item class or Items property as those belong to the
//    goblin in the corner who will insta-rage and one-shot you as he doesn't believe in shared code
//    ownership (you can make the UpdateQuality method and Items property static if you like, we'll cover
//    for you).
//
//    Just for clarification, an item can never have its Quality increase above 50, however "Sulfuras" is a
//    legendary item and as such its Quality is 80 and it never alters.
class GildedRose {
    BasicItem[] items;

    public GildedRose(BasicItem[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {

            // Applies to: Conjured, Dexterity, Elixir
            if (!items[i].name.equals("Aged Brie")
                    && !items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (items[i].quality > 0) {
                    // Degrading QUALITY by -1 for items: Conjured, Dexterity, Elixir
                    if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                        items[i].quality = items[i].quality - 1;
                    }
                }

                // Applies to: AgedBrie, Backstage, Conjured, Dexterity and Elixir
            } else {
                // Increases QUALITY by 1
                if (items[i].quality < 50) {
                    items[i].quality = items[i].quality + 1;

                    // Increases Backstage QUALITY by 1 if days is less than 10 and by 2 if days is less than 5
                    if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (items[i].sellIn < 11) {
                            if (items[i].quality < 50) {
                                items[i].quality = items[i].quality + 1;
                            }
                        }

                        if (items[i].sellIn < 6) {
                            if (items[i].quality < 50) {
                                items[i].quality = items[i].quality + 1;
                            }
                        }
                    }
                }
            }

            // Applies to: AgedBrie, Backstage, Conjured, Dexterity and Elixir. Degrading SellIn by -1
            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                items[i].sellIn = items[i].sellIn - 1;
            }

            // sellIn < 0
            if (items[i].sellIn < 0) {
                if (!items[i].name.equals("Aged Brie")) {
                    if (!items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (items[i].quality > 0) {
                            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                                items[i].quality = items[i].quality - 1;
                            }
                        }

                    } else {
                        items[i].quality = 0;
                    }

                // Applies to Aged Brie
                } else {
                    if (items[i].quality < 50) {
                        items[i].quality = items[i].quality + 1;
                    }
                }
            }
        }
    }
}