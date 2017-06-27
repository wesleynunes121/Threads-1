public class Impressora implements Runnable {
		private int i;
	Armazem armazem;
	public Impressora(Armazem arm){
		this.armazem=arm;
	}
	    public void run() {
	    
	    for(i=0; i<100; i++){
               	
        System.out.println(armazem.getA());
        
        try {
        	System.out.println("Dormiu impressora;");
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    }
    }

    
    
}