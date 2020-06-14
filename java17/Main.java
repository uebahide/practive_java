import java.io.*;
public class Main{
	public static void main(String[] args)throws Exception{
		String filename="c/test.text";
		FileWriter fw=new FileWriter(filename);

		fw.write('成');
		fw.write('功');
		fw.close();
	}
}