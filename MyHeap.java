public class MyHeap{
  public static void pushDown(int[]data,int size,int index){
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

  public static void pushUp(int[]data,int index){
    int node = index+1;
    if (node != 1 && data[index] > data[node/2-1]){
      swap(data,index,node/2-1);
      pushUp(data,node/2-1);
    }
  }

  
}
