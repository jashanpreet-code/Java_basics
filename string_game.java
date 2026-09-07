import java.util.Scanner;

public class string_game {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.println("enter the adjective (description): ");
        adjective1 = input.nextLine();

        System.out.println("Enter a noun (animal): ");
        noun1 = input.nextLine();

        System.out.println("Enter an adjective (description): ");
        adjective2 = input.nextLine();

        System.out.println("Enter  a verb end with -ing (action): ");
        verb1 = input.nextLine();

        System.out.println("Enter an adjective (descriptino): ");
        adjective3 = input.nextLine();

        System.out.println("Today i  went to a "+ adjective1 + " Zoo ");
        System.out.println("In exibition I saw a " + noun1 +" .");
        System.out.println(noun1 + " was " + adjective2 + " end " + verb1 + "! ");
        System.out.println("I was "+ adjective3 + "!");
        input.close();
    }
}
