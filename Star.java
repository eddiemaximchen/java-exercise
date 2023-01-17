
public class Star { 
	static int L=5;//層數
	static int MaxNum=L*(L-1)+1;//最大格數
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int L=5;
		//int MaxNum=L*(L-1)+1;//最大格數
		//int j=0;//*的factor, 2i-1 每層星星數
		int star=0;
		
		for (int i=0;i<L;i++) {
			star= getStar(i);
			for(int j=0;j<getSpace(star);j++) {
				System.out.print(" ");
			}
			for(int k=0;k<star;k++)
			{
				System.out.print("*");
			}		
			for(int j=0;j< getSpace (star);j++) {
				System.out.print(" ");
			}		
			System.out.println();
		}

		/*for(int i=0;i<L;i++)
		{
			j=(i+1)+i;		
			for(int m=0;m<(MaxNum-j)/2;m++) //每行空格數=總格數-每行星星數,要對稱, 所以要除以2
			{	
				System.out.print(" ");
			}
			for(int k=0;k<j;k++)
			{
				System.out.print("*");
			}			
			for(int m=0;m<(MaxNum-j)/2;m++)
			{	
				System.out.print(" ");
			}
		    
			System.out.println();

		}*/
		
	}
	public static int getStar(int factor) { //為何一定要是static,因為main一定是static, 除非是物件方法
		return (factor+1)+factor;
	}
	public static int getSpace(int star) {
		return (MaxNum-star)/2;
	}
		
}
