
class A{
    synchronized void m1(){
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName());
            try{
                Thread.sleep(2000);
            }
            catch(Exception e){
                System.out.println("Error");
            }
        }
    }

    public static void main(String Args[]){
        A a1 = new A();
        A a2 = new A();
        Thread t1 = new Thread(()->a1.m1());
        Thread t2 = new Thread(()->a1.m1());
        Thread t3 = new Thread(()->a2.m1());
        t1.start();
        t2.start();
        t3.start();
    }
}

// public class DEMO1 {
    
// }
