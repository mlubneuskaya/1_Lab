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
    public String toString(){
        String info = super.toString();
        info += " filling №1: " + filling1 + ", filling №2: " + filling2;
        return info;
    }
    public boolean equals(Object object){
        if(super.equals(object)){
            return ( this.getName() == ((Food)object).getName()
                    &&(filling1.equals(((Sandwich) object).getFilling1())
                    && filling2.equals(((Sandwich) object).getFilling2())));
        }
        return false;
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

    @Override
    public int calculateCalories() {
        int calories;
        return 0;
    }
}
