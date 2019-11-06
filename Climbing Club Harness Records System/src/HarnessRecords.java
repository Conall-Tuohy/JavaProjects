import java.util.ArrayList;

public class HarnessRecords {

	private ArrayList<Harness> harnessList;
	public HarnessRecords(){
		if(isEmpty())harnessList = new ArrayList<Harness>(0);}
	public HarnessRecords(ArrayList<Harness> recordOfHarnesses){
		harnessList=recordOfHarnesses;
	}
	public boolean isEmpty(){ return (harnessList == null);}
		
	public void addHarness(Harness currentHarness){
		System.out.println(currentHarness);
		harnessList.add(currentHarness); 
	}
	public Harness findHarness (String make, int modelNumber){
		for(int i=0; i<harnessList.size(); i++){
			if ((harnessList.get(i)).harnessModelNumber == modelNumber && (harnessList.get(i)).harnessMake == make){
				return harnessList.get(i);
			}
		} return null;
	}
	public Harness checkHarness (String make, int modelNumber, String nameOfInstructor){
		if(findHarness(make, modelNumber)!=null){
			findHarness(make, modelNumber).checkHarness(nameOfInstructor);
			System.out.println(findHarness(make, modelNumber));
			return findHarness(make, modelNumber);
		} else {System.out.println("This harness is on loan, you fool... Choose another");
			return findHarness(make, modelNumber);}
	}
	public Harness loanHarness(String nameOfInstructor){
		for(int i=0; i<harnessList.size(); i++){
			if ((harnessList.get(i)).canHarnessBeLoaned()){
				(harnessList.get(i)).loanHarness(nameOfInstructor);
				return harnessList.get(i);
			}
		} return null;
	}
	public Harness returnHarness(String make, int modelNumber){
			if (findHarness(make, modelNumber)!=null){
				findHarness(make, modelNumber).returnHarness();
				System.out.println(findHarness(make, modelNumber));
				return findHarness(make, modelNumber);
		} return null;
	}
	public Harness removeHarness(String make, int modelNumber){
		for(int i=0; i<harnessList.size(); i++){
			if ((harnessList.get(i)).harnessModelNumber == modelNumber && (harnessList.get(i)).harnessMake == make){
				System.out.println(harnessList.get(i));
				harnessList.remove(i);
				return harnessList.get(i);
			}
		} return null;
	}
	
	public String toString() {
		String output = "";
		for(Harness harness : harnessList) {
			output += harness;
		}
		return output;
	}
}
