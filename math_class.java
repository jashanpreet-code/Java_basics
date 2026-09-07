import java.util.Scanner;
public class math_class {

    public static void srt(){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("Square root "+ Math.sqrt(Math.pow(a,2) + Math.pow(b,2)));
    }
    public static void main(String[] args){
        double result;
        result = Math.pow(2,3);
        System.out.println("absolute value: "+Math.abs(-23));
        System.out.println("Square root of number: "+Math.sqrt(2));
        System.out.println("Power of a number: "+result);
        System.out.println("Rounding value: "+Math.round(result));
        System.out.println("ceil a value: "+Math.ceil(245.43));
        System.out.println("flooring the number: "+Math.floor(245.34));
        System.out.println("max number between: " +Math.max(23,43));
        System.out.println("minimum value : " +Math.min(43,56));
        srt();
    }
}

