import java.util.Scanner;

 class RandomNumber
 {

	public int GetANumber()
	{
		int Rand = 0 + (int)(Math.random()* 10);
		return Rand;
	}
	
	public int GetANumber(int high)
	{	
		int RandomNo = 0 + (int) (Math.random()* high);
		return RandomNo;
	 }
	
	public int GetANumber(int hi, int lo)
	{
		int RandomNo =  lo + (int)(Math.random() * (hi-lo));
		return RandomNo;
	}

}