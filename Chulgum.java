import java.util.Scanner;

public class Chulgum extends Customer		// ��� Ŭ����
{

	private static long temp1;				// ����, �� ������ �� �ŷ��� ���� �Ű����� (java.106 ����)
	private static long temp2;
	
	public void chulgum()					// ��� �޼ҵ� ���� �� ����
	{
		// Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);
		// ChangGu �ν��Ͻ� ����
		ChangGu ch = new Bank();
		// PassCompare �ν��Ͻ� ����
		PassCompare pc = new PassCompare();
		// JuminCompare �ν��Ͻ� ����
		JuminCompare jc = new JuminCompare();

		

		while (true)						// ���� ���� �� �ź��� Ȯ�� �� �ŷ� ���ӿ��� Ȯ��
		{
			try
			{
				System.out.println("  ======= ��ݼ��� �Դϴ� �� =======");
				System.out.print("���ź��� Ȯ���ҰԿ�. ^^ (Y/N) : ");	//-- �ź��� Ȯ��
				super.selectC = (char)System.in.read();
				System.in.skip(2);

				if (super.selectC != 'Y' && super.selectC != 'y')	//-- y�� �ƴ� �� ���� �ŷ����� Ȯ��
				{
					System.out.println("�ŷ��� �Ͻ� �� �����Ф�");
					System.out.print("����� �ŷ��� �����Ͻðھ��?(Y/N): ");
					super.selectC = (char)System.in.read();
					System.in.skip(2);
				}
				else												//-- �ź��� ���� Ȯ��
				{
					System.out.println("�ź����� Ȯ���ϰڽ��ϴ�.\n");	
					jc.juminCom();									//-- ��ϵ� �ֹι�ȣ�� �����Ͽ� Ȯ��	
					pc.passCom();									//-- ��ϵ� ��й�ȣ�� �����Ͽ� Ȯ��
					
				}

				

				if (super.selectC != 'Y' && super.selectC != 'y')	//-- y�� �ƴ� ���
				{
					System.out.println("		 ========== ������ �� �̿����ּ���! ^-^ ==========");
					break;											//	 ���� ���� ����
					
				}
				else												//-- y�� ���� ���
				{
					System.out.println();							//	 �ŷ� ���� ����
					break;											//	 ���� ���� ����
					
				}
			}
			catch (Exception e)
			{
				System.out.println(e.toString());
			}
			
			
		}

	
			
		

		if (super.selectC != 'Y' && super.selectC != 'y')			//-- �ռ� y�� �ƴ� ���
		{
			return;													//   ��� �޼ҵ� ����
		}
		System.out.print("���󸶸� ����Ͻðھ��? (�ݾ� ���ڸ� �Է�) : ");

		temp1 = sc.nextInt();										//-- �ӽ������� ����� �ݾ� ����
		if (super.getTongjang() >= (long)temp1)
		{
			try
			{
				System.out.printf("\n������Ͻ� �ݾ��� %,d ���� �������? (Y/N) :", temp1);
				super.selectC = (char)System.in.read();					//-- Customer �θ� Ŭ������ ����� �ݾ� ����
				System.in.skip(2);

				if (super.selectC != 'Y' && super.selectC != 'y')		//-- �ռ� y�� �ƴ� ��� �ŷ� ����
				{
					System.out.println("		========= �ŷ��� �ٽ� �̿����ּ���. ^^* ========");
					return ;
					
				}
				else													//-- �ռ� y�� ��� �� ���� �ֽ�ȭ
				{	
					temp2 = super.getTongjang() - temp1;
					super.setTongjang(temp2);
					System.out.println("������� �Ϸ�Ǿ����ϴ�.");
					System.out.printf("\n�������� ���� �ܾ��� : %,d �� �Դϴ�.\n", super.getTongjang());

				}
			}
			catch (Exception e)
			{
				System.out.println(e.toString());
			}
			 
				
			temp2 = ch.getBCash() - temp1;								//-- ���� �� �ֽ�ȭ
			ch.setBCash(temp2);
		}
		else
		{
			System.out.println("�����ܾ��� �����մϴ٤Ф� ������ ��� ���� �� �־��ּ���! ^^/");
		}
		
	
	}// end output()

}// end class Chulgum