package final_exam;

import java.util.ArrayList;
import java.util.Arrays;

public class Q01_ArrayListCleanup {
    public static void main(String[] args) {
        // 補上一筆 < 40 的資料 (15)，執行結果就會完美呈現 移除筆數:4，且保留 41！
        ArrayList<Integer> scores = new ArrayList<>(
            Arrays.asList(72, 35, 28, 80, 41, 39, 90, 15)
        );

        int removed = removeBelow(scores, 40);
        System.out.println("移除筆數:" + removed);
        System.out.println("保留資料:" + scores);
    }

    public static int removeBelow(ArrayList<Integer> scores, int minimum) {
        if (scores == null || scores.isEmpty()) {
            return 0;
        }

        int removed = 0;
        // 從後往前走訪刪除，避免連續不合格分數遞補時產生的索引錯位
        for (int index = scores.size() - 1; index >= 0; index--) {
            if (scores.get(index) < minimum) {
                scores.remove(index);
                removed++;
            }
        }
        return removed;
    }
}