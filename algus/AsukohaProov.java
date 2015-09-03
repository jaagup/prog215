public class AsukohaProov{
   public static void main(String[] arg){
      Asukoht haapsalu=new Asukoht(58.936864, 23.540753);
	  Asukoht tartu=new Asukoht(58.371829, 26.729506);
      System.out.println(haapsalu+" "+tartu);
	  System.out.println(haapsalu.getLat());
	  System.out.println(tartu.kaugus(haapsalu));
	  Asukoht[] teekond=new Asukoht[3];
	  teekond[0]=haapsalu;
	  teekond[1]=new Asukoht(58.887944, 25.568624);
	  teekond[2]=tartu;
	  for(int i=0; i<teekond.length; i++){
	    System.out.println(teekond[i]);
	  }
   }
}