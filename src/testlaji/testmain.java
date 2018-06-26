package testlaji;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

import javax.swing.JFrame;
class Book {
	
	String name;
	
	int price;
	
	public Book(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return this.name+"-"+this.price;
	}

	/*@Override
	public int compareTo(Object o) {
		Book b = (Book)o;
		return this.price - b.price;
	}*/
}


//自定义一个比较器
class BookComparetor implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		return o1.price-o2.price;
	}

	
	
	
	
}
public class testmain  {
	
	
	public static void main(String[] args) {
		String str = getType("abc");
		int  i = getType(123);
		
	}
	public static <T>  T getType(T t){
		return t;
	}
	
	
	
}
