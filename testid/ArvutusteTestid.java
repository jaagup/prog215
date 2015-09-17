import org.junit.*;
import static org.junit.Assert.*;
public class ArvutusteTestid{
	@Test
    public void pikkuseTest(){
		assertEquals(5.0, Arvutused.pikkus(3, 4), 0.01);
	}	
}