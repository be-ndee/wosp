package klassen;

class Radio {
	private boolean eingeschaltet;
	private int lautstaerke;
	private double frequenz;
	
	Radio() {
		
	}
	
	Radio (boolean einaus, int laut, double freq) {
		eingeschaltet = einaus;
		
		// check that lautstaerke is between 0 and 10
		if (laut >= 10) {
			lautstaerke = 10;
		} else if (laut <= 0) {
			lautstaerke = 0;
		} else {
			lautstaerke = laut;
		}
		
		// check that frequenz is between 85.0 and 110.0
		if (freq < 85.0) {
			frequenz = 99.0;
		} else if (freq > 110.0) {
			frequenz = 99.0;
		} else {
			frequenz = freq;
		}
	}
	
	void lauter() {
		if (lautstaerke < 10 && eingeschaltet) {
			lautstaerke++;
		}
	}
	
	void leiser() {
		if (lautstaerke > 0 && eingeschaltet) {
			lautstaerke--;
		}
	}
	
	void an() {
		eingeschaltet = true;
	}
	
	void aus() {
		eingeschaltet = false;
	}
	
	public String toString() {
		String info = "Radio ";
		if (eingeschaltet) {
			info = info + "an: ";
		} else {
			info = info + "aus: ";
		}
		info = info + "Freq=" + frequenz + ", Laut=" + lautstaerke;
		return info;
	}
	
	void waehleSender(double freq) {
		if (freq < 85.0 || freq > 111.0) {
			frequenz = 99.0;
		} else {
			frequenz = freq;
		}
	}
}