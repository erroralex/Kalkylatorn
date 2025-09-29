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
    public static void logoDisplay () {
        System.out.println("\n─────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("██╗  ██╗ █████╗ ██╗     ██╗  ██╗██╗   ██╗██╗      █████╗ ████████╗ ██████╗ ██████╗ ███╗   ██╗");
        System.out.println("██║ ██╔╝██╔══██╗██║     ██║ ██╔╝╚██╗ ██╔╝██║     ██╔══██╗╚══██╔══╝██╔═══██╗██╔══██╗████╗  ██║");
        System.out.println("█████╔╝ ███████║██║     █████╔╝  ╚████╔╝ ██║     ███████║   ██║   ██║   ██║██████╔╝██╔██╗ ██║");
        System.out.println("██╔═██╗ ██╔══██║██║     ██╔═██╗   ╚██╔╝  ██║     ██╔══██║   ██║   ██║   ██║██╔══██╗██║╚██╗██║");
        System.out.println("██║  ██╗██║  ██║███████╗██║  ██╗   ██║   ███████╗██║  ██║   ██║   ╚██████╔╝██║  ██║██║ ╚████║");
        System.out.println("╚═╝  ╚═╝╚═╝  ╚═╝╚══════╝╚═╝  ╚═╝   ╚═╝   ╚══════╝╚═╝  ╚═╝   ╚═╝    ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═══╝");
        System.out.println("─────────────────────────────────────────────────────────────────────────────────────────────");
    }
//──────────────────────────────────────────────────────────────────────────────────────────────────────────────────────
    public static void displayInputPrompt() {
        clearScreen();
        logoDisplay();
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
        logoDisplay();
        System.out.println("Välkommen till addition! Hur många tal vill du addera?");
        System.out.println("─────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.print("Skriv in siffra och tryck [ENTER]: ");
        int temp = 0;
        // Kontrollerar inmatning på antal
        while (true) {
            try {
            temp = scanner.nextInt();
            break;
        } catch (InputMismatchException e) {
                System.out.println("Ogiltlig inmatning! Ange en siffra och [ENTER] för att fortsätta: ");
                scanner.nextLine();
            }
        }
        listOfNumbers.clear();
        double sum = 0;

        for (int i = 0; i < temp; i++) {
            System.out.println("Vilket tal vill du addera?");
            // Kontrollerar inmatning på talen
            while (true) {
                try {
                    double number = scanner.nextDouble();
                    listOfNumbers.add(number); // addera nummer till listan
                    sum = number + sum;
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Ogiltlig inmatning! Ange en siffra och [ENTER] för att fortsätta: ");
                    scanner.nextLine();
                }
            }
        }
        System.out.println("────────────────────────────────────────");
        System.out.println("Summan av dina tal är " + sum);
        System.out.println("[ENTER] för att återgå till menyn");
        System.out.println("────────────────────────────────────────\n");
        scanner.nextLine();
    }
//──────────────────────────────────────────────────────────────────────────────────────────────────────────────────────
    public static void subtraction (Scanner scanner) {
        clearScreen();
        logoDisplay();
        System.out.println("Välkommen till subtraktion! Hur många tal vill du subtrahera?");
        System.out.println("─────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.print("Skriv in siffra och tryck [ENTER]: ");
        int temp = 0;
        // Kontrollerar inmatning på antal
        while (true) {
            try {
                temp = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Ogiltlig inmatning! Ange en siffra och [ENTER] för att fortsätta: ");
                scanner.nextLine();
            }
        }
        listOfNumbers.clear();
        double sum = 0;

        for (int i = 0; i < temp; i++) {
            System.out.println("Vilket tal vill du subtrahera?");
            // Kontrollerar inmatning på talen
            while (true) {
                try {
                    double number = scanner.nextDouble();
                    if (i == 0) {
                        sum = number;
                    } else {
                        sum -= number;
                    }
                    listOfNumbers.add(number); // addera nummer till listan
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Ogiltlig inmatning! Ange en siffra och [ENTER] för att fortsätta: ");
                    scanner.nextLine();
                }
            }
        }
        System.out.println("────────────────────────────────────────");
        System.out.println("Summan av dina tal är " + sum);
        System.out.println("[ENTER] för att återgå till menyn");
        System.out.println("────────────────────────────────────────\n");
        scanner.nextLine();
    }
//──────────────────────────────────────────────────────────────────────────────────────────────────────────────────────
    public static void multiplication (Scanner scanner) {
        clearScreen();
        logoDisplay();
        System.out.println("Välkommen till multiplikation! Hur många tal vill du multiplicera?");
        System.out.println("─────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.print("Skriv in siffra och tryck [ENTER]: ");
        int temp = 0;
        // Kontrollerar inmatning på antal
        while (true) {
            try {
                temp = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Ogiltlig inmatning! Ange en siffra och [ENTER] för att fortsätta: ");
                scanner.nextLine();
            }
        }
        listOfNumbers.clear();
        double sum = 0;

        for (int i = 0; i < temp; i++) {
            System.out.println("Vilket tal vill du multiplicera");
            // Kontrollerar inmatning på talen
            while (true) {
                try {
                    double number = scanner.nextDouble();
                    if (i == 0) {
                        sum = number;
                    } else {
                        sum = sum * number;
                    }
                    listOfNumbers.add(number); // addera nummer till listan
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Ogiltlig inmatning! Ange en siffra och [ENTER] för att fortsätta: ");
                    scanner.nextLine();
                }
            }
        }
        System.out.println("────────────────────────────────────────");
        System.out.println("Summan av dina tal är " + sum);
        System.out.println("[ENTER] för att återgå till menyn");
        System.out.println("────────────────────────────────────────\n");
        scanner.nextLine();
    }
//──────────────────────────────────────────────────────────────────────────────────────────────────────────────────────
public static void division (Scanner scanner) {
    clearScreen();
    logoDisplay();
    System.out.println("Välkommen till division! Hur många tal vill du dividera?");
    System.out.println("─────────────────────────────────────────────────────────────────────────────────────────────");
    System.out.print("Skriv in siffra och tryck [ENTER]: ");

    int temp = 0;
    // Kontrollerar inmatning på antal
    while (true) {
        try {
            temp = scanner.nextInt();
            break;
        } catch (InputMismatchException e) {
            System.out.println("Ogiltlig inmatning! Ange en siffra och [ENTER] för att fortsätta: ");
            scanner.nextLine();
        }
    }

    listOfNumbers.clear();
    double sum;

    while (true) {
        try {
            System.out.print("Ange det första talet att dividera med: ");
            sum = scanner.nextDouble();
            if (sum == 0) {
                System.out.println("Du kan inte dela med noll! Ange en siffra och [ENTER] för att fortsätta: ");
                continue;
            }
            listOfNumbers.add(sum); // addera nummer till listan
            break;
        } catch (InputMismatchException e) {
            System.out.println("Ogiltlig inmatning! Ange en siffra och [ENTER] för att fortsätta: ");
            scanner.nextLine();
        }
    }

    for (int i = 1; i < temp; i++) {
        double divisor;
        // Kontrollerar inmatning på talen
        while (true) {
            try {
                System.out.println("Vilket tal vill du dividera med?");
                divisor = scanner.nextDouble();
                if (divisor == 0) {
                    System.out.println("Du kan inte dela med noll! Ange en siffra och [ENTER] för att fortsätta: ");
                    continue;
                }
                sum /= divisor;
                listOfNumbers.add(divisor); // addera nummer till listan
                break;
            } catch (InputMismatchException e) {
                System.out.println("Ogiltlig inmatning! Ange en siffra och [ENTER] för att fortsätta: ");
                scanner.nextLine();
            }
        }
    }
    System.out.println("────────────────────────────────────────");
    System.out.println("Summan av dina tal är " + sum);
    System.out.println("[ENTER] för att återgå till menyn");
    System.out.println("────────────────────────────────────────\n");
    scanner.nextLine();
}
//──────────────────────────────────────────────────────────────────────────────────────────────────────────────────────
    public static void modulus (Scanner scanner) {
        clearScreen();
        logoDisplay();
        System.out.println("Välkommen till modulus! Här visas restvärde av divisioner. Hur många tal vill du dividera?");
        System.out.println("─────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.print("Skriv in siffra och tryck [ENTER]: ");

        int temp;
        // Kontrollerar inmatning på antal
        while (true) {
            try {
                temp = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Ogiltlig inmatning! Ange en siffra och [ENTER] för att fortsätta: ");
                scanner.nextLine();
            }
        }

        listOfNumbers.clear();
        for (int i = 0; i < temp; i++) {
            double number;
            // Kontrollerar inmatning på talen
            while (true) {
                try {
                    if (i == 0) {
                        System.out.print("Ange det första talet att dividera med: ");
                    } else {
                        System.out.println("Vilket nästa tal vill du dividera med?");
                    }
                    number = scanner.nextDouble();
                    if (number == 0 && i > 0) {
                        System.out.println("Du kan inte dela med noll! Ange en siffra och [ENTER] för att fortsätta: ");
                        continue;
                    }
                    listOfNumbers.add(number); // addera nummer till listan
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Ogiltlig inmatning! Ange en siffra och [ENTER] för att fortsätta: ");
                    scanner.nextLine();
                }
            }
        }

        double remainder = listOfNumbers.get(0);
        for (int i = 1; i < temp; i++) {
            remainder %= listOfNumbers.get(i);
        }

        System.out.println("────────────────────────────────────────");
        System.out.println("Resten av division utav dina tal är " + remainder);
        System.out.println("[ENTER] för att återgå till menyn");
        System.out.println("────────────────────────────────────────\n");
        scanner.nextLine();
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