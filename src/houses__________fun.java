import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class houses__________fun {
public static void main(String[] args) {
	
Robot bob = new Robot();

bob.setSpeed(100);
bob.setX(50);
bob.setY(500);	
bob.penDown();
Random rand=new Random();
String oof = " ";
Color color = null;
for(int i =0; i<10; i++) {
int o = rand.nextInt(3);
if(o == 0) {
oof = "small";	
color=Color.blue;
}
else if(o == 1) {
oof = "medium";	
color=Color.red;
}
else if(o==2) {
oof = "large";
color=Color.LIGHT_GRAY;
}
drawHouse(bob, oof, color);
}

}

static void drawHouse(Robot rob, String size, Color color) {
	int height = 0;
	if(size.equals("small")){
	height = 60;
	}
	else if(size.equals("medium")) {
	height = 120;	
	}
	else if(size.equals("large")) {
	height = 250;	
	}
	rob.setPenColor(color);
	rob.move(height);
	if(height == 250) {
	flatmobile(rob);	
	}
	else {
	pointPoint(rob);	
	}
	rob.move(height);
	rob.turn(-90);
	rob.setPenColor(0,200,0);
	rob.move(80);
    rob.setAngle(0);
}

static void pointPoint(Robot rob) {
	rob.turn(45);
	rob.move(50);
	rob.turn(90);
	rob.move(50);
	rob.turn(45);
	
}
static void flatmobile(Robot rob) {
	rob.turn(90);
	rob.move(50);
	rob.turn(90);
}
}

