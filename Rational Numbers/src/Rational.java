
public class Rational {

	public int Numerator;
	public int Denominator;

	
	public Rational(int n, int d) throws NumberFormatException{

		if (d == 0){
			throw new NumberFormatException();
		} else{
			Numerator = n; 
			Denominator = d;
		}
	}
	public Rational(int n) {
		Numerator = n;
		Denominator = 1;
	}
	public Rational Add(Rational pre) {
		int topCalc1 = Numerator * pre.Denominator;
		int topCalc2 = Denominator * pre.Numerator;
		int finalTop = topCalc1 + topCalc2;
		int finalBottom = Denominator*pre.Denominator;
		Rational additionRational = new Rational(finalTop, finalBottom);
		return additionRational;
	}
	public Rational Subtract(Rational pre) {
		int topCalc1 = Numerator * pre.Denominator;
		int topCalc2 = Denominator * pre.Numerator;
		int finalTop = topCalc1 - topCalc2;
		int finalBottom = Denominator*pre.Denominator;
		Rational additionRational = new Rational(finalTop, finalBottom);
		return additionRational;
	}
	public Rational Multiply(Rational pre) {
		int finalTop = Numerator*pre.Numerator;
		int finalBottom = Denominator*pre.Denominator;
		Rational mulRational = new Rational(finalTop, finalBottom);
		return mulRational;
	}
	public Rational Divide(Rational pre) {
		int finalTop = Numerator*pre.Denominator;
		int finalBottom = Denominator*pre.Numerator;
		Rational mulRational = new Rational(finalTop, finalBottom);
		return mulRational;
	}
	public boolean Equals(Rational pre) {
		if((Numerator*pre.Denominator)==(pre.Numerator*Denominator))
			return true;
		else return false;
	}
	public boolean isLessThan (Rational pre) {	
		if((Numerator*pre.Denominator)<(pre.Numerator*Denominator))
			return true;
		else return false;
	}
	public Rational Simplify() {		
		int greatestCommonDivisor = gcd(Numerator,Denominator);
		Numerator = (Numerator/greatestCommonDivisor);
		Denominator = (Denominator/greatestCommonDivisor);
		Rational simplifiedSet =  new Rational(Numerator, Denominator);
		return simplifiedSet;
	}
	public static int gcd(int p, int q) {
		if (q == 0) return p;
		else return gcd(q, p % q);
	}
	public String toString() {
		return Numerator+"/"+Denominator;
	}
}
