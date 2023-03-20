public class PalindromeString {
    public static void main(String[] args) {

        CheckPalindrome("malayalam", 0, 8);
    }

    public static int CheckPalindrome(String str, int l, int r) {
        if (l>=r) {
            System.out.println("Palindrome String");
            return 1;
        }

        if (str.charAt(l)!=str.charAt(r)) {
            System.out.println("Not a palindrome String");
            return 0;
        }

        CheckPalindrome(str, l+1, r-1);
        return 0;

    }

}


