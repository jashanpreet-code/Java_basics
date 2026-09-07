import java.util.Scanner;

public class nested_if {
    public static void main(String[] args){
        boolean isStudent;
        boolean isSenior;
        double price ;
        Scanner input = new Scanner(System.in);
        isStudent = input.nextBoolean();
        isSenior = input.nextBoolean();
        price = input.nextDouble();
        if(isStudent == true){
            if(isSenior == true){
                System.out.print("The Student and Senior is true");
            }
        }
    }
}
