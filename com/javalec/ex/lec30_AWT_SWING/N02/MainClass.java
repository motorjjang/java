package com.javalec.ex.lec30_AWT_SWING.N02;

import java.awt.Dimension;

public class MainClass {

	public static void main(String[] args) {
		
		MakeFrame makeFrame = new MakeFrame();
		makeFrame.setSize(new Dimension(500, 500));
		makeFrame.setVisible(true);
	}
}
