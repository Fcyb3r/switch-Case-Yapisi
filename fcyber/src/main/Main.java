package main;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		/*
		 * Bir turizm şirketi farklı tur çeşitlerinden oluşan bir liste sunuyor.
		 * Kullanıcı bu listeden ilgilendiği bir turu seçtiğinde, o turla ilişkili
		 * ayrıntılı bilgiye ulaşıyor. Burada aşağıdaki basit algoritmayı uygulayacağız
		 * 
		 * Tur seçenekleri ekrana yazdırılır. Kullanıcıdan bu tur seçeneklerinden bir
		 * tanesini seçmesi istenir. Kullanıcının seçimine uygun olan tur hakkındaki
		 * bilgiler ekrana yazdırılır.
		 * 
		 */

		Scanner input = new Scanner(System.in);
		int secilenDeg;
		System.out.println("Fcyber turizm saygıyla sunar");
		System.out.println("(1)Ucuz suriye turu");
		System.out.println("(2)Orta hindistan turu");
		System.out.println("(3)Orta vietnam turu");
		System.out.println("(4)Pahali Amerika turu");
		System.out.println("Secim yapiniz");
		secilenDeg = input.nextInt();

		switch (secilenDeg) {
		case 1:
			System.out.println("Ucuz suriye turu listesi");
			System.out.println("BOMBA VARR DİKKAT ET");
			break;
		case 2:
			System.out.println("Orta hindistan turu listesi");
			System.out.println("CANTAN CALINDI");
			break;
		case 3:
			System.out.println("Orta vietnam turu listesi");
			System.out.println("Burasi vietnamm!!!!");
			break;
		case 4:
			System.out.println("|---Pahali Amerika turu listesi---|");
			System.out.println("Macera dolu amerika");
			break;
		default:
			System.out.println("Yalnızca listedekileri secebilirsiniz");
			break;

		}
	}

}