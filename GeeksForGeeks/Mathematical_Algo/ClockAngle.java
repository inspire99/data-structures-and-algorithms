/* IMPORTANT: class must not be public. */

/*
 * uncomment this if you want to read input.
import java.io.BufferedReader;
import java.io.InputStreamReader;

You can cross check for the answer in this link: 
www.mathcelebrity.com/clockangle.php
*/


class ClockAngle {
    public static void main(String args[] ) throws Exception {

    	angleBetweenHands(2,43);
    	
    }
    
    private static void angleBetweenHands(int hour, int min)
    {
    	// Keeping 12:00 as reference.
    	// Hour hand rotates 360 degrees in 12 hours or 12x60 = 720 minutes, so 360 degrees in 720 minutes
    	// So, hour hand rotates 0.5 degree in one minute
    	// Minute hand rotates 360 degrees in 60 minutes, 6 degrees in one minute
    	// In h hours and m minutes, hour hand will move: (h*60 + m)*0.5
    	// In h hours and m minutes, minute hand will move: (h*60 + m)*6
    	
    	if(hour ==12) hour = 0;
    	if(min == 60) min = 0;
    	
    	// With reference to 12:00, minute hand will have moved every minute 6 degrees
    	// With reference to 12:00, hour hand will have moved every minute 0.5 degrees
    	double minuteAngle =  (min)*6;
    	double hourAngle = (hour*60 + min)*0.5;
    	
    	System.out.println("Between-Inside hour hand and minute hand "+ Math.abs(minuteAngle-hourAngle));
    	System.out.println("Between-Outside hour hand and minute hand " + (360 - Math.abs(minuteAngle-hourAngle)));
    }
    
    
}
