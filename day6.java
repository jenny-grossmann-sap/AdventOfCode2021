import java.util.ArrayList;

public class day6 {
    public static void main(String args[]) {
        ArrayList<Integer> input = new ArrayList<Integer>();

        int[] fish = { 5, 1, 1, 5, 4, 2, 1, 2, 1, 2, 2, 1, 1, 1, 4, 2, 2, 4, 1, 1, 1, 1, 1, 4, 1, 1, 1, 1, 1, 5, 3, 1,
                4, 1, 1, 1, 1, 1, 4, 1, 5, 1, 1, 1, 4, 1, 2, 2, 3, 1, 5, 1, 1, 5, 1, 1, 5, 4, 1, 1, 1, 4, 3, 1, 1, 1, 3,
                1, 5, 5, 1, 1, 1, 1,
                5, 3, 2, 1, 2, 3, 1, 5, 1, 1, 4, 1, 1, 2, 1, 5, 1, 1, 1, 1, 5, 4, 5, 1, 3, 1, 3, 3, 5, 5, 1, 3, 1, 5, 3,
                1, 1, 4, 2, 3, 3, 1, 2, 4, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 4, 1, 3, 2, 5, 2, 1, 1, 1, 4, 2, 1, 1, 1, 4, 2,
                4, 1, 1, 1, 1, 4, 1, 3, 5, 5, 1, 2, 1, 3, 1, 1, 4, 1, 1, 1, 1, 2, 1, 1, 4, 2, 3, 1, 1, 1, 1, 1, 1, 1, 4,
                5, 1, 1, 3, 1, 1, 2, 1, 1, 1, 5, 1, 1, 1, 1, 1, 3, 2, 1, 2, 4, 5, 1, 5, 4, 1, 1, 3, 1, 1, 5, 5, 1, 3, 1,
                1, 1, 1, 4, 4, 2, 1, 2, 1, 1, 5, 1, 1, 4, 5, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                3, 1, 1, 1, 1, 1, 4, 2, 1, 1, 1, 2, 5, 1, 4, 1, 1, 1, 4, 1, 1, 5, 4, 4, 3, 1, 1, 4, 5, 1, 1, 3, 5, 3, 1,
                2, 5, 3, 4, 1, 3, 5, 4, 1, 3, 1, 5, 1, 4, 1, 1, 4, 2, 1, 1, 1, 3, 2, 1, 1, 4 };

        for (int i = 0; i < fish.length; i++) {
            input.add(fish[i]);
        }

        for (int day = 1; day <= 80; day++) {
            for (int i = 0; i < input.size(); i++) {

                if (input.get(i) == 0) {
                    input.set(i, 6);
                    input.add(9);
                } else {
                    int help = input.get(i);
                    help--;
                    input.set(i, help);
                }

            }
        }

        System.out.println("Part 1: " + input.size());

        long[] inputPart2 = new long[9];
        for (int i = 0; i < fish.length; i++) {
            if (fish[i] == 0) {
                inputPart2[0]++;
            } else if (fish[i] == 1) {
                inputPart2[1]++;
            } else if (fish[i] == 2) {
                inputPart2[2]++;
            } else if (fish[i] == 3) {
                inputPart2[3]++;
            } else if (fish[i] == 4) {
                inputPart2[4]++;
            } else if (fish[i] == 5) {
                inputPart2[5]++;
            } else if (fish[i] == 6) {
                inputPart2[6]++;
            } else if (fish[i] == 7) {
                inputPart2[7]++;
            } else if (fish[i] == 8) {
                inputPart2[8]++;
            } else {
                System.out.println("ERROR!");
            }
        }

        for (int day = 1; day <= 256; day++) {
            long day0 = inputPart2[0];
            long day1 = inputPart2[1];
            long day2 = inputPart2[2];
            long day3 = inputPart2[3];
            long day4 = inputPart2[4];
            long day5 = inputPart2[5];
            long day6 = inputPart2[6];
            long day7 = inputPart2[7];
            long day8 = inputPart2[8];

            inputPart2[0] = day1;
            inputPart2[1] = day2;
            inputPart2[2] = day3;
            inputPart2[3] = day4;
            inputPart2[4] = day5;
            inputPart2[5] = day6;
            inputPart2[6] = day7 + day0;
            inputPart2[7] = day8;
            inputPart2[8] = day0;
        }

        long result = 0;
        for (int i = 0; i < inputPart2.length; i++) {
            result = result + inputPart2[i];
        }
        System.out.println("Part 2: " + result);

    }
}