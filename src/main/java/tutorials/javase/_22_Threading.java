package tutorials.javase;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

//Thread
//Senkron: Aynı anda sadece 1 işlem yapabilmedir.
//Asenkron:aynı anda birden fazla işlem yapabilme yeteneğidir.
//Java Multi threading ?

//Threading bize yararı nedir ?
// Hızlılığı

// Thread metotları

// run()
// start()
// join()
// wait()
// notify()
// notifyAll()

//extends
//implement
//anonymous


//Kalıtımlama
@AllArgsConstructor
public class _22_Threading extends Thread{

    @Getter @Setter
    private String proc;

    @Override
    public void run() {
        System.out.println(proc+" processing threading start");
        for (int i = 1; i <=10 ; i++) {
            System.out.println(i+". "+proc+" processing threading start");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Interrup:  "+e);
               // throw new RuntimeException(e);
            }
        }
    }
}


//interface
@AllArgsConstructor
class implementsThreading implements Runnable{

    @Getter @Setter
    private String proc;


    @Override
    public void run() {
        System.out.println(proc+" processing threading start");
        for (int i = 1; i <=10 ; i++) {
            System.out.println(i+". "+proc+" processing threading start");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Interrup:  "+e);
                // throw new RuntimeException(e);
            }
        }
    }
}

class MainClass{
    public static void main(String[] args) {

        //extends Thread
        _22_Threading extendThread1=new _22_Threading("thread-1 ==> extends ");
        _22_Threading extendThread2=new _22_Threading("thread-2 ==> extends");

        //implements Thread
        Thread implementsthread3=new Thread(new implementsThreading("thread-3 ==> implements ") );
        Thread implementsthread4=new Thread(new implementsThreading("thread-4 ==> implements ") );

        extendThread1.start();
        extendThread2.start();
        implementsthread3.start();
        implementsthread4.start();
    }
}