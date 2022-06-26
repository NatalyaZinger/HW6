package ru.netology.sqr;

public class SQRService {
    public int countAmountSQR(int lowerBound, int upperBound) {
        int count = 0;
        for (int x = 10; x <= 99; x++) {
            if (x * x >= lowerBound && x * x <= upperBound) {
                count++;
            }
        }
        return count;
    }
}
