package knemr.loool;

import processing.core.PApplet;
import processing.core.PImage;

public class MyDisplay extends PApplet {

	private static final long serialVersionUID = 1L;
	PImage img;
	
	@Override
	public void setup() {
		size(400, 400);
		background(200, 200, 200);
		stroke(0);
		img = loadImage("/home/tiger/Pictures/images.jpg");
		img.resize(0, height);
		image(img, 0, 0);
	}
	
	@Override
	public void draw() {
		
		/*//  Draw happy face
		fill(255, 255, 0);
		ellipse(200, 200, 390, 390);
		fill(0, 0, 0);
		ellipse(120, 130, 50, 70);
		ellipse(280, 130, 50, 70);
		noFill();
		arc(200, 280, 75, 75, 0, PI);*/
		
		// View sun with custom color
		int[] color = sunColorSec(second());
		fill(color[0], color[1], color[2]);
		ellipse(width/4, height/5, width/4, height/5);
		
		// here is my new change
	}

	private int[] sunColorSec(float seconds) {
		int[] rgb = new int[3];
		float diffFrom30 = Math.abs(30-seconds);
		float ratio = diffFrom30/30;
//		System.out.println("Seconds: " + seconds + ", DiffFrom30: " + diffFrom30 + ", Ratio: " + ratio);
		
		rgb[0] = (int)(255*ratio);
		rgb[1] = (int)(255*ratio);
		rgb[2] = 0;
//		System.out.println("R: " + rgb[0] + ", G: " + rgb[1] + ", B: " + rgb[2]);
		
		return rgb;
	}

}
