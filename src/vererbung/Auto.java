package vererbung;

public class Auto extends Fahrzeug {

	Auto(double position, double v)
	{
		super(position, v);
		this.maxSpeed=140;
		if(v>this.maxSpeed)
		{
		speed=140;
		}
		this.maxWheel=4;
	}


}

