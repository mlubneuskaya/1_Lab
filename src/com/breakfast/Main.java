package com.breakfast;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        List<Food> breakfast = waiter.getBreakfast(args);
        for(Food piece: breakfast){
            System.out.println(piece.toString());
        }
    }
}
