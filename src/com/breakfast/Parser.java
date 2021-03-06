package com.breakfast;

import com.breakfast.food.Food;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;


public class Parser {
    public List<Food> parseCommandLineArguments(String[] arguments) {
        List<Food> breakfast = new ArrayList<>();
        for (String argument : arguments) {
            if (argument.charAt(0) != '-') {
                String[] parameters = argument.split("/");
                Class<?> someClass;
                try {
                    someClass = Class.forName("com.breakfast.food." + parameters[0]);
                    if (parameters.length == 1) {
                        Constructor<?> constructor = someClass.getConstructor();
                        breakfast.add((Food) constructor.newInstance());
                    } else if (parameters.length == 2) {
                        Constructor<?> constructor = someClass.getConstructor(String.class);
                        breakfast.add((Food) constructor.newInstance(parameters[1]));
                    } else {
                        Constructor<?> constructor = someClass.getConstructor(String.class, String.class);
                        breakfast.add((Food) constructor.newInstance(parameters[1], parameters[2]));
                    }
                } catch (ClassNotFoundException | NoSuchMethodException |
                        InstantiationException | IllegalAccessException | InvocationTargetException exception) {
                    System.out.println("cannot find class" + " " + "\"" + parameters[0] + "\" or matching constructor");
                }
            }
        }
        return breakfast;
    }
}
