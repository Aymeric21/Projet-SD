public class Client implements Runnable
{
	private Compte c;
	private int nbRetrait;
	private int sommeARetirer;
	private String nom;
	public Client(String nom, Compte c){
	 this.nom=nom;
	 this.c=c;
    }
    public void run()
    {
		 for(int i=1;i<=nbRetrait;i++)
		  {
			   c.retrait(sommeARetirer);
			   c.afficherSolde();
		  }
	}
	public void setNbRetrait(int nb)
	{
		this.nbRetrait = nb;
	}
	
	public void setSommeARetirer(int somme)
	{
		this.sommeARetirer = somme;
	}
}
