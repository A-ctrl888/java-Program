import java.util.Vector;

public class LanguageVector {
    public static void main(String args[]) {
        Vector list = new Vector();
        int n = args.length;

        for (int i = 0; i < n; i++) {
            list.addElement(args[i]);
        }

        list.insertElementAt("COOL", 2);

        int size = list.size();
        String listArray[] = new String[size];

        list.copyInto(listArray);

        System.out.println("list of language =");
        for (int i = 0; i < size; i++) {
            System.out.println(listArray[i]);
        }
    }
}