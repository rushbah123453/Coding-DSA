package practise.heap;

public class MaxHeap {

    private int size;
    private int maxSize;
    private int heap[];

    public MaxHeap(int maxSize){
        this.maxSize=maxSize;
        heap=new int[this.maxSize+1];
        this.size=0;
        heap[0]=Integer.MAX_VALUE;
    }


    public void insert(int element){
           heap[++size]=element;
  }

  public void buildHeap(){
        int j=(int)Math.floor(size/2);
        for (int i=j;i>=1;i--){
            maxHeapify(heap,i);
        }
  }

    private void maxHeapify(int[] heap, int i) {
        if (leaf(i)){
            return;
        }
        int leftChild=(2*i);
        int rightChild=(2*i)+1;
        if (rightChild<=size){
            if (heap[i]>=heap[leftChild] && heap[i]>=heap[rightChild]){
                return;
            }
        }else {
            if (heap[i]>=heap[leftChild]){
                return;
            }
        }

        int largest;
        if (leftChild<=size && heap[i]<heap[leftChild]){
            largest=leftChild;
        }else {
            largest=i;
        }
        if(rightChild<=size && heap[largest]<heap[rightChild]){
            largest=rightChild;
        }

        if (largest!=i){
            swap(largest,i);
        }

        maxHeapify(heap,largest);

    }

    private void swap(int largest, int i) {
        int temp=heap[largest];
        heap[largest]=heap[i];
        heap[i]=temp;
    }

    private boolean leaf(int i) {
        if (i>(size/2)){
            return true;
        }else {
            return false;
        }
    }

    public void print(){
        for (int i=1;i<=maxSize;i++){
            System.out.print(heap[i]+" ");
        }
    }


    public  void heapSort(){
        buildHeap();
        int length=size;
        for (int i=length;i>=2;i--){
            swap(1,i);
            size--;
            maxHeapify(heap,1);
        }
        size=length;
    }

}
