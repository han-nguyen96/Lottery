class Ntn456_LotteryWinner{
	private int[] lottery_nums= new int [5];

	Ntn456_LotteryWinner(){
		lottery_nums[0]=10;
		lottery_nums[1]=20;
		lottery_nums[2]=30;
		lottery_nums[3]=40;
		lottery_nums[4]=50;
	}

	public void checkWinnings(int a, int b, int c,int d, int e)
	{
		int[] your_nums= new int [5];
		your_nums[0]=a;
		your_nums[1]=b;
		your_nums[2]=c;
		your_nums[3]=d;
		your_nums[4]=e;

		int count=0;

		for (int x:lottery_nums)
		{
			for (int y:your_nums)
			{
				if (x==y)
				{
					count = count+1;
				}
			}	
		}

		if (count ==1)
		{
			System.out.println("Congrats! You won $10. There is " +count+" match between your Lottery Numbers and the Winning numbers.");
		}
		else if (count==2)
		{
			System.out.println("Congrats! You won $25. There are " +count+" matches between your Lottery Numbers and the Winning numbers.");
		}
		else if (count ==3)
		{
			System.out.println("Congrats! You won $50. There are " +count+" matches between your Lottery Numbers and the Winning numbers.");
		}
		else if (count ==4)
		{
			System.out.println("Congrats! You won $1000. There are " +count+" matches between your Lottery Numbers and the Winning numbers.");
		}
		else if (count ==5)
		{
			System.out.println("Congrats! You won $10000. There are " +count+" matches between your Lottery Numbers and the Winning numbers.");
		}
		else
		{
			System.out.println("You suck and didn't win any money. 0 matches.");
		}

	}



}