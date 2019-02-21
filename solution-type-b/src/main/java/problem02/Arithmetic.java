package problem02;

public interface Arithmetic {
	int calculate( int a, int b );
}

class Add implements Arithmetic
{
	public int calculate(int a, int b) 
	{
		return a+b;
	}
}

class Sub implements Arithmetic
{
	public int calculate(int a, int b) 
	{
		return a-b;
	}
}

class Mul implements Arithmetic
{
	public int calculate(int a, int b) 
	{
		return a*b;
	}
}

class Div implements Arithmetic
{
	public int calculate(int a, int b) 
	{
		return a/b;
	}
}

