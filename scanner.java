import java.util.Scanner;

public class scanner {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the input text: ");
        
        String text = scanner.nextLine();
        System.out.println(text);

        int num = scanner.nextInt();
        System.out.println(num);

        double db = scanner.nextDouble();
        System.out.println(db);

        boolean bol = scanner.nextBoolean();
        System.out.println(bol);

        if(bol){
            System.out.println("this is true");
        }
        else{
            System.out.println("this not True");
        }
    }
}
