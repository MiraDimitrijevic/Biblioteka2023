package biblioteka.interfejs;

import java.util.List;

import biblioteka.Autor;
import biblioteka.Knjiga;

public interface BibliotekaInterfejs {

	public void dodajknjigu(Knjiga knjiga);
	public void obrisiKnjigu(Knjiga knjiga);
	public List<Knjiga> vratiSveKnjige();
	public List<Knjiga> pronadjiKnjigu(Autor autor, long ISBN, String naslov, String izdavac);
}
