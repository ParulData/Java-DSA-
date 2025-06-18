// creating threads using runnable interface

class MyRunnable1 implements Runnable{ 
	@Override
	public void run(){
		int i = 0;
		while(i < 10){
			System.out.println("Painting thread running.");
			i++;
		}
	}
}

class MyRunnable2 implements Runnable{
	@Override
	public void run(){
		int i = 0;
		while(i < 10){
			System.out.println("Cooking thread running.");
			i++;
		}
	}
}
class Threads_02{
	public static void main(String[] args){
		MyRunnable1 r1 = new MyRunnable1();
		Thread t1 = new Thread(r1);        
		MyRunnable2 r2 = new MyRunnable2();
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
	}
}