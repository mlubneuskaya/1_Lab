package com.breakfast;

public class Apple extends Food {
    private String size;

    public Apple(String size) {
        super(FoodType.APPLE);
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
