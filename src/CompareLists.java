import java.util.ArrayList;
import java.util.LinkedList;

public class CompareLists {
    private TestLists testThisLists = new TestLists();
    public CompareLists(){
        System.out.println("ArrayList: ");
        testThisLists.testList(new ArrayList<>());
        System.out.println("LinkedList: ");
        testThisLists.testList(new LinkedList<>());
    }
}
