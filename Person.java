package inlamnings_uppgift_2_AliAldoori;

public class Person {
	String Namn;
	String adress;
	int mobilnummer;

	public Person(String namn, String adress, int mobilnummer) {
		super();
		Namn = namn;
		this.adress = adress;
		this.mobilnummer = mobilnummer;
	}

	@Override
	public String toString() {
		return "Person [Namn=" + Namn + ", adress=" + adress + ", mobilnummer=" + mobilnummer + "]";
	}

	public String getNamn() {
		return Namn;
	}

	public void setNamn(String namn) {
		Namn = namn;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public int getMobilnummer() {
		return mobilnummer;
	}

	public void setMobilnummer(int mobilnummer) {
		this.mobilnummer = mobilnummer;
	}

}
