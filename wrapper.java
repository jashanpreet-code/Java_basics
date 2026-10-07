import java.util.ArrayList;

public class wrapper {
    public static void main(String[] args){
        int a = 10;
        Integer A = a;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(A);
        System.out.println(list);

        int unboxing = list.get(0);
        System.out.println("After unboxing of the wrapper class = "+unboxing);
    }
}
