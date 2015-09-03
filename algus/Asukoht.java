class Asukoht{
   public Asukoht(double laiuskraad, double pikkuskraad){
      lat=kraadParajaks(laiuskraad);
	  lng=kraadParajaks(pikkuskraad);
   }
   private double kraadParajaks(double kraad){
      while(kraad>180) {kraad-=360;}
      while(kraad<-180){kraad+=360;}
	  return kraad;
   }
   public @Override String toString(){ return "("+lat+","+lng+")";}
   private double lat;
   private double lng;
   public double getLat(){return lat;}
   public double getLng(){return lng;}
}