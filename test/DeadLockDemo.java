package test;
public class DeadLockDemo{
    private static Object r1 = new Object();
    private static Object r2 = new Object();

    public static void main(String[] args){
        synchronized(r1){
            new Thread(()->{
                System.out.println(Thread.currentThread()+"get r1");
                try{
                    Thread.sleep(1000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
                
        },"线程1").start();
        }
    }



}