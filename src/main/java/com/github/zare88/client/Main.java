package com.github.zare88.client;

import com.github.zare88.model.Triangle;
import com.github.zare88.model.TriangleType;
import com.github.zare88.service.TriangleService;

import java.util.Scanner;

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

            Triangle triangle = new Triangle(x, y, z);
            TriangleType type = TriangleService.getInstance().identifyType(triangle);
            printSeparator();
            if(type == TriangleType.NONE){
                System.out.println("It's not a triangle at all");
            }else{
                System.out.printf("It's %s%n",type.name().toLowerCase());
            }
            printSeparator();
            System.out.println("Do you want to continue ? (Y/N)");
            //TO Skip enter
            scanner.next();
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
