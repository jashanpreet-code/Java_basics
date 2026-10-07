
class food extends Thread{
    private String f;

    food(String val){
        this.f = val;
    }

    public void run(){
        System.out.println("The food is : " + f + " Thread is : "+ currentThread().getName());
    }
}


class extend_threads{
    public static void main(String[] args){
        food obj1 = new food("first");
        food obj2 = new food("second");
        food obj3 = new food("Third");

        obj1.start();
        obj2.start();
        obj3.start();
    }
}