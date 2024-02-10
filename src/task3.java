import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String party = "";

        System.out.println("Enter a letter for your party; R, D, I, or other: ");

        if (in.hasNextLine()) {
            party = in.nextLine();
        }

        if (party.equalsIgnoreCase("R")) {
            System.out.println("You get an elephant. Roll Tide!");
        } else if (party.equalsIgnoreCase("D")) {
            System.out.println("You get a donkey. EEE HAW!");
        } else if (party.equalsIgnoreCase("I")) {
            System.out.println("You are an independent mind. Think freely.");
        } else if (party.equalsIgnoreCase("other")) {
            System.out.println("You are very specific about your beliefs. Carry on free thinker!");
        } else {
            System.out.println("You didn't type in a valid party!");
        }
    }
}
