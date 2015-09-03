public class AsukohaProov{
   public static void main(String[] arg){
      Asukoht haapsalu=new Asukoht();
	  haapsalu.lat=58.936864;
	  haapsalu.lng=23.540753;
	  Asukoht tartu=new Asukoht();
	  tartu.lat=58.371829;
	  tartu.lng=26.729506;
	  System.out.println("Ajavahe: "+
	    (tartu.lng-haapsalu.lng)/360*24*60+" minutit");
   }
}