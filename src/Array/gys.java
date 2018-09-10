package Array;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class gys {
	public static void main(String[] args) {
	String str="abc";
	str.replace("a", "d");
	System.out.println(str);
	LocalDate now =LocalDate.parse("2018-02-11", DateTimeFormatter.ISO_LOCAL_DATE);
	System.out.println(now);
	System.out.println(now.plusDays(2));
	System.out.println(now.plusDays(2));
	
//	
//LocalDate today1=LocalDate.of(1988,04,9);
//System.out.println(today1);
}
}