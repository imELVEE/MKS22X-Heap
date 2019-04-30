public class MyHeap{
  private static void pushDown(int[]data,int size,int index){
    int node = index+1;
    if (node*2 <= size){
      if (node*2+1 <= size){
        if (data[node*2] > data[node*2-1]){
          swap(data,index,node*2);
          pushDown(data,size,node*2);
        }
        else{
          swap(data,index,node*2-1);
          pushDown(data,size,node*2-1);
        }
      }
      else{
        swap(data,index,node*2);
        pushDown(data,size,node*2);
      }
    }
  }
  private static void swap(int[] data,int first, int second){
    int temp = data[first];
    data[first] = data[second];
    data[second] = temp;
  }
}
