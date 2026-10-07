class A extends Thread{
    public void run(){
        for(int i= 0;i < 10; i++){
            System.out.println("hi");
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i= 0;i < 10; i++){
            System.out.println("hello");
            try{
                Thread.sleep(10);
            }
            catch(Exception d){
                System.out.println(d);
            }
        }
    }
}


public class thred_1 {
    public static void main(String[] args){
        A a_obj = new A();
        B b_obj = new B();

        b_obj.setPriority(Thread.MAX_PRIORITY);

        a_obj.start();
        try{
            Thread.sleep(2);
        }
        catch(Exception e){
            System.out.println(e);
        }
        b_obj.start();
    }    
}
