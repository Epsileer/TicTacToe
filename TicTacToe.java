import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;
public class TicTacToe extends JFrame{
	JPanel p = new JPanel();
	XOButton buttons[] = new XOButton[9];
	public static void main(String[] args) {
		new TicTacToe();
	}
	public TicTacToe(){
		super("TicTacToe");
		setSize(400,400);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		p.setLayout(new GridLayout(3,3));
		for(int i=0;i<9;i++){
			buttons[i] = new XOButton();
			p.add(buttons[i]);
		}
		add(p);

		setVisible(true);
	}
}
class a{
	public static int value = 0;
}
class XOButton extends JButton{
	
	ImageIcon X,O;
	public XOButton(){
		X = new ImageIcon(this.getClass().getResource("X.png"));
		O = new ImageIcon(this.getClass().getResource("O.png"));
		this.addActionListener(new ecout5());
	}
	class ecout5 implements ActionListener {
            public void actionPerformed(ActionEvent e){
		a.value%=2;
		switch(a.value){
			case 0:
				setIcon(X);break;
			case 1:
				setIcon(O);break;
        }
        a.value++;
    }
}
}	
