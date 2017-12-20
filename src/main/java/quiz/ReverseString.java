package quiz;

public class ReverseString {
    public String reverse(String input) {
        StringBuffer rev = new StringBuffer();
        int strlen = input.length();
        
        //if string is empty return it
        if(input.equals("")){
            return input;
        }

        //reverse the string
        for(int i = strlen; i > 0; i--){
            rev = rev.append(input.charAt(i-1));
        }
        //System.out.println(rev);
        return rev.toString();
        //return new StringBuffer(input).reverse().toString();
    }
}