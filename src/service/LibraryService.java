package service;

import model.Book;

import java.util.ArrayList;

public class LibraryService {

    private ArrayList<Book> books;

    public LibraryService() {

        books = new ArrayList<>();
    }

    /*
     * ADD BOOK
     */
    public boolean addBook(Book book) {

        for (Book existingBook : books) {

            if (existingBook.getBookId()
                    == book.getBookId()) {

                return false;
            }
        }

        books.add(book);

        return true;
    }

    /*
     * VIEW BOOKS
     */
    public void viewBooks() {

        if (books.isEmpty()) {

            System.out.println(
                    "\nNo books available.");

            return;
        }

        System.out.println(
                "\n=========================");
        System.out.println(
                "      BOOK LIST");
        System.out.println(
                "=========================");

        for (Book book : books) {

            System.out.println(book);
        }
    }

    /*
     * SEARCH BOOK
     */
    public Book searchBook(
            int bookId) {

        for (Book book : books) {

            if (book.getBookId()
                    == bookId) {

                return book;
            }
        }

        return null;
    }

    public ArrayList<Book> getBooks() {

        return books;
    }
}