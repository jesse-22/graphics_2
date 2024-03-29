package Graphics_02;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Circle implements Sprite {
	private int width;
	private int height;
	private Color color;

	public Circle(int width, int height, Color color) {
		this.width = width;
		this.height = height;
		this.color = color;
	}

	public void draw(Graphics surface, int x, int y) {
		// Draw the object
		surface.setColor(color);
        surface.fillOval(x, y, width, height);
        surface.setColor(Color.BLACK);
        ((Graphics2D) surface).setStroke(new BasicStroke(3.0f));
        surface.drawOval(x, y, width, height);
	}

	public int getWidth() {
		return this.width;
	}

	public int getHeight() {
		return this.height;
	}

}