public class YesNo extends Customer
{
	public void yesNo()
	{
		try
		{
			System.out.print("\n���� �ٸ� ������ ���͵帱���?(Y/N) : ");
			super.selectC = (char)System.in.read();
			System.in.skip(2);

			if (super.selectC != 'Y' && super.selectC != 'y')			// �ռ� ������ y�� �ƴҰ��
			{
				try
				{
				  System.out.println();
				  System.out.println("============================================================================");
				  Thread.sleep(100);
				  System.out.println("|           ====�� �湮���ּż� �����մϴ� �����Ϸ� �Ǽ��� ��====          |");
				  Thread.sleep(100);
				  System.out.println("|                                                                          |");
				  Thread.sleep(100);
				  System.out.println("|         #####      #####      #####     #######                          |");
				  Thread.sleep(100);
				  System.out.println("|        ##         ##   ##    ##   ##    ##    ##                         |");
				  Thread.sleep(100);
				  System.out.println("|       ##         ##     ##  ##     ##   ##     ##                        |");
				  Thread.sleep(100);
				  System.out.println("|       ##   ####  ##     ##  ##     ##   ##     ##                        |");
				  Thread.sleep(100);
				  System.out.println("|       ##     ##  ##     ##  ##     ##   ##     ##                        |");
				  Thread.sleep(100);
				  System.out.println("|        ##    ##   ##   ##    ##   ##    ##    ##                         |");
				  Thread.sleep(100);
				  System.out.println("|         ######     #####      #####     #######                          |");
				  Thread.sleep(100);
				  System.out.println("|                                                                          |");
				  Thread.sleep(100);
				  System.out.println("|                                                                          |");
				  Thread.sleep(100);
				  System.out.println("|                   #######     ##     ##    ########       **       **    |");
				  Thread.sleep(100);
				  System.out.println("|                   ##    ##     ##   ##     ##            *   **  **   *  |");
				  Thread.sleep(100);
				  System.out.println("|                   ##     #      ## ##      ##            *     **     *  |");
				  Thread.sleep(100);
				  System.out.println("|                   #######        ###       ########       *          *   |");
				  Thread.sleep(100);
				  System.out.println("|                   ##     #       ###       ##              *        *    |");
				  Thread.sleep(100);
				  System.out.println("|                   ##    ##       ###       ##                *    *      |");
				  Thread.sleep(100);
				  System.out.println("|                   #######        ###       ########            **        |");
				  Thread.sleep(100);
				  System.out.println("|                                                                          |");
				  Thread.sleep(100);
				  System.out.println("============================================================================");
			   }
			   catch (Exception e)
			   {
				  System.out.println(e.toString());
			   }
				return;													// yegum() �޼��� ����
			}
			else
			{
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			}
		}
		catch (Exception e)
		{
			System.out.println(e.toString());
		}
		

	}// end yesNo()

}// end class YesNo 