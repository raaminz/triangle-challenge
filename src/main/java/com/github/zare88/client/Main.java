package com.github.zare88.client;

import com.github.zare88.model.shape.Shape;
import com.github.zare88.service.ShapeFactory;

import java.util.Scanner;

/**
 * @author ramin zare
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Triangle Identifier Program !");
        while(true) {
            System.out.println("Please enter 3 sides of your imaginary triangle then I'll say you what is the type of triangle");
            System.out.println("Enter Side X:");
            int x = scanner.nextInt();
            System.out.println("Enter Side Y:");
            int y = scanner.nextInt();
            System.out.println("Enter Side Z:");
            int z = scanner.nextInt();

            int[] sides = {x, y, z};
            Shape type = ShapeFactory.getInstance().makeNewShape(sides);
            printSeparator();
            System.out.printf("It's %s%n", type.name());
            printSeparator();
            System.out.println("Do you want to continue ? (Y/N)");
            //TO Skip enter
            scanner.nextLine();
            String answer =scanner.nextLine();
            if(!"y".equalsIgnoreCase(answer)){
                break;
            }else{
                System.out.println("Have a nice time");
            }
        }
    }

    private static void printSeparator(){
        System.out.println("##############");
    }
}
