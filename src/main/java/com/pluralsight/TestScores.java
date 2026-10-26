package com.pluralsight;




public class TestScores {
    public static void main(String[] args) {

        int[] scores = {80, 60, 50, 55, 89, 90, 92, 100, 67, 95};

        int sum = 0;
        int high = scores[0];
        int low = scores[0];

        for (int score : scores) {
            sum += score;

            if (score > high) {
                high = score;
            }
            if (score < low) {
                low = score;

            }
        }
        double average = (double) sum / scores.length;

        System.out.printf("Average: %.2f\n", average);
        System.out.println("High score: " + high);
        System.out.println("Low score: " + low);
    }
}
