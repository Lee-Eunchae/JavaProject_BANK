import java.util.Scanner;

public class Yegum extends Customer		// ���� Ŭ����
{
	
	private static long temp1;			// ����, �� ������ �� �ŷ��� ���� �Ű����� (java.108 ����)
	private static long temp2;
	
	public void yegum()					// ���� �޼ҵ�			
	{
		
		// Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);
		// Bank �ν��Ͻ��� �����Ͽ� ChangGu ��ü�� ��ĳ����
		ChangGu ch = new Bank();
		// PassCompare �ν��Ͻ� ����
		PassCompare pc = new PassCompare();
		// JuminCompare �ν��Ͻ� ����
		JuminCompare jc = new JuminCompare();
		

		
		

		while (true)	// ���ѷ��� �� �ź��� Ȯ�� �� �ŷ� ���ӿ��� Ȯ��
		{
			try
			{
				System.out.println(" ======= ���ݼ��� �Դϴ٢� =======");
				System.out.print("���ź��� Ȯ���ҰԿ�.^^(Y/N) : ");		// �ź��� Ȯ��
				super.selectC = (char)System.in.read();
				System.in.skip(2);

				if (super.selectC != 'Y' && super.selectC != 'y')	// y�� �ƴ� ��� ���� ����
				{
					System.out.println("�ŷ��� �Ͻ� �� �����ϴ�.\n");
					System.out.print("����� �ŷ��� �����Ͻðھ��?(Y/N): ");
					super.selectC = (char)System.in.read();
					System.in.skip(2);

				}
				else												// y �� ��� �ŷ� ��� ����
				{
					System.out.println("�ź����� Ȯ���ϰڽ��ϴ�.\n");
					jc.juminCom();									// ��ϵ� �ֹι�ȣ�� �Է� �ֹι�ȣ ����
					pc.passCom();									// ��ϵ� ��й�ȣ�� �Է� ��й�ȣ ����
	

				}

				
				if (super.selectC != 'Y' && super.selectC != 'y')	//	java.37 �� ���� ������ y�� �ƴ� ���
				{
					System.out.println("������ �� �̿����ּ���. ^^*");
					System.out.println("================================");
					break;
					
				}
				else												// y �� ��� �Ѿ��.
				{
					System.out.println();
					break;
					
				}
			}
			catch (Exception e)										// Exception ��Ƴ��� ����
			{
				System.out.println(e.toString());
			}
			
		}

		// �ֹι�ȣ �Է�(�´��� �ȸ´���)
		
			
		

		// �ź��� �˻� �޼ҵ� �ʿ�
		if (super.selectC != 'Y' && super.selectC != 'y')			// �ռ� ������ y�� �ƴҰ��
		{
			return;													// yegum() �޼��� ����
		}

		System.out.print("���󸶸� �Ա��Ͻðھ��? (�ݾ� ���ڸ� �Է�) : ");

		temp1 = (long)sc.nextInt();								// Customer �θ� Ŭ������ �Աݱݾ� ����

		try
		{
			System.out.printf("\n���Ա��Ͻ� �ݾ��� %,d ���� �������?(Y/N) :", temp1);
			super.selectC = (char)System.in.read();
			System.in.skip(2);

			if (super.selectC != 'Y' && super.selectC != 'y')		// ����� �ݾװ� ���� ���� ��� �ٽ� �Է�
			{
				System.out.println("�ŷ��� �ٽ� �̿����ֽñ� �ٶ��ϴ�.");
				return ;
				
			}
			else													// ���� �Ա� Ȯ������ �ŷ� ����
			{
				
				System.out.println("�����Ա��� �Ϸ�Ǿ����ϴ�!");
				temp2 = super.getTongjang() + temp1;
				super.setTongjang(temp2);
				System.out.printf("\n�������� ���� �ܾ��� : %,d �� �Դϴ�. ���~\n", super.getTongjang());
			}
		}
		catch (Exception e)
		{
			System.out.println(e.toString());
		}
			
		temp2 = ch.getBCash() - temp1;							// ���� �� �ֽ�ȭ
		ch.setBCash(temp2);
		
	}// end yegum()


}// end class Yegum
