package com.breakfast;

import java.util.HashMap;

import static com.breakfast.FoodType.CHEESE;

public class Cheese extends Food {
    public Cheese(){
        super(CHEESE);
    }
    public boolean equals(Object object){
        if(super.equals(object)){
            return this.getName() == ((Food)object).getName();
        }
        return false;
    }

    @Override
    public int calculateCalories(HashMap<FoodType, HashMap<String, Integer>> caloriesTable) {
        HashMap<String, Integer> cheeseCalories = caloriesTable.get(this.getName());
        if(cheeseCalories.containsKey(this.getName().toString().toLowerCase())){
            return cheeseCalories.get(this.getName().toString().toLowerCase());
        }else{
            System.out.println("cannot calculate calories of" + "\"" + this.getName().toString().toLowerCase() + "\"");
            return 0;
        }
    }
}
