import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Du ska skapa en namnlista med CRUD funktionalitet
        Man saka kunna skapa namn, lista alla namn, ändra namn och radera namn
        Om man försöker radera eller ändra ett namn som inte finns ska programmet säga till
        om att namnet inte finns.

        Vid inlämning, skicka in kodfilerna (*.java) bara */

        // Kristian Karlson
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        start(scanner, names); // Here we go! Handles menu and all the CRUD (L) functions
        System.out.println("Programmet avslutas, ha en fortsatt bra dag!");
        scanner.close();
    }
    private static void start(Scanner scanner, ArrayList<String> names) {
        String usrChoice;
        while (true) {
            usrChoice = printMenu(scanner, names);
            switch (Integer.parseInt(usrChoice)){
                case 1 -> addName(scanner,names);
                case 2 -> removeName(scanner,names);
                case 3 -> changeName(scanner,names);
                case 4 -> listNames(names);
                case 9 -> {
                    return;
                }
                default -> System.out.println("Inte ett giltigt val");
            }
        }
    }
    private static String printMenu(Scanner scanner, ArrayList<String> namn) {
        System.out.println("+---------------------------------------+");
        System.out.println("| Den Crudiga namnlistan                |");
        System.out.println("+---------------------------------------+");
        System.out.println("| Listan innehåller " + namn.size() + " namn              |");
        System.out.println("| 1) Mata in ett namn                   |");
        System.out.println("| 2) Radera ett namn                    |");
        System.out.println("| 3) Ändra ett namn                     |");
        System.out.println("| 4) Lista alla namn                    |");
        System.out.println("| 9) Avsluta                            |");
        System.out.println("+---------------------------------------+");
        System.out.print("Ange alternativ: ");
        return scanner.nextLine();
    }
    private static void addName(Scanner scanner,ArrayList<String> namn) {
        System.out.print("Namn att lägga till: ");
        namn.add(scanner.nextLine());
    }
    private static void removeName(Scanner scanner, ArrayList<String> namn) {
        System.out.print("Ta bort namn ur listan. Namn: ");
        String remove = scanner.nextLine();
        if (namn.contains(remove)){
            namn.remove(remove);
            System.out.println("Namnet är nu borttaget");
        } else System.out.println("Namnet finns inte i listan");
    }
    private static void changeName(Scanner scanner, ArrayList<String> namn) {
        System.out.print("Sök och ersätt. namn: ");
        String replace = scanner.nextLine(); // om sant ersätt
        if (namn.contains(replace)){
            System.out.print("Namnet finns, vad vill du ersätta med: ");
            String newName = scanner.nextLine();
            int pos = namn.indexOf(replace);
            namn.set(pos, newName);
        } else System.out.println("Namnet finns inte i listan.");
    }
    private static void listNames(ArrayList<String> names) {
        System.out.println("Listan innehåller följande namn:");
        for (String name : names){
            System.out.println(name);
        }
    }
}