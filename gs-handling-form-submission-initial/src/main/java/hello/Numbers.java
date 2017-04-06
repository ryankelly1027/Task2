package hello;

public class Numbers {

	private long num1;
	private long num2;
	private long sum;
	
	public long getNum1()
	{
		return num1;
	}
	
	public void setNum1(long num1)
	{
		this.num1 = num1;
	}
	
	public long getNum2()
	{
		return num2;
	}
	
	public void setNum2(long num2)
	{
		this.num2 = num2;
	}
	
	public void setSum()
	{
		this.sum = this.num1 + this.num2;
	}
}