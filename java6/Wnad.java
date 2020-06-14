public class Wand{
	private String name;
	private double power;

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
	public int getPower(){
		return this.power;
	}
	public void setPower(int power){
		if(0.5>power){
			throw new IllegalArgumentExeption("増幅率が小さすぎる。処理を中断");
		}	
		if(100.0<power){
			throw new IllegalArgumentExeption("増幅率が大きすぎる。処理を中断");
		}
		this.power=power;
	}
}