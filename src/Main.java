
public class Main {

	public static void main(String[] args) {
		int[] ourArray = new int[] { 1, 2, 3, 4, 5, 6 };
		int[] ourArray2 = new int[ourArray.length];

		for (int index = 0; index < ourArray.length; index++) {
			ourArray2[index] = ourArray[index];
		}
		for (int index = 0; index < ourArray.length; index++){
			System.out.print(ourArray2[index]+" "); 
		}
	}
}
