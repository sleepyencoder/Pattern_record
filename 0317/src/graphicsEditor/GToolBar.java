package graphicsEditor;

import java.awt.FlowLayout;

import javax.swing.JRadioButton;
import javax.swing.JToolBar;

public class GToolBar extends JToolBar {
	private static final long serialVersionUID = 1L;
	
	private JRadioButton rectangleButton;
	
	public GToolBar() {
		//rectangle 버튼 왼쪽에 붙여 고정시키기 위함인데 안됨... 알아서 하3
		this.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		
		this.rectangleButton = new JRadioButton("rectangle");
		this.add(this.rectangleButton);
		
	}

	public void initialize() {
		// TODO Auto-generated method stub
		
	}

}
