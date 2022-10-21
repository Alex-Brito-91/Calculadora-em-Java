import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Window.Type;
import java.awt.Font;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.border.BevelBorder;

public class Calc extends JFrame {

	public Calc() throws Exception {
		super("Calculadora");
		getContentPane().setBackground(new Color(0, 0, 0));
		setBackground(new Color(0, 0, 0));
		getContentPane().setFont(new Font("DialogInput", Font.PLAIN, 20));

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 400);
		setLocation(400, 200);
		
		BorderLayout borderLayout = new BorderLayout();
		borderLayout.setVgap(15);
		borderLayout.setHgap(15);
		getContentPane().setLayout(borderLayout);
		
		TextPanel textPanel = new TextPanel();
		textPanel.setBackground(new Color(46, 52, 54));
		textPanel.getTxtNumber().setFont(new Font("DialogInput", Font.PLAIN, 18));
		textPanel.getTxtNumber().setColumns(23);
		textPanel.getTxtNumber().setEnabled(true);
		FlowLayout flowLayout = (FlowLayout) textPanel.getLayout();
		flowLayout.setAlignOnBaseline(true);
		flowLayout.setVgap(30);
		flowLayout.setHgap(15);
		getContentPane().add(BorderLayout.NORTH, textPanel);
		
		JPanel digitsPanel = new JPanel();
		digitsPanel.setBackground(new Color(46, 52, 54));
		digitsPanel.setBorder(new EmptyBorder(40, 20, 40, 20));
		BorderLayout bl_digitsPanel = new BorderLayout();
		bl_digitsPanel.setVgap(10);
		bl_digitsPanel.setHgap(10);
		digitsPanel.setLayout(bl_digitsPanel);
		NumbersPanel numbersPanel = new NumbersPanel (textPanel.getTxtNumber());
		numbersPanel.setBackground(new Color(46, 52, 54));
		numbersPanel.setBorder(null);
		GridLayout gridLayout_1 = (GridLayout) numbersPanel.getLayout();
		gridLayout_1.setVgap(10);
		gridLayout_1.setHgap(10);
		digitsPanel.add(BorderLayout.CENTER, numbersPanel);
		OperationsPanel operationsPanel = new OperationsPanel (textPanel.getTxtNumber());
		operationsPanel.setBackground(new Color(46, 52, 54));
		operationsPanel.setBorder(null);
		operationsPanel.setForeground(new Color(114, 159, 207));
		GridLayout gridLayout = (GridLayout) operationsPanel.getLayout();
		gridLayout.setVgap(10);
		gridLayout.setHgap(10);
		digitsPanel.add(BorderLayout.EAST, operationsPanel);
		
		
		getContentPane().add(BorderLayout.CENTER, digitsPanel);

		setVisible(true);

	}

	public static void main(String[] args) throws Exception {
		new Calc();
	}

}
