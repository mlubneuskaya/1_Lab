package com.breakfast.food;

import com.breakfast.calories.CaloriesCalculator;

import java.util.Objects;

@SuppressWarnings("unused")
public class Sandwich extends Food {

    private Filling filling1;
    private Filling filling2;
    private final Filling bread;


    public Sandwich(String filling1, String filling2, CaloriesCalculator caloriesCalculator) {
        this(new Filling(filling1, caloriesCalculator), new Filling(filling2, caloriesCalculator), caloriesCalculator);
    }

    public Sandwich(Filling filling1, Filling filling2, CaloriesCalculator caloriesCalculator){
        super("sandwich", caloriesCalculator);
        this.filling1 = filling1;
        this.filling2 = filling2;
        this.bread = new Filling("bread", caloriesCalculator);
    }

    public String toString() {
        return super.toString() + " with " + filling1 + " and " + filling2;
    }

    public Filling getFilling1() {
        return filling1;
    }

    public Filling getFilling2() {
        return filling2;
    }

    public void setFilling1(Filling filling) {
        this.filling1 = filling;
    }

    public void setFilling2(Filling filling) {
        this.filling2 = filling;
    }

    @Override
    public int calculateCalories() {
        return filling1.calculateCalories() + filling2.calculateCalories() + bread.calculateCalories();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Sandwich sandwich = (Sandwich) o;
        return Objects.equals(filling1, sandwich.filling1) &&
                Objects.equals(filling2, sandwich.filling2) &&
                Objects.equals(bread, sandwich.bread);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), filling1, filling2, bread);
    }
}
