public class Hero{
	private int hp;
	private int mp;
	private String name;
	
	public void attack(){
		System.out.println(this.name+"の攻撃！");		
	}
	public void setName(String name){
		this.name=name;
	}
	public void setHp(int hp){
		this.hp=hp;
	}
}