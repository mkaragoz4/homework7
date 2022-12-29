package questions;

public class Question3b {

	int number;
	String name;
	static String college="ITS";
	
	Question3b(int r, String n, String college){
		
		this.number=r;
		this.name=n;
		this.college=college;
		
		
	}
	
	public static void main(String[]args) {
		
		Question3b s1=new Question3b(111,"Karan", "MIT");
		Question3b s2=new Question3b(222,"Aryan", "Harvard");
		
		
		System.out.println(s1.number);
		System.out.println(s2.number);
		
		System.out.println(s1.name);
		System.out.println(s2.name);
		
		System.out.println(s1.college);
		System.out.println(s2.college);
		
	}
	
	
}
