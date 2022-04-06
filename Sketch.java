import processing.core.PApplet;

public class Sketch extends PApplet {
	
  private int intColumnblock;

  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(1200, 600);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(45, 150, 207);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	  // sample code, delete this stuff
    /*
    stroke(128);
    line(150, 25, 270, 350);  

    stroke(255);
    line(50, 125, 70, 50);  
*/
    draw_section_outlines();
    draw_section1();
    draw_section2();
    draw_section3();
    draw_section4();
	  
    draw_section5();
    draw_section6();
    draw_section7();
    draw_section8();

    
  }


  /**
   * Draw the outlines for all sections
   */
  public void draw_section_outlines(){
    stroke(0);
    noFill();

    // draw bottom row boxes
    rect(0,300, 300, 300);
    rect(300, 300, 300, 300);
    rect(600, 300, 300, 300);
    rect(900, 300, 300, 300);

    // draw top row boxes
    rect(0,0, 300, 300);
    rect(300, 0, 300, 300);
    rect(600, 0, 300, 300);
    rect(900, 0, 300, 300);
  }
  
  /**
   * draws the bottom left section
   */

  public void draw_section1(){
    int intX = 0;
    int intY = 0;

    //filling the entire section with evenly spaced squares
    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = 0; intColumn < 30; intColumn++){
        intX = 3 + intRow * 10;  //Instead of zero, calculate the proper intX location using 'intRow'
        intY = 300 + 3 + intColumn * 10; //Instead of zero, calculate the proper intY location using 'intColumn'

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);

      }
    }
  }

  /**
   * Use the modulus operator and an if statement to select the color
   * Don't loop from 30 to 60 to shift everything over, just add 300 to x.
   */

  public void draw_section2(){
    int intX2 = 0;
    int intY2 = 0;

    //filling the entire section with evenly spaced squares
    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = 0; intColumn < 30; intColumn++){
        intX2 = 300 + 3 + intRow * 10;  
        intY2 = 300 + 3 + intColumn * 10; 

        if((intRow % 2) == 0){
          fill(255, 255, 255);
        }
        else {
          fill(0, 0, 0);
        }
        
        noStroke();
        rect(intX2, intY2, 5, 5);
      }
    }
  }


  public void draw_section3(){
    int intX3 = 0;
    int intY3 = 0;

    //filling the entire section with evenly spaced squares
    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = 0; intColumn < 30; intColumn++){
        intX3 = 600 + 3 + intRow * 10;  
        intY3 = 300 + 3 + intColumn * 10; 

        if((intColumn % 2) == 0){
          fill(0, 0, 0);
        }
        else {
         fill(255, 255, 255);
        }
        
        noStroke();
        rect(intX3, intY3, 5, 5);
      }
    }
  }

  /**
   * Use the modulus operator and just one 'if' statement to select the color.
   */

  public void draw_section4(){
   
    int intX4 = 0;
    int intY4 = 0;
    
    //black and white square pattern
    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = 0; intColumn < 30; intColumn++){
        intX4 = 900 + 3 + intRow * 10; 
        intY4 = 300 + 3 + intColumn * 10; 

        if((intColumn % 2) != 0 && (intRow % 2) == 0){
          fill(255, 255, 255);
        }
        else {
         fill(0, 0, 0);
        }
        
        noStroke();
        rect(intX4, intY4, 5, 5);
      }
    }
  }

  /**
   * Do NOT use 'if' statements to complete 5-8. Manipulate the loops instead
   */

  public void draw_section5(){
    int intX5 = 0;
    int intY5 = 0;

     //triangle with the straight lines facing right 
     for(int intRow5 = 0; intRow5 < 30; intRow5++){
      for(int intColumn5 = 30 - intRow5; intColumn5 < 30; intColumn5++){
        intX5 = 3 + intRow5 * 10;  
        intY5 = 3 + intColumn5 * 10; 

        fill(255);
        noStroke();
        rect(intX5, intY5, 5, 5);

      }
    }
  }

  public void draw_section6(){
      int intX6 = 0;
      int intY6 = 0;

      //triangle with the straight lines facing left
      for(int intRow6 = 0; intRow6 < 30; intRow6++){
        for(int intColumn6 = intRow6; intColumn6 < 30; intColumn6++){
        
          intX6 = 300 + 3 + intRow6 * 10;  
          intY6 = 3 + intColumn6 * 10; 

          fill(255);
          noStroke();
          rect(intX6, intY6, 5, 5);

      }
    }

  }

  public void draw_section7(){
    int intX7 = 0;
    int intY7 = 0;
    
    //upside down triangle with the straight lines facing left
    for(int intRow7 = 0; intRow7 < 30; intRow7++){
      for(int intColumn7 = 30 - intRow7; intColumn7 > 0; intColumn7--){
      
        intX7 = 600+ 3 + intRow7 * 10;  
        intY7 = 3 + intColumn7 * 10 - 10; 

        fill(255);
        noStroke();
        rect(intX7, intY7, 5, 5);
      }
    }
  }
  
  public void draw_section8(){
    int intX8 = 0;
    int intY8 = 0;
    
    //upside down triangle with the straight lines facing right
    for(int intRow8 = 0; intRow8 < 30; intRow8++){
      for(int intColumn8 = 0; intColumn8 <= intRow8; intColumn8++){
      
        intX8 = 900 + 3 + intRow8 * 10;  
        intY8 = 3 + intColumn8 * 10; 

        fill(255);
        noStroke();
        rect(intX8, intY8, 5, 5);
      }
  
    }
  }
}
