package Array;

public class Herbivore extends Omnivore {
	private int num=8;
	public Herbivore(int age) {
		super(age);
		
		this.size=4;
		
	}
public void dis() {
	System.out.println(super.getAge());
	System.out.println(super.size);
	System.out.println(this.num);
}
public static void main(String[] args) {
	Omnivore h=new Omnivore(10);
	h.dis();
	
}
}


//}

