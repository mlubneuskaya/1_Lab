package com.breakfast;

public abstract class Food {
    FoodType name;
    public Food(FoodType type){
        name = type;
    }
    public boolean equals(Object object){
        if(!(object instanceof Food)){
            return false;
        }
        for(FoodType type: FoodType.values()){
            if(((Food)object).getName() == type){
                return true;
            }
        }
        return false;
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
