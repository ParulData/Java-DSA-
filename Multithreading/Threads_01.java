import java.util.*;

class MyThread1 extends Thread{     // inheritance
	
	@Override
	public void run(){    // overriding run()
		int i = 0;
		while(i < 10){
		System.out.println("My thread is running");
		System.out.println("I am happy!!");
		i++;
		 }
	}
}

class MyThread2 extends Thread{

	@Override
	public void run(){    // overriding run()
		int i = 0;
		while(i < 10){
			System.out.println("Cooking thread is running.");
			System.out.println("I am sad!");
			i++;
		}
	}
}
class Threads_01{
	public static void main(String[] args){
		MyThread1 t1 = new MyThread1();
		MyThread2 t2 = new MyThread2();
		t1.start();   // start is a member function of thread class, run method is contained inside start() , so start() is called and not run().
		t2.start();   

	}
}