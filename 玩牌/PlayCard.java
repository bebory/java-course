package ����;
//������
public class PlayCard {
	public static void main(String[] args)
	{
		Deck d=new Deck();
		d.creatCards();
		d.shuffle();
		int player1,player2;
		Card[] player_1=new Card[5];
		Card[] player_2=new Card[5];
		for(int i=0;i<5;++i)
		{
			player_1[i]=new Card(d.cards[2*i]);
			player_2[i]=new Card(d.cards[2*i+1]);
		}                                          //ץ��
		
		player1=d.jud(player_1);
		player2=d.jud(player_2);
		d.show(player_1);
		d.show(player_2);
		if(player1>player2) System.out.println("���һ��ʤ����ϲ���һ��");
		else if(player1<player2) System.out.println("��Ҷ���ʤ����ϲ��Ҷ���");
		else {
			if(player1==2||player1==3||player2==4||player1==7) 
			{
				if(player_1[0].face>player_2[0].face) System.out.println("���һ��ʤ����ϲ���һ��");
				else if(player_1[0].face<player_2[0].face) System.out.println("��Ҷ���ʤ����ϲ��Ҷ���");
				else System.out.println("ƽ��");
			}
			else  System.out.println("ƽ��");
		}
	}

}
