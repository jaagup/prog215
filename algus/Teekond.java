import java.util.*;
class Teekond{
   String nimetus;
   ArrayList<TeekonnaPunkt> punktid=new ArrayList<TeekonnaPunkt>();
   public Teekond(String nimetus){
      this.nimetus=nimetus;
   }
   public void lisaPunkt(Asukoht koht, String nimetus){
      punktid.add(new TeekonnaPunkt(koht, nimetus));	  
   }
   public @Override String toString(){
      StringBuffer sb=new StringBuffer();
	  sb.append("Teekond: "+nimetus+"\n");
	  for(int i=0; i<punktid.size(); i++){ 
	    TeekonnaPunkt t=punktid.get(i);
	      //lisage valjatrukil ka kaugus algpunktist
	    sb.append(t.koht+" "+t.nimetus+"\n");
	  }
	  return sb.toString();
   }
}