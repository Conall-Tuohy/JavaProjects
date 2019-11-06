
public class Harness {

	public final int harnessModelNumber;
	public final String harnessMake;
	private String harnessNameOfInstructor;
	private int harnessNumberOfTimesUsed;
	private boolean harnessOnLoan;
	private String harnessLoanerName;;
	private final int MAX_HARNESS_USE = 25;

	public Harness(String make, int modelNumber, int numberOfTimesUsed, String nameOfInstructor, boolean onLoan, String loanerName){
		harnessModelNumber = modelNumber;
		harnessMake = make;
		harnessNameOfInstructor = nameOfInstructor;
		harnessNumberOfTimesUsed = numberOfTimesUsed;
		harnessOnLoan = onLoan;
		harnessLoanerName = loanerName;
	}
	public Harness(String make, int modelNumber, String nameOfInstructor){
		harnessModelNumber = modelNumber;
		harnessMake = make;
		harnessNameOfInstructor = nameOfInstructor;
		harnessNumberOfTimesUsed = 0;
		harnessOnLoan = false;
		harnessLoanerName = "Nobody";
	}
	public void checkHarness (String nameOfInstructor){
		if(harnessOnLoan){
			harnessNumberOfTimesUsed = 0;
			harnessNameOfInstructor = nameOfInstructor;
		} else System.out.println("This harness is on loan and cannot be checked.");
	}
	public boolean canHarnessBeLoaned (){
		if(harnessOnLoan || harnessNumberOfTimesUsed>=MAX_HARNESS_USE){
			return false;
		} else return true;
	}
	public void loanHarness (String loanerName){
		if(canHarnessBeLoaned()){
			harnessLoanerName=loanerName;
			harnessOnLoan = true;
		}
	}
	public void returnHarness (){
		if(harnessOnLoan){
			harnessLoanerName="Nobody";
			harnessNumberOfTimesUsed++;
			harnessOnLoan = false;
		}
	}
	public String toString(){
		return (harnessOnLoan)?("This Harness is of the make: "+harnessMake
				+"\nThis Harness' model number is: "+ harnessModelNumber
				+"\nThis harness was last checked by: "+ harnessNameOfInstructor
				+"\nThis harness has been used "+ harnessNumberOfTimesUsed+" since last checked."
				+"\nThis harness is on loan to: " + harnessLoanerName+ "\n"):		("This Harness is of the make: " + harnessMake
																					+"\nThis Harness' model number is: " + harnessModelNumber
																					+"\nThis harness was last checked by: " + harnessNameOfInstructor
																					+"\nThis harness has been used " + harnessNumberOfTimesUsed + " since last checked."
																					+"\nThis harness is not on loan\n");
	}
}
