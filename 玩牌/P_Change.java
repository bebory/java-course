//������
package ����;
import java.util.Random;
public class P_Change {
	public static void main(String[] args)
	{ 
		Random ran=new Random();
		int wins=0;         //���Ӯ�Ĵ���
		int loses=0;
		Replace r=new Replace();
		Deck d=new Deck();
		d.creatCards();
		int player1,player2;
		Card[] player_1=new Card[5];
		Card[] player_2=new Card[5];
		
		for(int j=0;j<20;j++)
		{
			d.shuffle();                               //ϴ��
			for(int i=0;i<5;++i)                       //ץ��
			{
				player_1[i]=new Card(d.cards[2*i]);
				player_2[i]=new Card(d.cards[2*i+1]);
			}                                     
			int end=r.evaluate(player_1);              //����
			int[] exNum=new int[end];
			for(int i=0;i<end;++i)
			{
				exNum[i]=ran.nextInt(5);
				for(int k=0;k<i;k++)
				{
					if(exNum[k]==exNum[i]) {i--;break;}              //�����ǰ���ظ�����ô����ȡ�����
				}
			}
			for(int i=0;i<end;++i)
			{
				player_1[exNum[i]].face=d.cards[10+i].face;          //�������ѡ�е�end�Ų��ظ�����
				player_1[exNum[i]].suit=d.cards[10+i].suit;
			}
			player1=d.jud(player_1);
			player2=d.jud(player_2);
			if(player1>player2) {System.out.println("���һ��ʤ����ϲ���һ��");loses++;}
			else if(player1<player2) {System.out.println("��Ҷ���ʤ����ϲ��Ҷ���");wins++;}
			else {
				if(player1==1||player1==2||player1==3||player2==4||player1==7) 
				{
					if(player_1[0].face>player_2[0].face) {System.out.println("���һ��ʤ����ϲ���һ��");loses++;}
					else if(player_1[0].face<player_2[0].face) {System.out.println("��Ҷ���ʤ����ϲ��Ҷ���");wins++;}
					else System.out.println("ƽ��");
				}
			else  System.out.println("ƽ��");
		}
	}
		System.out.printf("%s%d,%s%d","���Ӯ�Ĵ�����",wins,"ׯ��Ӯ�Ĵ�����",loses);
	}
}
