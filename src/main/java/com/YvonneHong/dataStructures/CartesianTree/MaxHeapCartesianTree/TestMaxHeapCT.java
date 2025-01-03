package com.YvonneHong.dataStructures.CartesianTree.MaxHeapCartesianTree;

public class TestMaxHeapCT {

    public static void main(String[] args) {
        // Create a MaxHeapCT instance
        MaxHeapCT heap = new MaxHeapCT();

        // Test insertions
        System.out.println("Inserting values: 20, 15, 30, 10, 25...");
        heap.insert(20);
        heap.insert(15);
        heap.insert(30);
        heap.insert(10);
        heap.insert(25);

        // Print the tree after insertion
        System.out.println("Heap after insertion:");
        heap.printTree();

        // Test peek (should return the maximum value, which is 30)
        System.out.println("Peek (max value): " + heap.peek());

        // Test popMax (should return and remove the maximum value, which is 30)
        System.out.println("Pop Max: " + heap.popMax());

        // Print the tree after popping the max value
        System.out.println("Heap after popping max value:");
        heap.printTree();

        // Test delete method
        System.out.println("Deleting value 15...");
        heap.delete(15);

        // Print the tree after deletion
        System.out.println("Heap after deleting value 15:");
        heap.printTree();

        // Test size method
        System.out.println("Size of heap: " + heap.size());

        // Test popping all elements to empty the heap
        System.out.println("Popping all elements:");
        while (heap.size() > 0) {
            System.out.println("Pop Max: " + heap.popMax());
            heap.printTree();
        }
    }
}


