/**
 * Description: Contains all of the string testing methods used in WordTester
 * @author Ella Ley - isPalindrome, isAbecdarian, capitalizeFirstLetter
 * @since 2024-03-8 
 */


public class Antics{

/**
 * Description: Tests if word is a palindrome by testing the first and last letter, then working its way in
 * @param word Word inputted from WordTester
 * @return True or False, depending on if word is a palindrome
 */
    
    public static boolean isPalindrome(String word) {
        int rightLetter = word.length() - 1 ;
        for(int leftLetter = 0; leftLetter < rightLetter;) {
            if (word.charAt(leftLetter) != word.charAt(rightLetter)){
                return false;
            }
            else{
                rightLetter--;
                leftLetter++;
            }
        }            
        return true;
        }
/**
 * Description: Tests if word is Abecdedarian, meaning the letters in the word are in alphabetical order
 * @param word Word inputted from WordTester
 * @return True or False depending on if word is abecedarian
 */
    public static boolean isAbecedarian(String word) {
        int previousCharacter = 0;
        for (int nextChar = 1; nextChar < word.length();) {
            char firstLetter = word.charAt(previousCharacter);
            int firstConversion = firstLetter;
            char nextLetter = word.charAt(nextChar);
            int nextConvert = nextLetter;
            if (firstConversion > nextConvert) {
                return false;
            }
            else {
                previousCharacter++;
                nextChar++;
            }
        }
        return true;
    }
/**
 * Description: Takes the word, forces it to be lowercase, then capitalizes the first letter
 * @param word Word taken from WordTester
 * @return Word with the first letter capitalized
 */
    public static String capitalizeFirstLetter(String word) {
        String lowerWord = word.toLowerCase();
        String capString = lowerWord.substring(0,1).toUpperCase() + lowerWord.substring(1);
        return capString;



    }
}
