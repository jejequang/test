package testlaji;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
	public static String log = "";
	public static ArrayList<String> m_list  = new ArrayList<String>();
	public static class haha implements  Runnable{
		public int i = 1;
		haha(List<String> list){
			for(int i = 0 ; i< list.size();i++){
				m_list.add(list.get(i));
			}
		}
		public void run() {
			
				for(int i = 0;i<m_list.size();i++){
					log = m_list.remove(0);
					System.out.println(log);
				}
		}
	}
	public static void main(String[] args) {
		String[] srcArr = new String[]{"aa","bb","cc"};
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(srcArr));
		Thread t1 = new Thread(new haha(al));
		Thread t2 = new Thread(new haha(al));
		t1.start();
		t2.start();
		}
}
