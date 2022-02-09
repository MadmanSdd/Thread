package threadOne;

import java.util.Iterator;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		//Usando metodo thread		
		//ThreadOne.onethread();
		//ThreadTwo.twothread();
		
		//Uso de Runnable
		Thread thEmail = new Thread(RunnableCustomized.ThreadsEmail);
		thEmail.start();
		
		Thread thNota = new Thread(RunnableCustomized.ThreadsNotaFiscal);
		thNota.start();
		
		JOptionPane.showMessageDialog(null, "Thread ocorrendo em paralelo");
	}
}
