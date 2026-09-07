import java.util.Scanner;
// import java.util.Math;

public class veriable_argument{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] d = new int[10];
        for(int i = 0; i < 10; i++){
            d[i] = input.nextInt();
        }
        add(d);
        input.close();

    }

    static void add(int... numbers){
        int sum = 0;
        for(int i = 0; i < 10; i++){
            System.out.println(numbers[i]+ "\t");
        }
        for(int h: numbers){
            sum += h;
        }
        System.out.println(sum);
    }
}
