package Iterator;

public class Loader {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(5);
        list.add(5);
        list.add(7);
        list.add(8);
        list.add(1);
        list.add(4);
        System.out.println(list);

        Iterator iterator = list.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            int var = (int) iterator.next();
            if (var == 8) {
                iterator.remove();
            } else {
                System.out.println(var);
            }
        }
    }
}
