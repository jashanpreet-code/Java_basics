

public class try_catch_2 {
    public static void main(String[] args){
        int arr[] = new int[5];
        int c = 23;
        try{
            int  j = c / 0;
            System.out.println(arr[20]);
        }
        catch(ArithmeticException ct){
            System.out.println(ct);
        }
        catch(ArrayIndexOutOfBoundsException d){
            System.out.println(d);
        }
    }
}
