class counter implements Runnable {
    int count = 0;

    synchronized void incre(){
        count++;
    }

    public void run(){
        for(int i = 0; i <= 1000; i++){
            incre();
        }
    }
}

public class runnable_sync {
    public static void main(String[] args){
        counter obj = new counter();
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }
        catch(Exception e){
            System.out.println(e);
        }

        System.out.println(obj.count);
    }
}
