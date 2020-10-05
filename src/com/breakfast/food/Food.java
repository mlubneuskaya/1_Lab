package com.breakfast.food;

public abstract class Food implements Nutritious {
    private final FoodType name;
    public Food(FoodType type){
        name = type;
    }
    public boolean equals(Object object){
        return object instanceof Food;
    }
    public int hashCode(){
        return this.toString().hashCode();
    }
    public  FoodType getName(){
        return this.name;
    }
    public String toString(){
        String info =  this.name.toString();
        info = info.charAt(0)  + info.substring(1).toLowerCase();
        return info;
    }
}
