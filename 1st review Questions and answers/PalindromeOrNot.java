public class PalindromeOrNot{
    public static void main(String[] args){
        String str = "Vasantha";
        String reverse = "";
        for(int i =str.length() - 1; i>=1; i--){
            reverse =  reverse+str.charAt(i);   
        }
        if(str == reverse){
            System.out.println("its a palindrome");
        }else{
         System.out.println("its not a palindrome");
        }
    }
}