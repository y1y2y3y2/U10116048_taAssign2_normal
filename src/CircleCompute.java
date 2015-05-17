//U10116048 楊明璋   實習課作業2


import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class CircleCompute {
	static Frame frm =new Frame("U10116048_GeoCalculate");
	static Label lab1 =new Label("circle");
	static Label lab2 =new Label("ridius");
	static Label lab3 =new Label("the area is");
	static Label lab4 =new Label("the parameter is");
	static Label lab1b =new Label("circle");
	static Label lab2b =new Label("ridius");
	static Label lab3b =new Label("the area is");
	static Label lab4b =new Label("the parameter is");
	static Label lab1c =new Label("circle");
	static Label lab2c =new Label("ridius");
	static Label lab3c =new Label("the area is");
	static Label lab4c =new Label("the parameter is");
	static Button refreshBtn = new Button("清除");
	static Button cp1 = new Button("計算");//第1組
	static Button cp2 = new Button("計算");//第2組
	static Button cp3 = new Button("計算");//第3組
	static TextField r1 = new TextField("r1"); //文字框
	static TextField r2 = new TextField("r2"); //文字框
	static TextField r3 = new TextField("r3"); //文字框
	static TextField area1 = new TextField("a1"); //文字框
	static TextField area2 = new TextField("a2"); //文字框
	static TextField area3 = new TextField("a3"); //文字框
	static TextField perimeter1 = new TextField("p1"); //文字框
	static TextField perimeter2 = new TextField("p2"); //文字框
	static TextField perimeter3 = new TextField("p3"); //文字框
	public static void main(String[] args) {
		frm.setSize(200,400);
		frm.setBounds(400, 400,200,400);
		frm.setBackground(Color.darkGray);
		
		/*排版 座標*/
		/*lab1.setBounds(50, 50,40,20);
		lab2.setBounds(50, 80,40,20);
		lab3.setBounds(50, 110,80,20);
		lab4.setBounds(50, 130,80,20);*/
		 frm.setLayout(new FlowLayout());
		/*加入畫面*/
		//第1組
		frm.add(lab1);
		frm.add(lab2);
		frm.add(r1);
		frm.add(cp1);
		frm.add(refreshBtn);
		frm.add(lab3);
		frm.add(area1);
		frm.add(lab4);
		frm.add(perimeter1);
		//第2組
		frm.add(lab1b);
		frm.add(lab2b);
		frm.add(r2);
		frm.add(cp2);
		frm.add(refreshBtn);
		frm.add(lab3b);
		frm.add(area2);
		frm.add(lab4b);
		frm.add(perimeter2);
		//第3組
		frm.add(lab1c);
		frm.add(lab2c);
		frm.add(r3);
		frm.add(cp3);
		frm.add(refreshBtn);
		frm.add(lab3c);
		frm.add(area3);
		frm.add(lab4c);
		frm.add(perimeter3);
		
		/*視窗上按鈕*/
		frm.addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent e){System.exit(0);}});
		/**********/
		frm.setVisible(true);
	}

}
