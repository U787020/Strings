public class AnzahlDerSuchmuster {

    public static void main(String[] args) {
        String string = "TacabroTacata";
        String suchmuster = "ta"; // Erkenntnis: String string ist case-sensitive
        String suchmuster2 = "Ta"; // funktioniert nicht :-(
        int pos = 0;  // akt. Position im String
        int oldPos = 0; // wo wir zuletzt waren
        int i = 0;

        while (pos>=0) {
            pos = string.indexOf(suchmuster, oldPos);
            if (pos>=0) {
                i++;
                oldPos = pos+1;
            }
        }
        System.out.println(i);
    }
}

