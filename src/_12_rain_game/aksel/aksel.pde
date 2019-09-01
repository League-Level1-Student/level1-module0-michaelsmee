int x=0;
int y=0;
int z=0;
int randomNumber = (int) random(800)+100;
void setup(){

size(1000,1000);  
 

  
  
}

void draw(){
  background(0,200,0); 
fill(0, 0, 200);
stroke(0, 0, 200);
 ellipse(randomNumber, y, 50, 50);    
y+=1;  

if(y==950) {
y=0;
randomNumber = (int) random(800)+100;

}

 
  
  
rect(mouseX, 850, 200, 150);  
  
  if(y>=875){
  checkCatch(randomNumber);
  }
    fill(0, 0, 0);
    textSize(16);
    text("Score: " + z, 20, 20);

     
  
  
  
  
  
  
}




void checkCatch(int x){
         if (x > mouseX && x < mouseX+200)
            z++;
         else if (z > 0) 
            z--;
            
        println("Your score is now: " + z);
    }
