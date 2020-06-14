public class Cleric{
	String name;
	int hp;
	final int MHP=50;
	int mp;
	final int MMP=10;

	public void selfAid(){
		this.mp -=5;
		this.hp=this.MHP;
		System.out.println("MPを5消費し、HPを最大まで回復した.");
	}
	public int pray(int sec){
		int recover=new java.util.Random().nextInt(3)+sec;
		int recoverActual=Math.min(this.MMP-this.mp,recover);

		this.mp +=recoverActual;
		return recoverActual;		
	}
}