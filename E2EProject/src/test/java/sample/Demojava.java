
package sample;

public class Demojava {

	public static void main(String[] args) {
		int temp = 0;
		for(int i=1; i<=100; i++)
		{
			for(int j=2; j<=i-1; j++);
			{
				
				int j = 0;
				//int j = i-1;
				if(i%j==0) {
					temp=temp+1;
				}
				if(temp==0) {
					System.out.println(i);
				}
				else
				{
					temp=0;
				}
			}
		}

	}

}
