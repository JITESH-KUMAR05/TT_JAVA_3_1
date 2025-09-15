
class A extends Thread
{
    int total=0;
    public void run(){
        for(int i=0;i<10000;i++){
            this.total = this.total + i;
        }
    }
}

class B{
    public static void main(String args[]) throws InterruptedException{

        A a1 = new A();
        A a2 = new A();
        a1.start();
        // a2.start();
        // Thread.sleep(1000); // we are waiting unnecessary time so we will use join method
        a1.join();
        System.out.println(a1.total);
    }
}