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
    public int calculateCalories() {
        return 0;
    }
}
