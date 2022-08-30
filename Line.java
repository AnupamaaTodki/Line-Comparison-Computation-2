package com.linecomparison;

public class Line {
	Point Start_Point;
	Point End_Point;
    Line(Point Start_Point, Point End_Point)
	{
		this.Start_Point = Start_Point;
		this.End_Point = End_Point;
		
	}
	public double length() {
	double lengthOfLine=Math.sqrt(Math.pow(End_Point.x-Start_Point.x,2)+Math.pow(End_Point.y-Start_Point.y,2));
	return lengthOfLine;
	}

}
