package algorithm1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Programmers68644 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] numbers = {2, 1, 3, 4, 1};
        solution.solution(numbers);
    }
}

/**
 * logic
 * 1. 입력받은 배열의 값을 하나씩 꺼내서 더하고 List에 추가한다.
 * 2. 더해준 값의 중복을 제거한다.
 * 3. 배열을 오름차순으로 정렬한다.
 * 4. 정답 배열을 리턴해준다.
 */

class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> addList = calculator(numbers);

        addList = duplicateDelete(addList);

        addList = sortList(addList);

        return result(addList);
    }

    /**
     * 1. 입력받은 배열의 값을 하나씩 꺼내서 더하고 List에 추가한다.
     * 배열의 값을 하나씩 꺼내서 List 에 저장
     * @param numbers 매개변수로 받은 배열값
     * @return 모두 더한 값을 리턴
     */
    private List<Integer> calculator(int[] numbers) {
        List<Integer> addList = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                addList.add(numbers[i] + numbers[j]);
            }
        }

        return addList;
    }

    /**
     * 2. 더해준 값의 중복을 제거한다.
     * @param addList 매개변수로 받은 List<Integer>
     * @return 중복제거가 완료된 값을 리턴
     */
    private List<Integer> duplicateDelete(List<Integer> addList) {
        List<Integer> duplicateDeleteList = new ArrayList<>();

        for (int i = 0; i < addList.size(); i++) {
            if (!duplicateDeleteList.contains(addList.get(i))) {
                duplicateDeleteList.add(addList.get(i));
            }
        }

        return duplicateDeleteList;
    }

    /**
     * 3. 배열을 오름차순으로 정렬한다.
     * @param addList
     * @return
     */
    private List<Integer> sortList(List<Integer> addList) {
        Collections.sort(addList);
        return addList;
    }

    /**
     * 4. 정답 배열을 리턴해준다.
     * List 를 배열로 변경
     * @param addList
     * @return
     */
    private int[] result(List<Integer> addList) {
        int[] result = new int[addList.size()];
        for (int i = 0; i < addList.size(); i++) {
            result[i] = addList.get(i);
        }
        return result;
    }
}
