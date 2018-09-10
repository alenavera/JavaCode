package Array;

import java.util.Arrays;

public class UsingNestedLoop {

	public static void main(String[] args) {
		int[] ducks= {1,2,3,4,5};
		for(int i=0;i<ducks.length;i++) {
			System.out.print(ducks[i]+" ");
		}System.out.println();
for(int eachDuck:ducks) {
	System.out.print(eachDuck+" ");
}System.out.println();
int[][] Ponds= {{1,23,3},{1,34,33,5,6},{1}};  
for(int i=0;i<Ponds.length;i++) {
	int[]eachPond=Ponds[i];
	//System.out.println(Arrays.toString(Ponds[i]));
	//System.out.println(Arrays.toString(eachPond));
	//eachPond[0]=eachPond[0]+20;
	for(int j=0;j<eachPond.length;j++) {
		System.out.print(Ponds[i][j]+" ");
	}
}System.out.println();
System.out.println(Arrays.deepToString(Ponds));
	}

}
