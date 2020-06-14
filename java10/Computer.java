public class Computer extends TangibleAsset{
	private String makerName;
	
	public Computer(String name,int price,String color,String makerName){
		super(name,int,color);
		this.makerName=makerName;
	}
	public String getMakerName(){return this.makerName;}
}