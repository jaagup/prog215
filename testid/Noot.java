public class Noot{
	private int korgus=-1;
	public Noot(String nimetus){
		if(nimetus.equals("A")){
			korgus=69;
		}
		if(nimetus.equals("C")){
			korgus=60;
		}
	}	
	public int kysiKorgus(){
		return korgus;
	}
}