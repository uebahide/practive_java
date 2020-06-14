public class Wand{
	private String name;
	private double power;

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
	public void setPower(int power){
		if(power<0.5||power>100.0){
			throw new IllegalArgumentExeption("入力した増幅量が異常です。処理を中断");
		}
		this.power=power;
		}
	}
	public int getPower(){
		return this.power;
	}	
}	