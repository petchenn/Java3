import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Этот класс измеряет время выполнения основных операций с классоми ArrayList и LinkedList,
 * таких, как добавление, получение и удаление. Использует TestLists
 */
public class CompareLists {
    private TestLists testThisLists = new TestLists();
    /**
     * Основной метод для выполнения тестов производительности. Дважды вызывает класс TestLists.
     */
    public CompareLists(){
        System.out.println("ArrayList: ");
        testThisLists.testList(new ArrayList<>());
        System.out.println("LinkedList: ");
        testThisLists.testList(new LinkedList<>());
    }
}
