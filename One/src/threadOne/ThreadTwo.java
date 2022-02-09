package threadOne;

public class ThreadTwo {

	public static void twothread() {
		new Thread() {

			public void run() {

				for (int i = 0; i < 20; i++) {
					System.out.println("thread excultando Email" + (++i));

					try {
						Thread.sleep(2000);

					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			};

		}.start();

	}
}
