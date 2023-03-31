/* 

    Threading...
 -> Thread is a speacific part of process or sub-process which uses 
    shared memory area.
 -> Threads are light weight as compare to the process.
 -> Threads runs concurrently.

    Multiprocessing...
 -> It is the process of spawning more than one process on a system.

    Multitasking...
 -> Sharing of Server system between number of users.    
 -> Both the multiprocessing and multithreading is used to 
    achive multitasking.

    // Achieving interfaces in java
    --> by extending thread class
    --> using runnable interface.

 */

class Base extends Thread {
    public void run() {
        while (true) {
            System.out.println("I am thread 1..");
        }
    }
}

class Derived extends Thread {
    public void run() {
        while (true) {
            System.out.println("I am thread 2..");
        }
    }
}

public class threads {
    public static void main(String[] args) {
        Base b = new Base();
        Derived d = new Derived();
        b.start();
        d.start();
    }
}
