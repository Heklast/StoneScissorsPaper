/******************************************************************************
 *  Nafn: Hekla Scheving Thorsteinsson
 *  Tölvupóstur: hst10@hi.is
 *
 *  Lýsing: Lýsing á hvað forritið gerir, inntak, útreikningar, úttak
 *
 *
 *****************************************************************************/


public class StoneScissorsPaper {
    public static void main(String[] args) {
        System.out.println("Rock Paper Scissors");
        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Scissors");
        System.out.println("Enter your choice: ");
        int choice = Integer.parseInt(new java.util.Scanner(System.in).nextLine());

        String[] you = {"Rock", "Paper", "Scissors"};
        String[] computer = {"Rock", "Paper", "Scissors"};
        int random = (int) (Math.random() * 3);

        if (choice == 1) {
            System.out.println("You chose Rock");
            System.out.println("Computer chose " + computer[random]);
            if (computer[random] == "Rock") {
                System.out.println("Tie");
            } else if (computer[random] == "Paper") {
                System.out.println("You lose");
            } else if (computer[random] == "Scissors") {
                System.out.println("You win");
            }
        } else if (choice == 2) {
            System.out.println("You chose Paper");
            System.out.println("Computer chose " + computer[random]);
            if (computer[random] == "Rock") {
                System.out.println("You win");
            } else if (computer[random] == "Paper") {
                System.out.println("Tie");
            } else if (computer[random] == "Scissors") {
                System.out.println("You lose");
            }
        } else if (choice == 3) {
            System.out.println("You chose Scissors");
            System.out.println("Computer chose " + computer[random]);
            if (computer[random] == "Rock") {
                System.out.println("You lose");
            } else if (computer[random] == "Paper") {
                System.out.println("You win");
            } else if (computer[random] == "Scissors") {
                System.out.println("Tie");
            }
        }
    }


}



