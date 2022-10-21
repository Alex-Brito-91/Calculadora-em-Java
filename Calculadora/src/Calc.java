import javax.swing.JFrame;

public class Calc extends JFrame {

	public Calc() throws Exception {
		super("Calculadora");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 400);
		setLocation(400, 200);
		setVisible(true);

	}

	public static void main(String[] args) throws Exception {
		new Calc();
	}

}
