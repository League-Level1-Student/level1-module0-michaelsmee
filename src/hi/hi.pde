import ddf.minim.*;             //at the very top of your sketch
Minim minim;        //as a member variable
AudioPlayer song;      //as a member variable
PImage pictureOfRecord;                        //as member variable
int speed=0;
void setup(){
 size(330,329); 
            //in setup method
  
  minim = new Minim(this);    //in the setup method
  song = minim.loadFile("awesomeTrack.mp3", 512);   //in the setup method
   
                                        //in setup method
        pictureOfRecord= loadImage("aksel.png");      //in setup method
       
        
  pictureOfRecord.resize(330,329);
  
  
}

void draw(){
   
   speed+=1;
  if(mousePressed){
    rotateImage(pictureOfRecord, speed);
  }
image(pictureOfRecord, 0, 0);  //in draw method
  
}
  
  void rotateImage(PImage image, int amountToRotate) {
        translate(width/2, height/2);
        rotate(amountToRotate*TWO_PI/360);
        translate(-image.width/2, -image.height/2);
    }
