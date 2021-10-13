package com.kodilla.testing.library;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class BookDirectoryTestSuite {

    @Mock
    private LibraryDatabase libraryDatabaseMock;

    private List<Book> generateListOfNBooks (int booksQuantity) {
        List<Book> resultList = new ArrayList<>();
        for(int n= 1; n<= booksQuantity; n++) {
            Book theBook = new Book("Title" + n, "Author" + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Nested
    @DisplayName("Tests list of books with three conditions")
    class TestBooksWithConditions {

        @Test
        void testListBooksWithConditionsReturnList ( ) {
            //Given
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            List<Book> resultListOfBooks = new ArrayList<>();
            Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
            Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
            Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
            Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
            resultListOfBooks.add(book1);
            resultListOfBooks.add(book2);
            resultListOfBooks.add(book3);
            resultListOfBooks.add(book4);
            when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);
            //When
            List<Book> theListOfBook = bookLibrary.listBooksWithCondition("Secret");
            //Then
            assertEquals(4, theListOfBook.size());
        }

        @Test
        void testListBooksWithConditionMoreThan20() {

            // Given
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            List<Book> resultListOf0Books = new ArrayList<Book>();
            List<Book> resultListOf15Books = generateListOfNBooks(15);
            List<Book> resultListOf40Books = generateListOfNBooks(40);
            when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                    .thenReturn(resultListOf15Books);
            when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                    .thenReturn(resultListOf0Books);
            when(libraryDatabaseMock.listBooksWithCondition("FortyBooks"))
                    .thenReturn(resultListOf40Books);

            // When
            List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
            List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
            List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");
            // Then

            assertEquals(0, theListOfBooks0.size());
            assertEquals(15, theListOfBooks15.size());
            assertEquals(0, theListOfBooks40.size());
        }

        @Test
        void testListBooksWithConditionFragmentShorterThan3 ( ) {
            //Given
            LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

            //When
            List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");
            //Then
            assertEquals(0, theListOfBooks10.size());
            verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
        }
    }

    @Nested
    @DisplayName("Testes list of books in hands of user")
    class TestListBooksInHandsOf {

        private final LibraryUser libraryUser = new LibraryUser("Amelia", "Smith", "220022");

        @Test
        void testListBooksInHandsOfWhenIsEmpty() {
            //Given
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            List<Book> books = new ArrayList<>();
            when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(books);

            //When
            List<Book> userListBooks = bookLibrary.listBooksInHandsOf(libraryUser);

            //Then
            assertEquals(0, userListBooks.size());
        }

        @Test
        void testListBooksInHandsOfOne() {
            //Given
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            List<Book> books = generateListOfNBooks(1);
            when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(books);

            //When
            List<Book> userListBooks = bookLibrary.listBooksInHandsOf(new LibraryUser("Amelia", "Smith", "220022"));

            //Then
            assertEquals(1, userListBooks.size());
        }

        @Test
        void testListBooksInHandsOfMoreThanFour() {
            //Given
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            List<Book> books = generateListOfNBooks(5);
            when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(books);

            //When
            List<Book> newUserListBooks = bookLibrary.listBooksInHandsOf(new LibraryUser("Amelia", "Smith", "220022"));

            //Then
            assertEquals(5, newUserListBooks.size());
        }
    }
}
