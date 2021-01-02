public class BondLaengen {

    public static void main(String[] args) {

        String ausgabe = "Mein Name ist Bond. James Bond.";
        int laenge = ausgabe.length();
        for (int i=0; i<laenge; i++) {
            System.out.print(ausgabe.charAt(i));
        }
    }
}

// Hm. Sehr spektakulär ist das nicht. Das könnte ich mit nur "System.out.print" schneller haben.
