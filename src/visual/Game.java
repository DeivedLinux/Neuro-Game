package visual;


import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

@SuppressWarnings("serial")
public class Game extends JPanel {
		
		private JTextPane texto;
        private JLabel background;
	
	
	public Game(Tela tela) {
		
		drawBackGround();
                
		
	}
	
	private void drawBackGround() 
	{
		
		setBackGround(new JLabel(new ImageIcon("src/Resources/Images/Game.png")));
		
		getBackGround().setBounds(0, 0, 700, 500);
		getBackGround().setVisible(true);
		this.add(getBackGround());
		
	}
	
	
	private void setTexto(JTextPane texto) {
			this.texto = texto;
	}
	private JLabel getBackGround() {
			return background;
	}
	private void setBackGround(JLabel background) {
			this.background = background;
	}
  
}

