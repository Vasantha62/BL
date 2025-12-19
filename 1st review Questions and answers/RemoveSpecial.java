public class RemoveSpecial{
    public static void main(String[] args) {
        char[] input = {'R','a','g','i','m','e','k','a','l','a','p','a','l','l','i',' ','V','a','s','a','n','t','h','a','@','1','3','5','!','#','$'};

    
        char[] output = new char[input.length];
        int index = 0;

        for (int i = 0; i < input.length; i++) {
            char ch = input[i];


            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) {
                output[index] = ch;
                index++;
            }
        }
        System.out.print("After removing Space is: ");
        for (int i = 0; i < index; i++) {
            System.out.print(output[i]);
        }
    }
}

