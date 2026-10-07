

public class try_catch_block {
    public static void main(String[] args){
        int ad = 23;
        try{
            int j = ad / 0;
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
