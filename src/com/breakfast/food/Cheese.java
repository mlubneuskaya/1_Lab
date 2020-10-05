package com.breakfast.food;

import java.util.Map;


public class Cheese extends Food {
    public Cheese() {
        super("Cheese");
    }

    public boolean equals(Object object) {
        if (super.equals(object)) {
            return this.getName().equals(((Food) object).getName());
        }
        return false;
    }

    @Override
    public int calculateCalories(Map<String, Map<String, Integer>> caloriesTable) {
        Map<String, Integer> cheeseCalories = caloriesTable.get(this.getName());
        if (cheeseCalories.containsKey(this.getName().toLowerCase())) {
            return cheeseCalories.get(this.getName().toLowerCase());
        } else {
            System.out.println("cannot calculate calories of" + "\"" + this.getName().toLowerCase() + "\"");
            return 0;
        }
    }
}
