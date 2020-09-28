package com.breakfast;

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
}
