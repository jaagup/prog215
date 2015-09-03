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
	  for(TeekonnaPunkt t: punktid){
	    sb.append(t.koht+" "+t.nimetus+"\n");
	  }
	  return sb.toString();
   }
}