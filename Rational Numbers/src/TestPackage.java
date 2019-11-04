
import java.util.*;
public class TestPackage {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner( System.in );
		System.out.println("Please type your first rational number with a space seperating the two integers rather than a '/'.");
		if(input.hasNextInt()){
			int rationalTransportNumerator = input.nextInt();
			int rationalTransportDenominator = input.nextInt();
			Rational firstRationalSet = new Rational(rationalTransportNumerator, rationalTransportDenominator);
			System.out.println("Please type your second rational number with a space seperating the two integers rather than a '/'.");
			if(input.hasNextInt()){
				 rationalTransportNumerator = input.nextInt();
				 rationalTransportDenominator = input.nextInt();
				Rational secondRationalSet = new Rational(rationalTransportNumerator, rationalTransportDenominator);
				Rational additionRational = firstRationalSet.Add(secondRationalSet);
				System.out.println("The Addition of "+firstRationalSet.toString()+" and "+secondRationalSet.toString()+" was "+additionRational.toString());
				
				Rational subtractionRational = firstRationalSet.Subtract(secondRationalSet);
				System.out.println("The Subtraction of "+firstRationalSet.toString()+" and "+secondRationalSet.toString()+" was "+subtractionRational.toString());

				Rational multiplyRational = firstRationalSet.Multiply(secondRationalSet);
				System.out.println("The Multiplication of "+firstRationalSet.toString()+" and "+secondRationalSet.toString()+" was "+multiplyRational.toString());

				Rational divideRational = firstRationalSet.Divide(secondRationalSet);
				System.out.println("The Division of "+firstRationalSet.toString()+" and "+secondRationalSet.toString()+" was "+divideRational.toString());
				
				if(firstRationalSet.Equals(secondRationalSet))
					System.out.println(firstRationalSet.toString()+" and "+secondRationalSet.toString()+" are equal.");
				else System.out.println(firstRationalSet.toString()+" and "+secondRationalSet.toString()+" aren't equal.");
				
				Rational firstSimpRational = firstRationalSet.Simplify();
				System.out.println(firstRationalSet.toString()+" simplified is "+firstSimpRational.toString());
				
				Rational secondSimpRational = secondRationalSet.Simplify();
				System.out.println(secondRationalSet.toString()+" simplified is "+secondSimpRational.toString());
				
				firstRationalSet.toString();
			}
		}
	}

}


