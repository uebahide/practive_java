public abstract class Character{
	String name;
	int hp;
	
	public abstract void attack(Matango m);
	public void run(){System.out.println("逃げ出した");}
	
	public Character(String name){this.name=name;}

}