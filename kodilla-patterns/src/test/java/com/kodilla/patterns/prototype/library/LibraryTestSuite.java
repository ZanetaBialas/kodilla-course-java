package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTestSuite {
    @Test
    void testGetBook() {
        //Given
        Book book1 = new Book("Narzeczona nazisty", "Barbara Wysoczanska", LocalDate.of(2017,1,1));
        Book book2 = new Book("Potega Podswiadomosci", "Joseph Murphy", LocalDate.of(2019,2,15));
        Book book3 = new Book("Pandemia Klamstw", "Judy Mikovits", LocalDate.of(2020,9,9));
        Library library = new Library("First Library");
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Second Library");
        }
        catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Third Library");
        }
        catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(book2);

        //Then
        System.out.println(library.getBooks());
        assertEquals(2, library.getBooks().size());
        System.out.println(clonedLibrary.getBooks());
        assertEquals(2, clonedLibrary.getBooks().size());
        System.out.println(deepClonedLibrary.getBooks());
        assertEquals(3, deepClonedLibrary.getBooks().size());
    }
}
