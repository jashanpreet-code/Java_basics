class counter{
    int count = 0;

    synchronized void increase(){
        count++;
    }
}

public class without_sync {
    public static void main(String[] args){

        counter obj = new counter();
        Thread new_thread = new Thread(()-> {for(int  i =0 ;i <= 1000 ; i++){
            obj.increase();
        }
        });

        Thread second_Thread = new Thread(() -> {for(int i = 0; i<= 10000; i++){
            obj.increase();
        }});

        new_thread.start();
        second_Thread.start();

        try{
            new_thread.join();
            second_Thread.join();
        }
        catch(Exception r){
            System.out.println(r);
        }
        System.out.println(obj.count);
    }
}
