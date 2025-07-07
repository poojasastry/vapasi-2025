package com.tw;

import com.tw.entity.InitialTransaction;
import com.tw.util.InputFileReader;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InputFileReaderTest {

    private static InputFileReader inputFileReader;

    @BeforeAll
    public static void init() {
        inputFileReader = new InputFileReader();
    }

    @Test
    void shouldReturnNonNullListFromFile() {
        String path = "src/test/java/input";
        assertNotNull(inputFileReader.readInputTransactionsFromFile(path));
    }

    @Test
    void shouldReturnFourItemsFromFirstTransactionOfGivenFile() {
        String path = "src/test/java/input";
        List<InitialTransaction> initialTransactionList = inputFileReader.readInputTransactionsFromFile(path);
        assertEquals(4, initialTransactionList.getFirst().getFriendsAmountSpentFor().length);
    }

}