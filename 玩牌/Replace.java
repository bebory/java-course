//������
package ����;

public class Replace {
	public int evaluate(Card[] s)
	{
		Deck d=new Deck();
		int result=d.jud(s);
		if(result==1&&result==2) return 3;
		if(result==3) return 2;
		else return 1;
		
	}
	public static void main(String[] args)
	{ 
		Replace r=new Replace();//player1��ׯ��
		Deck d=new Deck();
		
		
		
		d.creatCards();
		d.shuffle();
/*		for(int i=0;i<52;++i)
		{
			System.out.println(d.cards[i]);
		}*/
		int player1,player2;
		Card[] player_1=new Card[5];
		Card[] player_2=new Card[5];
		for(int i=0;i<5;++i)
		{
			player_1[i]=new Card(d.cards[2*i]);
			player_2[i]=new Card(d.cards[2*i+1]);
		}                                          //ץ��
		d.show(player_1);
		d.show(player_2);
		int end=r.evaluate(player_1);
		for(int i=0;i<end;++i)
		{
			player_1[4-i].face=d.cards[10+i].face;
			player_1[4-i].suit=d.cards[10+i].suit;
		}
		System.out.println("���һ���ƺ�");
		d.show(player_1);
		player1=d.jud(player_1);
		player2=d.jud(player_2);
		if(player1>player2) System.out.println("���һ��ʤ����ϲ���һ��");
		else if(player1<player2) System.out.println("��Ҷ���ʤ����ϲ��Ҷ���");
		else {
			if(player1==1||player1==2||player1==3||player2==4||player1==7) 
			{
				if(player_1[0].face>player_2[0].face) System.out.println("���һ��ʤ����ϲ���һ��");
				else if(player_1[0].face<player_2[0].face) System.out.println("��Ҷ���ʤ����ϲ��Ҷ���");
				else System.out.println("ƽ��");
			}
			else  System.out.println("ƽ��");
		}
	}

}
