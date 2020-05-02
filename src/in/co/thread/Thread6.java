package in.co.thread;

public class Thread6 {
	public static void main(String[] args) {

		Runnable r = new Runnable() {
			void run() {
				System.out.println("Cat");
			}
		};
		Threadt = new Thread(r) {
			public void run() {
				System.out.println("Dog");
			}
		};
		t.start();
	}
}
