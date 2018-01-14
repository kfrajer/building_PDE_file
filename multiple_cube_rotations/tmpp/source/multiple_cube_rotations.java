import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class multiple_cube_rotations extends PApplet {

//REFERENCE:
// https://forum.processing.org/two/discussion/16151/3d-programming-books#latest

float a;       // Angle of rotation 1
float a2;      // Angle of rotation 2
 
public void setup() 
{ 
  
} 
 
public void draw() 
{     
  background(0, 0, 26);
  lights(); 
 
  // big gray box in the center 
  pushMatrix();
  translate(width/2, height/2);
  fill(188);
  rotateY(a);
  box(200);
  popMatrix();
 
  // red box
  pushMatrix();
  translate(width/2, height/2);
  translate(200, 230);
  fill(255, 2, 2);
  rotateY(a2);
  box(20);
  popMatrix();
 
  // blue box 
  pushMatrix();
  translate(width/2, height/2);
  translate(200, 230);
  fill(2, 2, 255);
  rotateY(a2);
  translate(123, 0); 
  box(20);
  popMatrix();
 
  // increase angles 
  a += 0.01f;
  a2 += 0.053f;
} 
  public void settings() {  size(940, 760, OPENGL); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "multiple_cube_rotations" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
