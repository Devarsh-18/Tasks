package test_script.test_script;

import java.util.Scanner;

public class task10_triangle {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
        System.out.print("Enter the length of side a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter the length of side b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter the length of side c: ");
        double c = scanner.nextDouble();
        if(a ==b && b==c) {
        	System.out.println("equilatral");}
        	else if(a==b || b==c || a==c) {
        		System.out.println("isosceles");}
        	else {
        		System.out.println("scalable");    }}}