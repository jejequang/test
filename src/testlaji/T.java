package testlaji;
class cal {
	void show(String s){
		String ns = "";
		for(int  i = 0;i<s.length();i++){
			ns = s.charAt(i)+ns;
			System.out.println(ns);	
		}
	}
	void show(int s){
		int i,ns = 0;
		while(s != 0){
			ns = ns+ s%10;
			s= s/10;
		}
		System.out.println(ns);
	}
}
public  class T {

	public static void main(String[] args) {
		cal cal = new cal();
		cal.show(12345);
//		System.out.println(args);
//		for(String str:args){
//			System.out.println(str);
//		}
	}
	
	
}
