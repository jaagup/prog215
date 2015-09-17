public class Arvutused{
	public static double pikkus(double dx, double dy){
		return Math.sqrt(Math.pow(dx, 2)+dy*dy);
	}	
	public static double punktideVahelineKaugus(double x1, double y1, double x2, double y2){
		return pikkus(x2-x1, y2-y1);
	}
}