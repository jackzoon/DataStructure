package com.halen;

import com.halen.printer.BinaryTreeInfo;
import com.halen.printer.BinaryTrees;

import java.util.Comparator;

/**
 * Created By Halen 2020/7/5 11:17
 */
public class Main {

    private static class PersonComparator implements Comparator<Person> {
        @Override
        public int compare(Person e1, Person e2) {
            return e1.getAge() - e2.getAge();
        }
    }

    private static class PersonComparator2 implements Comparator<Person> {
        @Override
        public int compare(Person e1, Person e2) {
            return e2.getAge() - e1.getAge();
        }
    }

    public static void main(String[] args) {
      /*Integer[] data = {7, 4, 9, 2, 5};
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        for (int i = 0; i < data.length; i++) {
            bst.add(data[i]);
        }
        System.out.println(bst.isComplete());
        System.out.println("------------------");*/
         /* BinaryTrees.print(bst);

        BinarySearchTree<Person> bst2 = new BinarySearchTree<>(new PersonComparator());
        bst2.add(new Person(12));
        bst2.add(new Person(15));

        BinarySearchTree<Person> bst3 = new BinarySearchTree<>(new PersonComparator2());
        bst2.add(new Person(12));
        bst2.add(new Person(15));

        BinarySearchTree<Person> bst4 = new BinarySearchTree<>((e1, e2) -> e1.getAge() - e2.getAge());*/
//       test3();
//        test5();
//        test1();
        test7();
    }

    static void test1() {
        Integer[] data = {7, 4, 2,1,3,5,9,8,11,10,12};
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        for (int i = 0; i < data.length; i++) {
            bst.add(data[i]);
        }
        BinaryTrees.print(bst);
        System.out.println();
        System.out.println("------------------------------");
        bst.preOrder(new BinarySearchTree.Visitor<Integer>() {
            @Override
            public void visit(Integer element) {
                System.out.print(element+"  ");
            }
        });
        System.out.println();
        bst.inOrder(element -> System.out.print(element+"  "));
        System.out.println();
        bst.postOrder(element -> System.out.print(element+"  "));
        System.out.println();
        bst.levelOrder();

        bst.levelOrder(new BinarySearchTree.Visitor() {
            @Override
            public void visit(Object element) {
                System.out.print(element+"_ ");
            }
        });
        System.out.println("----------------------------------");
        System.out.println(bst.height());
        System.out.println(bst.height2());
    }

    static void test3() {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        for (int i = 0; i < 30; i++) {
            bst.add((int) (Math.random() * 100));
        }
        BinaryTrees.print(bst);
        System.out.println("------------------------------");
        System.out.println(bst.height2());
        System.out.println(bst.height());
        System.out.println("________________________");
        System.out.println(bst.isComplete());
    }

    static void test5() {
        BinarySearchTree<Person> bst = new BinarySearchTree<>();
        bst.add(new Person(10, "jack"));
        bst.add(new Person(12, "rose"));
        bst.add(new Person(6, "jim"));
        BinaryTrees.print(bst);
    }

    static void test7() {
        Integer[] data = {7, 4, 2,1,3,5,9,8,11,10,12};
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        for (int i = 0; i < data.length; i++) {
            bst.add(data[i]);
        }
        BinaryTrees.print(bst);

        bst.remove(7);
        System.out.println();
        BinaryTrees.print(bst);
    }
}
