import java.util.Scanner;

public class if_statment {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int age = input.nextInt();

        // if(age.isEmpty()){
        //     System.out.println("you are not entered any age ");
        // }
        if(age >= 18){
            System.out.println("you are adult");
        }
        else if(age < 0){
            System.out.println("you are born yet");
        }
        else if(age >= 65){
            System.out.println("you are older");
        }
        else{
            System.out.println("you not an adult");
        }
    }
}
