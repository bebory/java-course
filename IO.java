package ʵ��һ;
import java.util.*;
import java.io.*;
public class IO {
	public static void main(String[] args) throws IOException
	{
		
        //way1��use Scanner to input
		Scanner  input=new Scanner(System.in);
		System.out.print("����һ���ַ���������:");
		String a=input.next();
		int number=input.nextInt();
		
		//way2:use BufferedReader and System.in to input
		System.out.print("����һ���ַ���������:");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String b;
		b=br.readLine();
		int s;
		s =Integer.parseInt(br.readLine());
		
		
		//two ways to output
		System.out.print(a);
		System.out.println(number);
		System.out.print(b);
		System.out.println(s);
//		PrintStream out = new PrintStream( new BufferedOutputStream(System.out)); 
//		out.print(s);
		
		
		//��Ŀ��
		String s1,s2;
		s1=s2=null;
		int num1,num2;
		
		System.out.print("Please input two number:");
		s1=br.readLine();
		s2=br.readLine();
		if(s1.length()==0||s2.length()==0) 
		{
			System.out.print("erro!");
			return;
		}                                               //�п��ַ�������	
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>'9'||s1.charAt(i)<'0')
			{
				System.out.print("erro!");
				return;
			}
		}
		for(int i=0;i<s2.length();i++)
		{
			if(s2.charAt(i)>'9'||s2.charAt(i)<'0')
			{
				System.out.print("erro!");
				return;
			}
		}                                               //ֻҪs1,s2���з����ֵ��ַ��ͱ����˳�
		num1=Integer.parseInt(s1);
		num2=Integer.parseInt(s2);                      //��û���⣬��תΪ����
		System.out.print("The average of the two numbers is: ");
		System.out.print((num1+num2)/2);
	}

}
