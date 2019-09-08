PImage backgroundImage;
 import ddf.minim.*;
  Minim minim;
  AudioSample sound;
int x=0;
int y=50;
int speed = 5;
int speed1 = 1;
void setup(){
  
  size(1000,900);
  
  
  minim = new Minim (this);
  sound = minim.loadSample("aksel.wav", 128);
  
  //backgroundImage = loadImage("aksel.png");

  
  
}

void draw(){
  background(0,0,200);
   fill(255,0,0);
  stroke(255,0,0);
  ellipse(x,y,20,20);
  
  x+=speed;
  y+=speed1;
  if(intersects(x, y, mouseX, 800, 200) == true){
      speed1=-speed1; 
  }
  if(x == width)
  {sound.trigger();
  speed=-speed;  
  }
  
  else if(x == 0){sound.trigger();
   speed=-speed; 
  }

  if(y == height){sound.trigger();
   speed1=-speed1; 
  }
  else if(y==0){sound.trigger();
     speed1=-speed1;
  }
  
 
  
  
   //image(backgroundImage, 0, 0);
    //image(backgroundImage, 0, 0, width, height);  

    rect(mouseX, 800, 200, 200);
    fill(0,200,0);

    
}


 boolean intersects(int ballX, int ballY, int paddleX, int paddleY, int paddleLength) {
     if (ballY > paddleY && ballX > paddleX && ballX < paddleX + paddleLength)
          return true;
     else
          return false;
    
  }
