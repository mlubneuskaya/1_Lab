package com.breakfast;

import java.util.HashMap;

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
    public int calculateCalories(HashMap<FoodType, HashMap<String, Integer>> caloriesTable) {
        int calories = 0;
        HashMap<String, Integer> sandwichCalories = caloriesTable.get(this.getName());
        if(sandwichCalories.containsKey(this.getFilling1()) && sandwichCalories.containsKey(this.getFilling2())){
            calories += sandwichCalories.get(this.getFilling1()) + sandwichCalories.get(this.getFilling2());
        }else{
            System.out.println("cannot calculate calories of such a sandwich");
            return 0;
        }
        return calories + 320; // + calories of sandwich bread
    }
}
