import java.util.Scanner;

public class ternary{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n;
        n = input.nextInt();
        String EvenOrOdd = (n %2 == 0) ? "Even" : "Odd";
        System.out.print(EvenOrOdd);
    }
}

