package com.vnzit.sampledagger.repository;

import com.vnzit.sampledagger.model.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by quangson8128 on 2/15/16.
 */
public class Api {
    public final long timeCreated;

    public Api() {
        this.timeCreated = System.currentTimeMillis();
    }

    public List<Item> getAllItem() {
        return getItems(10);
    }

    public Item findOne() {
        return genItem();
    }


    private List<Item> getItems(int count) {
        List<Item> result = new ArrayList<>();
        for (int i = 0; i < count; ++i) {
            result.add(genItem());
        }
        return result;
    }

    private Item genItem() {
        return  new Item("title", "content");
    }
}
