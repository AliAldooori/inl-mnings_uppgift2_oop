package inlamnings_uppgift_2_AliAldoori;

import java.util.ArrayList;

public class Varukorg {
	Varor varor;
	double saldo_ex_moms;
	double saldo_ink_moms;
	ArrayList<Varor> kundvarolist;
	ArrayList<Varor> butikvarulist;

	public Varukorg(double saldo_ex_moms, double saldo_ink_moms, ArrayList<Varor> kundvarolist) {
		super();

//		this.saldo_ex_moms = saldo_ex_moms;
//		this.saldo_ink_moms = saldo_ink_moms;
		setSaldo_ex_moms(kundvarolist);
		setSaldo_ink_moms(kundvarolist);
		this.kundvarolist = kundvarolist;
	}

	@Override
	public String toString() {
		return "Varukorg [varor=" + varor + ", saldo_ex_moms=" + saldo_ex_moms + ", saldo_ink_moms=" + saldo_ink_moms
				+ ", kundvarolist=" + kundvarolist + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	public Varor getVaror() {
		return varor;
	}

	public void setVaror(Varor varor) {
		this.varor = varor;
	}

	public double getSaldo_ex_moms() {
		return saldo_ex_moms;
	}

	public double setSaldo_ex_moms(ArrayList<Varor> kundvarolist) {
		saldo_ex_moms = 0;
		for (int i = 0; i < kundvarolist.size(); i++) {
			saldo_ex_moms += kundvarolist.get(i).getNettopris();

		}
		return saldo_ex_moms;

	}

	public double getSaldo_ink_moms() {
		return saldo_ink_moms;
	}

	public double setSaldo_ink_moms(ArrayList<Varor> kundvarolist) {
		saldo_ink_moms = 0;
		for (int i = 0; i < kundvarolist.size(); i++) {
			saldo_ink_moms += kundvarolist.get(i).brutto_pris();

		}
		return saldo_ink_moms;
	}

	public ArrayList<Varor> getKundvarolist() {
		return kundvarolist;
	}

	public void setKundvarolist(ArrayList<Varor> kundvarolist) {
		this.kundvarolist = kundvarolist;
	}

}
