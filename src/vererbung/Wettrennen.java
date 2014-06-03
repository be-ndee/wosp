package vererbung;

public class Wettrennen {

	public static void main(String[] args) {
		
		Fahrrad fr = new Fahrrad(0, 20);
		Auto car = new Auto(0, 150);
		Rennwagen rw = new Rennwagen(0, 220);
		Krankenwagen kw = new Krankenwagen(0, 80);
		
		fr.bewege(240);
		
		car.bewege(60);
		rw.bewege(60);
		kw.bewege(60);
		fr.bewege(60);
		
		System.out.println(car);
		System.out.println(rw);
		System.out.println(kw);
		System.out.println(fr);
		
		
	}
}
