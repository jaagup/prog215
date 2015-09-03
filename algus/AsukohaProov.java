public class AsukohaProov{
   public static void main(String[] arg){
      Asukoht haapsalu=new Asukoht(58.936864, 23.540753);
	  Asukoht tartu=new Asukoht(58.371829, 26.729506);
	  Teekond tee1=new Teekond("Koolitee");
	  tee1.lisaPunkt(haapsalu, "Haapsalu");
	  tee1.lisaPunkt(new Asukoht(58.887944, 25.568624), "Paide");
	  tee1.lisaPunkt(tartu, "Tartu");
	  System.out.println(tee1);
   }
}