package harm;

public class Harmonic {
	public double harmonium(int n)
	{
		double sum=0;
		for(int i=1; i<=n; i++)
		{
			sum += (1.0/i);
		}
		return sum;
	}
}


