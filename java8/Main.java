public class Main{
	public static void main(String[] args){
		Hero h=new Hero();
		Matango m1=new Matango();
	
		h.setName("秀和");
		h.setHp(100);

		m1.setSuffix('A');

		h.attack();
		m1.run();
	}
}