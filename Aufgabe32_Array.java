
public class Aufgabe32_Array {
	public static void main(String [] args) {
		int[] varArray;
		varArray = new int[100];
		int count = 1;
		
//		for (int laufVarE : varArray) {
//			System.out.print("laufVarE: " + laufVarE + "\t");
//			System.out.print("VarArray: " + varArray + "\t");
//			System.out.print("VarArray[e]: " + varArray[laufVarE]);
//			System.out.println();
//		}
		
		//Array nun mit Werten füllen von 1-100
		for(int i = 0; i < varArray.length; i++) {
			varArray[i] = count;
			count++;
			
			//alternativ aber schlecht weil direkt inhalt dcer laufvariable geschrieben wird beginnt bei null und endet bei 99
//			varArray[i] = i;
		}
		
		// Erneute Ausgabe von Array
		for (int laufVarE : varArray) {
			System.out.print("laufVarE: " + laufVarE + "\t");
			System.out.print("VarArray: " + varArray + "\t");
			
			// schlechte Ausgabe
			System.out.print("VarArray[laufVarE]: " + varArray[laufVarE -1]); //Array beginnt bei Index 0 dort steht 1
			
			System.out.println();
		}
		 // Alternative Arrayausgabe
		for(int i = 0; i<varArray.length; i++) {
			System.out.print("laufVarE: " + i + "\t");
			System.out.print("VarArray: " + varArray + "\t");
			
		 // schlechte Ausgabe hier aber Ohne veränderung wirksam
			System.out.print("VarArray[laufVarE]: " + varArray[i]); 
			
			System.out.println();
		}
		
	}
}
