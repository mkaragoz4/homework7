package questions;

import java.util.Arrays;
import java.util.Scanner;

/**
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

public class Question4 {
	
	private static java.lang.Object urunlist;
	private static final Object Object = urunlist;
	private static int i;

	public static void main (String[]args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("5 adet ucretsız urun satın alma hakkı kazandınız \n Lütfen bu urunleri gırınız:");
		
		String []urunler =new String[5];
		
		for (int i=0; i<urunler.length; i++);
		
		
		urunler[i]=scan.nextLine();
		 
	
	
	Urunlist urunlist = new Urunlist();
	
    String[] list = urunlist.getList(Object , Object , Object , Object, Object );{
	
	
    for (String urun : list) {
        System.out.println(urun);
    }
	
    Arrays.sort(list);
	
	
	
    System.out.println("\nAlfabetik sıraya göre sıralanmış ürünler:");
    for (String urunList : list) {
        System.out.println(urunler);
    }
	
	
	
    
	String replacementProduct = list[2];
    System.out.println("\n3. indeksdeki eleman '" + list[2] + "' '" + replacementProduct + "' ile değiştiriliyor.");
    list[2] = replacementProduct;
	
    }
	
    }
	
}

