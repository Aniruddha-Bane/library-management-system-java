package main;

import model.Book;
import service.LibraryService;

public class Main {

    public static void main(String[] args) {

        LibraryService libraryService =
                new LibraryService();

        libraryService.addBook(
                new Book(
                        101,
                        "Clean Code",
                        "Robert Martin",
                        5));

        libraryService.addBook(
                new Book(
                        102,
                        "Effective Java",
                        "Joshua Bloch",
                        3));

        libraryService.viewBooks();
    }
}