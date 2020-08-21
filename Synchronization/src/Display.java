
public class Display {
	public synchronized void wish(String name) {
		for(int i=0;i<=10;i++) {
			System.out.println("good morning");
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
		}
			System.out.println(name);
		}
	}
	}
class MyThread extends Thread{
	Display d;
	String name;
	MyThread(Display d,String name){
		this.d=d;
		this.name=name;
	}
	public void run() {
		d.wish(name);
	}

	public static void main(String[] args) {
		Display d=new Display();
		MyThread t=new MyThread(d, "shareef");
		MyThread t1=new MyThread(d, "arif");
		t.start();
		t1.start();
	}

	}


