package com.breakfast.food;


public class Sandwich extends Food {

    private Filling filling1;
    private Filling filling2;
    private final Filling bread;

    public Sandwich(String filling1, String filling2) {
        super("sandwich");
        this.filling1 = new Filling(filling1);
        this.filling2 = new Filling(filling2);
        this.bread = new Filling("bread");
    }

    public String toString() {
        String info = super.toString();
        info += " filling №1: " + filling1 + ", filling №2: " + filling2;
        return info;
    }

    public boolean equals(Object object) {
        if (super.equals(object)) {
            return (this.getName().equals(((Food) object).getName())
                    && (filling1.equals(((Sandwich) object).getFilling1())
                    && filling2.equals(((Sandwich) object).getFilling2())));
        }
        return false;
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
}
