package ders0404;

public class Hesaplama4 {

	int sabit = 2 ;
	private int ozelsabit = 1 ;
	public static class Toplama4{
		static int toplam ; 
		int sonuc ;
		public int toplamaYap(int a, int b){
			//return (a+b) +sabit ; !Hata
			sonuc = toplam = a+b;
			return sonuc;
		}
		public void dekontOlustur(){
			/* sabit alan�na ve ekranaBas() yordam�na ula�abilmek i�in Hesaplama4s�n�f�na ait nesne olu�turmam�z gerekir*/
			Hesaplama4 hs4 = new Hesaplama4(); //do�ru
			int a = hs4.ozelsabit;//do�ru
			hs4.ekranaBas(); //do�ru
			System.out.println("Dekont olu�turuluyor = "+ hs4.sabit + "-" + a);
		}
	}
	
	public class Cikartma4{
		int sonuc ;
		//static int sonuc1;   //!hata
		public int cikartmaYap(int a, int b){
			ekranaBas();
			sonuc = (a-b) - ozelsabit ;
			return sonuc; //dikkat
		}
	}
	private void ekranaBas(){
		System.out.println("Hesaplama4.ekranaBas()");
	}
	public static void main(String args[]){
		//!hata  Toplama4 statik dahili �ye s�n�f�na  �evreleyen s�n�fa ait herhangi bir  kalmadf�k
		//Hesaplama4.Toplama4 tp4 = new Hesaplama4().new Toplama4;
		Toplama4 tp4 = new Toplama4();
		tp4.dekontOlustur();
		int sonuc = tp4.toplamaYap(10, 5);
		System.out.println("Sonuc = 10 + 5 = " +sonuc );
	}

	

	
}
