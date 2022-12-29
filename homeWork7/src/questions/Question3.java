package questions;

public class Question3 {
	/*
	 * Asagida verilmis olan sayifalardaki kodlari inceleyin, sonuclari tahmin edin,
	 * daha sonra bu kodlari eclipse’ te yazarak dogru sonucu consol’ a yazdirin.
	 * Tahmininiz ile gercek sonucu karsilastirin. Yalnis tahmin yaptiysaniz
	 * sebebini kendi kendinize bulmaya calisin, bulamazsaniz grup toplantinizda
	 * arkadaslarinizla ve mentorlerinizle birlikte inceleyiniz.
	 */
	
	
	static int x;
	int y;
	
	Question3(){
		x+=2;
		y++;
	}
	static int getSquare() {
		return x * x;
	}
	
	public static void main(String []args) {
		
		
		Question3 sm1=new Question3();
		
		Question3 sm2=new Question3();
		
		int z = sm1.getSquare();
		
		System.out.println("-x" + z + "-y" + sm2.y);
		
		
		
	}
	
}
