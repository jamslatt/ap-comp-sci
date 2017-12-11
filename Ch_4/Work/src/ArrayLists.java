import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Jop");
        list.add("Dot");
        list.add("Joeb");
        list.add("Noob");
        System.out.println(list + "\n----After removeEvenLength()----");
        removeEvenLength(list);
        System.out.println(list);

        // Next Problem
        ArrayList ints = new ArrayList();
        ints.add(2);
        ints.add(1);
        ints.add(4);
        System.out.println("==========================\n==========================\nMin to Front\n");
        minToFront(ints);
    }

    public static void removeEvenLength(ArrayList list) {
        /*Iterator<String> i = list.iterator();

        while (i.hasNext()) {
            String s = i.next();
            if ((s.length()) % 2 == 0) {
                i.remove();
            }
        }*/


        boolean x = true;
        int size = list.size();
        int count = 0;

        while (x) {
            for (int i = 0; i < list.size(); i++) {
                String test = (String) list.get(i);
                if ((test.length()) % 2 == 0) {
                    list.remove(i);
                }
            }
            count++;
            if (count > size) {
                x = false;
            }
        }


    }

    public static void minToFront(ArrayList list) {
        int min = 99999999;
        int slot = 0;
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            int test = (int) list.get(i);
            if (test < min) {
                min = test;
                slot = i;
            }
        }
        list.remove(slot);
        list.add(0, min);

        System.out.println(list);


    }

}
