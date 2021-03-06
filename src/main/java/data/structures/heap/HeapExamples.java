package data.structures.heap;

import data.structures.bst.BSTExamples;
import utilities.ListNode;
import utilities.TreeNode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class HeapExamples {


  /**
   * 1.
   * Problem: k largest(or smallest) elements in an array | added Min Heap method.
   * Solution.
   * 1) Build a Min Heap MH of the first k elements (arr[0] to arr[k-1]) of the given array. O(k)
   * 2) For each element, after the kth element (arr[k] to arr[n-1]), compare it with root of MH.
   * a) If the element is greater than the root then make it root and call heapify for M
   * ……b) Else ignore it.
   * // The step 2 is O((n-k)*logk)
   * 3) Finally, MH has k largest elements and root of the MH is the kth largest element.
   */


  /**
   * 2.
   * Problem: Applications of Heap Data Structure.
   * 1. Priority Queues: Priority queues can be efficiently implemented using Binary Heap because it supports insert(),
   * delete() and extractmax(), decreaseKey() operations in O(logn) time. Binomoial Heap and Fibonacci Heap are variations
   * of Binary Heap. These variations perform union also in O(logn) time which is a O(n) operation in Binary Heap. Heap
   * Implemented priority queues are used in Graph algorithms like Prim’s Algorithm and Dijkstra’s algorithm.
   * 2. Order statistics: The Heap data structure can be used to efficiently find the kth smallest (or largest) element
   * in an array.
   */

  /**
   * 3.
   * Problem: Tournament Tree (Winner Tree) and Binary Heap.
   * Solution:
   */

  /**
   * 4.
   * Problem: Time Complexity of building a heap.
   * Solution:
   */

  /**
   * 5.
   * Problem: Median in a stream of integers (running integers).
   * Solution:
   */

  /**
   * 6.
   * Problem: Sort a nearly sorted (or K sorted) array.
   * Given an array of n elements, where each element is at most k away from its target position, devise
   * an algorithm that sorts in O(n log k) time
   * Solution: We can use Insertion Sort to sort the elements efficiently.
   * The inner loop will run at most k times. To move every element to its correct place, at most k elements
   * need to be moved. So overall complexity will be O(nk)
   */
  void insertionSort(int[] array) {
    int key, j;
    for (int i = 1; i < array.length; i++) {
      key = array[i];
      j = i - 1;
      while (j > 0 && array[j] > key) {
        array[j + 1] = array[j];
        j--;
      }
      array[j + 1] = key;
    }
  }


  /**
   * 7.
   * Problem: Sort numbers stored on different machines.
   * Solution:
   */

  /**
   * 8.
   * Problem: Design an efficient data structure for given operations.
   * Solution:
   */

  /**
   * 9.
   * Problem: Merge k sorted arrays | Set 1.
   * Solution:
   */

  /**
   * 10.
   * Problem: Connect n ropes with minimum cost.
   * Solution:
   */

  /**
   * 11.
   * Problem: Print all elements in sorted order from row and column wise sorted matrix.
   * Solution:
   */

  /**
   * 12.
   * Problem: Binary Heap.
   * Solution:
   */

  /**
   * 13.
   * Problem: Binomial Heap.
   * Solution:
   */

  /**
   * 14.
   * Problem: K&#8217;th Smallest/Largest Element in Unsorted Array | Set 1.
   * Solution:
   */

  /**
   * 15.
   * Problem: Where is Heap Sort used practically?.
   * Solution: Although QuickSort works better in practice, the advantage of HeapSort worst case upper bound of O(nLogn).
   * MergeSort also has upper bound as O(nLogn) and works better in practice when compared to HeapSort. But MergeSort
   * requires O(n) extra space HeapSort is not used much in practice, but can be useful in real time (or time bound where
   * QuickSort doesn’t fit) embedded systems where less space is available (MergeSort doesn’t fit)
   */

  /**
   * 16.
   * Problem: K&#8217;th largest element in a stream.
   * Solution:
   */

  /**
   * 17.
   * Problem: Why is Binary Heap Preferred over BST for Priority Queue?.
   * Solution:
   */

  /**
   * 18.
   * Problem: How to check if a given array represents a Binary Heap?.
   * Solution:
   */

  /**
   * 19.
   * Problem: Fibonacci Heap | Set 1 (Introduction).
   * Solution:
   */

  /**
   * 20.
   * Problem: Check if a given Binary Tree is Heap.
   * Solution:
   */

  /**
   * 21.
   * Problem: K-ary Heap.
   * Solution:
   */

  /**
   * 22.
   * Problem: Convert min Heap to max Heap.
   * Solution:
   */

  /**
   * 23.
   * Problem: Heap using STL C++.
   * Solution:
   */

  /**
   * 24.
   * Problem: Minimum sum of two numbers formed from digits of an array.
   * Solution:
   */

  /**
   * 25.
   * Problem: Sum of all elements between k1&#8217;th and k2&#8217;th smallest elements.
   * Solution:
   */

  /**
   * 26.
   * Problem: Array Representation Of Binary Heap.
   * Solution:
   */

  /**
   * 27.
   * Problem: Implementation of Binomial Heap.
   * Solution:
   */

  /**
   * 28.
   * Problem: Rearrange characters in a string such that no two adjacent are same.
   * Solution:
   */

  /**
   * 29.
   * Problem: Given level order traversal of a Binary Tree, check if the Tree is a Min-Heap.
   * Solution:
   */

  /**
   * 30.
   * Problem: Applications of Priority Queue.
   * Solution: A Priority Queue is different from a normal queue, because instead of being a “first-in-first-out”, values
   * come out in order by priority. It is an abstract data type that captures the idea of a container whose elements have
   * “priorities” attached to them.
   *
   * Dijkstra’s Shortest Path Algorithm using priority queue: When the graph is stored in the form of adjacency list or
   * matrix, priority queue can be used to extract minimum efficiently when implementing Dijkstra’s algorithm.
   * Prim’s algorithm: It is used to implement Prim’s Algorithm to store keys of nodes and extract minimum key node at every step.
   * Data compression : It is used in Huffman codes which is used to compresses data.
   * Heap Sort : Heap sort is typically implemented using Heap which is an implementation of Priority Queue.
   * Operating systems: It is also use in Operating System for load balancing (load balancing on server), interrupt handling.
   */

  /**
   * 31.
   * Problem: How to implement stack using priority queue or heap?.
   * Solution:
   */
  class StackPriority {


    int priority = 0;
    PriorityQueue<Element> priorityQueue = new PriorityQueue<>((Element e1, Element e2) -> e2.getCount() - e1.getCount());

    void push(int value) {
      priority++;
      priorityQueue.add(new Element(value, priority));
    }

    void pop() {
      if (!isEmpty()) {
        priority--;
        priorityQueue.poll();
      }
    }

    int top() {
      return priorityQueue.peek().getValue();
    }

    boolean isEmpty() {
      return priorityQueue.isEmpty();
    }
  }

  class Element {
    int count;
    int value;

    public Element(int count, int value) {
      this.count = count;
      this.value = value;
    }

    public void setCount(int count) {
      this.count = count;
    }

    public void setValue(int value) {
      this.value = value;
    }

    public int getValue() {
      return value;
    }

    public int getCount() {
      return count;
    }
  }

  /**
   * 32.
   * Problem: Merge two binary Max Heaps.
   * Solution:
   */


  /**
   * 33.
   * Problem: Convert BST to Min Heap.
   */
  TreeNode bstToMinHeap(TreeNode root) {
    return new BSTExamples().bstToMinHeap(root);
  }

  /**
   * 34.
   * Problem: Find k numbers with most occurrences in the given array.
   * Solution:
   */

  /**
   * 35.
   * Problem: Largest triplet product in a stream.
   * Solution:
   */




  /**
   * 1.
   * Problem: k largest(or smallest) elements in an array | added Min Heap method.
   * Solution:
   */

  /**
   * 2.
   * Problem: Applications of Heap Data Structure.
   * Solution:
   */

  /**
   * 3.
   * Problem: Tournament Tree (Winner Tree) and Binary Heap.
   * Solution:
   */

  /**
   * 4.
   * Problem: Time Complexity of building a heap.
   * Solution:
   */

  /**
   * 5.
   * Problem: Median in a stream of integers (running integers).
   * Solution:
   */

  /**
   * 6.
   * Problem: Sort a nearly sorted (or K sorted) array.
   * Solution:
   */

  /**
   * 7.
   * Problem: Sort numbers stored on different machines.
   * Solution:
   */

  /**
   * 8.
   * Problem: Design an efficient data structure for given operations.
   * Solution:
   */

  /**
   * 9.
   * Problem: Heap Sort.
   * Solution:
   */

  /**
   * 10.
   * Problem: Merge k sorted arrays | Set 1.
   * Solution:
   */

  /**
   * 11.
   * Problem: Connect n ropes with minimum cost.
   * Solution:
   */

  /**
   * 12.
   * Problem: Print all elements in sorted order from row and column wise sorted matrix.
   * Solution:
   */

  /**
   * 13.
   * Problem: Binary Heap.
   * Solution:
   */

  /**
   * 14.
   * Problem: Binomial Heap.
   * Solution:
   */

  /**
   * 15.
   * Problem: K&#8217;th Smallest/Largest Element in Unsorted Array | Set 1.
   * Solution:
   */

  /**
   * 16.
   * Problem: Where is Heap Sort used practically?.
   * Solution:
   */

  /**
   * 17.
   * Problem: K&#8217;th largest element in a stream.
   * Solution:
   */

  /**
   * 18.
   * Problem: Why is Binary Heap Preferred over BST for Priority Queue?.
   * Solution:
   */

  /**
   * 19.
   * Problem: How to check if a given array represents a Binary Heap?.
   * Solution:
   */

  /**
   * 20.
   * Problem: Fibonacci Heap | Set 1 (Introduction).
   * Solution:
   */

  /**
   * 21.
   * Problem: Check if a given Binary Tree is Heap.
   * Solution:
   */

  /**
   * 22.
   * Problem: K-ary Heap.
   * Solution:
   */

  /**
   * 23.
   * Problem: Convert min Heap to max Heap.
   * Solution:
   */

  /**
   * 24.
   * Problem: Heap in C++ STL | make_heap(), push_heap(), pop_heap(), sort_heap(), is_heap, is_heap_until().
   * Solution:
   */

  /**
   * 25.
   * Problem: Minimum sum of two numbers formed from digits of an array.
   * Solution:
   */

  /**
   * 26.
   * Problem: Sum of all elements between k1&#8217;th and k2&#8217;th smallest elements.
   * Solution:
   */

  /**
   * 27.
   * Problem: Array Representation Of Binary Heap.
   * Solution:
   */

  /**
   * 28.
   * Problem: Implementation of Binomial Heap.
   * Solution:
   */

  /**
   * 29.
   * Problem: Rearrange characters in a string such that no two adjacent are same.
   * Solution:
   */

  /**
   * 30.
   * Problem: Given level order traversal of a Binary Tree, check if the Tree is a Min-Heap.
   * Solution:
   */

  /**
   * 31.
   * Problem: Applications of Priority Queue.
   * Solution:
   */

  /**
   * 32.
   * Problem: How to implement stack using priority queue or heap?.
   * Solution:
   */

  

  /**
   * 33.
   * Problem: Merge two binary Max Heaps.
   */
  void mergeTwoMaxHeaps(int[] maxHeap1, int[] maxHeap2) {
    int[] maxHeap = new int[maxHeap1.length + maxHeap2.length];
    System.arraycopy(maxHeap1, 0, maxHeap, 0, maxHeap1.length);
    System.arraycopy(maxHeap2, 0, maxHeap, maxHeap1.length, maxHeap2.length);
    for (int i = maxHeap.length / 2 - 1; i >= 0; i--) maxHeapify(maxHeap, i);
    for (int i : maxHeap) {
      System.out.print(i + " ");
    }
  }

  private void maxHeapify(int[] array, int i) {
    if (i < array.length) {
      int left = 2 * i + 1;
      int right = 2 * i + 2;
      int max;
      if (left < array.length && array[left] > array[i]) max = left;
      else max = i;
      if (right < array.length && array[right] > array[i]) max = right;
      if (max != i) {
        swapNode(array, max, i);
        maxHeapify(array, max);
      }
    }
  }

  private void swapNode(int[] array, int x, int y) {
    int temp = array[x];
    array[x] = array[y];
    array[y] = temp;
  }


  /**
   * 34.
   * Problem: Convert BST to Min Heap.
   * Solution:
   */

  /**
   * 35.
   * Problem: Find k numbers with most occurrences in the given array.
   * Solution:
   */

  /**
   * 36.
   * Problem: Largest triplet product in a stream.
   * Given a stream of integers represented as arr[]. For each index i from 0 to n-1, print the
   * multiplication of largest, second largest, third largest element of the subarray arr[0…i]. If i < 2 print -1
   */
  void tripletProduct(int[] array, int k) {
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    int product = 1;
    for (int i = 0; i < k; i++) {
      minHeap.add(array[i]);
      product *= array[i];
      if (i < k -1) System.out.println(-1);
      else System.out.println(product);
    }

    for (int i = k; i < array.length; i++) {
      if (minHeap.peek() < array[i]) {
        product /= minHeap.poll();
        product *= array[i];
        minHeap.add(array[i]);
        System.out.println(product);
      }
    }
  }

  /**
   * 37.
   * Problem: Merge k sorted linked lists | Set 2 (Using Min Heap).
   */
  ListNode mergeKLists(ListNode[] lists) {
    ListNode head = null, tail = null;
    PriorityQueue<ListNode> queue = new PriorityQueue<>(lists.length, (ListNode listNode1, ListNode listNode2) -> (listNode1.data - listNode2.data));
    for (ListNode list : lists) if (list != null) queue.add(list);
    while (!queue.isEmpty()) {
      ListNode top = queue.poll();
      if (top.next != null) queue.add(top.next);
      if (head == null) {
        head = top;
        tail = top;
      } else {
        tail.next = top;
        tail = tail.next;
      }
    }
    return head;
  }

  /**
   * 38.
   * Problem: Median of Stream of Running Integers using STL.
   * Solution:
   */

  /**
   * 39.
   * Problem: Leftist Tree / Leftist Heap.
   * Solution:
   */

  /**
   * 40.
   * Problem: std::make_heap() in C++ STL.
   * Solution:
   */

  /**
   * 41.
   * Problem: Adding elements of an array until every element becomes greater than or equal to k.
   * Solution:
   */

  /**
   * 42.
   * Problem: Print all nodes less than a value x in a Min Heap..
   * Solution:
   */

  /**
   * 43.
   * Problem: K-th Largest Sum Contiguous Subarray.
   * Solution:
   */

  /**
   * 44.
   * Problem: Minimum product of k integers in  an array of positive Integers.
   */
  int minKProduct(int[] array, int k) {
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(k, (x, y) -> y - x);
    for (int i = 0; i < k; i++) maxHeap.add(array[i]);
    for (int i = k; i < array.length; i++) {
      if (maxHeap.peek() > array[i]) {
        maxHeap.poll();
        maxHeap.add(array[i]);
      }
    }
    int product = 1;
    while (!maxHeap.isEmpty()) product *= maxHeap.poll();
    return product;
  }

}
