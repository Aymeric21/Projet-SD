public class Compte
{
	 private int solde;
	 
	 public Compte(int solde)
	  {
		  this.solde=solde;
	  }
	  
    public int getSold(){
		   return this.solde;
    }

   public  void setSold(int s){
		   this.solde=s;
   }

  /* utilisation d'un montor aautour de la methode retrait */
  public synchronized void retrait(int somme)
  {
	      if(somme>=0)
			 this.solde -= somme;
		  else
	         this.solde+=somme;		  			
  }
 public synchronized void afficherSolde()
	{
	System.out.println("Il y a encore " + this.getSold() + " euros sur votre compte.");
	}
}
