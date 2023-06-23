/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

/**
 *
 * @author muqar
 */
import java.util.Scanner;

public class TestUserProfile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Choose your favorite genre:");
        System.out.println("1. Action");
        System.out.println("2. Comedy");
        System.out.println("3. Drama");

        System.out.print("Enter your choice (1-3): ");
        int genreChoice = scanner.nextInt();

        String genre;
        switch (genreChoice) {
            case 1:
                genre = "Action";
                break;
            case 2:
                genre = "Comedy";
                break;
            case 3:
                genre = "Drama";
                break;
            default:
                genre = "Unknown";
                break;
        }

        // Create the user profile message
        String userProfile = "User Profile\n" +
                "Name: " + name + "\n" +
                "Favorite Genre: " + genre;

        // Display the user profile message
        System.out.println(userProfile);

        // Close the scanner
        scanner.close();
    }
}

