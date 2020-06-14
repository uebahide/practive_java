public class PoisonMatango extends Matango{
	private int times=5;
	
	public void attack(Hero h){
		super.attack(h);
		if(times>0){
			private double damage=h.getHp()/5;
			System.out.println("さらに毒の胞子をばらまいた！");
			System.out.println(damage+"ポイントのダメージ");
			h.setHp(h.getHp()-damage);
			this.times -=1;
		}
	public PoisonMatango(char suffix){
			super(suffix);
		}
	}
}