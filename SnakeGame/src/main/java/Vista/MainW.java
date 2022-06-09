package Vista;

import javax.swing.JFrame;

import Controlador.SnakeGame;

public class MainW extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2873342823046220930L;

	public MainW() {
		initUI();
	}

	private void initUI() {
		SnakeGame game1 = new SnakeGame();
		game1.getBtnReset().addActionListener(game1);
		add(game1);
		setResizable(false);
		pack();
		setTitle("Snake game");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {

		try {
			JFrame frame = new MainW();
			frame.setVisible(true);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
