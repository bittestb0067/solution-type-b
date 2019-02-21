package problem03;

public class Money {
	
	//
	// 클래스 구현을 완성 하십시오.
	// 
	private int amount;
	
	public Money(int amount) {
		this.amount = amount;
	}

	public Money add(Money money)
	{
		int total_amount = this.amount + money.amount;
		return new Money(total_amount);
	}

	public Money minus(Money money) {
		int total_amount = this.amount - money.amount;
		return new Money(total_amount);
	}

	public Money multiply(Money money) {
		int total_amount = this.amount * money.amount;
		return new Money(total_amount);
	}

	public Money devide(Money money) {
		int total_amount = this.amount / money.amount;
		return new Money(total_amount);
	}
	
	public boolean equals(Object obj)
	{
		if(obj instanceof Money)
		{
			Money m = (Money)obj;
			return this.amount == m.amount ? true : false;
		}
		else
			return false;
	}
	public int hashCode() 
	{ 
		return this.hashCode() + this.amount; 
	} 
}