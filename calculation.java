package basic;
import java.util.Scanner;

public class calculation{
    public static void main(String[] args){
    try(Scanner scanner = new Scanner(System.in)){
    System.out.println("Enter the first number: ");
    int num1 = scanner.nextInt();
    System.out.println("Enter the second number: ");
    int num2 = scanner.nextInt();
    int sum = num1 + num2;
    int product = num1 * num2;
    int dividing = num1 / num2;
    int minus = num1 - num2;
    int modulo  = num1 % num2;
    System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum + ".");
    System.out.println("the prouduct of " + num1 + " and " + num2 + " is " +product);
    System.out.println("the division of the" + num1 + " and " + num2 +" is " + dividing);
    System.out.println("the minus of the" + num1 + " and " + num2 +" is " + minus);
    System.out.println("the modulo of the " + num1 + " and " + num2 + " is " + modulo);
    }
}
}