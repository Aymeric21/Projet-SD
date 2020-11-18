public class Main
{
	public static void main(String args[])
	{
		Compte compte = new Compte(100000);
		
		Client client1 = new Client("client1", compte);
		client1.setNbRetrait(100);
		client1.setSommeARetirer(10);
		
		Client client2 = new Client("client2", compte);
		client2.setNbRetrait(100);
		client2.setSommeARetirer(10);
		
		Thread t1 = new Thread(client1);
		Thread t2 = new Thread(client2);
		
		t1.start();
		t2.start();
	}
}
