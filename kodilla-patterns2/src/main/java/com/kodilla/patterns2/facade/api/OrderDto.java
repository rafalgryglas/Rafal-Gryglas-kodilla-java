package com.kodilla.patterns2.facade.api;

import java.util.ArrayList;
import java.util.List;

public class OrderDto {
    public final List<ItemDto> items = new ArrayList<>();

    public void addItem (ItemDto item) {
        items.add(item);
    }
    public List <ItemDto> getItems() {
        return items;
    }
}
