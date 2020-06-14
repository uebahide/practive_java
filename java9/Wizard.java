public class Wizard{
	private int hp;
	private int mp;
	private String name;
	private Wand wand;
	
	public void heal(Hero h){
		int basePoint=10;
		int recoverPoint=(int)(basePoint*this.wand.getPower());

		h.setHp(h.getHp()+recoverPoint);
		System.out.println(h.getName()+"のHPを"+recoverPoint+"回復した！");
	}
	
	public void setHp(int hp){
		if(hp<0){
			this.hp=0
		}else{
		this.hp=hp;
		}
	}
	public int getName(){
		return this.hp;
	}
	public void setMp(int mp){
		if(mp<0){
			throw new IllegalArgumentException(" MPが異常です。処理を中断");
		}
		this.mp=mp;
	}
	public int getMp(){
		return this.mp;
	}
	public void setName(String name){
		if(name==null||name.length()<3){
			throw new IllegalArgumentExeption("入力した名前が異常です。処理を中断");
		}
		this.name=name;
		}
	}
	public String getName(){
		return this.name;
	}
	public void setWand(Wand wand){
		if(wand==null){
			throw new IllegalArgumentException("杖がnullです。処理を中断");
		}
		this.wand=wand;
	}
	public Wand getWnad(){
		return this.Wand;
	}
}