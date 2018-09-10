package Array;

public class increment {

	public static void main(String[] args) {
		
	String out="Jama";	
	//String word="Gulshan";
	
	increment t=new increment();
//	System.out.println(t.makeOutWord(out, word));
	String tag="i";
	String word="Gulshan";
	System.out.println(t.makeTags(tag, word));
	System.out.println(t.extraEnd("Gulshan"));
	System.out.println(t.ch("i"));
	System.out.println(t.half("kam"));
	System.out.println(t.min("jailoo"));
	System.out.println(t.comboString("kambar", "Jylyzbek"));
	System.out.println(t.nonStart("Okan", "Alkan"));
	System.out.println(t.frontBack("Gulshan"));
	System.out.println( t.withoutX2("Gulshan"));
	}

public String makeOutWord(String out, String word)

{	return (out.substring(0, 2) + word + out.substring(2, 4));	
}

public String makeTags(String tag, String word)

{	return ('<' + tag + '>' + word + '<' + '/' + tag + '>');	}

	

public String extraEnd(String str)

{

	int len = str.length();
	System.out.println(len);
	String temp = str.substring(len-2,7);

	return (temp + temp + temp);
	
}
public String ch(String s) {
	if(s.length()>=3) {
		return s.substring(0,2);
	}
		return s;
	}
public String half(String wo) {
	return wo.substring(0, wo.length()/2);

	
}
//Given a string, return a version without the first and last char, so "Hello" yields "ell".

		// The string length will be at least 2.
		public String min(String str) {
			return str.substring(1,str.length()-1);
		}
		public String comboString(String a, String b){
			if(a.length()>=b.length() ) {
				return a+b+a;
			}
				return b+a+b;
			}

public String nonStart(String a, String b)

{	
	return (a.substring(1) +" "+ " "+b.substring(1));
}
public String frontBack(String str) {
	
	  if (str.length() <= 1) return str;
	  
	  String mid = str.substring(1, str.length()-1);
	  
	  // last + mid + first
	  return str.charAt(str.length()-1) + mid + str.charAt(0);
	
}	
public String withoutX2(String str){

	int len = str.length();

	if(len >= 2)

	{

		char ch = str.charAt(0);

		StringBuilder stbuild = new StringBuilder(len);

		if(ch != 'x')

			stbuild.append(ch);

		ch = str.charAt(1);

		if(ch != 'x')

			stbuild.append(ch);

		stbuild.append(str.substring(2));

		return stbuild.toString();

	}

	else if(len == 1 && str.charAt(0) == 'x')

		return "";

	else

		return str;

}
}


