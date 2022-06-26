package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/bounds.CSV")

    public void testSQR(int expected, int lowerBound, int upperBound) {
        SQRService service = new SQRService();
        int actual = service.countAmountSQR(lowerBound, upperBound);
        Assertions.assertEquals(expected, actual);
    }

}
