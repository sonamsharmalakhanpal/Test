package practise;

public class StringRotation {

	public static void main(String[] args) {

		System.out.println(isRotation("abcd", "badc"));

	}

	public static boolean isRotation(String str, String rotatedString ) {

		if (str == null || rotatedString==null) {
			return false;
		} else if(str.length() != rotatedString.length()){
			return false;
		}else {
			String concat = str+str; //combine string with itself in this way then rotation string should be in between the concat string
			return concat.contains(rotatedString);

		}
	}
}
