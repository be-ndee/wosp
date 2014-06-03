package probeklausur;

public class ZooTier {
	
	 String name;
	 String art;
	 String futter;
	 

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArt() {
		return art;
	}

	public void setArt(String art) {
		this.art = art;
	}

	public String getFutter() {
		return futter;
	}

	public void setFutter(String futter) {
		this.futter = futter;
	}

	void füttern(String futter)
	{
		if (futter == this.futter)
		{
		System.out.println("("+name+") ("+art+") frisst " +futter);
		}
		else 
		{
			System.out.println("("+name+") ("+art+") verschmäht " +futter);	
		}
	}
	
	public String toString()
	{
		String info="";
		info = info +"Name: " +this.name +" Art: "+this.art;
	return info;
	}
	
	ZooTier(String art, String name )
	{
		this.art=art;
		this.name=name;
	}


}

class Raubtier extends ZooTier {

	Raubtier(String art, String name)
	{
	super(art, name);
	super.futter="Fleisch";
	}
	
}

class Singvogel extends ZooTier {
	
	Singvogel(String art,String name)
	{
		super(art, name);
		super.futter="Körner";
	}
	
}
