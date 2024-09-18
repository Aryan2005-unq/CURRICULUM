import java.io.*;
import java.util.*;
class SingleInheritance{
	public static void main(String args[]){
		Cube sc=new Cube();
		int resultsquare=sc.calculate(17);
		int resultcube=sc.calculate1(17);
		System.out.println("Square is :"+resultsquare);
		System.out.println("Cube is :"+resultcube);
}

}
class operation{
	int calculate(int num){
		int sum=num*num;
		return sum;
		
}
}
 class Cube extends operation{
	int calculate1(int num){
		int cube=num*num*num;
		return cube;
}
}


