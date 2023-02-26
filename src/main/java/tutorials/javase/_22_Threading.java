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


//Kalıtımlama ==> 1.YOL
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


//interface ==> 2.YOL
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
    public static void main(String[] args) throws InterruptedException {

        //extends Thread
        _22_Threading extendThread1=new _22_Threading("extends-1 ==>  ");
        _22_Threading extendThread2=new _22_Threading("extends-2 ==> ");

        //implements Thread
        Thread implementsthread3=new Thread(new implementsThreading("implements-3 ==>  ") );
        Thread implementsthread4=new Thread(new implementsThreading("implements-4 ==>  ") );

        extendThread1.start();
        extendThread2.start();

        //join() => Öncelik bu threadler bitsin ondan sonra diğerleri başlasın (Threading group)
        extendThread1.join();
        extendThread2.join();

        implementsthread3.start();

        //wait() => ikinci bir emre kadar threading çalışmasını istemiyorum
        //notify: uyuyan güzel uyansın artık :)
        for (int i = 1; i <=10 ; i++) {
            if(i%2==0){
                implementsthread4.wait();
            }else{
                implementsthread4.notify();
            }
        }
        implementsthread4.start();
    }
}