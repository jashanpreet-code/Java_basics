public class method_overloading {
    public static void main(String[] args){
        int n = 10;
        String name = "#4rqq";
        int d = 23;
        // method overloading is calling function with same name but different parameters
        fun1(n,name);
        fun1(n,name,d);
       
    }
    static void fun1(int a, String n){
            System.out.printf("The age is = " + a + " and the name is = " + n);
        }
    static void fun1(int a, String n,int x){
            System.out.printf("The age is = " + a + " and the name is = " + n + "the x is = " +x);
        }
}
