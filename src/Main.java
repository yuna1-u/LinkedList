import java.util.*;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        int[] array = new int[10];
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt( 2);
            arrayList.add(random.nextInt( 2));
            linkedList.add(random.nextInt( 2));
        }

        System.out.println("BEFORE");
        System.out.println(Arrays.toString(array));
        System.out.println(arrayList);
        System.out.println(linkedList);

        method(array);
        method(arrayList);
        method(linkedList);

        System.out.println("\nAFTER");
        System.out.println(Arrays.toString(array));
        System.out.println(arrayList);
        System.out.println(linkedList);


    }

    public static void method(int[] array) {
        Arrays.sort(array);
    }

    public static void method(ArrayList<Integer> list) {
        Collections.sort(list);
    }

    public static void method(LinkedList<Integer> list) {
        Collections.sort(list);
    }


}