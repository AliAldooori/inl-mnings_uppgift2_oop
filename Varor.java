package inlamnings_uppgift_2_AliAldoori;

public class Varor {
	private int Artnr;
	private String varans_namn;
	private double nettopris;
	private double momssats;

	public Varor(int artnr, String varans_namn, double nettopris) {
		super();
		Artnr = artnr;
		this.varans_namn = varans_namn;
		this.nettopris = nettopris;
		this.momssats = momssats;
	}

	@Override
	public String toString() {
		return "Varor [Artnr=" + Artnr + ", varans_namn=" + varans_namn + ", nettopris=" + nettopris + ", momssats="
				+ momssats + "]";
	}

	public int getArtnr() {
		return Artnr;
	}

	public void setArtnr(int artnr) {
		Artnr = artnr;
	}

	public String getVarans_namn() {
		return varans_namn;
	}

	public void setVarans_namn(String varans_namn) {
		this.varans_namn = varans_namn;
	}

	public double getNettopris() {
		return nettopris;
	}

	public void setNettopris(double nettopris) {
		this.nettopris = nettopris;
	}

	public double getMomssats() {
		return momssats;
	}

	public void setMomssats(double momssats) {
		this.momssats = momssats;
	}

	public double brutto_pris() {
		return this.getNettopris() * 1.25;

				}

}
