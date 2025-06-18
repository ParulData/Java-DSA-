
class MyThr1 extends Thread{
	public MyThr1(String name){
		super(name);
	}

	@Override
	public void run(){
		int i = 0;
		while(i < 10){
			System.out.println("Thank You : " + this.getName());
			i++;
		}
	}
}



class ThreadPriorities{
	public static void main(String[] args) {
		MyThr1 t1 = new MyThr1("Parul");
		MyThr1 t2 = new MyThr1("Mrunal");
		MyThr1 t3 = new MyThr1("Shreya");
		MyThr1 t4 = new MyThr1("Khwaish");
		t4.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t1.setPriority(Thread.MIN_PRIORITY);    
		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}
}