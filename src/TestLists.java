import java.util.List;

/**
 * Этот класс измеряет время выполнения основных операций с классом List (и его подклассами),
 * таких, как добавление, получение и удаление.
 */
public class TestLists {
    private static final int ITERATIONS = 1000;

    /**
     * Основной метод для выполнения тестов производительности List.
     *
     * @param list параметр для получения типа проверяемого List.
     */
    private void testList(List<Integer> list){

        testAdd(list);
        testGet(list);
        testDelete(list);
    }

    /**
     * Измеряет время, необходимое для добавления элементов в список.
     *
     * @param list Список, в который добавляются элементы.
     */
    private static void testAdd(List<Integer> list) {
        long startTime, endTime, duration;
        startTime = System.nanoTime();
        for (int i = 0; i < ITERATIONS; i++) {
            list.add(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.printf("  add(): %d iterations, Time: %.6f ms\n", ITERATIONS, duration / 1000000.0);
    }
    /**
     * Измеряет время, необходимое для получения элементов из списка.
     *
     * @param list Список, из которого получаются элементы.
     */
    private static void testGet(List<Integer> list) {
        long startTime, endTime, duration;
        startTime = System.nanoTime();
        for (int i = 0; i < ITERATIONS; i++) {
            list.get(i % list.size());
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.printf("  get(): %d iterations, Time: %.6f ms\n", ITERATIONS, duration / 1000000.0);
    }
    /**
     * Измеряет время, необходимое для удаления элементов с конца списка.
     *
     * @param list Список, из которого удаляются элементы. Элементы удаляются с конца списка.
     */
    private static void testDelete(List<Integer> list) {
        long startTime, endTime, duration;
        startTime = System.nanoTime();
        for (int i = list.size() - 1; i >= 0; i--) {
            list.remove(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.printf("  delete(): %d iterations, Time: %.6f ms\n", ITERATIONS, duration / 1000000.0);
    }
}
