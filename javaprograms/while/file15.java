class file15
{
public static void main(String args[])
	
	{

	for(int x=1;x<=100;x++){
		int num=x,start=2,count=0,temp=num;
		for(;start<=num/2;start++)
			{
			if(num%start==0)
			count++;
			}
			num=temp;
			if(count==0 && start>=2){
			System.out.println(temp+" is a prime ");
					}
			}	

	}
}