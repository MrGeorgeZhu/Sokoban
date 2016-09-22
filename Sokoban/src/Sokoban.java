
public class Sokoban
{
	
	static String myArray[][] = new String[25][25];
	public static void main(String[] args) 
	{
		for(int row = 0; row < myArray.length; row++)
			{
				for(int col = 0; col < myArray.length; col++)
					{
						myArray[row][col]="+";
						System.out.println(myArray[row][col]);
					}
			}
		System.out.println("The # is your charcater, the + is your boxes, and the * is where you are supposed to place your box.");
		System.out.println();
		System.out.println("------------------------------------------");
		System.out.println(" #                                       |");
		System.out.println("                                         |");
		System.out.println("|          +                             |");
		System.out.println("|                                        |");
		System.out.println("|                                        |");
		System.out.println("|            *                           |");
		System.out.println("|                        +               |");
		System.out.println("|                                        |");
		System.out.println("|                                        |");
		System.out.println("|                                *       |");
		System.out.println("|        +                               |");
		System.out.println("|                                        |");
		System.out.println("|                 *                      |");
		System.out.println("|                                        |");
		System.out.println("|                                        |");
		System.out.println("| *                         +            |");
		System.out.println("------------------------------------------");
		
		
	}
}
