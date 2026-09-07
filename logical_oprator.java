import java.util.Scanner;

public class logical_oprator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String user_name;
        user_name = input.nextLine();
        if(user_name.length() <  12 || user_name.length() > 12){
            System.out.printf("User_name is in correct parameters");    
        }
        else if(user_name.contains(" ") || user_name.contains("_")){
            System.out.printf("user name is not in the parameters");
        }
        else{
            System.out.printf("enter corect name");
        }
        input.close();
    }
}
