package com.linecomparison;

public class LengthOfLineEqual2 {

	public static void main(String[] args) {
		
		double x1,x2,x3,x4,y1,y2,y3,y4,lengthOfLine1,lengthOfLine2;
		x1=78;
		x2=88;
		y1=36;
		y2=77;
		lengthOfLine1=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
		System.out.println("Lenght of line 1 is : "+lengthOfLine1);

		x3=99;
		x4=88;
		y3=36;
		y4=77;
		lengthOfLine2=Math.sqrt(Math.pow(x4-x3,2)+Math.pow(y4-y3,2));
		System.out.println("Lenght of line 2 is : "+lengthOfLine2);
		
		if(lengthOfLine1 == lengthOfLine2)
{
	System.out.println("both lines are equal");
}
else
	System.out.println("both lines are not equal");

	}

}
