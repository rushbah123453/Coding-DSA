package dsa.heaps.implementation;

import java.util.Arrays;

// here heap is implemented from index 0
public class MinHeap {
    private int capacity;
    private int size;
    private int[] items;

    public MinHeap(int capacity) {
        this.items = new int[capacity];
    }

    private int getLeftChildIndex(int parentIndex) {
        return 2 * parentIndex + 1;
    }

    private int getRightChildIndex(int parentIndex) {
        return 2 * parentIndex + 2;
    }

    private int getParentIndex(int childIndex) {
        return (childIndex - 1) / 2;
    }

    private boolean hasLeftChild(int parentIndex) {
        return getLeftChildIndex(parentIndex) < size;
    }

    private boolean hasRightChild(int parentIndex) {
        return getRightChildIndex(parentIndex) < size;
    }

    private boolean hasParent(int childIndex) {
        return getParentIndex(childIndex) >= 0;
    }

    private int leftChildValue(int index) {
        return items[getLeftChildIndex(index)];
    }

    private int rightChildValue(int index) {
        return items[getRightChildIndex(index)];
    }

    private int parentValue(int index) {
        return items[getParentIndex(index)];
    }

    private void ensureExtraCapacity() {
        if (size == capacity) {
            items = Arrays.copyOf(items, capacity * 2);
            capacity *= 2;
        }
    }

    public int peek() {
        if (size == 0) throw new IllegalStateException();
        return items[0];
    }

    public int poll() {
        if (size == 0) throw new IllegalStateException();
        int item = items[0];
        items[0] = items[size - 1];
        size--;
        heapifyDown();
        return item;
    }

    public void add(int item) {
        ensureExtraCapacity();
        items[size++] = item;
        heapifyUp();
    }

    private void heapifyDown() {
        int index = 0;
        while (hasLeftChild(index)) {
            int smallerChildIndex = getLeftChildIndex(index);
            if (hasRightChild(index) && leftChildValue(index) < rightChildValue(index)) {
                smallerChildIndex = getRightChildIndex(index);
            }
            if(items[smallerChildIndex] < items[index]) {
                swap(index, smallerChildIndex);
            } else {
                break;
            }
            index = smallerChildIndex;
        }
    }

    public void heapifyUp() {
        int index = size - 1;
        while (hasParent(index) && items[index] < parentValue(index)) {
            swap(index, getParentIndex(index));
            index = getParentIndex(index);
        }
    }

    private void swap(int itemIndex, int parentIndex) {
        int temp = items[itemIndex];
        items[itemIndex] = items[parentIndex];
        items[parentIndex] = temp;
    }
}
