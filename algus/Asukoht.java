class Asukoht{
   public Asukoht(double laiuskraad, double pikkuskraad){
      koordinaadid[0]=kraadParajaks(laiuskraad);
	  koordinaadid[1]=kraadParajaks(pikkuskraad);
   }
   private double kraadParajaks(double kraad){
      while(kraad>180) {kraad-=360;}
      while(kraad<-180){kraad+=360;}
	  return kraad;
   }
   public @Override String toString(){ 
      return "("+this.getLat()+","+this.getLng()+")";}
   private double[] koordinaadid=new double[2];
   public double getLat(){return koordinaadid[0];}
   public double getLng(){return koordinaadid[1];}
}