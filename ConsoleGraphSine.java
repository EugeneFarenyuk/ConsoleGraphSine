// Task: Graph function y=sin(x) via text-only console terminal (no GUI).
// Domain is [-Pi/2; Pi/2].
// Range is [-1; 1]
// Domain and Range are for standard x=arcsin(y).
import java.lang.*;
public class ConsoleGraphSine {
    public static void main(String args[]) { 
        double sineValue =1.0;
        int angleInt = 0;
        for(int i=0;i<=20;i++) {            
            double angleRadian = Math.asin(sineValue);
            angleInt = (int)(angleRadian*36.0)+56; // 36 and 56 were determined through testing.
            //System.out.println(angleRadian +"  "+angleInt);
            if(angleInt==0) angleInt=1;
            System.out.printf("%" + angleInt + "s","x\n");
            sineValue = sineValue-0.1;
        }        
    }
}