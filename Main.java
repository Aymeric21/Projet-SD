public class Main
{
	 public static void main(String arg[])
	 {
		Compte c=new Compte(100000); 
		Client client1 = new Client("client1", c);
		client1.setNbRetrait(100);
		client1.setSommeARetirer(10);
		
		Client client2 = new Client("client2", c);
		client2.setNbRetrait(100);
		client2.setSommeARetirer(10);
		
		Thread t1 = new Thread(client1);
		Thread t2 = new Thread(client2);
		
		t1.start();
    	t2.start();
try{
  t1.join();
  t2.join();
}
catch (InterruptedException e)
{e.printStackTrace();}

}
}

