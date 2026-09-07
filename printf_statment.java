public class printf_statment {
    public static void main(String[] args){
        String name = "Her";
        char ch = 'A';
        int age  = 54;
        double db = 23.4;
        boolean happy = false;
        System.out.printf("The name is %s\n",name);
        System.out.printf("The %d is age \n",age);
        System.out.printf("The charachter %c is there \n",ch);
        System.out.printf("The %f is double value\n",db);
        System.out.printf("The %b is boolean value\n",happy);
        System.out.printf("name = %s and the age = %d\n",name,age);


        int num1 = 1;
        int num2 = 23;
        int num3 = 456;
        int num4 = 7890;
        System.out.printf("formatting string on number adding zeros");
        System.out.printf("num1 = %04d\n",num1);
        System.out.printf("num1 = %04d\n",num2);
        System.out.printf("num1 = %04d\n",num3);
        System.out.printf("num1 = %04d\n",num4);

        System.out.printf("Formatting string on numbers adding spaces");
        System.out.printf("num1 = %-4d\n",num1);
        System.out.printf("num1 = %-4d\n",num2);
        System.out.printf("num1 = %-4d\n",num3);
        System.out.printf("num1 = %-4d\n",num4);


    }
}
