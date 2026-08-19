import java.util.Scanner;

public class Greetings{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Your name: ");
        String name = sc.nextLine();

        System.out.print("Your score: ");
        int score = sc.nextInt();

        System.out.println("Hello " + name + ", your score is " + score + ".");

        sc.close();
    }
}