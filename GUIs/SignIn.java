package ������;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class SignIn extends JFrame {
	private JPanel fir =new JPanel();
	private JPanel sec =new JPanel();
	private JPanel thi =new JPanel();
	 private JButton QD = new JButton("ȷ��");
	 private JButton QX = new JButton("ȡ��");
	 JTextField nameText = new JTextField(10);
     JPasswordField passText= new JPasswordField(10);
	public SignIn()
	{
		JFrame land=new JFrame();
		land.setTitle("                           ��½");
		land.setLocation(500, 200);
		land.setLayout(new FlowLayout());
		JLabel name = new JLabel("�û�����");
	     JLabel password = new JLabel("��   �룺 ");
	     
	     nameText.setSize(200, 40);
	     passText.setSize(200, 40);
	     fir.add(name);
	     fir.add(nameText);
	     sec.add(password);
	     sec.add(passText);
	     thi.add(QD);
	     thi.add(QX);
	     land.add(fir);
	     land.add(sec);
	     land.add(thi);
	     land.setVisible(true);
	     land.setSize(300, 200);
	     land.setResizable(false);
	     land.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	     QD.addActionListener(new ActionListener()
	     {
	    	 @Override
		public void actionPerformed(ActionEvent e) {
	    			// TODO Auto-generated method stub
	    			String   n=new   String(); 
	    			String   p=new   String(); 
	    			n=nameText.getText();
	    			p=passText.getText();
	    			if(n.length()==0) JOptionPane.showMessageDialog(null, "�û�������Ϊ�գ�", "����", JOptionPane.ERROR_MESSAGE);
	    			if(p.length()<3)  JOptionPane.showMessageDialog(null, "���볤������Ϊ3��", "����", JOptionPane.ERROR_MESSAGE); 
	    			if(n.equals("spacz"))
	    			{
	    				if(p.equals("123456")) {JOptionPane.showMessageDialog(null, "��½�ɹ�", "��Ϣ", JOptionPane.INFORMATION_MESSAGE); System.exit(0);;}
	    				else JOptionPane.showMessageDialog(null, "�������", "����", JOptionPane.ERROR_MESSAGE);
	    			}
	    		}
	     });
	     QX.addActionListener(new ActionListener()
	     {
	    	 @Override
		public void actionPerformed(ActionEvent e) {
	    			// TODO Auto-generated method stub
	    			System.exit(0);
	    		}
	     });
	}
	public static void main(String[] args)
	{
		new SignIn();
	}

}
