/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author minhl
 */
public class Cart {
     private Map<String, CartItem> items;

    public Cart() {
        items = new HashMap<>();
    }

    public void addProduct(Product product) {
        if (items.containsKey(product.getComicid())) {
            items.get(product.getComicid()).setQuantity(items.get(product.getComicid()).getQuantity() + 1);
        } else {
            items.put(product.getComicid(), new CartItem(product, 1));
        }
    }

    public void removeProduct(String comicId) {
        items.remove(comicId);
    }

    public float getTotal() {
        float total = 0;
        for (CartItem item : items.values()) {
            total += item.getProduct().getPrice() * item.getQuantity();
        }
        return total;
    }

    // ... Other necessary methods

    public Map<String, CartItem> getItems() {
        return items;
    }
}
