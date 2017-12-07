import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Jop");
        list.add("Dot");
        list.add("Joeb");
        list.add("Noob");
        System.out.println(list + "After:------");
        removeEvenLength(list);
        System.out.println(list);
    }

    public static void removeEvenLength(ArrayList list) {
        Iterator<String> i = list.iterator();

        while (i.hasNext()) {
            String s = i.next();
            if ((s.length()) % 2 == 0) {
                i.remove();
            }
        }

        /*for (int i = 0; i < list.size(); i++) {
            String test = (String) list.get(i-deletedItems);
            if ((test.length()) % 2 == 0) {
                list.remove(i - deletedItems);
                deletedItems++;
            }
        }*/


    }

}
