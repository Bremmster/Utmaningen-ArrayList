import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Du ska skapa en namnlista med CRUD funktionalitet
        Man saka kunna skapa namn, lista alla namn, ändra namn och radera namn
        Om man försöker radera eller ändra ett namn som inte finns ska programmet säga till
        om att namnet inte finns.

        Vid inlämning, skicka in kodfilerna (*.java) bara */
        ArrayList<String> names = new ArrayList<>();

        printMenu(names); // Klar
        addName(names); // Klar
        removeName(names);
        changeName(names);
        listNames(names); // Klar
    }

    private static void listNames(ArrayList<String> names) {
        System.out.println("Listan innehåller följande namn:");
        for (String name : names){
            System.out.println(name);
        }
    }

    private static void changeName(ArrayList<String> namn) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sök och ersätt. namn: ");
        String replace = scanner.nextLine(); // om sant ersätt
        if (namn.contains(replace)){
            System.out.print("Namnet finns, vad vill du ersätta med: ");
            String newName = scanner.nextLine();
            int pos = namn.indexOf(replace);
            namn.set(pos, newName);
        } else System.out.println("Namnet finns inte i listan.");
    }
    private static void removeName(ArrayList<String> namn) {
        // namn.remove

    }
    private static void addName(ArrayList<String> namn) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Namn att lägga till: ");
        namn.add(scanner.nextLine());
    }

    private static void printMenu(ArrayList<String> namn) {
        System.out.println("+---------------------------------------+");
        System.out.println("| Den Crudiga namnlistan                |");
        System.out.println("+---------------------------------------+");
        System.out.println("| Listan innehåller " + namn.size() + " namn              |");
        System.out.println("| 1) Mata in ett namn                   |");
        System.out.println("| 2) Radera ett namn                    |");
        System.out.println("| 3) Ändra ett namn                     |");
        System.out.println("| 4) Lista alla namn                    |");
        System.out.println("+---------------------------------------+");
    }
}