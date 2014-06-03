package probeklausur;

import java.io.FileWriter;
import java.io.IOException;

public class Zoo {
	
	public static void main(String[] args) throws ZooFileException, IOException {
		Zoo z=new Zoo(2);
		//
		z.addAnimal(new Raubtier("Tiger", "Fred"));
		z.addAnimal(new Raubtier("Tiger", "Lisa"));
		z.addAnimal(new Raubtier("Löwe", "Simba"));
		z.addAnimal(new Singvogel("Kleiber", "Hansi"));
		z.addAnimal(new Singvogel("Schneeammer", "Sina"));
		z.addAnimal(new Singvogel("Zaunkönig", "Henry"));
		


		
		//in Datei speichern:
		z.saveToFile();
		
		z.füttern("Körner");
		
		
		System.out.println("Gibt es Fred im Zoo?");
		if (z.existsAnimal("Fred")) System.out.println("Ja");
		else System.out.print("Nein");
		System.out.println("Gibt es Kimba im Zoo?");
		if (z.existsAnimal("Kimba")) System.out.println("Ja");
		else System.out.println("Nein");
		System.out.print("Gibt es Henry im Zoo?");
		if (z.existsAnimal("Henry")) System.out.println("Ja");
		else System.out.println("Nein");
		System.out.println("Gibt es Lotte im Zoo?");
		if (z.existsAnimal("Lotte")) System.out.println("Ja");
		else System.out.println("Nein");
	}
	
	int cap;
	static ZooTier tier[];
	static int count;
	
	
	public Zoo(int max)
	{
		this.cap = max;
		tier = new ZooTier[max];
	}
	public Zoo()
	{
	this.cap = 5;	
	tier = new ZooTier[5];
	}
	
	public void addAnimal(ZooTier tier)
	{
		if(count < cap)	
		{
			this.tier[count]= tier;	
			System.out.println();
			System.out.println(tier.getName() +" ("+ tier.getArt() + ") zum Zoo hinzugefügt!");
		}
		else
		{
		System.out.println("Fehler: Zoo-Kapazität überschritten!");	
		}
		
		count++;
	}
	public ZooTier[] getAnimals()
	{
		int i=0;
		ZooTier animals[];

		for (ZooTier tier: this.tier)
		{
			if(tier!=null)
			{
			i++;	
			}
		}
		animals = new ZooTier[i];
		i=0;
		for (ZooTier tier: this.tier)
		{
			if(tier!=null)
				{
				animals[i]=tier;
				i++;
				}
				
		}
		return animals;
	}
	public static boolean existsAnimal(String name)
	{
		for (ZooTier t: tier)
		{
		if (t.getName()==name) 
			{
			return true;
			}
		}
		return false;
		
	}
	
	public void füttern(String futter)
	{
		for (ZooTier t: tier)	
		{
			if (t!=null)
			{
			t.füttern(futter);	
			}
		}
	}
	
	public void saveToFile() throws ZooFileException,IOException
	{
		FileWriter fw = new FileWriter("C:\\Daten\\Studium\\programmieren\\dir\\filename.txt");
		for (ZooTier t: tier)
		{
			if(t!=null)
			{
			fw.write(t.getArt()+";"+t.getName() +";"+t.getClass());
			fw.flush();
			}
		}
		fw.close();
		
	}

}
