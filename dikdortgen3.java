package ders2802;

public class dikdortgen3 {
	//s�n�f�m�za ai veri alanlar�n� kaps�lleme y�ntemi ile belirleyelim
	private double en;
	private double boy;
	//varsay�lan yap�land�r�c� yazal�m.
	//en veri alan�m�z� getter y�ntemi ile d�nd�relim.
	public double getEn(){
		return en;
	}
	//en veri alan�m�za setter y�ntemi ile de�er atayal�m. 
	//d�n�� de�eri yok void
	public void setEn(double x){
		en = x;
	}
	//boy veri alan�m�z� getter y�ntemi ile d�nd�relim
	public double getBoy(){
		return boy;
	}
	//boy veri alan�m�za setter y�ntemi ile de�er atayal�m. 
	//d�n�� de�eri yok void
	public void setBoy(double boy){
		this.boy = boy;
	}
	public double alan(){
		return en*boy;
	}
}
