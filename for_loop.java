import java.util.Scanner;

public class for_loop {
    public static void mian(String[] args){
        Scanner input = new Scanner(System.in);
        int  n = input.nextInt();
        for(int  i = 0; i <= n; i++){
            System.out.println(i);
        }
        input.close();
    }
}
