package graphicsEditor;
import java.awt.Graphics;

import javax.swing.JPanel;

public class GDrawingPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	
	//Constructor
	public GDrawingPanel() {
		
	}
	
	public void draw(Graphics graphics) {
		graphics.drawRect(10, 10, 50, 50);
	}

	public void initialize() {
	}
	
	
	protected void paintComponent(Graphics graphics) {
		super.paintComponent(graphics);//오버라이딩 할때는 항상 이렇게 해라. 자식을 무조건 호출
		this.draw(graphics);
	}
}
