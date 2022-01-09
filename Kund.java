package inlamnings_uppgift_2_AliAldoori;

import java.util.ArrayList;
import java.util.Scanner;

public class Kund extends Person {
	static int kund_nummer = 0;
	 Varukorg varokorg;

	

	public Kund(String namn, String adress, int mobilnummer, Varukorg varokorg) {
		super(namn, adress, mobilnummer);
		getKund_nummer();
		this.varokorg = varokorg;
	}

	@Override
	public String toString() {
		return "Kund [kund_nummer=" + kund_nummer + ", varokorg=" + varokorg + ", Namn=" + Namn + ", adress=" + adress
				+ ", mobilnummer=" + mobilnummer + ", toString()=" + super.toString() + ", getNamn()=" + getNamn()
				+ ", getAdress()=" + getAdress() + ", getMobilnummer()=" + getMobilnummer() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

	public int getKund_nummer() {
		return kund_nummer++;
	}

	public Varukorg getVarokorg() {
		return varokorg;
	}

	public void setVarokorg(Varukorg varokorg) {
		this.varokorg = varokorg;
	}

	public void kvito(ArrayList<Varor> kundvarulist) {
		Scanner input = new Scanner(System.in);
		System.out.println("Kund Name : "+this.getNamn());
		System.out.println("Kundnummer : "+this.getKund_nummer());
		System.out.println("Varu name    Netto pris    brutto pris");
		for (int i = 0; i < kundvarulist.size(); i++) {
			System.out.println(kundvarulist.get(i).getVarans_namn() + "          " + kundvarulist.get(i).getNettopris() + "            "
					+ kundvarulist.get(i).brutto_pris());
		}
//		System.out.println("do you want more ");
//		KundHandlar(kundvarulist, input) ;
System.out.println("==============================================================================");
		System.out.println("Total pris ex moms" + this.varokorg.setSaldo_ex_moms(kundvarulist));
		System.out.println("Total Saldo ink moms " + this.varokorg.setSaldo_ink_moms(kundvarulist));

	}

	public ArrayList<Varor> KundHandlar(ArrayList<Varor> butikvarulist, Scanner input) {
		String varo;
		do {
			System.out.println("enter your varor ");
			varo = input.next();
			for (int i = 0; i < butikvarulist.size(); i++) {
				if (butikvarulist.get(i).getVarans_namn().equals(varo))
				this.varokorg.kundvarolist.add(butikvarulist.get(i));
			}
		} while (!varo.equals("exit"));
		return this.varokorg.getKundvarolist();

	}
}
