import java.util.Scanner;


public class twoDarray{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String[] fruits = {"apple","orange","banana"};
        String[] vegetable = {"potatto","onion","carrot"};
        String[] meats = {"chiken","pork","beef","fish"};

        String[][] two_D_array = {fruits, vegetable,meats};

        for(String[] foods: two_D_array){
            for(String f : foods){
                System.out.println(f + " ");
            }
        }
    }
}