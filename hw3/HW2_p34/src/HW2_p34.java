import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW2_p34 
{
	public static void main (String[] args)throws IOException
	{
		System.out.println("�аݭn���L�ĴX�����B�z�O?(1~10)");
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int res = Integer.parseInt(str);
		
		for (int i=0;i<=10;i++)
		{
			if(i==res)
			{
				continue;
			}		
			System.out.println("��"+i+"�����B�z");
			
		}

		
	}
}