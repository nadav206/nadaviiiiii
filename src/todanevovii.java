package com.company;
import java.util.Scanner;
public class todanevovii {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double bagrot, psycomtry, part1, part2, finalgrade = 0;
        System.out.println("enter your bagrot avreg");
        bagrot = input.nextDouble();
        System.out.println("what is your psycomtry score");
        psycomtry = input.nextDouble();
        System.out.println("enter your quantitative part");
        part1 = input.nextDouble();
        System.out.println("enter your english part");
        part2 = input.nextDouble();
        if (bagrot >= 102) {
            System.out.println("Welcome to the collage");
        }
        else if (psycomtry >= 700 & part1 >= 145 & part2 >= 120)
            System.out.println("Welcome to the collage");
        else{
            finalgrade = (psycomtry * 0.8) + (bagrot / 1.2);
            System.out.println("your final grade is" +  finalgrade);
            if (finalgrade >= 600)
                System.out.println("Welcome to the collage");
            else
                System.out.println("Sorry but we're looking for something else");
        }
    }
}
