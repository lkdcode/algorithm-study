package algorithm1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface Input {
    void input();
}

interface MakeResult {
    void makeResult();
}

interface ResultPrint {
    void resultPrint();
}

public class baekjoon2675 implements Input, MakeResult, ResultPrint {
    private final Scanner scanner;
    private final List<String> inputString;
    private final List<Integer> loop;
    private final StringBuilder result;
    private final String LINE;

    public baekjoon2675() {
        this.scanner = new Scanner(System.in);
        this.inputString = new ArrayList<>();
        this.loop = new ArrayList<>();
        this.result = new StringBuilder();
        this.LINE = "line.separator";
    }

    public static void main(String[] args) {
        baekjoon2675 baekjoon2675 = new baekjoon2675();
        baekjoon2675.input();
        baekjoon2675.makeResult();
        baekjoon2675.resultPrint();
    }

    /**
     * 입력 받는 메소드
     */
    @Override
    public void input() {
        int size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            this.loop.add(scanner.nextInt());
            this.inputString.add(scanner.next());
        }
    }

    /**
     * 정답을 만드는 메소드
     */
    @Override
    public void makeResult() {
        for (int i = 0; i < this.inputString.size(); i++) {
            addResult(inputString.get(i), loop.get(i));
        }
    }

    /**
     * 입력받은 문자열을 문자로 나눈 뒤 addWrod() 메소드로 넘겨주는 메소드
     *
     * @param input 입력 받은 문자열 중 하나
     * @param loop  입력 받은 반복 횟수
     */
    private void addResult(String input, int loop) {
        for (int i = 0; i < input.length(); i++) {
            addWord(input.charAt(i), loop);
        }
        result.append(System.getProperty(LINE));
    }

    /**
     * 문자와 반복횟수를 입력받아 StringBuilder result 에 추가하는 메소드
     *
     * @param word
     * @param loop
     */
    private void addWord(char word, int loop) {
        for (int i = 0; i < loop; i++) {
            result.append(word);
        }
    }

    /**
     * 정답을 출력하는 메소드
     */
    @Override
    public void resultPrint() {
        System.out.println(result);
    }
}