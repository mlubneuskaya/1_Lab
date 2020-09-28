package com.breakfast;

import static com.breakfast.FoodType.SANDWICH;

public class Sandwich extends Food {

    private String filling1;
    private String filling2;

    public Sandwich(String filling1, String filling2){
        super(SANDWICH);
        this.filling1 = filling1;
        this.filling2 = filling2;
    }
    public String getFilling1(){
        return filling1;
    }
    public String getFilling2(){
        return filling2;
    }
    public void setFilling1(String filling1){
        this.filling1 = filling1;
    }
    public void setFilling2(String filing2){
        this.filling2 = filling2;
    }
}
