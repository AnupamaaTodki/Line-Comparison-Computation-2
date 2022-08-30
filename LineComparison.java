package com.linecomparison;

public class LineComparison {

	public static void main(String[] args) {
	
		Point lineOnePointOne = new Point(22, 30);
		Point lineOnePointTwo = new Point(30, 35);
		
		Line lineOne = new Line(lineOnePointOne,lineOnePointTwo );
		System.out.println("length Of Line1 "+lineOne.length());
		
		Point lineTwoPointOne = new Point(33, 55);
		Point lineTwoPointTwo = new Point(15, 50);
		
		
		Line lineTwo = new Line(lineTwoPointOne,lineTwoPointTwo );
		System.out.println("length of line2 " + lineTwo.length());
		
		if(lineOne == lineTwo)
		{
			System.out.println("both lines are equal");
		}
		else
			System.out.println("both lines are not equal");
				}
		
		
	
	}

