import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;


public class Compute2 extends JFrame {

	private JPanel contentPane;
	private static JTextField r1;
	private static JTextField r2;
	private static JTextField r3;
	private static JTextField a1;
	private static JTextField p1;
	private static JTextField a2;
	private static JTextField p2;
	private static JTextField a3;
	private static JTextField p3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Compute2 frame = new Compute2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Compute2() {
		setTitle("U10116048_GeoCompute");//設定JFRAME標題
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 700);
		contentPane = new JPanel();
		
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("circle1");
		
		JLabel lblNewLabel_1 = new JLabel("radius1");
		
		r1 = new JTextField();
		r1.setColumns(10);
		
		JButton cp1 = new JButton("\u8A08\u7B97");
		
		JButton btnNewButton_1 = new JButton("\u6E05\u9664");
		
		r2 = new JTextField();
		r2.setColumns(10);
		
		JLabel lblCircle = new JLabel("circle2");
		
		JLabel lblRadius = new JLabel("radius2");
		
		JButton cp2 = new JButton("\u8A08\u7B97");
		
		JButton button_1 = new JButton("\u6E05\u9664");
		
		JLabel lblCircle_1 = new JLabel("circle3");
		
		JLabel lblRadius_1 = new JLabel("radius3");
		
		r3 = new JTextField();
		r3.setColumns(10);
		
		JButton cp3 = new JButton("\u8A08\u7B97");
		
		JButton button_3 = new JButton("\u6E05\u9664");
		
		a1 = new JTextField();
		a1.setColumns(10);
		
		p1 = new JTextField();
		p1.setColumns(10);
		
		JLabel lblTheAreaIs = new JLabel("the area is:");
		
		JLabel lblTheParameterIs = new JLabel("the parameter is:");
		
		JLabel lblTheAreaIs_1 = new JLabel("the area is");
		
		a2 = new JTextField();
		a2.setColumns(10);
		
		JLabel lblTheParameterIs_1 = new JLabel("the parameter is:");
		
		p2 = new JTextField();
		p2.setColumns(10);
		
		JLabel lblTheAreaIs_2 = new JLabel("the area is");
		
		a3 = new JTextField();
		a3.setColumns(10);
		
		JLabel lblTheParameterIs_2 = new JLabel("the parameter is:");
		
		p3 = new JTextField();
		p3.setColumns(10);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(63)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel)
							.addContainerGap())
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(lblTheParameterIs_1)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(p2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGap(145))
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblTheAreaIs_1)
									.addGap(18)
									.addComponent(a2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(178))
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
									.addGroup(gl_contentPane.createSequentialGroup()
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
											.addComponent(lblCircle)
											.addGroup(gl_contentPane.createSequentialGroup()
												.addComponent(lblRadius)
												.addGap(18)
												.addComponent(r2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
												.addComponent(cp2)
												.addGap(28)
												.addComponent(button_1)))
										.addContainerGap())
									.addGroup(gl_contentPane.createSequentialGroup()
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
											.addComponent(lblTheAreaIs)
											.addComponent(lblTheParameterIs))
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
											.addComponent(p1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addComponent(a1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGap(139))
									.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(lblNewLabel_1)
										.addGap(18)
										.addComponent(r1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
										.addComponent(cp1)
										.addGap(28)
										.addComponent(btnNewButton_1)
										.addGap(29)))))))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(55)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblTheParameterIs_2)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(p3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(161))
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(lblTheAreaIs_2)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(a3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGap(198))
							.addGroup(gl_contentPane.createSequentialGroup()
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addComponent(lblCircle_1)
									.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(lblRadius_1)
										.addGap(18)
										.addComponent(r3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
										.addComponent(cp3)
										.addGap(28)
										.addComponent(button_3)))
								.addGap(37)))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(29)
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(btnNewButton_1)
						.addComponent(cp1)
						.addComponent(r1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(27)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTheAreaIs)
						.addComponent(a1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(p1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTheParameterIs))
					.addGap(68)
					.addComponent(lblCircle)
					.addGap(24)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(r2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblRadius)
						.addComponent(button_1)
						.addComponent(cp2))
					.addGap(30)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTheAreaIs_1)
						.addComponent(a2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTheParameterIs_1)
						.addComponent(p2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(30)
					.addComponent(lblCircle_1)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblRadius_1)
						.addComponent(r3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_3)
						.addComponent(cp3))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblTheAreaIs_2)
						.addComponent(a3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTheParameterIs_2)
						.addComponent(p3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(21, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
		
		//*事件*//
		cp1.addActionListener(new compute1());
		cp2.addActionListener(new compute2());
		cp3.addActionListener(new compute3());
		btnNewButton_1.addActionListener(new clean1());
		button_1.addActionListener(new clean2());
		button_3.addActionListener(new clean3());
	}
	/*inner class
	 * 圓形1 圓形2 圓形3使用個別class撰寫*/
	
	//圓形1
	static class compute1 implements ActionListener{

		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			double i1=0;
			double area=0;
			double pi=3.14;
			double perimeter=0;
			String x;
			//取得Textfield的值轉成整數
			x=r1.getText();			 
			i1=Integer.parseInt(x);
			System.out.println("圓形1有作用");//在console上印出，方便除錯
			//計算
			area=pi*i1*i1;
			perimeter=2*pi*i1;
			//gui
			a1.setText(""+area);
			p1.setText(""+perimeter);
			  
		
		}
		
	}
	//圓形2
	static class compute2 implements ActionListener{

		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			double i1=0;
			double area=0;
			double pi=3.14;
			double perimeter=0;
			String x;
			//取得Textfield的值轉成整數
			x=r2.getText();			 
			i1=Integer.parseInt(x);
			System.out.println("圓形2有作用");//在console上印出，方便除錯
			//計算
			area=pi*i1*i1;
			perimeter=2*pi*i1;
			//gui
			a2.setText(""+area);
			p2.setText(""+perimeter);
		}
		
	}
	//圓形3
	static class compute3 implements ActionListener{

		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			double i1=0;
			double area=0;
			double pi=3.14;
			double perimeter=0;
			String x;
			//取得Textfield的值轉成整數
			x=r3.getText();			 
			i1=Integer.parseInt(x);
			System.out.println("圓形3有作用");//在console上印出，方便除錯
			//計算
			area=pi*i1*i1;
			perimeter=2*pi*i1;
			//gui
			a3.setText(""+area);
			p3.setText(""+perimeter);
		}
		
	}
	//清除
	//圓形1
	static class clean1 implements ActionListener{

		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			r1.setText(null);
			a1.setText(null);
			p1.setText(null);
		}
	}
	//圓形2
	static class clean2 implements ActionListener{

		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			r2.setText(null);
			a2.setText(null);
			p2.setText(null);
		}
	}
	//圓形3
	static class clean3 implements ActionListener{

		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			r3.setText(null);
			a3.setText(null);
			p3.setText(null);
		}
	}
}
