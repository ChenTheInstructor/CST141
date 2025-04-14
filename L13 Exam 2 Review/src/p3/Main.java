package p3;

public class Main {

	public static void main(String[] args) {
		System.out.println(isValidCode("XABCD5"));
	}

	public static boolean isValidCode(String code) {
		return (startsWithX(code) && constainsSixCharacters(code) && endsWithDigit(code));
//		if (startsWithX(code) == true 
//				&& constainsSixCharacters(code) == true 
//				&& endsWithDigit(code) == true) {
//			return true;
//		} else {
//			return false;
//		}
	}

	private static boolean endsWithDigit(String code) {
		char lastCharacter = code.charAt(code.length() - 1);
		return Character.isDigit(lastCharacter);
	}

	private static boolean constainsSixCharacters(String code) {
		return code.length() == 6;
	}

	private static boolean startsWithX(String code) {
		return code.startsWith("X");
	}

}
