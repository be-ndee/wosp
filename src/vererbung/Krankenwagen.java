package vererbung;

public class Krankenwagen extends Auto {
	
	boolean blaulicht;

	Krankenwagen(double position, double v)
	{
		super(position, v);
		this.maxSpeed=140;
		this.maxWheel=4;
		this.blaulicht=false;
		
	}

	public boolean isBlaulicht() {
		return blaulicht;
	}

	public void setBlaulicht(boolean blaulicht) {
		this.blaulicht = blaulicht;
	}
	
	


}
