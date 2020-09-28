package com.breakfast;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Food> breakfast = new ArrayList<>();
        for (String argument : args) {
            String[] parameters = argument.split("/");
            Class<?> someClass;
            try {
                someClass = Class.forName("com.breakfast." + parameters[0]);
                if(parameters.length == 1){
                    Constructor<?> constructor = someClass.getConstructor();
                    breakfast.add((Food)constructor.newInstance());
                } else if(parameters.length == 2){
                    Constructor<?> constructor = someClass.getConstructor(String.class);
                    breakfast.add((Food)constructor.newInstance(parameters[1]));
                }else{
                    Constructor<?> constructor = someClass.getConstructor(String.class, String.class);
                    breakfast.add((Food)constructor.newInstance(parameters[1], parameters[2]));
                }
            } catch (ClassNotFoundException | NoSuchMethodException |
                    InstantiationException | IllegalAccessException | InvocationTargetException exception) {
                exception.printStackTrace();
            }
        }
        for(Food piece: breakfast){
            System.out.println(piece.toString());
        }
    }
}
