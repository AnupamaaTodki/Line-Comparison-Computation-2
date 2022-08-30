package com.linecomparison;

public class LengthOfLine {

	public static void main(String[] args) {
		double x1,x2,y1,y2,lenghtOfLine1;
		x1=78;
		x2=88;
		y1=36;
		y2=77;
		lenghtOfLine1=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
		System.out.println("Lenght of line 1 is : "+lenghtOfLine1);

		}

	}
