/*
 * JAVA THREADS
 * 
 * Threads allows a program to operate more efficiently by 
 * doing multiple things at the same time.

Threads can be used to perform complicated tasks in the background 
without interrupting the main program.
 */

/*
    CREATING A THREAD

public class ThreadsExample extends Thread {
    public void run(){
        System.out.println("This code is running in a thread")
    }
}
 */

 /*
    CREATING A RUNNABLE THREAD

public class ThreadsExample implments Runnable {
    public void run(){
        System.out.println("This code is running in a thread")
    }
}
 */

 // Running Threads
 /*public class ThreadsExample extends Thread{
    public static void main(String[] args){
        ThreadsExample thread = new ThreadsExample();
        thread.start();
        System.out.println("This code is outside of the thread");
    }

    public void run(){
        System.out.println("This code is running in a thread");
    }
}
*/

/*
    //Running Thread Runnable
 public class ThreadsExample implements Runnable{
    public static void main(String[] args){
        ThreadsExample miObj = new ThreadsExample();
        Thread thread = new Thread(miObj);
        thread.start();
        System.out.println("This code is outside of the thread");
    }

    public void run(){
        System.out.println("This code is running in a thread");
    }
}

 */

 /*
  * Concurrency Problems

  Because threads run at the same time as other parts of the program, 
  there is no way to know in which order the code will run. When the 
  threads and main program are reading and writing the same variables, 
  the values are unpredictable. The problems that result from this are 
  called concurrency problems.
  */
 
 public class ThreadsExample extends Thread{
    public static int amount = 0;
    
    //Creating the main method
    public static void main(String[] args){
        ThreadsExample thread = new ThreadsExample();
        thread.start();

        //Wait for the thread to finish
        while (thread.isAlive()) {
            System.out.println("Waiting...");
        }

        //Update amount and print its value
        System.out.println("Main: " + amount);
        amount++;
        
        System.out.println("Main: " + amount);
    }
    //Creating the run method for our thread
    public void run(){
        amount++;
    }
 }