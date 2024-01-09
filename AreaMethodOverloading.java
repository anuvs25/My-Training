class AreaMethodOverloading{
	
public static void area(double radius){
	System.out.println("The area of the circle is "+(3.14*radius*radius));
}

public static void area(float length, float breadth){
	System.out.println("The area of the rectangle is "+(length*breadth));
}

public static void area(float side){
	System.out.println("The area of the square is "+(side*side));
}

public static void main(String args[]){
	AreaMethodOverloading.area(5d);
	AreaMethodOverloading.area(8f,6f);
	AreaMethodOverloading.area(6f);
}

}

