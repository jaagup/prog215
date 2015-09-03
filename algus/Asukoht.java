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
   public double kaugus(Asukoht a2){
      double dLat=Math.toRadians(this.getLat()-a2.getLat());
      double dLng=Math.toRadians(this.getLng()-a2.getLng());
	  double abi=Math.sin(dLat/2)*Math.sin(dLat/2)+
	    Math.cos(Math.toRadians(this.getLat()))*
	    Math.cos(Math.toRadians(a2.getLat()))*
		Math.sin(dLng/2)*Math.sin(dLng/2);
      double c=2*Math.atan2(Math.sqrt(abi), Math.sqrt(1-abi));
	  return c*6371;		
   }
   public @Override String toString(){ 
      return "("+this.getLat()+","+this.getLng()+")";}
   private double[] koordinaadid=new double[2];
   public double getLat(){return koordinaadid[0];}
   public double getLng(){return koordinaadid[1];}
}