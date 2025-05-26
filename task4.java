package Core_java;

public class task4 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("before swapping");
        System.out.println("a =" +a );
        System.out.println("b " +b);
        int temp = a;
        a = b;
        b = a;
        b = temp;
        System.out.println("after swapping");
        System.out.println("a is " +a);
        System.out.println("b is " +b);


    }
}