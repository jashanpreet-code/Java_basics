import java.util.Random;

public class random_class {
    public static void main(String[] args){
        Random ran = new Random();
        int number = 0;
        number = ran.nextInt(1,100000000);
        System.out.println(number);

        Double db = ran.nextDouble();
        System.out.println("returns only the decimal values: "+db);

        boolean bl = ran.nextBoolean();
        System.out.println("the boolean random: "+bl);
    }
}
