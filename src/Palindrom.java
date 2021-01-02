public class Palindrom {

    public static void main(String[] args) {

        String palindrom = "eine note betone nie";
        int vor=0, rueck=palindrom.length();
        boolean isPalindrom = true;
        while (isPalindrom && rueck>0) {
            rueck--;
            // Ueberspringen der Leerzeichen
            while (rueck>=0 && palindrom.charAt(rueck)==' ') rueck--;
            while (vor<palindrom.length() && palindrom.charAt(vor)==' ') vor++;

            if (palindrom.charAt(vor) != palindrom.charAt(rueck)) {
                isPalindrom = false;
            }
            vor++;
        }
        System.out.println(isPalindrom);
    }
}


