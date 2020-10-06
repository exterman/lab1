public class Palindrom {
    public static void main(String[] args){
        for (int i = 0; i < args.length; i++){
            String s = args[i];
            if (isPalindrom(s)){
                System.out.println(s + " is a palindrom");
            }
            else{
                System.out.println(s + " is not a palindrom");
            }
        }
    }
    public static String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }
    public static boolean isPalindrom(String s) {
        return s.equals(reverseString(s));
    }
}
