/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Inventories;

import java.util.HashMap;

/**
 *
 * @author halder.r
 */
public class FoodSuppliesInMilitaryCampInventory {
    private HashMap<String, Integer> foodInventory;
    
    public FoodSuppliesInMilitaryCampInventory(){
        foodInventory = new HashMap<>();
    }

    public HashMap<String, Integer> getFoodInventory() {
        return foodInventory;
    }

    public void addToFoodInventory(String foodName, Integer quantity) {
        this.foodInventory.put(foodName, quantity);
    }
}
