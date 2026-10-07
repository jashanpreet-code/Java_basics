class food extends Thread{
    String food_name;

    food(String name){
        this.food_name = name;
    }

    public void run(){
        System.out.println("Food = " + food_name + " Thread = " + Thread.currentThread().getName());
    }
}

public class GET_SET_PRIOPRITY {
    public static void main(String[] args){
        food obj1 = new food("first");
        food obj2 = new food("second");
        System.out.println(obj2.getPriority());
        System.out.println(obj1.getPriority());

        obj2.setPriority(10);
        obj1.setPriority(1);

        obj1.start();
        obj2.start();

        System.out.println(obj2.getPriority());
        System.out.println(obj1.getPriority());
    }
}
