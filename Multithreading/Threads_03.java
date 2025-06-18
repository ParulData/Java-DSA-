// thread constructor

class MyThr1 extends Thread{
	public MyThr1(String name) {   // constructor
		super(name);
	}
	@Override
	public void run(){
		int i = 0;
		while(i < 5){
			System.out.println("Oshin Yadav");
			i++;
		}
	}
}
class MyThr2 extends Thread{
	public MyThr2(String name) {   // constructor
		super(name);
	}
	@Override
	public void run(){
		int i = 0;
		while(i < 5){
			System.out.println("Parul Yadav");
			i++;
		}
	}
}

class Threads_03{
	public static void main(String[] args){
		MyThr1 t1 = new MyThr1("Shivam");
		MyThr2 t2 = new MyThr2("Piyush");
		t1.start();
		t2.start();
		System.out.println("Thread id of t1 : " + t1.getId());
		System.out.println("Thread id of t2 : " + t2.getId());
		System.out.println("Name of t1 : " + t1.getName());
		System.out.println("Name of t2 : " + t2.getName());

	}
}