import java.util.Scanner;

public class area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double circle_radius = 2 * Math.PI * n;
        double circle_area =  Math.PI * Math.pow(n,2);
        double circle_volume = (4/3) * Math.PI * Math.pow(n,3);

        System.out.printf("radius Of circle is = %.2fcm\n ", circle_radius);
        System.out.printf("area of circleis is = %.2fcm\n",circle_area);
        System.out.printf("volume of circle is = %.2fcm\n", circle_volume);
    }
}
