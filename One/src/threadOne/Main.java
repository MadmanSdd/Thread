package threadOne;

import java.util.Iterator;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		new Thread() {
			
			public void run() {
				
				for (int i = 0; i < 20; i++) {
					System.out.println("thread excultando "+(++i));
					
					try {
						Thread.sleep(2000);

					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				
			};
			
		}.start();
		
		JOptionPane.showMessageDialog(null, "Thread ocorrendo em paralelo");
	}
}
