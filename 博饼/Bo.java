package ����;
import java.util.Random;
import java.util.Scanner;
import java.math.*;
public class Bo {
	
	

	public void grade(int[] a)//��������������
	{
		int[] count=new int[7];            //��¼�м���4
		for(int i=0;i<6;i++)        //��¼1��6ÿ�������ֵĴ���������count[1]��count[6]��
		{
			++count[a[i]];
		}
		switch(count[4])           //���ж��й�4��
		{
		case 1: System.out.print("һ��  ");break;
		case 2: System.out.print("����   ");break;
		case 3: System.out.print("����   ");break;
		case 4: 
			{
				if(count[2]==2) System.out.print("״Ԫ���   ");
				else System.out.print("�ĺ�  ");
			}break;
		case 5: System.out.print("����  ");break;
		case 6: System.out.print("������  ");break;
		}
		count[0]=count[1];
		for(int i=2;i<7;++i)
		{
			if(count[i]>count[0]) count[0]=count[i];
		}                             //��count[0]���������
		if(count[0]>3&&count[0]!=count[4])
		{
			switch(count[0])
			{
			case 4:System.out.print("�Ľ�");break;
			case 5:System.out.print("����");break;
			case 6:System.out.print("������");break;
			}
		}
		if(count[0]==1) System.out.print("����");
		System.out.print("\n");
	}
	public void run()          //������
	{
		int[] num=new int[6];
		Random ran=new Random();           //�������
		Scanner s=new Scanner(System.in); //������
		while(true)
		{
			System.out.print("�����������1���ֶ�����������0:");
			int jud=s.nextInt();
			if(jud==1)                      //���������
			{
				for(int j=0;j<6;j++)          //6����
				{
					System.out.print("���");
					System.out.print(j+1);
					System.out.print("���ɵ���Ϊ��");
					for(int i=0;i<6;i++)        //6�������
					{
						num[i]=Math.abs(ran.nextInt()%6)+1;
						System.out.printf("%d",num[i]);
					}
					System.out.printf("\n");
					grade(num);
				}
				
				
			}
			else                             //�ֶ�����
			{
				for(int j=0;j<6;j++)
				{
					System.out.printf("��%d����ң�\n",j+1);
					System.out.print("������6��1��6֮�������");
					for(int i=0;i<6;i++)
					{
						num[i]=s.nextInt();
						if(num[i]<1||num[i]>6)
						{
							System.out.print("��Ȼ��ҡ���������֣��Ҹ�����!\n");
							break;
						}
					}
					System.out.printf("\n");
					grade(num);
				}
				
			}
			System.out.print("������0���˳���1:");
			int x=s.nextInt();
			if(x!=0) break;             //xΪ1ʱ����
		}
	}
	
}
