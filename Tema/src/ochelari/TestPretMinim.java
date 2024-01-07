package ochelari;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestPretMinim {

	@Test
	public void TestarePretMinim() 
	{
		Ochelari[] tablou =  new Ochelari[5];
		tablou[0] = new Ochelari("Gucci", 2500, "soare");
		tablou[1] = new Ochelari("Bvlgari", 3000, "vedere");
		tablou[2] = new Ochelari("Lensa", 340, "vedere");
		tablou[3] = new Ochelari("Bershka", 100, "soare");
		tablou[4] = new Ochelari("Gucci", 3400, "soare");
		
		Ochelari o = Main.pretMinim(tablou);
		Assertions.assertEquals(tablou[3], o);
		
	}

}
