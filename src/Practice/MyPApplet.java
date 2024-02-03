package Practice;
import processing.core.*;

public class MyPApplet extends PApplet{
	PImage img;
	
	public void setup() {
		size(600, 400);
		background(13, 5, 13);
		stroke(0);
		img = loadImage("https://cseweb.ucsd.edu//~minnes/palmTrees.jpg", "jpg");
		img.resize(0, height);
		image(img, 0, 0);
	}
	
	public void draw() {
		int []color = sunColorSec(second());
		fill(color[0], color[1], color[2]);
		ellipse(width/4, height/4, height/5, height/5);
	}
	
	public int[] sunColorSec(float seconds) {
		int rgb[] = new int[3];
		float diffFrom30 = Math.abs(30-seconds);
		float ratio = diffFrom30/30;
		rgb[0] = (int)(255*ratio);
		rgb[1] = (int)(255*ratio);
		rgb[2] = 0;
		return rgb;
	}
}