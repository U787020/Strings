public class Tanga {

    public static void main(String[] args) {

        String input = "Kaokao";
        String appendix = "";
        String vocal = "aeiouAEIOU";

        for (int i=0; i<input.length(); i++) {
            char zeichen = input.charAt(i);
            if (vocal.indexOf(zeichen)>=0) {
                appendix = appendix + zeichen;
            }
        }
        System.out.println(input+appendix);
    }
}
