package ders2802;

public class dhesap3 {
	public static void main(String[] args){
		dikdortgen3 d5 = new dikdortgen3();
		dikdortgen3 d6 = new dikdortgen3();
		
		d5.setEn(2);
		d5.setBoy(10);
		d6.setEn(5);
		d6.setBoy(20);
		System.out.println("dikd�rtgenin alan� =" + d5.alan());
		System.out.println("dikd�rtgenin alan� =" + d6.alan());
		System.out.println("d5 dikd�rtgenin eni="+d5.getEn());
		System.out.println("d5 dikd�rtgenin boyu="+d5.getBoy());
		System.out.println("d6 dikd�rtgenin eni="+d6.getEn());
		
		
		
	}
//hata veriyor ��nk� dikdort2 class�nda private elemana eri�mek istiyoruz.
}
