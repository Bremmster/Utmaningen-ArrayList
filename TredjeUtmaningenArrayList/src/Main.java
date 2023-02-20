public class Main {
    public static void main(String[] args) {
        /*Du ska skapa en namnlista med CRUD funktionalitet
        Man saka kunna skapa namn, lista alla namn, ändra namn och radera namn
        Om man försöker radera eller ändra ett namn som inte finns ska programmet säga till
        om att namnet inte finns.

        Vid inlämning, skicka in kodfilerna (*.java) bara */

        int numberOfNames = 2; // numberOfNames ska bort och istället vara storleken på listan
        printMenu(numberOfNames); // numberOfNames ska bort och istället vara storleken på listan
    }

    private static void printMenu(int numberOfNames) {
        // numberOfNames ska bort och istället vara storleken på listan
        System.out.println("+---------------------------------------+");
        System.out.println("| Den Crudiga namnlistan                |");
        System.out.println("+---------------------------------------+");
        System.out.println("| Listan innehåller " + numberOfNames + " namn              |");
        System.out.println("| 1) Mata in ett namn                   |");
        System.out.println("| 2) Radera ett namn                    |");
        System.out.println("| 3) Ändra ett namn                     |");
        System.out.println("| 4) Lista alla namn                    |");
        System.out.println("+---------------------------------------+");
    }
}