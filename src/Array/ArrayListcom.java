package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListcom {
	public static void main(String[] args) {

		String[] wordArray = { "Level", "Ada", "Kayak", "Bob", "Rotator", "Ahmed" };
		List<String> strList = new ArrayList<>();
		for (String str : wordArray) {
			strList.add(str);
			printListWithIndex(strList);
		}

		// List<String> strList = new ArrayList<>();
		//
		// for (String str : wordArray) {
		//
		// strList.add(str);

		printListWithIndex(strList);
		strList.add(2, "Java");
		System.out.println(strList);

		String oldElement = strList.set(1, "Naan");
		System.out.println("Element	that	was	replaced:	" + oldElement);
		printListWithIndex(strList);

		String newElement = strList.set(2, "Kaan");
		System.out.println("Element	that	was added:	" + newElement);
		printListWithIndex(strList);

		System.out.println("Element	removed:	" + strList.remove("Kaan"));
		printListWithIndex(strList);
		System.out.println("The	size	of	the	list	is	" + strList.size());

		System.out.println("\n(7)	Determine	if	the	list	is	empty:");
		boolean result = strList.isEmpty();
		System.out.println(result);
		System.out.println("=================================");

		List<String> strList2 = new ArrayList<>(strList);
		boolean trueOrFalse = strList.equals(strList2);

		// strList2.add(null);
		printListWithIndex(strList);
		printListWithIndex(strList2);
		trueOrFalse = strList.equals(strList2);

		System.out.println("The	lists	strList	and	strList2	are" + (trueOrFalse ? "" : "	not") + "	equal.");
		System.out.println("First	element:	" + strList.get(0));
		System.out.println("Last	element:	" + strList.get(strList.size() - 1));

		boolean found = strList.contains("Naan");
		String msg = found ? "contains" : "does	not	contain";
		System.out.println(msg);

		System.out.println("=============================================================");

		int pos = strList.indexOf("Bob");
		System.out.println(pos);
		pos = strList.indexOf("BOB");
		System.out.println(pos);
		pos = strList.lastIndexOf("Bob");
		System.out.println(pos);
		printListWithIndex(strList);
		for	(int	i	=	0;	i	<	strList.size();	i++)	{					
			System.out.print(i	+	":"	+	strList.get(i)	+	"	");		
			}			
		System.out.println();
		
		System.out.println("============================================================================");
		for	(String	str	:	strList)	{			
			System.out.print(str	+		"	");					
				//strList.remove(str);						
		//	Throws ConcurrentModificationException.			
			}				System.out.println();
			System.out.println("+===========================================");
			
			Object[]	objArray	=	strList.toArray();			
			System.out.println("Object[]	length:	"	+	objArray.length);			
				
			for	(Object	obj	:	objArray)	{	
				System.out.println(obj);
				String	str	=	(String)	obj;	//	Cast	required.		
			System.out.print("--->"+str.length()	+	"	");
			}
	System.out.println("000=====================================================================");	
			
			
			String[] strArray=strList.toArray(new String[0]);
			
System.out.println(strArray.length);
for (String str : strArray) {
	System.out.print(str.length()+  "   ");
	
//	String[]	strArray	=	strList.toArray(new	String[0]);			
//	System.out.println(strArray.length+"----");		
//		
//	for	(String	str	:	strArray)	{			
//		System.out.print(str.length()	+	"	");	
	
			List<StringBuilder>	sbList	=	new	ArrayList<>();				
			for	(String	str1	:	strArray)	{				
				sbList.add(new	StringBuilder(str));				}
		}
//Collections.sort(sbList);												
//	Compile-time	error!		
System.out.println("Unsorted	list:	"	+	strList);			
Collections.sort(strList);
System.out.println("sorted	list:	"	+	strList);		
}
		
		

	

	public static <E> void printListWithIndex(List<E> list) {

		List<String> newList = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			newList.add(i + ":" + list.get(i));
		}
		System.out.println(newList);

	}

}
