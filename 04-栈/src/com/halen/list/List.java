package com.halen.list;

/**
 * Created By Halen 2020/5/11 15:18
 */
public interface List<E> {

    static final int ELEMENT_NOT_FOUND = -1;

    // 清除所有元素
    void clear();

    // 元素的数量
    int size();

    // 是否为空
    boolean isEmpty();

    // 是否包含某个元素
    boolean contains(E e);

    // 添加元素
    void add(E e);

    // 获取指定下标的元素
    E get(int index);

    // 设置指定下标的元素
    E set(int index, E e);

    // 在指定位置添加元素
    void add(int index, E e);

    // 移除指定下标的元素
    E remove(int index);

    // 获取某个元素的下标
    int indexOf(E e);


}
