package in.co.thread;

public class Threads5 {
	public static void main(String[] args) {
		new Thread(new Runnable() {
			public void run() {
				System.out.println("bar");
			}
		}).start();
	}
}