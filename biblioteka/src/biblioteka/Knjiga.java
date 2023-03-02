package biblioteka;

import java.util.List;

public class Knjiga {
	
	private String naslov;
	public String getNaslov() {
		return naslov;
	}
	public void setNaslov(String naslov) {
		this.naslov = naslov;
	}
	public long getISBN() {
		return ISBN;
	}
	public void setISBN(long iSBN) {
		ISBN = iSBN;
	}
	public List<Autor> getAutori() {
		return autori;
	}
	public void setAutori(List<Autor> autori) {
		this.autori = autori;
	}
	public String getIzdavac() {
		return izdavac;
	}
	public void setIzdavac(String izdavac) {
		this.izdavac = izdavac;
	}
	public int getIzdanje() {
		return izdanje;
	}
	public void setIzdanje(int izdanje) {
		this.izdanje = izdanje;
	}
	private long ISBN;
	private List<Autor> autori;
	private String izdavac;
	private int izdanje;
	@Override
	public String toString() {
		return "Knjiga [naslov=" + naslov + ", ISBN=" + ISBN + ", autori=" + autori + ", izdavac=" + izdavac
				+ ", izdanje=" + izdanje + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (ISBN ^ (ISBN >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Knjiga))
			return false;
		Knjiga other = (Knjiga) obj;
		if (ISBN != other.ISBN)
			return false;
		return true;
	}
	
	

}
