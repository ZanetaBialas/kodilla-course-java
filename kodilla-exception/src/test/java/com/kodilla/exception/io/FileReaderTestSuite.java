package com.kodilla.exception.io;

import com.kodilla.exception.test.SecondChallenge;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FileReaderTestSuite {
    @Test
    void testReadFile() {
        //given
        FileReader fileReader = new FileReader();

        //when & then
        assertDoesNotThrow(()-> fileReader.readFile());
    }

    @Test
    void whenFileDosentExistReadFileShouldThrowException() {
        //given
        FileReader fileReader = new FileReader();
        String fileName = "nie_ma_takiego_pliku.txt";
        //when & then
        assertThrows(FileReaderException.class, () -> fileReader.readFile(fileName));
    }

    @Test
    public void testReadFileWithName() {
        //given
        FileReader fileReader = new FileReader();
        //when & then
        assertAll(
                ()-> assertThrows(FileReaderException.class, () -> fileReader.readFile("nie_ma_takiego_pliku.txt")),
                ()-> assertThrows(FileReaderException.class, () -> fileReader.readFile(null)),
                ()-> assertDoesNotThrow(() -> fileReader.readFile("names.txt"))
        );
    }
    @Test
    @DisplayName("When input is out of boundary condition method should throw" +
            "Exception, otherwise should return \"Done!\"")
    void testBoundaryConditions() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        Exception firstConditionIsTruForUpperBound = assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2, 4));
        Exception firstConditionIsTrueForBottomBound = assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0.99, 1));
        Exception secondConditionIsTrue = assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1.2, 1.5));

        //When & Then
        assertAll(
                () -> assertEquals("Incorrect value of input parameters ...", firstConditionIsTruForUpperBound.getMessage()),
                () -> assertEquals("Incorrect value of input parameters ...", firstConditionIsTrueForBottomBound.getMessage()),
                () -> assertEquals("Incorrect value of input parameters ...", secondConditionIsTrue.getMessage()),
                () -> assertEquals("Done!", secondChallenge.probablyIWillThrowException(1, 2)),
                () -> assertEquals("Done!", secondChallenge.probablyIWillThrowException(1.99, 1)),
                () -> assertEquals("Done!", secondChallenge.probablyIWillThrowException(1.5, 1.49))
        );
    }
}
