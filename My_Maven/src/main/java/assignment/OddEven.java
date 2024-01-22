package assignment;

public class OddEven {
int num;
public void checkOdd(int num) {
	
	this.num=num;
	
	if(num%2==0){
		System.out.println("The given number is even");
	}
	else{
		System.out.println("The given number is odd");
	}
}
	public static void main(String[] args) {
		OddEven ob = new OddEven();
		ob.checkOdd(25);
	}

}
