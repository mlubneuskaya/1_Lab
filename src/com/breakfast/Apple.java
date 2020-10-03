package com.breakfast;

import java.util.HashMap;

import static com.breakfast.FoodType.APPLE;

public class Apple extends Food {
    private String size;

    public Apple(String size) {
        super(APPLE);
        this.size = size;
    }
    public String toString(){
        return super.toString() + " size: " + size;
    }
    public boolean equals(Object object){
        if(super.equals(object)){
            return (this.getName() == ((Food)object).getName() &&
                    size.equals(((Apple) object).getSize()));
        }
        return false;
    }
    public String getSize(){
        return size;
    }
    public void setSize(String size){
        this.size = size;
    }

    @Override
    public int calculateCalories(HashMap<FoodType, HashMap<String, Integer>> caloriesTable) {
        HashMap<String, Integer> appleCalories = caloriesTable.get(this.getName());
        if(appleCalories.containsKey(this.getSize())){
            return appleCalories.get(this.getSize());
        }else{
            System.out.println("cannot calculate calories of such an apple");
            return 0;
        }
    }
}
