import java.util.Scanner;

public class while_loop {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num;
        System.out.printf("enter how many times the loop should run: ");
        num = input.nextInt();
        while(num > 0){
            System.out.println("The number is "+num);
            num--;
        }
        input.close();
    }
}
