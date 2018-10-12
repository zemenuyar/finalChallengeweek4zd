package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // write your code here
        //i) create an Arraylist list with the following colors: red, brown, yellow and orange.

        ArrayList<String> colores = new ArrayList<>();
        colores.add("red");
        colores.add("brown");
        colores.add("yellow");
        colores.add("orange");

        //ii) Create another Array list with this drinks: pumpkin spiced latte, chai tea, hot cocoa.

        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("pumpkin spiced latte");
        drinks.add("chai tea");
        drinks.add("hot cocoa");

        //iii) prompt the user for a temperature input in Fahrenheit.
        //if the user enters a number from 45-70, output a massage with a Randomly selected color and Randomly selected drink.
        // if the user enters a number less than 45, let them know it`s to cold.
        // if the user enters a number greater than 70, let them know it`s to warm.

        Random rand = new Random();
        int index = rand.nextInt(colores.size() - 1);
        String colores4 = colores.get(index);
        System.out.println("\n " + colores4 + " ");

        //Randomly selected string form the Array list.
        Random Rand = new Random();
        int temp = Rand.nextInt(drinks.size() - 1);
        String dirnks3 = drinks.get(temp);
        System.out.println("\n " + dirnks3 + " ");


        //getting inmput



        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number in Fahrenheit");
        int Fahrenheit = in.nextInt();
        System.out.println();


        String userInput = "";

        do {


           System.out.println("Enter a number in Fahrenheit");
             Fahrenheit = in.nextInt();
            if (Fahrenheit >= 45 && Fahrenheit <= 70) {
                System.out.println("Today`s weather is a perfact fall a day for a cup of "+ dirnks3 + " The colore of the the lives are " + colores4);
            } else if (Fahrenheit>71) {
                System.out.println("The weather is a bit warm for fall.");
            } else if (Fahrenheit <44){
                System.out.println("The weather is a bit chilly for fall." );
            }
            System.out.println("would you like to enter another temperature Y(yes) or N(no):");
            userInput = in.next();
        } while (!userInput.equalsIgnoreCase("no"));

    }


}




















