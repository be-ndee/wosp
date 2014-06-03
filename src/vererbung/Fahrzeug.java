package vererbung;

public class Fahrzeug {

	double position;
	double speed;
	double maxSpeed;
	double maxWheel;

	void bewege(double minutes) {
		if (this.speed != 0) {
			double s = this.speed /60 * minutes;
			this.position = this.position +s;
		}

	}

	public void setSpeed(double speed) {
		if (speed < this.maxSpeed) {
			this.speed = speed;
		}
	}


	@Override
	public String toString() {
		String info = "Geschwindigkeit: " + speed + " maxGeschwindigkeit: "
				+ maxSpeed + "Reifen: " + maxWheel + " Aktuelle Position: "
				+ position;

		return info;
	}
	public Fahrzeug() {
		
	}
	public Fahrzeug(double position, double speed)
	{
		this.position = position;
		this.speed = speed;
		this.maxSpeed = 0;
		this.maxWheel= 0;
		
	}

}
