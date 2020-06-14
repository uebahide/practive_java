import java.util.Calendar;
import java.util.Date;
public class Main{
	public static void main(String[] args){
		Date now=new Date();
		Calendar c=Calendar.getInstance();
		c.setTime(now);

		int y=c.get(Calendar.YEAR);
		System.out.println("今年は"+y+"年です");
		
		c.set(50000,4,4,15,22,30);
		Date past=c.getTime();
		System.out.println(past);
	}
}