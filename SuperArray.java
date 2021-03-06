public class SuperArray{
  private String [] data;
  private int size;

  public SuperArray(){
    size = 0;
    data = new String[10];
  }

  public SuperArray(int initialCapacity){
    if(initialCapacity < 0){
      throw new IllegalArgumentException("initialCapacity " + initialCapacity + " cannot be negative.");
    }
    size = 0;
    data = new String[initialCapacity];
  }

  public int size(){
    return size;
  }

  public boolean add(String element){
    if(data.length == size+1){
      resize();
    }
    data[size] = element;
    size += 1;
    return true;
  }

  public void add(int index, String element){
    if(index < 0 || index > size){
      throw new IndexOutOfBoundsException("index " + index + " is out of bounds.");
    }
    if(data.length == size+1){
      resize();
    }
    for(int i = size; i >= index; i--){
      data[i + 1] = data[i];
    }
    data[index] = element;
    size += 1;
  }

  public String get(int index){
    if(index < 0 || index >= size){
      throw new IndexOutOfBoundsException("index " + index + " is out of bounds.");
    }
    return data[index];
  }

  public String set(int index, String element){
    if(index < 0 || index >= size){
      throw new IndexOutOfBoundsException("index " + index + " is out of bounds.");
    }
    String holder = data[index];
    data[index] = element;
    return holder;
  }

  public String remove(int index){
    if(index < 0 || index >= size){
      throw new IndexOutOfBoundsException("index " + index + " is out of bounds.");
    }
    String holder = data[index];
    for(int i = index; i < size; i++){
      data[i] = data[i + 1];
    }
    size -= 1;
    return holder;
  }

  public int indexOf(String s){
    for(int i = 0; i < size; i++){
      if(data[i].equals(s)){
        return i;
      }
    }
    return - 1;
  }

  private void resize(){
    String[] holder = new String[data.length * 2];
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

  public String[] toArray(){
    String[] result = new String[size];
    for(int i = 0; i < size; i++){
      result[i] = data[i];
    }
    return result;
  }

  public int lastIndexOf(String value){
    for(int i = size-1; i >= 0; i--){
      if(data[i].equals(value)){
        return i;
      }
    }
    return - 1;
  }

  public boolean equals(SuperArray other){
    for (int i = 0; i < size; i++) {
      if(!data[i].equals(other.get(i))){
        return false;
      }
    }
    return true;
  }

}
