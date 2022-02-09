package threadOne;

public class ThreadOne {

	public static void onethread() {
		new Thread() {

			public void run() {

				for (int i = 0; i < 20; i++) {
					System.out.println("thread excultando Compra finalizada" + (++i));

					try {
						Thread.sleep(1000);

					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			};

		}.start();

	}
}
