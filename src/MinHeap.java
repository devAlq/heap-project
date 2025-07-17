


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
            System.arraycopy(heap, 0, newHeap, 0, heap.length);
            heap = newHeap;
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
    
    boolean isEmpty(){
        return count ==0;
    }



public int peak(){
    if(isEmpty()){
        return -1;
    }return heap[0];
}

public int extract(){
    int max = peak();
    if(max != -1){
        System.out.println("extract method: ");
        swap(count - 1, 0);
        count --;
        heapifyDown(0);
      
     
    }return max;
}

public void heapifyDown(int index){
    int leftChild = 2*index +1;
    int rightChild = 2*index +2;
    int largest = index;
    if(leftChild < count && heap[leftChild] < heap[largest]){
        largest = leftChild;
    }
    if(rightChild > count && heap[rightChild] > heap[largest]){
        largest = rightChild;
    }

    if(largest != index){
        swap(index, largest);
        heapifyDown(largest);
    }

    

}







    public static void main(String[] args) {
        MinHeap heapNums = new MinHeap(4);
        heapNums.ensureCapacity();
        int[] vals ={50, 42, 98, 20, 30};

        for(int x =0; x<vals.length ; x++){
            heapNums.insert(vals[x]);
        }System.out.println("Heap: ");
        for (int i = 0; i < heapNums.count; i++){
            System.out.print(heapNums.heap[i]+ " ");
       }
        System.out.println("heap peek: "+heapNums.peak());
        heapNums.extract();
        System.out.println("heap peek: "+ heapNums.peak());
        for (int i = 0; i < heapNums.count; i++){
            System.out.print(heapNums.heap[i]+ " ");
       }



        
        
        
        
     }
    }


