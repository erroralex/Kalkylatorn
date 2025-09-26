import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

    static boolean isRunning = true;
    public static int menuChoice;
    static Scanner scanner = new Scanner(System.in);
    public static List<Double> listOfNumbers = new ArrayList<>();
//──────────────────────────────────────────────────────────────────────────────────────────────────────────────────────
    public static void clearScreen() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
//──────────────────────────────────────────────────────────────────────────────────────────────────────────────────────
    public static void displayInputPrompt() {
        System.out.println("\n─────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("██╗  ██╗ █████╗ ██╗     ██╗  ██╗██╗   ██╗██╗      █████╗ ████████╗ ██████╗ ██████╗ ███╗   ██╗");
        System.out.println("██║ ██╔╝██╔══██╗██║     ██║ ██╔╝╚██╗ ██╔╝██║     ██╔══██╗╚══██╔══╝██╔═══██╗██╔══██╗████╗  ██║");
        System.out.println("█████╔╝ ███████║██║     █████╔╝  ╚████╔╝ ██║     ███████║   ██║   ██║   ██║██████╔╝██╔██╗ ██║");
        System.out.println("██╔═██╗ ██╔══██║██║     ██╔═██╗   ╚██╔╝  ██║     ██╔══██║   ██║   ██║   ██║██╔══██╗██║╚██╗██║");
        System.out.println("██║  ██╗██║  ██║███████╗██║  ██╗   ██║   ███████╗██║  ██║   ██║   ╚██████╔╝██║  ██║██║ ╚████║");
        System.out.println("╚═╝  ╚═╝╚═╝  ╚═╝╚══════╝╚═╝  ╚═╝   ╚═╝   ╚══════╝╚═╝  ╚═╝   ╚═╝    ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═══╝");
        System.out.println("─────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("Välkommen till Kalkylatorn!");
        System.out.println("Vad vill du göra?");
        System.out.println("────────────────────────────────────────");
        System.out.println("\n[1] Addera tal med varandra");
        System.out.println("[2] Subtrahera tal med varandra");
        System.out.println("[3] Multiplicera tal med varandra");
        System.out.println("[4] Dividera tal med varandra");
        System.out.println("[5] Kontrollera modulus-rest av division");
        System.out.println("[6] Avsluta program");
        System.out.println("────────────────────────────────────────");
        System.out.println("Skriv in siffra och tryck ENTER: ");
    }
//──────────────────────────────────────────────────────────────────────────────────────────────────────────────────────
    public static void whatToDo() {
        menuChoice = scanner.nextInt();

        switch (menuChoice) {

            //Addera tal
            case 1:
                addition(scanner);
                break;

            //Subtrahera tal
            case 2:
                subtraction(scanner);
                break;

            //Multiplicera tal
            case 3:
                multiplication(scanner);
                break;
            //Dividera tal
            case 4:
                division(scanner);
                break;
            //Modulus
            case 5:
                modulus(scanner);
                break;

            //Avsluta program
            case 6:
                isRunning = false;
                System.out.println("Tack för att du använde dig av programmet!");
                break;

            default:
                System.out.println("Du måste mata in en korrekt siffra för ditt val! Försök igen. Tryck [ENTER] ");
                scanner.nextLine();
                break;
        }
    }
//──────────────────────────────────────────────────────────────────────────────────────────────────────────────────────
    public static void addition (Scanner scanner) {
        clearScreen();
        System.out.println("────────────────────────────────────────");
        System.out.println("Välkommen till addition! \nHur många tal vill du addera?");
        System.out.println("────────────────────────────────────────");
        System.out.println("Skriv in siffra och tryck ENTER:");
        int temp = 0;
        try {
            temp = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Ogiltlig inmatning! Tar dig tillbaka till menyn. Tryck [ENTER] ");
            scanner.nextLine();
            return;

        }
        listOfNumbers.clear();
        double sum = 0;

        for (int i = 0; i < temp; i++) {
            System.out.println("Vilket tal vill du addera?");
            try {
                double number = scanner.nextDouble();
                listOfNumbers.add(number); // addera nummer till listan
                sum = number + sum;
            } catch (InputMismatchException e) {
                System.out.println("Ogiltlig inmatning! Tar dig tillbaka till menyn. Tryck [ENTER] ");
                scanner.nextLine();
                return;
            }
        }
        System.out.println("────────────────────────────────────────");
        System.out.println("Summan av dina tal är " + sum);
        System.out.println("────────────────────────────────────────\n");
    }
//──────────────────────────────────────────────────────────────────────────────────────────────────────────────────────
    public static void subtraction (Scanner scanner) {
        clearScreen();
        System.out.println("────────────────────────────────────────");
        System.out.println("Välkommen till subtraktion! Hur många \ntal vill du subtrahera?");
        System.out.println("────────────────────────────────────────");
        System.out.println("Skriv in siffra och tryck ENTER:");
        int temp = 0;
        try {
            temp = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Ogiltlig inmatning! Tar dig tillbaka till menyn. Tryck [ENTER] ");
            scanner.nextLine();
            return;
        }
        listOfNumbers.clear();
        double sum = 0;

        for (int i = 0; i < temp; i++) {
            System.out.println("Vilket tal vill du subtrahera?");
            try {
                double number = scanner.nextDouble();
                if (i == 0) {
                    sum = number;
                } else {
                    sum -= number;
                }
                listOfNumbers.add(number); // addera nummer till listan
            } catch (InputMismatchException e) {
                System.out.println("Ogiltlig inmatning! Tar dig tillbaka till menyn. Tryck [ENTER] ");
                scanner.nextLine();
                return;
            }
        }
        System.out.println("────────────────────────────────────────");
        System.out.println("Summan av dina tal är " + sum);
        System.out.println("────────────────────────────────────────\n");
    }
//──────────────────────────────────────────────────────────────────────────────────────────────────────────────────────
    public static void multiplication (Scanner scanner) {
        clearScreen();
        System.out.println("────────────────────────────────────────");
        System.out.println("Välkommen till multiplikation!");
        System.out.println("Hur många tal vill du multiplicera?");
        System.out.println("────────────────────────────────────────");
        System.out.println("Skriv in siffra och tryck ENTER:");
        int temp = 0;

        try {
            temp = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Ogiltlig inmatning! Tar dig tillbaka till menyn. Tryck [ENTER] ");
            scanner.nextLine();
            return;

        }
        listOfNumbers.clear();
        double sum = 0;

        for (int i = 0; i < temp; i++) {
            System.out.println("Vilket tal vill du multiplicera");

            try {
                double number = scanner.nextDouble();
                if (i == 0) {
                    sum = number;
                } else {
                    sum = sum * number;
                }
                listOfNumbers.add(number); // addera nummer till listan
            } catch (InputMismatchException e) {
                System.out.println("Ogiltlig inmatning! Tar dig tillbaka till menyn. Tryck [ENTER] ");
                scanner.nextLine();
                return;
            }
        }
        System.out.println("────────────────────────────────────────");
        System.out.println("Summan av dina tal är " + sum);
        System.out.println("────────────────────────────────────────\n");
    }
//──────────────────────────────────────────────────────────────────────────────────────────────────────────────────────
    public static void division (Scanner scanner) {
        clearScreen();
        System.out.println("────────────────────────────────────────");
        System.out.println("Välkommen till division!");
        System.out.println("Hur många tal vill du dividera?");
        System.out.println("────────────────────────────────────────");
        System.out.println("Skriv in siffra och tryck ENTER:");
        int temp = 0;

        try {
            temp = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Ogiltlig inmatning! Tar dig tillbaka till menyn. Tryck [ENTER] ");
            scanner.nextLine();
            return;
        }
        listOfNumbers.clear();
        double sum = 0;

        for (int i = 0; i < temp; i++) {
            System.out.println("Vilket tal vill du dividera?");

            try {
                double number = scanner.nextDouble();
                if (number == 0) {
                    System.out.println("Du kan inte dela med noll! Tar dig tillbaka till menyn. Tryck [ENTER] ");
                    scanner.nextLine();
                    return;
                }else if (i == 0) {
                    sum = number;
                }else {
                    sum = sum / number;
                }
                listOfNumbers.add(number); // addera nummer till listan
            } catch (InputMismatchException e) {
                System.out.println("Ogiltlig inmatning! Tar dig tillbaka till menyn. Tryck [ENTER] ");
                scanner.nextLine();
                return;
            }
        }
        System.out.println("────────────────────────────────────────");
        System.out.println("Summan av dina tal är " + sum);
        System.out.println("────────────────────────────────────────\n");
    }
//──────────────────────────────────────────────────────────────────────────────────────────────────────────────────────
    public static void modulus (Scanner scanner) {
        clearScreen();
        System.out.println("────────────────────────────────────────");
        System.out.println("Välkommen till modulus! Här visas rest av ");
        System.out.println("divisioner. Hur många tal vill du dividera?");
        System.out.println("────────────────────────────────────────");
        System.out.println("Skriv in siffra och tryck ENTER:");
        int temp = 0;

        try {
            temp = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Ogiltlig inmatning! Tar dig tillbaka till menyn. Tryck [ENTER] ");
            scanner.nextLine();
            return;
        }
        listOfNumbers.clear();
        double sum = 0;

        for (int i = 0; i < temp; i++) {
            System.out.println("Vilket tal vill du dividera?");

            try {
                double number = scanner.nextDouble();
                if (number == 0) {
                    System.out.println("Du kan inte dela med noll! Tar dig tillbaka till menyn. Tryck [ENTER] ");
                    scanner.nextLine();
                    return;
                }else if (i == 0) {
                    sum = number;
                }else {
                    sum = sum % number;
                }
                listOfNumbers.add(number); // addera nummer till listan
            } catch (InputMismatchException e) {
                System.out.println("Ogiltlig inmatning! Tar dig tillbaka till menyn. Tryck [ENTER] ");
                scanner.nextLine();
                return;
            }
        }
        System.out.println("────────────────────────────────────────");
        System.out.println("Resten av division utav dina tal är " + sum);
        System.out.println("────────────────────────────────────────\n");
    }
//──────────────────────────────────────────────────────────────────────────────────────────────────────────────────────
    public static void main(String[] args) {

        while (isRunning) {
            displayInputPrompt();
            try {
                whatToDo();
            } catch (InputMismatchException ex) {
                System.out.println("Ogiltlig inmatning, var vänlig och använd ett korrekt värde! Tryck [ENTER] ");
                scanner.nextLine();
            }
            scanner.nextLine();
        }
        scanner.close();
    }
}