/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Tanushka Kommoju
 */

import java.util.Scanner;

public class BAC {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String gender;
        Double bac, genderbac;
        int totalAlcConsumed, time, weight;

        System.out.print("What is your weight? ");
        weight = input.nextInt();
        System.out.print("Are you male or female? ");
        gender = input.next();
        if (gender.equals("female") || gender.equals("Female")){
            genderbac =(0.66);
        }
        else{
            genderbac =(0.73);
        }
        System.out.print("What is the total alcohol you have consumed in ounces? ");
        totalAlcConsumed = input.nextInt();
        System.out.print("How many hours has it been since your last drink? ");
        time = input.nextInt();

        bac = ((totalAlcConsumed*5.14)/(weight*genderbac) - .015 * time);
        String str = String.format("%.2f", bac);
        if(bac >= .08){
            System.out.print("Your BAC is "+ str + "\nIt is not legal for you to drive.");
        }
        else{
            System.out.print("Your BAC is "+ str + "\nIt is legal for you to drive.");
        }

    }
}







