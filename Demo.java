public class Demo{
  public static void removeDuplicates(SuperArray s){
    for(int i = s.size()-1; i > 0; i--){
      if(s.indexOf(s.get(i)) != i){
        s.remove(i);
      }
    }
  }

  public static SuperArray findOverlap(SuperArray a, SuperArray b){
    SuperArray result = new SuperArray();
    for(int i = 0; i < a.size(); i++){
      if(b.contains(a.get(i))){
        result.add(a.get(i));
      }
    }
    removeDuplicates(result);
    return result;
  }

  public static SuperArray zip(SuperArray a, SuperArray b){
    SuperArray result = new SuperArray(a.size() + b.size());
    for (int i = 0; i < Math.max(a.size(), b.size()); i++) {
      if(i < a.size()){
        result.add(a.get(i));
      }
      if(i < b.size()){
        result.add(b.get(i));
      }
    }
    return result;
  }

  public static void main(String[] args) {
    SuperArray words = new SuperArray();
    SuperArray words2 = new SuperArray();
    words.add("kani");
    words.add("uni");
    words.add("ebi");
    words.add("una");
    words.add("una");
    words.add("ebi");
    words.add("kani");
    words.add("una");
    words.add("una");
    words.add("ebi");
    words.add("toro");
    words2.add("noop");
    words2.add("kani");
    words2.add("noop");
    words2.add("kani");
    words2.add("una");
    words2.add("ebi");
    words2.add("ebi");
    System.out.println(words);
    removeDuplicates(words);
    System.out.println(words);
    System.out.println(words2);
    System.out.println(findOverlap(words, words2).toString());
    System.out.println("zip testing");
    System.out.println(words);
    System.out.println(words2);
    System.out.println(zip(words, words2).toString());
  }
}
