package com.company.service;

import com.company.model.Item;

public class ShopService {

    public static int itemPriceCalculation(int value, Item item){
        int totalPrice;
        if(value == 1){
            totalPrice = item.getPrice() + 2;
        }else{
            if(item.getPrice() >= 3) totalPrice = item.getPrice() - 2;
            else totalPrice = 1;
        }
        return totalPrice;
    }
}
