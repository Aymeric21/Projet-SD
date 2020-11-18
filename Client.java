public class Client implements Runnable
{
	private String nom;
	private Compte compte;
	private int nbRetrait;
	private int sommeARetirer;

	public Client(String nom, Compte compte)
	{
		this.nom = nom;
		this.compte = compte;
	}
	
	public void run()
	{
		for(int i=0; i<nbRetrait; i++)
		{
			compte.retrait(sommeARetirer);
			compte.afficherSolde();
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
