package Morpion;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class TicTacToe extends JFrame  implements ActionListener {


	public static void main(String[] args) {
		TicTacToe t =new TicTacToe();
		
		while(!win(t)) {
		
		tour(t.joueur);
		//System.out.println("A "+tour(joueur)+" de jouer");
		
		
		}
		System.out.println(tour(joueur)+" a gagné ");
	}	
	JFrame frame ;
	static String turn = null;
	static JButton a ;
	static int joueur=0;
	static JButton b;
	static JButton c;
	static JButton d;
	static JButton e;
	static JButton f ;
	static JButton g ;
	static JButton h;
	static JButton i;
	static ImageIcon cross = new ImageIcon("16732088788536705822682988776255.png");
	ImageIcon circle = new ImageIcon("bluecircle4.jpg");
	public TicTacToe() {
		frame=new JFrame();
		frame.setTitle("This is my Frame");
		frame.setSize(600,600);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		 a = new JButton() ;
		 b = new JButton();
		 c = new JButton();
		 d = new JButton();
		 e = new JButton();
		 f = new JButton();
		 g = new JButton();
		 h = new JButton();
		 i= new JButton() ;

		a.setBounds(0,0,200,200);
		b.setBounds(200,0,200,200);
		c.setBounds(400,0,200,200);
		d.setBounds(0,200,200,200);
		e.setBounds(200,200,200,200);
		f.setBounds(400,200,200,200);
		g.setBounds(0,400,200,200);
		h.setBounds(200,400,200,200);
		i.setBounds(400, 400, 200, 200);

		a.setBackground(Color.BLACK);
		b.setBackground(Color.BLACK);
		c.setBackground(Color.BLACK);
		d.setBackground(Color.BLACK);
		e.setBackground(Color.BLACK);
		f.setBackground(Color.BLACK);
		g.setBackground(Color.BLACK);
		h.setBackground(Color.BLACK);
		i.setBackground(Color.BLACK);
		
		frame.add(a);
		frame.add(b);
		frame.add(c);
		frame.add(d);
		frame.add(e);
		frame.add(f);
		frame.add(g);
		frame.add(h);
		frame.add(i);
		a.addActionListener(this);
		b.addActionListener( this);
		c.addActionListener( this);
		d.addActionListener(this);
		e.addActionListener( this);
		f.addActionListener( this);
		g.addActionListener( this);
		h.addActionListener( this);
		i.addActionListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent event) {
		ImageIcon cross = new ImageIcon("16732088788536705822682988776255.png");
		ImageIcon circle = new ImageIcon("bluecircle4.jpg");
		  
			System.out.println("hello c'est le bouton " );
			int joueur;
			if(event.getSource()==a) {
				a.setText(turn);
				a.setFont(new Font("MV BOLI",Font.PLAIN,150));
				a.setForeground(Color.RED);
				a.setBackground(Color.WHITE);
				System.out.println(win(this));
				this.joueur++;
				
				stop(this);
			}
			if(event.getSource()==b) {
				b.setText(turn);
				b.setFont(new Font("MV BOLI",Font.PLAIN,150));
				b.setForeground(Color.RED);
				b.setBackground(Color.WHITE);
				System.out.println(win(this));
				this.joueur++;
				stop(this);
			}
			if(event.getSource()==c) {
				c.setText(turn);
				c.setFont(new Font("MV BOLI",Font.PLAIN,150));
				c.setForeground(Color.RED);
				c.setBackground(Color.WHITE);
				System.out.println(win(this));	
				this.joueur++;
				
				stop(this);
				}
			if(event.getSource()==d) {
				d.setText(turn);
				d.setFont(new Font("MV BOLI",Font.PLAIN,150));
				d.setForeground(Color.RED);
				d.setBackground(Color.WHITE);
				System.out.println(win(this));
				this.joueur++;
				stop(this);}
			if(event.getSource()==e) {
				e.setText(turn);
				e.setFont(new Font("MV BOLI",Font.PLAIN,150));
				e.setForeground(Color.RED);
				e.setBackground(Color.WHITE);
				System.out.println(win(this));
					
				this.joueur++;stop(this);}
			if(event.getSource()==f) {
				f.setText(turn);
				f.setFont(new Font("MV BOLI",Font.PLAIN,150));
				f.setForeground(Color.RED);
				f.setBackground(Color.WHITE);
				System.out.println(win(this));
				
				this.joueur++;stop(this);}
			if(event.getSource()==g) {
				g.setText(turn);
				g.setFont(new Font("MV BOLI",Font.PLAIN,150));
				g.setForeground(Color.RED);
				g.setBackground(Color.WHITE);
				System.out.println(win(this));
				
				this.joueur++;stop(this);}
			if(event.getSource()==h) {
				h.setText(turn);
				h.setFont(new Font("MV BOLI",Font.PLAIN,150));
				h.setForeground(Color.RED);
				h.setBackground(Color.WHITE);
				System.out.println(win(this));
				
				this.joueur++;stop(this);}
			if(event.getSource()==i) {
				i.setText(turn);
				i.setFont(new Font("MV BOLI",Font.PLAIN,150));
				i.setForeground(Color.RED);
				i.setBackground(Color.WHITE);
				System.out.println(win(this));
				this.joueur++;
				stop(this);}
	
	}
	
	public static boolean win(TicTacToe t) {
		return(((a.getText()=="X"||a.getText()=="O")&&(a.getText()==b.getText())&&(b.getText()==c.getText())  ||
				(d.getText()=="X"||d.getText()=="O")&&(d.getText()==e.getText())&&(e.getText()==f.getText()) ||
				(g.getText()=="X"||g.getText()=="O")&&(g.getText()==h.getText())&&(h.getText()==i.getText()) ||
				(a.getText()=="X"||a.getText()=="O")&&(a.getText()==d.getText())&&(d.getText()==g.getText()) ||
				(b.getText()=="X"||b.getText()=="O")&&(b.getText()==e.getText())&&(e.getText()==h.getText()) ||
				(c.getText()=="X"||c.getText()=="O")&&(c.getText()==f.getText())&&(f.getText()==i.getText()) ||
				(a.getText()=="X"||a.getText()=="O")&&(a.getText()==b.getText())&&(b.getText()==c.getText()) ||
				(a.getText()=="X"||a.getText()=="O")&&(a.getText()==e.getText())&&(e.getText()==i.getText()) ||
				(c.getText()=="X"||c.getText()=="O")&&(e.getText()==e.getText())&&(e.getText()==g.getText())));
	}
	
  public static String tour(int joueur) {
	  
	  if (joueur%2==1) {
		  turn ="X";
	  }
	  else {
	      turn ="O";
  }
	  return turn;
}
  public static void stop(TicTacToe t) {
	  if (a.getText()==null)
		  a.setEnabled(false);
	  if (b.getText()==null)
		  b.setEnabled(false);
	  if (c.getText()==null)
		  c.setEnabled(false);
	  if (d.getText()==null)
		  d.setEnabled(false);
	  if (e.getText()==null)
		  e.setEnabled(false);
	  if (f.getText()==null)
		  f.setEnabled(false);
	  if (g.getText()==null)
		  g.setEnabled(false);
	  if (h.getText()==null)
		  h.setEnabled(false);
	  if (i.getText()==null)
		  i.setEnabled(false);
    
  
  
  if((g.getText()=="X"||g.getText()=="O")&&(g.getText()==h.getText())&&(h.getText()==i.getText())) {
	  g.setBackground(Color.GREEN);
	  h.setBackground(Color.GREEN);
	  i.setBackground(Color.GREEN);
	  a.setEnabled(false);
	  b.setEnabled(false);
	  c.setEnabled(false);
	  d.setEnabled(false);
	  e.setEnabled(false);
	  f.setEnabled(false);
	
  }
  if(((a.getText()=="X"||a.getText()=="O")&&(a.getText()==b.getText())&&(b.getText()==c.getText()) )) {
	  a.setBackground(Color.GREEN);
	  b.setBackground(Color.GREEN);
	  c.setBackground(Color.GREEN);
	  g.setEnabled(false);
	  h.setEnabled(false);
	  i.setEnabled(false);
	  d.setEnabled(false);
	  e.setEnabled(false);
	  f.setEnabled(false);
  }
  if((d.getText()=="X"||d.getText()=="O")&&(d.getText()==e.getText())&&(e.getText()==f.getText())) {
	  d.setBackground(Color.GREEN);
	  e.setBackground(Color.GREEN);
	  f.setBackground(Color.GREEN);
	  a.setEnabled(false);
	  b.setEnabled(false);
	  c.setEnabled(false);
	  g.setEnabled(false);
	  h.setEnabled(false);
	  i.setEnabled(false);
  }
  if((a.getText()=="X"||a.getText()=="O")&&(a.getText()==d.getText())&&(d.getText()==g.getText())) {
	  a.setBackground(Color.GREEN);
	  d.setBackground(Color.GREEN);
	  g.setBackground(Color.GREEN);
	  b.setEnabled(false);
	  c.setEnabled(false);
	  e.setEnabled(false);
	  f.setEnabled(false);
	  h.setEnabled(false);
	  i.setEnabled(false);
  }
  if((b.getText()=="X"||b.getText()=="O")&&(b.getText()==e.getText())&&(e.getText()==h.getText())) {
	  b.setBackground(Color.GREEN);
	  e.setBackground(Color.GREEN);
	  h.setBackground(Color.GREEN);
	  a.setEnabled(false);
	  c.setEnabled(false);
	  d.setEnabled(false);
	  i.setEnabled(false);
	  e.setEnabled(false);
	  f.setEnabled(false);
  }
  if((c.getText()=="X"||c.getText()=="O")&&(c.getText()==f.getText())&&(f.getText()==i.getText())) {
	  c.setBackground(Color.GREEN);
	  f.setBackground(Color.GREEN);
	  i.setBackground(Color.GREEN);
	  g.setEnabled(false);
	  h.setEnabled(false);
	  a.setEnabled(false);
	  d.setEnabled(false);
	  e.setEnabled(false);
	  b.setEnabled(false);
  }

  if((a.getText()=="X"||a.getText()=="O")&&(a.getText()==e.getText())&&(e.getText()==i.getText())) {
	  a.setBackground(Color.GREEN);
	  e.setBackground(Color.GREEN);
	  i.setBackground(Color.GREEN);
	  g.setEnabled(false);
	  h.setEnabled(false);
	  b.setEnabled(false);
	  d.setEnabled(false);
	  a.setEnabled(false);
	  f.setEnabled(false);
  }
  if((c.getText()=="X"||c.getText()=="O")&&(e.getText()==e.getText())&&(e.getText()==g.getText())) {
	  c.setBackground(Color.GREEN);
	  g.setBackground(Color.GREEN);
	  e.setBackground(Color.GREEN);
	  a.setEnabled(false);
	  b.setEnabled(false);
	  h.setEnabled(false);
	  i.setEnabled(false);
	  d.setEnabled(false);
	  e.setEnabled(false);
	  f.setEnabled(false);
  }
}
}