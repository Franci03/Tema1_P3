package ochelari;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestTipOchelari {

	@Test
	public void testareTipOchelari() 
	{
		Ochelari[] tablou =  new Ochelari[3];
		tablou[0] = new Ochelari("Lensa", 500, "vedere");
		tablou[1] = new Ochelari("Bershka", 100, "soare");
		tablou[2] = new Ochelari("Gucci", 3400, "soare");
		
		Ochelari[] rezultat = Main.tipOchelari("vededre", tablou);
		Assertions.assertEquals(1, rezultat.length);
		
	}

}
