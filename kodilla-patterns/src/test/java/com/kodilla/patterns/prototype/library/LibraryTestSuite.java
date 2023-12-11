package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;


public class LibraryTestSuite {
    @Test
    void testGetBooks() {
        //Giben
        Book book1 = new Book("1984", "George Orwell", LocalDate.of(1949, 6, 8));
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", LocalDate.of(1960, 7, 11));
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", LocalDate.of(1925, 4, 10));

        Library library = new Library("Classics");
        //adding book to library
        library.books.add(book1);
        library.books.add(book2);
        //creating shallow clone
        Library shallowClonedLibrary = null;
        try {
            shallowClonedLibrary = library.shallowCopy();
            shallowClonedLibrary.setName("Classicsc shallow clone");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        //adding book to shallow clone library
        shallowClonedLibrary.books.add(book2);
        //creating deep clone
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Classic deep clone");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        // adding book to deep clone library
        deepClonedLibrary.books.add(book3);
        //when



        int booksCollectionLibrary = library.getBooks().size();
        int booksCollectionShallowCloneLibrary = shallowClonedLibrary.getBooks().size();
        int booksCollectionDeepClonedLibrary = deepClonedLibrary.getBooks().size();
        //then
        Assertions.assertEquals(booksCollectionLibrary, 2);
        Assertions.assertEquals(booksCollectionShallowCloneLibrary, 2);
        Assertions.assertEquals(booksCollectionDeepClonedLibrary, 3);
    }
}
