import java.util.Scanner;

public class PassCompare extends Customer
{

	private static String temp;					//-- �ӽ������� ��й�ȣ�� �����ϱ� ���� temp ���� ����

	public void passCom()						//-- ��й�ȣ �� �޼ҵ�
	{

		// Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);

		// �׽�Ʈ 
		// System.out.println(super.selectC);

		if (super.selectC != 'Y' && super.selectC != 'y')	//-- ������ y�� �ƴ� ��� �ŷ� ����(JuminCompar Ŭ������ ����)
		{
			do												//-- �Է� ��й�ȣ�� 4�ڸ��� ���� ������ �ݺ�
			{
				System.out.print("����й�ȣ�� �Է��� �ּ���. (4�ڸ�): ");
				temp = sc.next();

				if (temp.length() !=4)
				{
					System.out.println("����й�ȣ�� �ٽ� �Է����ֽñ� �ٶ��ϴ�.\n");
				}

			}	
			while (temp.length() !=4); 

			if (temp.equals(super.getPass())==true)			//-- �Է¹��� ��й�ȣ�� ������ ����� ��й�ȣ�� ������ �ŷ� ����
			{
				System.out.println("��й�ȣ�� Ȯ�� �Ǿ����ϴ�.");
				super.selectC = 'y';						//-- ����, ����� �ŷ��� ����
			}

			do
			{
				if (temp.equals(super.getPass())==false)	//-- �Է¹��� ����� ������ ����� �ٸ��� �� �Է�
				{
					System.out.print("����� ��ȣ�� Ʋ�Ƚ��ϴ٤Ф� �ٽ� �Է��� �ּ���. : ");
					temp = sc.next();						
				}
				super.selectC = 'y';
			}
			while (temp.equals(super.getPass())==false);
		}
		else
		{
			super.selectC = 'n';							//-- ����, ����� �ŷ��� �ߴ�
		}

		

	}// end passCom()

}// end class PassCompare