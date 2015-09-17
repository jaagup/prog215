import org.junit.*;
import static org.junit.Assert.*;
public class ArvutusteTestid{
	@Test
    public void pikkuseTest(){
		assertEquals(5.0, Arvutused.pikkus(3, 4), 0.01);
		assertEquals(0.0, Arvutused.pikkus(0, 0), 0.01);
		assertEquals(5.0, Arvutused.pikkus(3,-4), 0.01);
	}	
	//Koostage testfunktsioon kauguse leidmiseks kahe koordinaadipaari vahel tasandil
	//Loo tegelik funktsioon tulemuse arvutamiseks, käivita testi kaudu.
	@Test
	public void punktideKauguseTest(){
		assertEquals(1.41, Arvutused.punktideVahelineKaugus(2, 1, 1, 2), 0.01);
		assertEquals(5, Arvutused.punktideVahelineKaugus(1, 5, 4, 1), 0.01);
	}
}
/*
jaagup@tigu:~/public_html/15/prog215/testid$ javac -cp .:junit-4.12.jar ArvutusteTestid.java
jaagup@tigu:~/public_html/15/prog215/testid$ java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore ArvutusteTestid
JUnit version 4.12
.
Time: 0.053

OK (1 test)
*/