package dsa.heaps.implementation;
//heap and heapsort insert
public class MaxHeap {
    private int size;
    private int maxSize;
    private int Heap[];

   public MaxHeap(int maxSize){
       this.maxSize=maxSize;
       this.Heap=new int[this.maxSize+1];
       size=0;
       Heap[0]=Integer.MAX_VALUE;
   }


   public void insert(int element){
      Heap[++size]=element;
      int i=size;
      while (i>1 && Heap[i/2]<Heap[i]){
          swap(i,i/2);
          i=i/2;
      }
   }


public void print(){
       for (int i=1;i<=size;i++){
           System.out.print(Heap[i]+" ");
       }
}

public void buildheap(){
       int j=(int)Math.floor(size/2.0);
       for (int i=j;i>=1;i--){
           maxHeapify(Heap,i);
       }
}

    private void maxHeapify(int[] heap, int i) {
if (isLeaf(i)){
    return;
}
int leftChild=2*i;
int rightChild=(2*i)+1;

if(rightChild<=size){
    if(Heap[i]>=Heap[leftChild] && Heap[i]>=Heap[rightChild]){
        return;
    }
}else {
    if (Heap[i]>=Heap[leftChild]){
        return;
    }
}

int largest;
if (leftChild<=size && Heap[leftChild]>Heap[i]){
largest=leftChild;
}else {
    largest=i;
}
if (rightChild<=size && heap[rightChild]>Heap[largest]){
    largest=rightChild;
}



if (largest!=i){
    swap(largest,i);
}
maxHeapify(heap,largest);


    }

    private void swap(int largest, int i) {
       int temp=Heap[largest];
       Heap[largest]=Heap[i];
       Heap[i]=temp;
    }

    private boolean isLeaf(int i) {
       if (i>(size/2) && i<=size){
           return true;
       }else {
           return false;
       }
    }

    public void heapSort(){
       buildheap();
       int heapLength=size;
       for (int i=size;i>=2;i--){
            swap(1,i);
           size--;
           maxHeapify(Heap,1);
       }
       size=heapLength;

    }


    public int extractMax(){

       if (size<1)
           System.out.println("heap empty");

       int max=Heap[1];
       Heap[1]=Heap[size];
       size--;
      maxHeapify(Heap,1);
      return max;
    }


    public void increaseKey(int i,int key){

       if (key<Heap[i])   // key should be increased value  as we are increasing key
           return;

       Heap[i]=key;

       while (i>1 && Heap[i/2]<Heap[i]){
           swap(i,i/2);
           i=i/2;

       }
    }


}
