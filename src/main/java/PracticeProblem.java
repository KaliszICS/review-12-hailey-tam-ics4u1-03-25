public class PracticeProblem {

	public static void main(String args[]) {
	
	}	
	
	public static boolean isPalindrome(String word){
		word = word.replaceAll("\\s", "").toLowerCase();
		char[] charArr = word.toCharArray();

		for (int i = 0; i < charArr.length; i++){
			if (charArr[i] != charArr[charArr.length - 1 -i]){
				return false;
			}
		}
		return true;
	}

	public static int getAge(String[] names, int[] ages, String name){
		int index = -1;
		for (int i = 0; i < names.length; i++){
			if (names[i] == name){
				index = i;
				i = names.length;
			}
		}
		return ages[index];
	}

	public static int countWords(String phase, char letter){
	 int count = 0;
	 String[] phaseArr = phase.split(" ");
		for (int i = 0; i < phaseArr.length; i++){
			String word = phaseArr[i];
			for (int j = 0; j < word.length(); j++){
				if (word.charAt(j) == letter){
					count++;
					j = word.length();
					}
				}
			}
			return count;
		}
	}

