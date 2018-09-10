package Array;

public class IntArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String names[] ={"Erick", "Lisa", "Hose", "Roger", "Nina", "Ekaterina", "Peter", "Sara"};
		String[]namesWithFan= new String[8];
		for(String name  : names ){
			for (int k=0; k < names.length; k++) {
				namesWithFan[k] = names[k]+ "fan"	;
			}
			
		}
		for(String s:namesWithFan) {
			System.out.println(s);
         }
	}
}