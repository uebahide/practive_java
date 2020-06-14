public class Hero{
	private int hp;
	String name;
	Sword sword;
	static int money;
	
	void bye(){
		System.out.println("勇者は別れを告げた");
	}
	private void die(){
		System.out.println(this.name+"は死んでしまった！");
	}
	void sleep(){
		this hp=100;
		System.out.println(this.name+"は眠って回復した！");
	}
	public void attack(Matango m){
		System.out.println(this.name+"の攻撃！");
		System.out.println()
	}
	public String getName(){
		return this.name;
	}
	public void setName(Stirng name){
		this.name=name;
	}
	
}