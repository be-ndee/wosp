package vererbung;

public class Fahrrad extends Fahrzeug {

	Fahrrad(double position, double v)
	{
		super(position, v);
		this.maxSpeed=30;
		this.maxWheel=2;
	}


}
