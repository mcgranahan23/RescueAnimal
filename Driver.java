import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Driver {

    private static final ArrayList<Dog> dogList = new ArrayList<>();
    private static final ArrayList<Monkey> monkeyList = new ArrayList<>();
    // Instance variables (if needed)


    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String menuSelect = "";


        initializeDogList(); // calls method to initialize list
        initializeMonkeyList();


        while (!menuSelect.equals("q")) { // loop to display menu and if user enters "q", program will quit
            displayMenu();
            menuSelect = scnr.nextLine();

            switch (menuSelect) { // switch is used here to avoid many if statements and look cleaner
                case "1":
                    intakeNewDog(scnr); // each menu option is a separate case that calls the method it's attached with
                    break;
                case "2":
                    intakeNewMonkey(scnr);
                    break;
                case "3":
                    reserveAnimal(scnr);
                    break;
                case "4":
                    printAnimals(4);
                    break;
                case "5":
                    printAnimals(5);
                    break;
                case "6":
                    printAnimals(6);
                    break;
                default:
                    System.out.println("Invalid selection"); // if user enters a selection that isn't on the menu it is called again
                    displayMenu();

            }
        }


    }





    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }


    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019",
                "United States", "intake", false, "United States", "Dog");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020",
                "United States", "Phase I", false, "United States", "Dog");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019",
                "Canada", "in service", false, "Canada", "Dog");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }


    // Adds monkeys to a list for testing
    //Optional for testing
    public static void initializeMonkeyList() {
        Monkey monkey1 = new Monkey("George", "Tamarin", "male", "3", "27", "06-19-2024",
                "Siberia", "intake", true, "USA", "9", "3.7", "10", "Monkey");
        monkeyList.add(monkey1);

    }


    // Complete the intakeNewDog method
    // The input validation to check that the dog is not already in the list
    // is done for you
    public static void intakeNewDog(Scanner scanner) {
        String name = null;
        try {
            System.out.println("What is the dog's name?");
            name = scanner.nextLine();
        }
        catch (InputMismatchException e) {
            System.out.println("Invalid name");
            scanner.nextLine();
        }
        for (Dog dog : dogList) {
            if (dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }

            System.out.println("What is the dog's breed?");
            String breed = scanner.nextLine();

            System.out.println("What is the dog's gender?");
            String gender = scanner.nextLine();

            System.out.println("What is the dog's age?");             // This method gathers info about a dog for intake. After the
            // info is gathered it attaches each piece of info to the relevant
            String age = scanner.nextLine();                          // variable and adds the new dog to dogList

            System.out.println("What is the dog's weight?");
            String weight = scanner.nextLine();

            System.out.println("What is the dog's acquisition date?");
            String acquisitionDate = scanner.nextLine();

            System.out.println("What is the dog's acquisition country?");
            String acquisitionCountry = scanner.nextLine();

            String trainingStatus = "intake";

            System.out.println("Is the dog reserved?");
            boolean reserved = scanner.nextBoolean();

            System.out.println("What is the dog's in service country?");
            String inServiceCountry = scanner.nextLine();

            String animalType = "Dog";

            Dog newDog = new Dog(name, breed, gender, age, weight, acquisitionDate,
                    acquisitionCountry, trainingStatus, reserved, inServiceCountry, animalType);

            dogList.add(newDog);
            return;


        }
    }

    public static void intakeNewMonkey(Scanner scanner) {
        String name = null;

        try {
            System.out.println("What is the monkey's name?");
            name = scanner.nextLine();
        }
        catch (InputMismatchException e) {
            System.out.println("Invalid name");
            scanner.nextLine();
        }
        for(Monkey monkey: monkeyList) {
            if(monkey.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis monkey is already in our system\n\n");
                return;
            }
        }
        System.out.println("What is the monkey's species?");
        String species = scanner.nextLine();

        System.out.println("What is the monkey's gender?");
        String gender = scanner.nextLine();

        System.out.println("What is the monkey's age?");
        String age = scanner.nextLine();

        System.out.println("What is the monkey's weight?");
        String weight = scanner.nextLine();

        System.out.println("What is the monkey's acquisition date?");
        String acquisitionDate = scanner.nextLine();

        System.out.println("What is the monkey's acquisition country?");
        String acquisitionCountry = scanner.nextLine();

        String trainingStatus = "intake";

        System.out.println("Is the monkey reserved?");
        boolean reserved = scanner.nextBoolean();

        System.out.println("What is the monkey's in service country?");
        String inServiceCountry = scanner.nextLine();

        System.out.println("What is the monkey's tail length?");
        String tailLength = scanner.nextLine();

        System.out.println("What is the monkey's height?");
        String height = scanner.nextLine();

        System.out.println("What is the monkey's body length?");
        String bodyLength = scanner.nextLine();

        String animalType = "Monkey";

        Monkey newMonkey = new Monkey(name, species, gender, age, weight, acquisitionDate,
                acquisitionCountry, trainingStatus, reserved, inServiceCountry, tailLength, height,
                bodyLength, animalType);

        monkeyList.add(newMonkey);

    }



    public static void reserveAnimal(Scanner scanner) {
        int i = 0;                                // This method's code is excessive and will be cleaned up for the next
        int count = 0;                        // part of the project.
        String type;
        String country;
        int dName;
        int mName;
        String dogCountry = dogList.get(i).getInServiceLocation();
        boolean dogReserve = dogList.get(i).getReserved();
        String dogTrain = dogList.get(i).getTrainingStatus();

        System.out.println("What type of animal would you like to reserve?");
        type = scanner.nextLine();
        System.out.println("What country would you like the animal to be in?");
        country = scanner.nextLine();

        /* The following if statement first uses i to index the first dog in dogList, grabs the in
             service location, and compares it to the input for country ignoring upper or lower case.
             It does the same for the same dogs training status to make sure it's in service, and makes
             sure the dog is not already reserved. the "!" in front of getReserved() is the same as not equal to
             except it makes sure reserved does not equal true.
            */

        switch (type.toLowerCase()) {
            case "dog":
                for (i = 0; i < dogList.size(); ++i) {
                    if (dogCountry.equalsIgnoreCase(country) && !dogReserve
                            && dogTrain.equalsIgnoreCase("in service")) {
                        System.out.println();
                        System.out.printf("[%s] %s, Breed: %s\n\n", (count + 1), dogList.get(i).getName(),
                                            dogList.get(i).getBreed());
                        ++count;
                    }
                }
                if (count == 0) {
                    System.out.println("Sorry, no animals are available to reserve."); // count starts at 0 and increments by one for each dog that
                    break;                                                             // meets the required statements. If count is 0, there were none
                } else {
                    System.out.println("What number dog would you like to reserve?");
                }
                dName = scanner.nextInt() - 1;                           // dName has to be subtracted by one because (count + 1) is used to show the options
                if (!dogList.get(dName).getReserved()) {
                    System.out.print("You have reserved " + dogList.get(dName).getName() + ".");
                    dogList.get(dName).setReserved(true);
                    break;
                }
            case "monkey":
                for (i = 0; i < monkeyList.size(); ++i) {
                    if (monkeyList.get(i).getInServiceLocation().equalsIgnoreCase(country) && !monkeyList.get(i).getReserved()
                            && dogList.get(i).getTrainingStatus().equalsIgnoreCase("in service")) {
                        System.out.println("[" + (count + 1) + "] " + monkeyList.get(i).getName());
                        ++count;
                    }
                }

                if (count == 0) {
                    System.out.println("Sorry, no monkey's are available to reserve.");
                    break;
                } else {
                    System.out.println("What number monkey would you like to reserve?");
                }
                mName = scanner.nextInt() - 1;
                if (!monkeyList.get(mName).getReserved()) {
                    System.out.print("You have reserved " + monkeyList.get(mName).getName() + ".");
                    monkeyList.get(mName).setReserved(true);
                    break;
                }
            default:
                System.out.println("Invalid selection.");
                break;
        }

    }

    public static void printAnimals(int itemToPrint) {

        int i;

        RescueAnimal dIndex;
        RescueAnimal mIndex;

        if (itemToPrint == 4) {  // Print all dogs
            for (i = 0; i < dogList.size(); ++i) {
                dIndex = dogList.get(i);
                System.out.println(dIndex.getName() + ": " + dIndex.getTrainingStatus()
                        + ", " + dIndex.getAcquisitionLocation() + ", Reserved: " + dIndex.getReserved());
            }
        }
        if (itemToPrint == 5) {  // Print all monkey
            for (i = 0; i < monkeyList.size(); ++i) {
                mIndex = monkeyList.get(i);
                System.out.println(mIndex.getName() + ": " + mIndex.getTrainingStatus()
                        + ", " + mIndex.getAcquisitionLocation() + ", Reserved: " + mIndex.getReserved());
            }
        }
        if (itemToPrint == 6) {  // Print all animals not reserved
            System.out.println("Available dogs:");
            for (i = 0; i < dogList.size(); ++i) {
                dIndex = dogList.get(i);
                boolean dogReserve = dIndex.getReserved();
                String dTrain = dIndex.getTrainingStatus();

                if ((!dogReserve) && (dTrain.equals("in service"))) {
                    System.out.println(dIndex.getName() + ": " + dIndex.getTrainingStatus() +
                            ", " + dIndex.getAcquisitionLocation() + ". Reserved: " + dIndex.getReserved());
                }
            }
            System.out.println("Available monkeys:");
            for (i = 0; i < monkeyList.size(); ++i) {
                mIndex = monkeyList.get(i);
                boolean monkeyReserve = mIndex.getReserved();
                String mTrain = mIndex.getTrainingStatus();

                if ((!monkeyReserve) && (mTrain.equals("in service"))) {
                    System.out.println(mIndex.getName() + ": " + mIndex.getTrainingStatus() +
                            ", " + mIndex.getAcquisitionLocation() + ". Reserved: " + mIndex.getReserved());
                }

            }




        }
    }
}

