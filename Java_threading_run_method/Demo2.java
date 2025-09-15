
class A extends Thread
{
    int total=0;
    public void run(){
        // for(int i=0;i<10000;i++){
        //     this.total = this.total + i;
        // }
        /*
         * for example if we have 1 cr statements after this 
         * for loop then the main thread will wait for 
         * long time unnecessaryly as we already got 
         * the total value 
         * so now we will use wait, notify, notify all;
         */
        synchronized(this){
            for(int i=0;i<10000;i++){
                this.total = this.total + i;
            }
            this.notify();
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
        // a1.join(); // this is also enfficient so we will use wait,notify,notify all
        synchronized(a1){
            a1.wait();

        }

        System.out.println(a1.total);
    }
}