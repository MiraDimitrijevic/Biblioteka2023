package biblioteka;

import java.util.ArrayList;
import java.util.List;

import biblioteka.interfejs.BibliotekaInterfejs;

public class Biblioteka implements BibliotekaInterfejs {
	
	private List<Knjiga> knjige= new ArrayList<Knjiga>();

	@Override
	public void dodajknjigu(Knjiga knjiga) {
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
		 return null;
			
		List<Knjiga> listaRezultati= new ArrayList<>();
		for(Knjiga k :knjige) {
			if(k.getNaslov().toLowerCase().contains(naslov.toLowerCase().trim())) {
				listaRezultati.add(k);
			}
		}
		return listaRezultati;
	}

}
