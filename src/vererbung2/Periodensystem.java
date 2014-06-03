package vererbung2;

public class Periodensystem {

	Element[] elArr = new Element[118];

	public static void main(String[] args) {

		Periodensystem ps = new Periodensystem();

		Element h = new Element("H", "Wasserstoff", 1, 'K', 3, true);
		Element he = new Element("He", "Helium", 2, 'K', 3, true);
		Element na = new Metall("Na", "Natrium", 11, 'M', 1, true, false,
				(21 * 10000000));
		Element fe = new Metall("Fe", "Eisen", 26, 'N', 1, false, false,
				(10.02 * 10000000));
		Element ge = new Metall("Ge", "Germanium", 32, 'N', 1, false, true,
				(1.45));
		Element br = new Element("Br", "Brom", 35, 'N', 2, true);
		Element te = new Metall("Te", "Tellur", 52, 'O', 1, true, true, (0.005));
		Element au = new Metall("Au", "Gold", 79, 'P', 1, false, false,
				(44 * 10000000));
		ps.addElement(h);
		ps.addElement(he);
		ps.addElement(na);
		ps.addElement(fe);
		ps.addElement(ge);
		ps.addElement(br);
		ps.addElement(te);
		ps.addElement(au);

		
		Element[] metals = ps.getAllMetalls();
		for(Element m: metals)
		{
			System.out.println(m);
		}
	}

	public void addElement(Element e) {
		boolean isAlreadyInList = false;
		int i = 0;

		for (Element el : elArr) {

			if (el != null) {
				i++;
				if (el.equals(e)) {
					isAlreadyInList = true;
				}
			}

		}
		if (!isAlreadyInList) {
			
			elArr[i] = e;
			
			System.out.println("I ist: "+i);
		}

	}

	public boolean hasElement(int oz) {
		for (Element el : elArr) {
			if (el.getOz() == oz) {
				return true;
			}
		}
		return false;

	}

	public Element getElement(int oz) {
		for (Element el : elArr) {
			if (el.getOz() == oz) {

				return el;
			}
		}

		return null;
	}

	public Element[] getAllMetalls() {
		Element[] metalArr = new Element[118];
		int i = 0;
		for (Element el : elArr) {
			if (el != null) {
				if (el instanceof Metall) {
					metalArr[i] = el;
				}
			}

		}
		return metalArr;
	}
}
