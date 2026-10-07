// class S {
//     String j;
//     S(String d){
//         this.j = d;
//     }
// }

class food implements Runnable{
    String food_name;

    food(String name){
        this.food_name = name;
    }

    public void run(){
        System.out.println("The food : " + food_name + "Thread is : " + Thread.currentThread().getName());
    }


}

public class implimenting_thread {
    public static void main(String[] args){
        food obj1 = new food("first");
        food obj2 = new food("second");
        food obj3 = new food("Third");
        food obj4  = new food("fourth");
        
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        Thread t3 = new Thread(obj3);
        Thread t4 = new Thread(obj4);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
