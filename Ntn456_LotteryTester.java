class Ntn456_LotteryTester
{
	public static void main(String[] args)
	{
		Ntn456_LotteryWinner han = new Ntn456_LotteryWinner();

		han.checkWinnings(10,20,30,100,200);

		han.checkWinnings(10,30,20,50,40);

		han.checkWinnings(0,1,2,3,4);	
	}
}