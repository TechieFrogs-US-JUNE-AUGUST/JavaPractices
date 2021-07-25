public class DeleteAllString {
public static void main(String[] args) {
		// Declare a string object
		String strValue = "aaxabbccddeefff";
		// call a method to delete all occurrences
		String newString = deleteAll(strValue, "a");
		// print the new string value
		System.out.println("New String:" + newString);

	}

	private static String deleteAll(String strValue, String charToRemove) {
		return strValue.replaceAll(charToRemove, "");

	}

}

