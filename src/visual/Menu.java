package visual;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import java.awt.*;

@SuppressWarnings("serial")
public class Menu extends JPanel {

	private JLabel background;
	private JButton mainButton;
	
public Menu(Tela tela) {
		
		//this.setLayout(null);
		
		drawBackGround();
	
		drawButton(tela);
		
		
	}
	private JButton getMainButton() {
		return mainButton;
	}

	private void setMainButton(JButton mainButton) {
		this.mainButton = mainButton;
	}

	private JLabel getBackGround() {
		return background;
	}

	private void setBackGround(JLabel background) {
		this.background = background;
	}
	
	private void drawBackGround()
	{
		setBackGround(new JLabel(/*new ImageIcon("src/Resources/Images/Menu.png"*/));
		getBackGround().setBounds(0, 0, 700, 500);
		getBackGround().setLayout(null);
		//getBackGround().setVisible(true);
		//getBackGround().setLayout(null)
		this.add(getBackGround());
		
	}
	
	private void drawButton(Tela tela)
	{
		JButton botao = new JButton("Start"); //("", new ImageIcon("src/Resources/Images/MenuButton.png"));
		//botao.setRolloverIcon(new ImageIcon("src/Resources/Images/MenuButtonOver.png"));
		botao.setForeground(new Color(255, 255, 255));
		botao.setBackground(new Color(40, 40,40));
		botao.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(255,255,255), 2, true));
		botao.setBounds(295, 410 ,110,50);
		
		//botao.setOpaque(false);
		//botao.setContentAreaFilled(false);
		//botao.setBorderPainted(false);
		
		
		setMainButton(botao);
		
		getMainButton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				
				tela.mudarParaTela("Game");
				
				
			}
		});
		
		getBackGround().add(botao);
		
		
			//this.add(getMainButton());
	
			
	}
	
}
