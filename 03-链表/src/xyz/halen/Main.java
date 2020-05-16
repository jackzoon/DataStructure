package xyz.halen;

import xyz.halen.circle.CircleLinkedList;
import xyz.halen.circle.SingleCircleLinkedList;

/**
 * Created By Halen 2020/5/11 15:28
 */
public class Main {

    public static void testList(List<Integer> list) {
        list.add(11);
        list.add(22);
        list.add(33);
        list.add(44);

        list.add(0, 55);
        list.add(2, 66);
        list.add(list.size(), 77);
        list.remove(0);
        list.remove(2);
        list.remove(list.size() - 1);

        Assert.test(list.indexOf(44) == 3);
        Assert.test(list.indexOf(22) == List.ELEMENT_NOT_FOUND);
        Assert.test(list.contains(33));
        Assert.test(list.get(0) == 11);
        Assert.test(list.get(1) == 66);
        Assert.test(list.get(list.size() - 1) == 44);
        System.out.println(list);
    }

    public static void main1(String[] args) {
        testList(new ArrayList<>());
        testList(new LinkedList<>());

    }

    public static void main2(String[] args) {
        testList(new SingleCircleLinkedList<>());
        testList(new CircleLinkedList<>());
    }

    public static void josephus() {
        CircleLinkedList<Integer> list = new CircleLinkedList<>();
        for (int i = 1; i <= 8; i++) {
            list.add(i);
        }
        // 指向头节点
        list.reset();

        while (!list.isEmpty()) {
            list.next();
            list.next();
            System.out.println(list.remove());
        }
    }

    public static void main(String[] args) {
        josephus();
    }
}
