package questions;

import java.util.Scanner;

/*
Iki farkli class olusturun. Birinci klasta kullanicidan; bir alisveris sitesinden 
5 adet urunu ucretsiz satin alabilme hakki kazandigini soyleyin ve bu 5 urunu 
isteyin(main method icinden). Ikinci class’ da ise bu urunleri bir array adi altinda 
listeleyen, nonstatic, String array donuslu, 5 argumanli bir method olusturunuz. 
Birinci class’ ta method call uzerinden alacaginiz array verisinin elemanlarini tektek yazdirin. 
Daha sonra bu arrayin icindeki elemanlari alfabetik siraya gore yazdirin. Arrayin 3. Index’indeki 
elemani istediginiz bir urunle degistirin. Degistirdiginiz urunun array icinde olup olmadigini 
sorgulayin, eger urun arrayin icinde ise “degisiklik yaptiginiz urun listeye eklenmistir.” 
Ibaresini consol’a yazdirin. 
*/
public class Q4FirstClass {
	
	public static void main(String[]args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("5 adet ürünü ücretsiz satın alma hakkınız var.\n Lütfen bu ürünleri giriniz:");
		
		
		String[] urun= new String[5];
		
		for (int i = 0; i < urun.length; i++) {
			urun[i] = scan.nextLine();
			}
		
		Q4SecondClass.listUrunler(urun);
		
	}

}
