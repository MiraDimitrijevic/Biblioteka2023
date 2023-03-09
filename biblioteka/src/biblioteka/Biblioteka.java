package biblioteka;

import java.util.ArrayList;
import java.util.List;

import biblioteka.interfejs.BibliotekaInterfejs;

public class Biblioteka implements BibliotekaInterfejs {
	
	private List<Knjiga> knjige= new ArrayList<Knjiga>();

	@Override
	public void dodajknjigu(Knjiga knjiga) {
		if(knjiga==null) 
			throw new NullPointerException("Knjiga ne sme biti null");
		if(knjige.contains(knjiga)) 
			throw new IllegalArgumentException("Knjiga je duplikat");
knjige.add(knjiga);

	}

	@Override
	public void obrisiKnjigu(Knjiga knjiga) {
knjige.remove(knjiga);
	}

	@Override
	public List<Knjiga> vratiSveKnjige() {
		// TODO Auto-generated method stub
		return knjige;
	}

	@Override
	public List<Knjiga> pronadjiKnjigu(Autor autor, long ISBN, String naslov, String izdavac) {
		if(autor==null && ISBN<0 && naslov==null && izdavac==null)
		throw new IllegalArgumentException("Morate uneti bar jedan kriterijum");
		
		List<Knjiga> listaRezultati= new ArrayList<>();
		
		if(naslov!=null)
		for(Knjiga k :knjige) {
			if(k.getNaslov().toLowerCase().contains(naslov.toLowerCase().trim())) {
				listaRezultati.add(k);
			}
		}
		return listaRezultati;
	}

}
