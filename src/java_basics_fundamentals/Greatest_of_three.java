package java_basics_fundamentals;

public class Greatest_of_three {
    public static void main(String[] args){
        int a=1,b=5,c=8;
        if (a > b && a > c) {
            System.out.println("Largest number is a: " + a);
        }
        else if (b > a && b > c) {
            System.out.println("Largest number is b: " + b);
        }
        else {
            System.out.println("Largest number is c: " + c);
        }
    }
}
