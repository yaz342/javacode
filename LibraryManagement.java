import java.util.Scanner;

class Book {
    int id;
    String title;
    String author;

    Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println("Book ID     : " + id);
        System.out.println("Title       : " + title);
        System.out.println("Author      : " + author);
        System.out.println("-----------------------------");
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book[] books = new Book[3];

        // 3 books details vaanguradhu
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for Book " + (i + 1) + ":");

            System.out.print("Book ID: ");
            int id = Integer.parseInt(sc.nextLine());

            System.out.print("Title: ");
            String title = sc.nextLine();

            System.out.print("Author: ");
            String author = sc.nextLine();

            books[i] = new Book(id, title, author);
            System.out.println();
        }

        // Ella books details display pannurom
        System.out.println("===== Library Records =====");
        for (Book b : books) {
            b.display();
        }

        // Simple search feature - book id vachu
        System.out.print("Enter Book ID to search: ");
        int searchId = Integer.parseInt(sc.nextLine());
        boolean found = false;

        for (Book b : books) {
            if (b.id == searchId) {
                System.out.println("Book Found:");
                b.display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Book not found with ID: " + searchId);
        }

        sc.close();
    }
}
