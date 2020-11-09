public class Demo{
  public static void removeDuplicates(SuperArray s){
    for(int i = s.size()-1; i > 0; i--){
      if(s.indexOf(s.get(i)) != i){
        s.remove(i);
      }
    }
  }
}
