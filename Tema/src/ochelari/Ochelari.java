package ochelari;

/**
 * Clasa Ochelari are ca scop descrierea obiectelor de tip Ochelari, prin atribute specifice
 * precum producatorul, pretul si tipul ochelarilor
 * @author Francesca
 * @version Tema Laborator 1.0
 * @since 19.10.2023
 */
/**
 * 
 */
public class Ochelari {
	
	private String producator;
	private float pret;
	private String tip;
	
	/**
	 * Constructor fara parametri, care initializeaza atributele clasei Ochelari 
	 * cu valori implicite.
	 */
	public Ochelari()
	{
		producator = "necunoscut";
		pret = 0;
		tip = "necunoscut";
	}
	
	
	/**
	 * Constructor cu parametri, care initializeaza atributele unei perechi de ochelari cu valori specificate.
	 * @param producator Producatorul ochelarilor
	 * @param pret Pretul aproximativ al unei perechi de ochelari produsa de un anumit producator
	 * @param tip Tipul ochelarilor, specificat in functie de necesitate, intrebuintare
	 */
	public Ochelari(String producator, float pret, String tip)
	{
		this.producator = producator;
		this.pret = pret;
		this.tip = tip;
	}
	
	
	/**
	 * Suprascriere a metodei toString(), pentru a putea asigura afisarea informatiilor referitoare la ochelari.
	 */
	public String toString()
	{
		return producator + " " + pret + " " + tip;
	}
	
	
	/**
	 * Metoda de tip get, care doreste returnarea pretului ochelarilor.
	 * @return Pretul unei perechi de ochelari.
	 */
	public float getPret()
	{
		return pret;
	}
	
	
	/**
	 * Metoda de tip get, ce returneaza numele producatorului de ochelari.
	 * @return Numele producatorului perechii de ochelari.
	 */
	public String getProducator()
	{
		return producator;
	}
	
	
	/**
	 * Metoda de tip get, ce returneaza tipul perechii de ochelari.
	 * @return Tipul ochelarilor.
	 */
	public String getTip()
	{
		return tip;
	}

}
