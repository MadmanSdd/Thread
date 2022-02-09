package threadOne;

public  class RunnableCustomized {

	public static Runnable ThreadsEmail =  new Runnable() {
		public void run() {
			for(int i = 0; i<= 5; i++) {
				System.out.println("Ex: Email enviado com sucesso!");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	};
	
	public static Runnable ThreadsNotaFiscal =  new Runnable() {
		public void run() {
			for(int i = 0; i<= 5; i++) {
				System.out.println("Ex: Nota fiscal gerado no sistema!");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	};
}
