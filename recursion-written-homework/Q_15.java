/**
 * 15. Longest common subsequence problem. Given two strings x and y, we wish to compute 
 * their LCS. If we delete some characters from x and some characters from y, and the resulting 
 * two strings are equal, we call the resulting string a common subsequence. The LCS problem is 
 * to find a common subsequence of two strings that is as long as possible. For example, the 
 * LCS of GGCACCACG and ACGGCGGATACG is GGCAACG, a string of length 7. 
 * - - G G C - - A - C C A C G 
 * A C G G C G G A T - - A C G
 * 
 * @author Nicole Delos Reyes
 *
 */

public class Q_15 {

	public static String LCS (String x, String y) {


		if (x.length()==0 || y.length()==0) {
			return "";
		}

		char xLastChar = x.charAt(x.length()-1);
		char yLastChar = y.charAt(y.length()-1);


		if (xLastChar == yLastChar) { // if last letter of the first string equals to the last letter of the second string
			return LCS(x.substring(0,x.length()-1), y.substring(0,y.length()-1)) + xLastChar;
		}
		else {
			// If 
			if (LCS(x, y.substring(0,y.length()-1)).length()>LCS(x.substring(0, x.length()-1), y).length()) {
				return LCS(x, y.substring(0,y.length()-1));
			}
			else {
				return LCS(x.substring(0, x.length()-1), y);
			}

		}
	}

	public static void main(String[] args) {

		String str1 = "Bookmark134";
		String str2 = "Bookshalf133";

		System.out.println(LCS(str1, str2));


	}

}
