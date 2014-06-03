package vererbung;

public class Rennwagen extends Auto {

	Rennwagen(double position, double v)
	{
		super(position, v);
		this.maxSpeed=220;
		this.maxWheel=4;
		speed=v;
	}


}
