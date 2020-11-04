public class SuperArray{
  private String [] data;
  private int size;

  public SuperArray(){
    size = 0;
    data = new String[10];
  }

  public SuperArray(int initialCapacity){
    size = 0;
    data = new String[initialCapacity];
  }

  public int size(){
    return size;
  }

  public boolean add(String element){
    if(data.length == size){
      resize();
    }
    data[size] = element;
    size += 1;
    return true;
  }

  public String get(int index){
    return data[index];
  }

  public String set(int index, String element){
    String holder = data[index];
    data[index] = element;
    return holder;
  }

  private void resize(){
    String[] holder = new String[data.length + 10];
    for(int i = 0; i < size; i++){
      holder[i] = data[i];
    }
    data = holder;
  }

  public boolean isEmpty(){
    return size == 0;
  }

  public void clear(){
    data = new String[10];
    size = 0;
  }

  public String toString(){
    if(size == 0){
      return "[]";
    }
    String result = "[" + data[0];
    for(int i = 1; i < size; i++){
      result += ", " + data[i];
    }
    result += "]";
    return result;
  }

  public boolean contains(String s){
    for(int i = 0; i < size; i++){
      if(s.equals(data[i])){
        return true;
      }
    }
    return false;
  }

}
