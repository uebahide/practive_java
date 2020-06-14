public class Wizard{
	private int hp;
	private int mp;
	private String name;
	private Wand wand;

	public void heal(Hero h){
		private int basePoint=10;
		private int recoverPoint=(int)(basePoint*this.wand.power);

		h.setHp(h.gethp()+recoverPoint);
		System.out.println(h.getName()+"のHPを"+recoverPoint+"回復した！");
	}
	public int getHp(){
		return this.hp;
	}
	public void setHp(int hp){
		if(hp<0){
			this.hp=0;
		}else{
			this.hp=hp;
		}
	}
	public int getMp(){
		return this.mp;
	}
	public void setMp(int mp){
		if(mp<0){
			throw new IllegalArgumentExeption("mpが０未満である。処理を中断");
		}
		this.mp=mp;
	}
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		if(name==null){
			throw new IllegalArgumentExeption("名前がnullである。処理を中断");
		}
		if(name.length()=<2){
			throw new IllegalArgumentExeption("名前が短すぎる。処理を中断");
		}
		this.name=name;
	}
	public Wand getWand(){
		rerutn this.wand;
	}
	public void setWand(Wand wand){
		if(wand==null){
			throw new IllegalArgumentExeption("杖がnullである。処理を中断");
		}
		this.wand=wand;
	}
}