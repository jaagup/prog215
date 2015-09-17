import java.util.*;
public class Noot{
	private int korgus=-1;
	private static Hashtable<String, Integer> korgused=new Hashtable<String, Integer>(); 
	static {
		korgused.put("A", new Integer(69));
		korgused.put("C", new Integer(60));
	}
	public Noot(String nimetus){
		korgus=korgused.get(nimetus);
	}	
	public int kysiKorgus(){
		return korgus;
	}
}