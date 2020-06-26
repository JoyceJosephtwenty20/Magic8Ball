
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Magic8Ball {
    public static void main(String[] args) {
        Random luck = new Random();
        Scanner keybd = new Scanner(System.in);

        ArrayList<String> myArray = new ArrayList<String>();

        myArray.add("It is certain");
        myArray.add("It is decidedly so");
        myArray.add("Without a doubt");
        myArray.add("Yes definitely");
        myArray.add("You may rely on it");
        myArray.add("As I see it, yes");
        myArray.add("Most likely");
        myArray.add("Outlook good");
        myArray.add("Yes");
        myArray.add("Signs point to yes");
        myArray.add("Reply hazy try again");
        myArray.add("Ask again later");
        myArray.add("Better not tell you now");
        myArray.add("Cannot predict now");
        myArray.add("Concentrate and ask again");
        myArray.add("Don't count on it");
        myArray.add("My reply is no");
        myArray.add("My sources say no");
        myArray.add("Outlook not so good");
        myArray.add("Very doubtful");

       String yesNo ="";

        do{
            String randomMsg = myArray.get(luck.nextInt(myArray.size()));

            System.out.println("Please ask a question:  ");
            String userAnswer = keybd.nextLine();

            System.out.println(randomMsg+"\n");

            System.out.println("Do you have another question for the Magic 8-Ball? (y/n)");
            yesNo = keybd.nextLine();


        }while (!yesNo.equalsIgnoreCase("n"));

        System.out.println("Thank you for playing!");



    }

}
