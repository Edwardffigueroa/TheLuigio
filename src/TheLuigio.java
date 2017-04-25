//import codeanticode.syphon.SyphonServer;
import processing.core.PApplet;
import processing.core.PFont;

import java.util.ArrayList;

import TUIO.*;
import processing.opengl.PJOGL;


public class TheLuigio extends PApplet {
	
	private Logica logica;

	//SyphonServer s;
	//Metodos
	
	public void settings(){
		
		System.out.println("Set Canvas Size");
		//if you will run on eclipse delete P3D and comment next line
		size(845, 720, P3D);
	//	PJOGL.profile=1;
	}
	
	@Override
	public void setup() {
		System.out.println("Start Logic");
		logica = new Logica (this);
		if(logica != null){
			System.out.println("Logic Running");
		}

		  // GUI setup
		  noCursor();

		//if you will run on eclipse comment line below
	//	s = new SyphonServer(this, "Processing Syphon");
		    	  
	}
	
	@Override
	public void draw() {
		
		 background(0);
		logica.pintar();
		//if you will run on eclipse comment line below
		//s.sendScreen();
	
	}
	
	
	public static void main(String[] args) {
		PApplet.main("TheLuigio");
	}

}