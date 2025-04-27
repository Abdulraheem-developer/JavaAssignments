import java.util.Scanner;

public class Nokia3310 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

	System.out.println("1. PhoneBook");
        System.out.println("2. Messages");
        System.out.println("3. Chat");
        System.out.println("4. Call register");
        System.out.println("5. Tones");
        System.out.println("6. Settings");
        System.out.println("7. Call divert");
        System.out.println("8. Games");
        System.out.println("9. Calculator");
        System.out.println("10. Reminders");
        System.out.println("11. Clock");
        System.out.println("12. Profiles");
        System.out.println("13. SIM Services");

        System.out.print("Enter a number:  ");

        int menu = input.nextInt(); // Read menu selection

        

        switch (menu) {
            case 1:
                System.out.println("Phone book: ");
                System.out.println("1. Search");
                System.out.println("2. Service No.s");
                System.out.println("3. Add Name");
                System.out.println("4. Erase");
                System.out.println("5. Edit");
                System.out.println("6. Assign tone");
                System.out.println("7. Send b'card");

                System.out.println("8. Options");
                System.out.print("Select an option (1-2): ");
                int options = input.nextInt();

                switch (options) {
                    case 1:
                        System.out.println("1. Type of view");
                        System.out.println("2. Memory Status");
                        break;
                    case 2:
                        System.out.println("Option 2 selected.");
                        break;
                }
                break;

            case 2:
                System.out.println("\nMessages: ");
                System.out.println("1. Write Messages");
                System.out.println("2. Inbox");
                System.out.println("3. Outbox");
                System.out.println("4. Picture Messages");
                System.out.println("5. Templates");
                System.out.println("6. Smileys");
                System.out.println("7. Message Settings");

                System.out.print("Select an Option (1-3): ");
                int set1 = input.nextInt();

                switch (set1) {
                    case 1:
                        System.out.println("1. Message center Number");
                        System.out.println("2. Message sent as: ");
                        System.out.println("3. Message Validity");
                        break;
                    case 2:
                        System.out.println("Option 2 selected.");
                        break;
                }

                System.out.print("Select a number (1-3): ");
                int common = input.nextInt();

                switch (common) {
                    case 1:
                        System.out.println("1. Delivery Reports");
                        System.out.println("2. Reply via same centre");
                        System.out.println("3. Character Support");
                        break;
                }

                System.out.println("8. Info Service");
                System.out.println("9. Voice Mailbox Number");
                System.out.println("10. Service Command Editor");
                break;

            case 3:
                System.out.println("Chat");
                break;

            case 4:
                System.out.println("\nCall Register: ");
                System.out.println("1. Missed Calls");
                System.out.println("2. Received Calls");
                System.out.println("3. Dialled numbers");
                System.out.println("4. Erase recent call lists");

                System.out.println("Show call duration");
                System.out.print("Select a number (1-5): ");
                int callDuration = input.nextInt();

                switch (callDuration) {
                    case 1:
                        System.out.println("1. Last Call duration");
                        System.out.println("2. All call duration");
                        System.out.println("3. Received calls' duration");
                        System.out.println("4. Dialled calls duration");
                        System.out.println("5. Clear timers");
                        break;
                }
                break;

            case 6:
                System.out.println("Show Call Costs");
                System.out.println("1. Last Call Costs");
                System.out.println("2. All calls costs");
                System.out.println("3. Clear Counters");
                break;

            case 7:
                System.out.println("Call Cost Settings");
                System.out.println("1. Call Cost limits");
                System.out.println("2. Show Costs in");
                break;

            case 8:
                System.out.println("Prepaid Credit");
                break;
        }
    }
}
