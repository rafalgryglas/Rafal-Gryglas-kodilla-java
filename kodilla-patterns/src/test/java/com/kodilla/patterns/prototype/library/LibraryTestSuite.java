package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Book book1 = new Book("Hobbit", "J.R.R. Tolkien", LocalDate.of(1937, 3, 4));
        Book book2 = new Book("Mechaniczna Pomarańcza", "Anthony Burgess", LocalDate.of(1962, 1, 1));
        Book book3 = new Book("Paragraf 22", "Joseph Heller", LocalDate.of(1961, 11, 23));
        Book book4 = new Book("Wielki Gatsby", "F. Scott Fitzgerald", LocalDate.of(1925, 3, 15));

        Library library = new Library("First library");
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);
        //making a shallow clone ogf object Library
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Second library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        //making a deep copy for object Library
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Third library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        //When
        library.getBooks().remove(book1);
        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(3, library.getBooks().size());
        Assert.assertEquals(3, clonedLibrary.getBooks().size());
        Assert.assertEquals(clonedLibrary.getBooks(), library.getBooks());
        Assert.assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());
    }
}
