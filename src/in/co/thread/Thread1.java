package in.co.thread;

public class Thread1 implements Runnable {
	public void run() {
		System.out.println("running");
	}

	public static void main(String[] args) {
		Thread t = new Thread(new Thread1());
		t.run();
		t.run();
		t.start();
	}
}
