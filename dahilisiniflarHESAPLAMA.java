package ders0404;

public class dahilisiniflarHESAPLAMA {
	

	public class Toplama {//dahili �ye s�n�f
		public int toplamaYap(int a, int b) {
			return a+b;
		}
	} //class Toplama
	
	public static void main(String args[]) {
		dahilisiniflarHESAPLAMA.Toplama ht = new dahilisiniflarHESAPLAMA().new Toplama();
		int sonuc = ht.toplamaYap(3, 5);
		System.out.println("Sonuc = " + sonuc);
	}
	
}//class dahilisiniflarHESAPLAMA
/* neden aray�zler var?
 * aray�zler ile �oklu kal�t�m deste�i k�smen bulabiliyorduk ama bu tam de�ildi. tam de�ildi ��nk� bir s�n�f iki normal s�n�ftan t�ret�lemiyordu
 * bir dahili �ye s�n�f private eri�im belirleyicisine sahip olsa dahi, �evreleyici s�n�f i�erisindeki t�m yordamlar taraf�ndan eri�ebilirlerbu k�s�t ancak ba�ka s�n�flar i�in ge�erlidir 
 */
