import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<String> names = new ArrayList<>();
    public static void main(String[] args) {
        /*Du ska skapa en namnlista med CRUD funktionalitet
        Man saka kunna skapa namn, lista alla namn, ändra namn och radera namn
        Om man försöker radera eller ändra ett namn som inte finns ska programmet säga till
        om att namnet inte finns.

        Vid inlämning, skicka in kodfilerna (*.java) bara */

        // Kristian Karlson
        Scanner scanner = new Scanner(System.in);
        start(scanner); // Here we go! Handles menu and all the CRUD (L) functions
        System.out.println("Programmet avslutas, ha en fortsatt bra dag!");
        scanner.close();
    }
    private static void start(Scanner scanner) {
        String usrChoice;
        usrChoice = printMenu(scanner);
        switch (Integer.parseInt(usrChoice)){
            case 1 -> addName(scanner);
            case 2 -> removeName(scanner);
            case 3 -> changeName(scanner);
            case 4 -> listNames();
            case 9 -> {
                return;
            }
            default -> System.out.println("Inte ett giltigt val");
        }
        start(scanner);
    }
    private static String printMenu(Scanner scanner) {
        System.out.println("+---------------------------------------+");
        System.out.println("| Den Crudiga namnlistan                |");
        System.out.println("+---------------------------------------+");
        System.out.println("| Listan innehåller " + names.size() + " namn              |");
        System.out.println("| 1) Mata in ett namn                   |");
        System.out.println("| 2) Radera ett namn                    |");
        System.out.println("| 3) Ändra ett namn                     |");
        System.out.println("| 4) Lista alla namn                    |");
        System.out.println("| 9) Avsluta                            |");
        System.out.println("+---------------------------------------+");
        System.out.print("Ange alternativ: ");
        return scanner.nextLine();
    }
    private static void addName(Scanner scanner) {
        System.out.print("Namn att lägga till: ");
        names.add(scanner.nextLine());
    }
    private static void removeName(Scanner scanner) {
        System.out.print("Ta bort namn ur listan. Namn: ");
        String remove = scanner.nextLine();
        if (names.contains(remove)){
            names.remove(remove);
            System.out.println("Namnet är nu borttaget");
        } else System.out.println("Namnet finns inte i listan");
    }
    private static void changeName(Scanner scanner) {
        System.out.print("Sök och ersätt. namn: ");
        String replace = scanner.nextLine(); // om sant ersätt
        if (names.contains(replace)){
            System.out.print("Namnet finns, vad vill du ersätta med: ");
            String newName = scanner.nextLine();
            int pos = names.indexOf(replace);
            names.set(pos, newName);
        } else System.out.println("Namnet finns inte i listan.");
    }
    private static void listNames() {
        System.out.println("Listan innehåller följande namn:");
        for (String name : names){
            System.out.println(name);
        }
    }
}