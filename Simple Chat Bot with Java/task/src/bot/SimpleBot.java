package bot;

import java.util.Scanner;

public class SimpleBot {
    public static void main(String[] args) {

        //Scanner class instantiated
        Scanner scanner = new Scanner(System.in);

        //Part 1: Introduction to ChatBot
        System.out.println("Hello! My name is ChatBot.");
        System.out.println("I was created in 2024.");
        System.out.println("Please, remind me your name.");

        //Part 2: ChatBot asks user for their name.
        String name = scanner.nextLine();

        System.out.println("What a great name you have, " + name + "!");

        //Part 3: ChatBot guessing age, using arithmetic formuler
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

        // reading all remainders
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int age = (a * 70 + b * 21 + c * 15) % 105;

        System.out.println("Your age is" + age + "; that's a good time to start programming!");

        //Part 4: ChatBot learning how to count
        System.out.println("Now I will prove to you that I can count to any number you want.");

        int numberInput = scanner.nextInt();

        for(int i = 0; i <= numberInput; i++){
            System.out.println(i +"!");
        }
        //Not NEEDED IN PART 5 System.out.println("Completed, have a nice day!");

        //Part 5: Play a simple quiz with ChatBot
        System.out.println("Let's test your programming knowledge");
        System.out.println("What is the purpose of creating this ChatBot?");
        System.out.println("1. To practice Python programming.");
        System.out.println("2. Because I am bored.");
        System.out.println("3. To practice Java programming.");
        System.out.println("4. I'm hungry.");

        int answerChoice = scanner.nextInt();

        while(answerChoice != 3){
            System.out.println("Please, try again.");
            answerChoice = scanner.nextInt();
        }
        System.out.println("Congratulations, have a nice day!");
    }
}
