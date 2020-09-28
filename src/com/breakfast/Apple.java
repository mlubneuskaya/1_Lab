package com.breakfast;

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
    public String getSize(){
        return size;
    }
    public void setSize(String size){
        this.size = size;
    }
}
