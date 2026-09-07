import java.util.Scanner;

public class Enhanced_switches{
    public static void main(String[] args){
        Scanner input  = new Scanner(System.in);
        System.out.print("enter  any week day like (monday or sunday): ");
        String weekDay = input.nextLine().toLowerCase();
        switch(weekDay){
            case "monday" -> System.out.printf("Monday");
            case "teusday" -> System.out.printf("teusday");
            case "wednesday" -> System.out.printf("wednesday");
            case "thursday" -> System.out.printf("thursday");
            case "friday" -> System.out.printf("friday");
            case "saturday" -> System.out.printf("saturday");
            case "sunday" -> System.out.printf("sunday");
            default -> System.out.printf("%s not a weekday",weekDay);
        }
    }
}