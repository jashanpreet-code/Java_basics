import java.util.Scanner;

public class array {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for(int  i = 0; i < arr.length; i++){
            arr[i] = input.nextLine();
        }
        for(int j = 0; j < arr.length; j++){
            System.out.println(arr[j]);
        }
        input.close();
    }
}
