package questions;

import java.util.ArrayList;
import java.util.Arrays;

public class Q4SecondClass {
		
		public static String urun[]=new String[5];
		
		
		
	public static void listUrunler(String[]urunler) {
		
		System.out.println("Girilen ürünler");
		
		
		for (int i = 0; i < urun.length; i++) {
			System.out.println(urun[i]);
		
	}

		Arrays.sort(urun);
		System.out.println("Ürünler alfabetik sıraya göre sıralandı: ");
		for (int i = 0; i < urun.length; i++) {
		System.out.println(urun[i]);
		}
		urunler[2] = "Yeni Ürün";
		
		
	
	
}
}	
	
