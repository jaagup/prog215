import java.io.*;
public class Arvutused{
   static double kogumass(int kogus, double yhemass){
      return kogus*yhemass;
   }   
   public static void main(String[] arg) throws IOException{
      double kotimass=2.5;
	  int kottidearv=3;
	  System.out.println("Kokku: "+kotimass*kottidearv);
	  System.out.println("Mitu kotti seekord?");
	  BufferedReader lugeja=new BufferedReader(
	    new InputStreamReader(System.in)
	  );
	  String rida=lugeja.readLine();
	  try{
	     kottidearv=Integer.parseInt(rida);
 	     System.out.println("Kokku: "+kogumass(kottidearv, kotimass));		 
		 for(int kotinr=1; kotinr<=kottidearv; kotinr++){
		    System.out.println(kotinr+": "+kotinr*kotimass);
		 }
	  } catch(Exception ex){
	     System.out.println("Probleem: "+ex.getMessage());
	  }
   }
}