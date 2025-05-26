package test_script.test_script;

public class task10_1_triangle {
	public static void main(String[] args) {
		int a = 5;
		int b =5;
		int c = 5;
		if (a == b && b == c) {
            System.out.println("The triangle is equilateral.");
        } else if (a == b || b == c || a == c) {
            System.out.println("The triangle is isosceles.");
        } else {
            System.out.println("The triangle is scalene.");   }}}
	


