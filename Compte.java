public class Compte
{
	private Verrou verrou;

	private int solde;
	
	public Compte(int solde)
	{
		this.solde = solde;
		
		this.verrou = new Verrou();
	}
	
	//Méthode de retrait qui utilise un verrou
	public void retrait(int somme)
	{
		try
		{
			verrou.verrouiller();
		
			if(somme >= 0)
				this.solde -= somme;
			else
				this.solde += somme;
				
			verrou.deverrouiller();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
	}
	
	private int getSolde()
	{
		return this.solde;
	}
	
	public void afficherSolde()
	{
		try
		{
			verrou.verrouiller();
			
			System.out.println("Il y a encore " + this.getSolde() + " euros sur votre compte.");
			
			verrou.deverrouiller();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
