
public class Threads {
	public static void main(String[] args) {

		Armazem armazem = new Armazem();
		Contador contador = new Contador(armazem);
       Impressora novaImpressora = new Impressora(armazem);
       Thread t1 = new Thread(contador);
       Thread t2 = new Thread(novaImpressora);
       t1.run();     
       t2.run();        
       
           
    }
    
}