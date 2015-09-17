import org.junit.*;
import static org.junit.Assert.*;
public class NoodiTestid{
	@Test
	public void loomine(){
		Noot n1=new Noot("A");
		try{
		  Noot n2=new Noot("X");
		  fail("Loodi lubamatu noot");
		} catch(Exception ex){}
	}
	@Test
	public void korgus(){
		Noot n1=new Noot("A");
		assertEquals(69, n1.kysiKorgus());
		//Lisage C kõrgusega 60
		Noot n2=new Noot("C");
		assertEquals(60, n2.kysiKorgus());
	}
}