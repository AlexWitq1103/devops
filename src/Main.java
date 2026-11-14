//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
   //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.

public class Main {
    public static void main(String[] args) {

        // Pierwsza pętla for
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i]);

            if (i < args.length - 1) {
                System.out.print(",");
            }
        }

        System.out.println();

        // Druga pętla for (for-each)
        int i = 0;

        for (String liczba : args) {
            if (i > 0) {
                System.out.print(",");
            }

            System.out.print(liczba);
            i++;
        }
    }
}