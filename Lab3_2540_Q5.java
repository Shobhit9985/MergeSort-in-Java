/*
Algorithm merge(A, B)
Input seq. a and b with n/2 elements each
  Output result = sorted sequence of a or b
  result <- empty sequence
   while (a.isEmpty() != true and b.isEmpty() != true)
    if (b.getFirst() < a.getFirst())
        result.enqueue(b.dequeue());
    else
        result.enqueue(a.dequeue());

    while (a.isEmpty() != true)
        result.enqueue(a.dequeue());

    while (b.isEmpty() != true)
        result.enqueue(b.dequeue());

    return result;



Algorithm mergeSort(Lab2_2540_Q5 input)

Input queue input
Output queue in ascending order as per mergesort
 
 if (input.size() == 1) 

    Lab2_2540_Q5 result = new Lab2_2540_Q5();
    result.enqueue(input.dequeue());
    return result;
        
else 
    int halfSize = input.size() / 2;

Lab2_2540_Q5 firstHalf = new Lab2_2540_Q5();

for (int i = 0; i < halfSize; i++)
    firstHalf.enqueue(input.dequeue());

Lab2_2540_Q5 secondHalf = input;

return merge(mergeSort(firstHalf), mergeSort(secondHalf));

  
 */

public class Lab3_2540_Q5 {

    public static Lab2_2540_Q5 merge(Lab2_2540_Q5 a, Lab2_2540_Q5 b) {

        Lab2_2540_Q5 result = new Lab2_2540_Q5();

        while (a.isEmpty() != true && b.isEmpty() != true) {

            if (b.getFirst() < a.getFirst())
                result.enqueue(b.dequeue());
            else
                result.enqueue(a.dequeue());
        }
        while (a.isEmpty() != true)
            result.enqueue(a.dequeue());

        while (b.isEmpty() != true)
            result.enqueue(b.dequeue());

        return result;
    }

    public static Lab2_2540_Q5 mergeSort(Lab2_2540_Q5 input) {

        if (input.size() == 1) {

            Lab2_2540_Q5 result = new Lab2_2540_Q5();
            result.enqueue(input.dequeue());
            return result;
        } else {
            int halfSize = input.size() / 2;
            Lab2_2540_Q5 firstHalf = new Lab2_2540_Q5();
            for (int i = 0; i < halfSize; i++)
                firstHalf.enqueue(input.dequeue());
            Lab2_2540_Q5 secondHalf = input;
            return merge(mergeSort(firstHalf), mergeSort(secondHalf));
        }
    }

    public static void main(String[] args) {
        Lab2_2540_Q5 que = new Lab2_2540_Q5();
        int B = 0;
        QNode A = new QNode(B);

        que.enqueue(10);
        que.enqueue(9);
        que.enqueue(8);
        que.enqueue(7);
        que.enqueue(6);
        que.enqueue(5);
        que.enqueue(4);
        que.enqueue(3);
        que.enqueue(2);
        que.enqueue(1);

        System.out.println("The input queue is :");
        que.show(A);

        que.size();

        Lab2_2540_Q5 result = mergeSort(que);

        System.out.println("The output after mergesort is :");

        result.show(A);

        Lab2_2540_Q5 que1 = new Lab2_2540_Q5();
        int C = 0;
        QNode A1 = new QNode(C);

        que1.enqueue(1);
        que1.enqueue(2);
        que1.enqueue(3);
        que1.enqueue(4);
        que1.enqueue(5);
        que1.enqueue(6);
        que1.enqueue(7);
        que1.enqueue(8);
        que1.enqueue(9);
        que1.enqueue(10);

        System.out.println("The input queue is :");
        que1.show(A1);

        que1.size();

        Lab2_2540_Q5 result1 = mergeSort(que1);

        System.out.println("The output after mergesort is :");

        result1.show(A1);

    }

}

// Worst case O(nlogn)
// Best case O(nlogn)
// because
// The height h of the merge-sort tree is O(log n) and The overall amount or
// work done at the nodes is O(n)
