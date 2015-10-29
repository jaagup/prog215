//int b=2;  kõik muutujad peavad olema klassi või funktsiooni sees
public class Skoop1{
	int a=3;
    void suurenda(){
		a++;
		//c++;  teise funktsiooni muutuja pole nähtav
	}	
	void loenda(){
		int c=4;
		//d=3;  ei saa kasutada enne kui deklareeritakse
		int d=5;
		{
			int f=11;
			
		}
		//f=5; deklareerimisplokist väljas ei saa kasutada
	}
}