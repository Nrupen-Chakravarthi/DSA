public class decodeMessageClass {
    public static void main(String[] args) {
        String input = "ab";
        System.out.println(decodeMessage(input, 2, 1));
    }
    public static String decodeMessage(String input, int input2, int input3){
        for(int i = 1; i < input.length(); i++){
            int ascii = (int) input.charAt(i) + input2;
            ascii = ascii % 122;
            char temp = (char) ascii;
            input.replace(input.charAt(i), temp);
        }
        return input;
    }
}
