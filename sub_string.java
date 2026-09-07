public class sub_string{
    public static void main(String[] args){
        String email = "example@gmail.com";
        String name = email.substring(0,email.indexOf('@'));
        String domain = email.substring(7,17);
        System.out.println("name = "+name);
        System.out.println("domain = "+domain);
    }
}