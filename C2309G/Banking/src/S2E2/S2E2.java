package S2E2;
import Entity.Customer;
import Entity.Gender;
import S2E2.Author;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class S2E2 {

    public static void main(String[] args) {
        List<Author> authors = new ArrayList<>();
        authors.add(new Author("Hai","Haideptri@gmail.com",Gender.M));
        authors.add(new Author("Hi","Nhingi@gmail.com",Gender.M));

        List<Book> books= new ArrayList<>();
        books.add(new Book("Cach lam giau",authors.get(0),50000,5));
        books.add(new Book("Cach lam ngheo",authors.get(1),100,2));
        //Stream API Collection
        authors.stream()
                .sorted(Comparator.comparing(Author::getName))
                .forEach(System.out::println);
        books.stream()
                .sorted(Comparator.comparing(Book::getName))
                .forEach(System.out::println);
        Book maxPriceBook = books.stream()
                .max(Comparator.comparing(Book::getPrice))
                .orElse(null);

        if (maxPriceBook != null) {
            System.out.println("Book with the maximum price:");
            System.out.println(maxPriceBook);
        } else {
            System.out.println("No books available.");
        }
        // Scanner input for author's name
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter author's name to list their books: ");
        String authorName = scanner.nextLine();

        // List books by the given author
        List<Book> authorBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().getName().equalsIgnoreCase(authorName)) {
                authorBooks.add(book);
            }
        }

        if (!authorBooks.isEmpty()) {
            System.out.println("Books by " + authorName + ":");
            authorBooks.forEach(System.out::println);
        } else {
            System.out.println("No books found for author: " + authorName);
        }

        scanner.close();


    }
}