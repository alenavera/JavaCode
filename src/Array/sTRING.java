package Array;

public class sTRING {

	public static void main(String[] args) {
		String[] group1 = {"Busra","Christos","Asel","Gulshan","Usen","Tamara"};

		String[] group2 = {"Ilya","Christos","Usen","Gulshan"," Asel","Dana"};
for(String class1:group1) {
	boolean k =false;
	for(String class2:group2) {
		if(class1.equals(class2)) {
			k=true;
		}
	}
	if(k) {
		System.out.println(class1+ " is in group  2");
	}else{
		System.out.println(class1 + "  is not in group 2");
	}
}
	}

}
