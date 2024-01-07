package ochelari;
public class Main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//Ochelari a = new Ochelari();
		Ochelari b = new Ochelari("Gucci", 2500, "soare");
		Ochelari c = new Ochelari("Bvlgari", 3000, "vedere");
		
		//System.out.println(a);
		//System.out.println(b);
		
		//b) Creați un tablou de ochelari și afișați tabloul
		Ochelari[] tablouOchelari =  new Ochelari[5];
		tablouOchelari[0] = b;
		tablouOchelari[1] = c;
		tablouOchelari[2] = new Ochelari("Dedeman", 80, "sudura");
		tablouOchelari[3] = new Ochelari("Bershka", 100, "soare");
		tablouOchelari[4] = new Ochelari("Gucci", 3400, "soare");
		
		for(int i = 0; i < tablouOchelari.length; i++)
		{
			System.out.println(tablouOchelari[i]);
		}
		
		
		
		Ochelari o1 = pretMinim(tablouOchelari);
		System.out.println("Cea mai putin costisitoare pereche de ochelari: "+ o1);
		
		producatoriDistincti(tablouOchelari);
		
		System.out.println("Afisare ochelari de soare");
		//tipOchelari("soare", tablouOchelari);
		Ochelari[] tipul = tipOchelari("soare", tablouOchelari);
		for(Ochelari oc : tipul)
			System.out.println(oc);
		
		
}
	
	//c) Creați o metodă care găsește și afișează perechea de ochelari mai puțin costisitoare din tablou
			
	public static Ochelari pretMinim(Ochelari[] tablou)
	{
		float pmin = tablou[0].getPret();
	
			Ochelari o = tablou[0];
			for(int i = 1; i < tablou.length; i++)
			{
				if(tablou[i].getPret() < pmin)
				{
					pmin = tablou[i].getPret();
					o = tablou[i];
					
				}
				
			}
			return o;
	}
	
	/*d) Creați o metodă care să numere pentru fiecare producător distinct numărul de ochelari
	produși de acel producător prezent în tablou*/
	
	public static void producatoriDistincti(Ochelari[] tablou) 
	{
	    String[] producatori = new String[tablou.length];
	    int[] nrOchelari = new int[tablou.length];
	    int p = 0; //nr de producatori distincti

	    for (Ochelari o : tablou) 
	    {
	        int ok = 0;

	        for (int i = 0; i < p; i++) // parcurgere lista de producatori deja inregistrati
	        {
	            if (producatori[i].equals(o.getProducator())) 
	            {
	                nrOchelari[i]++;
	                ok = 1;
	                break;
	            }
	        }

	        if (ok == 0) 
	        {
	            producatori[p] = o.getProducator();
	            nrOchelari[p] = 1;
	            p++;
	        }
	    }

	    
	    System.out.println("Numărul de ochelari pentru fiecare producător distinct:");
	    for (int i = 0; i < p; i++) {
	        System.out.println(producatori[i] + ": " + nrOchelari[i]);
	    }
	}
	
	
	/*e) Creați o funcție care primește ca parametru un tip de ochelari și un tablou de ochelari și
		afișează ochelarii din tablou care au acel tip*/
	
	/*public static void tipOchelari(String tip, Ochelari[] tablou)
	{
		for(Ochelari o : tablou)
			if(o.getTip().equals(tip))
				System.out.println(o);
	}*/
	
	public static Ochelari[] tipOchelari(String tip, Ochelari[] tablou)
	{
		Ochelari[] sir = new Ochelari[tablou.length];
		int c = 0;
		for(Ochelari o : tablou)
			if(o.getTip().equals(tip))
			{
				sir[c++] = o;
			}
		
		Ochelari[] rezultat = new Ochelari[c];
	    System.arraycopy(sir, 0, rezultat, 0, c);
		return rezultat;
	}

}
