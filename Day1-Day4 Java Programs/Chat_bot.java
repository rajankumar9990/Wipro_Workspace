package wd;

import java.util.Scanner;

public class Chat_bot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;

        System.out.println("ChatBot: Hey there! I’m your smart chatbot. (Type 'bye' to leave)");

        while (true) {
            System.out.print("You: ");
            input = sc.nextLine().toLowerCase();

            if (input.equals("bye")) {
                System.out.println("ChatBot: Bye! Talk to you later!");
                break;
            } 
            else if (input.contains("hello") || input.contains("hi")) {
                System.out.println("ChatBot: Hello! How’s your day going?");
            } 
            else if (input.contains("how are you")) {
                System.out.println("ChatBot: I’m great, thanks for asking! What about you?");
            } 
            else if (input.contains("name")) {
                System.out.println("ChatBot: My name is alexa, your friendly chatbot!");
            } 
            else if (input.contains("age")) {
                System.out.println("ChatBot: I’m immortal!");
            } 
            else if (input.contains("color")) {
                System.out.println("ChatBot: I love all colors, but white is my fvrt!");
            } 
            else if (input.contains("food")) {
                System.out.println("ChatBot: I don’t eat food!");
            } 
            else {
                
                System.out.println("ChatBot: Hmm… I’m not sure what you mean. Can you ask something else?");
            }
        }

        sc.close();
    }
}
