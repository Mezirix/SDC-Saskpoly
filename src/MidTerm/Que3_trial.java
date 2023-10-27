package MidTerm;

public class Que3_trial
{
    public static void main(String[] args) {

    }
    public static boolean isPalindrome(String str) {
        //postcondition: Result := reverse(str) = str
        int n = str.length();
        for (int i = 0; i < n/2; ++i) {
            if (str.charAt(i) != str.charAt(n-i-1)) return false;
        }
        return true;
//        System.out.println("Enter a number: ");
    }

}
