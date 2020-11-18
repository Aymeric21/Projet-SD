public class Verrou
{
	private boolean verrouille; 

	public Verrou()
	{
		this.verrouille = false;
	}
	
	public void verrouiller() throws InterruptedException
	{
		//On attend le déverrouillage
		while(this.estVerrouille())
		{
			//On met en pause le processus pendant x ms ( ici 10ms )
			Thread.sleep(10);
		}
		
		this.verrouille = true;
	}
	
	public void deverrouiller()
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
