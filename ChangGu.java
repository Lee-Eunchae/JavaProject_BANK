import java.util.Scanner;
//import java.io.IOException;
import java.util.Random;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class ChangGu extends Customer	// â�� display Ŭ����
{

////////////////////////////////////////////////////////////////////////////////

	private static long bankcash;


	public static void ChanGu()		// â�� ������ �� ���൷�� �ʱ�ȭ ��	
	{
		long bankcash = 3000000000L;
	}// end ������

	public static final long getBCash()
	{
		return bankcash;
	}// end getBCash()

	public static final void setBCash(long bankcash)
	{
		ChangGu.bankcash = bankcash;
	}// end setBCash()

	
////////////////////////////////////////////////////////////////////////////////
	
	public void changgu()
	{
		Scanner sc = new Scanner(System.in);
		WhatKind wk = new WhatKind();
		
	
		try
		{
			System.out.println("============================================================================");
			Thread.sleep(100);
			System.out.println("|              ====�� �ĸ����࿡ �湮�ϽŰ��� ȯ���մϴ� ��====            |");
			Thread.sleep(100);
			System.out.println("|                                                                          |");
			Thread.sleep(100);
			System.out.println("|                                                                          |");
			Thread.sleep(100);
			System.out.println("|           #######          ###         ##      ##      ##    ##          |");
			Thread.sleep(100);
			System.out.println("|           ##    ##        ## ##        ###     ##      ##   ##           |");
			Thread.sleep(100);
			System.out.println("|           ##     #      ##     ##      ## ##   ##      ##  ##            |");
			Thread.sleep(100);
			System.out.println("|           #######       #########      ##  ##  ##      ####              |");
			Thread.sleep(100);
			System.out.println("|           ##     #      ##     ##      ##    # ##      ##  ##            |");
			Thread.sleep(100);
			System.out.println("|           ##    ##      ##     ##      ##     ###      ##   ##           |");
			Thread.sleep(100);
			System.out.println("|           #######       ##     ##      ##      ##      ##    ##          |");
			Thread.sleep(100);
			System.out.println("|                                                                          |");
			Thread.sleep(100);
			System.out.println("|                          _______________________                         |");
			Thread.sleep(100);
			System.out.println("|                          |          |          |                         |");
			Thread.sleep(100);
			System.out.println("|                          |          |          |                         |");
			Thread.sleep(100);
			System.out.println("|                          |        ��|��        |                         |");
			Thread.sleep(100);
			System.out.println("|                          |          |          |                         |");
			Thread.sleep(100);
			System.out.println("|                          |          |          |                         |");
			Thread.sleep(100);
			System.out.println("============================================================================");
			
		}
		catch (Exception e)
		{
			System.out.println(e.toString());
		}

		

		try
		{
			// ������ �Է�
			// Ÿ�̸� ����
			Thread.sleep(1000);
			super.print();
			
			System.out.print("	====== �������. ���� �� ====== \n");
			System.out.print("������ ������ �����Ͻðھ��? (Y/N) :");
			super.selectC = (char)System.in.read();
			System.in.skip(2);	

			System.out.println();

			if (super.selectC !='y' && super.selectC != 'Y')
			{
				System.out.println("		======= �����մϴ�. �ȳ��� ������.^^ ======");	
				return;
			}
			else
			{
				System.out.println("��ø� ��ٷ��ּ���. �湮 â�� �� �ȳ��ص帱�Կ�.^^\n");
			}
			Random rd = new Random();
			int[] inwon = new int[5];		
			
			
			for (int j=0;j<inwon.length ;j++ )
			{
				
				inwon[j]=rd.nextInt(5)+1; 

				System.out.print("����ο��� ���� �ҿ�ð��� �߻��� �� �ִ��� ���غ�Ź�����.^^*\n");
				
//////////////////////////////////////////////////////////////////////////////////////////////////////////

				if (inwon[j]==1)
				{
				   System.out.println("���� ��� �ο� : 1��");
				   for (int i=0; i<1; i++)
				   {
					  System.out.println(1-i + "�� ���ҽ��ϴ�....");
					  Thread.sleep(1500);
				   }
				   System.out.println();break;   
				   
				}
				else if (inwon[j]==2)
				{
				   System.out.println("���� ��� �ο� : 2��");
				   for (int i=0; i<2; i++)
				   {
					  System.out.println(2-i + "�� ���ҽ��ϴ�....");
					  Thread.sleep(1500);
				   }
				   System.out.println();break;
				   
				}
				else if (inwon[j]==3)
				{
				   System.out.println("���� ��� �ο� : 3��");
				   for (int i=0; i<3; i++)
				   {
					  System.out.println(3-i + "�� ���ҽ��ϴ�....");
					  Thread.sleep(1500);
				   }
				   System.out.println();break;
				}
				else if (inwon[j]==4)
				{
				   System.out.println("���� ��� �ο� : 4��");   
				   for (int i=0; i<4; i++)
				   {
					  System.out.println(4-i + "�� ���ҽ��ϴ�....");
					  Thread.sleep(1500);
				   }
				   System.out.println();break;
				}
				else
				   System.out.println("���� ��� �ο� : 5��");
				   for (int i=0; i<5; i++)
				   {
					  System.out.println(5-i + "�� ���ҽ��ϴ�....");
					  Thread.sleep(1500);
				   }
				   System.out.println();break;
			 
				
////////////////////////////////////////////////////////////////////////////////////////////////////////
			}
			
			System.out.println("===================================");
			System.out.println(" â���� | â���� | â���� | â���� ");
			System.out.println("===================================");

			
			int[] num = new int[4];	

			for (int i=0;i<num.length;i++)
			{
				num[i]=rd.nextInt(4)+1;   
				// ���� ���� �����
				if (num[i]==1)
				{		
					System.out.println("   ��   \n");
					break;			
					
				}
				else if (num[i]==2)
				{
					System.out.println("            ��   \n");
					break;			
				}
				else if (num[i]==3)
				{
					System.out.println("                     ��   \n");
					break;			
				}
				else
				{
					System.out.println("                             ��   \n");
					break;			
				}
				
		
		}
		
		wk.whatKind();

	}
	catch (Exception e)
	{
		System.out.println(e.toString());
	}
	}// end changgu()
}
