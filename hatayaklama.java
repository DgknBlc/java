
import java.util.Scanner;
public class hatayaklama {

	public static void main(String args[]){
		Scanner input= new Scanner(System.in);
		System.out.print("ilk say�");
		int sayi1 =input.nextInt();
		System.out.print("ikinci say�");
		int sayi2 =input.nextInt();

		if (sayi2<= 0){
			throw new IllegalArgumentException("girilen say� pozitif de�il "+ sayi2);
		}
		System.out.println(sayi1/sayi2);
	}
	
}
