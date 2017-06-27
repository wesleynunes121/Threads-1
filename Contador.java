public class Contador implements Runnable  {
    public int x;
    
    Armazem armazem;
    public void run() {
    	
    	for(x=0; x<100; x++){
    		armazem.setA(x);
    		try {
    			System.out.println("Dormiu armazem");
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        } 
    }
    	
    public Contador(Armazem arm){
    	this.armazem=arm;
    }
    
	public int getX() {
		return x;
	}
	
    
    
}