package com.breakfast;

public class Apple extends Food {
    private String size;

    public Apple(FoodType type, String size) {
        super(type);
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
