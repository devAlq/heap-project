


import java.util.ArrayList;

public class MinHeap{
    int[] heap;
    int count = 0;
    MinHeap(int i){
        this.heap = new int[i];
    }
    public void insert(int value){
        ensureCapacity();
        heap[count++] = value;
        heapifyUp(count-1);
    }
    public void ensureCapacity(){
        if(count == heap.length){
            int[] newHeap = new int[heap.length * 2];
            System.arraycopy(newHeap, 0, newHeap, 0, 0);
        }}
    public void heapifyUp(int index){
        int parent = (index -1) /2;
        while(index > 0 && heap[index] < heap[parent]){
            swap(index, parent);
            index = parent;
            heapifyUp(index);
        }
    }
    public void swap(int i, int j){
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }
    public int peek(){
        if(count == 0){
            return-1;
        }return heap[0];
    
    
    }
    boolean isEmpty(){
        return count ==0;
    }

public void delete(int value){
   if (isEmpty()){
       System.out.println("the heap is empty ");
       return;
   }
   int index = -1;
   for(int i =0; i<count;i++){
        if(heap[i] == value){
            index = i;
            break;
        }

   }

   if(index == -1){
    System.out.println("heap not found");
   }
   heap[index] = heap[--count];
   int[] newHeap = new int[heap.length -1];
   System.arraycopy(heap, 0, newHeap, 0, count);
   heap = newHeap;
   heapifyDown(index);
   System.out.println("Number "+ value+ " has been deleted");




}
public int peak(){
    if(isEmpty()){
        return -1;
    }return heap[0];
}

public int extract(){
    int max = peek();
    if(max != -1){
        System.out.println("extract method: ");
        delete(heap[0]);
    }return max;
}

public void heapifyDown(int index){
    int leftChild = 2*index +1;
    int rightChild = 2*index +2;
    int largest = index;
    if(leftChild < count && heap[leftChild] > heap[largest]){
        largest = leftChild;
    }
    if(rightChild < count && heap[rightChild] > heap[largest]){
        largest = rightChild;
    }

    if(largest != index){
        swap(index, largest);
        heapifyDown(largest);
    }

    

}







    public static void main(String[] args) {
        MinHeap heapNums = new MinHeap(6);
        int[] vals ={20,15,13,5,8,10};
        for(int x =0; x<6; x++){
            heapNums.insert(vals[x]);
        }System.out.println("Heap: ");
        for(int element : heapNums.heap){
            System.out.print(element+ " ");
       }
        System.out.println("heap peek: "+heapNums.peak());
        heapNums.extract();
        System.out.println("heap peek: "+ heapNums.peak());
         for(int element : heapNums.heap){
            System.out.print(element+ " ");
       }



        
        
        
        
     }
}


