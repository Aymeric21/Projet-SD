public class Verrou
{
	private boolean verrouille; 

	public Verrou()
	{
		this.verrouille = false;
	}
	
	public void verrouiller() throws InterruptedException
	{
		while(this.estVerrouille())
		{
			//On attend le déverrouillage
			//On met en pause le processus pendant x ms ( ici 10ms )
			Thread.sleep(10);
		}
		
		this.verrouille = true;
	}
	
	public void deverouiller()
	{
		this.verrouille = false;
	}
	
	public boolean estVerrouille()
	{
		return this.verrouille;
	}
	
	public boolean essaiVerrouillage() throws InterruptedException
	{
		if(!this.estVerrouille())
		{
			this.verrouiller();
			return true;
		}
		
		return false;
	}
}
