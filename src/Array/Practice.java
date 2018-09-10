package Array;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			String[] bag1 = {"pen","pencil","books","eraser"};

		String[] bag2 = {"pen","computer","books","phone","eraser"};
	//	SEARCH:
		for(String stationery1:bag1) {
			boolean found=false;
			for(String stationary2:bag2) {
				if(stationery1.equals(stationary2)) {
					found=true;
					//break SEARCH;
					
				}
			}
			if(found) {
			System.out.println(stationery1 + "  is in a bag 2");
		}else{
			System.out.println(stationery1 + "   is not in a bag 2");
		}
	}

}}
