public class Antics extends WordTester{
    //Getting length of word for use
    WordTester wordTests = new WordTester();
    String inputtedWord = wordTests.word;
    int lengthOfWord = inputtedWord.length();
    
    public boolean isPalindrome() {
        boolean palindrome = true;
        int rightLetter = lengthOfWord;
        for(int leftLetter = 0; leftLetter < rightLetter;) {
            if (inputtedWord.charAt(leftLetter) != inputtedWord.charAt(rightLetter)){
                palindrome = false;
            }
            else{
                rightLetter--;
                leftLetter++;
            }
        }
        return palindrome;
            

        }




    }

    //Ella: Palindrome
    //Xinyi: Abecdarian
    //YuWen or Shirley : Capitalize first letter


}
