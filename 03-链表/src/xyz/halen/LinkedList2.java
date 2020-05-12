package xyz.halen;

/**
 * Created By Halen 2020/5/11 14:06
 * 增加一个虚拟头结点
 */
public class LinkedList2<E> extends AbstractList<E>{

    private Node<E> first;

    public LinkedList2() {
        first = new Node<>(null, null);
    }

    @Override
    public void clear() {
        size = 0;
        first = null;
    }

    @Override
    public E get(int index) {
        return node(index).element;
    }

    @Override
    public E set(int index, E e) {
        Node<E> node = node(index);
        E old = node.element;
        node.element = e;
        return old;
    }

    @Override
    public void add(int index, E e) {
        rangeCheckForAdd(index);
        Node<E> prev = index == 0 ? first:node(index - 1);
        prev.next = new Node<>(e, prev.next);
        size++;
    }

    @Override
    public E remove(int index) {
        rangeCheck(index);
        Node<E> prev = index == 0 ? first : node(index - 1);
        Node<E> node = prev.next;
        prev.next = node.next;
        size--;
        return node.element;
    }

    @Override
    public int indexOf(E e) {
        Node<E> node = first;
        if (e == null) {
            for (int i = 0; i < size; i++) {
                if (node == null) {
                    return i;
                }
                node = node.next;
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (e.equals(node.element)) {
                    return i;
                }
                node = node.next;
            }
        }
        return ELEMENT_NOT_FOUND;
    }

    /**
     * 获取index位置对应的节点对象
     * @param index
     * @return
     */
    private Node<E> node(int index) {
        rangeCheck(index);
        Node<E> node = first.next;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }


    private static class Node<E>{
        E element;
        Node next;

        public Node(E element, Node next) {
            this.element = element;
            this.next = next;
        }
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("size=").append(size).append(", [");
        Node<E> node =first.next;
        for (int i = 0; i < size; i++) {
            if (i != 0) {
                string.append(",");
            }
            string.append(node.element);
            node = node.next;
        }
        string.append("]");
        return string.toString();
    }
}
