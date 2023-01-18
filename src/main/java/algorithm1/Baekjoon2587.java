package algorithm1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Baekjoon2587 {
    private static final int PROBLEM_NUMBERS_SIZE = 5;
    private static final int MIDDLE_NUMBER_INDEX = 2;
    private final Scanner scanner = new Scanner(System.in);

    /**
     * logic
     * 1. 숫자 5개를 입력받는다.
     * 2. 오름차순으로 정렬한다.
     * 3. 평균 값을 찾는다.
     * 4. 중간 값을 찾는다.
     * 5. 결과값을 출력한다.
     */
    public static void main(String[] args) {
        Baekjoon2587 main = new Baekjoon2587();
        main.solution();
    }

    private void solution() {
        List<Integer> problemNumbers = inputProblemNumbers();

        problemNumbers = sortProblemNumbers(problemNumbers);

        int averageNumber = findAverageNumber(problemNumbers);

        int middleNumber = findMiddleNumber(problemNumbers);

        resultPrint(averageNumber, middleNumber);
    }

    /**
     * 1. 숫자 5개를 입력받는다.
     *
     * @return List 로 리턴
     */
    private List<Integer> inputProblemNumbers() {
        List<Integer> problemNumbers = new ArrayList<>();

        for (int i = 0; i < PROBLEM_NUMBERS_SIZE; i++) {
            problemNumbers.add(scanner.nextInt());
        }

        return problemNumbers;
    }

    /**
     * 2. 오름차순으로 정렬한다.
     *
     * @param problemNumbers 정렬된 List 리턴
     * @return
     */
    private List<Integer> sortProblemNumbers(List<Integer> problemNumbers) {
        Collections.sort(problemNumbers);
        return problemNumbers;
    }

    /**
     * 3. 평균 값을 찾는다.
     *
     * @param problemNumbers
     * @return 평균 값을 리턴
     */
    private int findAverageNumber(List<Integer> problemNumbers) {
        int total = 0;

        for (int i = 0; i < PROBLEM_NUMBERS_SIZE; i++) {
            total += problemNumbers.get(i);
        }

        return total / problemNumbers.size();
    }

    /**
     * 4. 중간 값을 찾는다.
     *
     * @param problemNumbers
     * @return 인덱스 2번의 숫자 리턴
     */
    private int findMiddleNumber(List<Integer> problemNumbers) {
        return problemNumbers.get(MIDDLE_NUMBER_INDEX);
    }

    /**
     * 5. 결과값을 출력한다.
     *
     * @param averageNumber 평균 값
     * @param middleNumber  중간 값
     */
    private void resultPrint(int averageNumber, int middleNumber) {
        System.out.printf("%d%n%d", averageNumber, middleNumber);
    }


}
