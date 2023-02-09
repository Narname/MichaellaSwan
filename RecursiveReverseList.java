import java.util.LinkedList;

public record RecursiveReverseList() {

    static void reverse(LinkedList<Integer> l) 
    {
      if (l.size() == 0) {
         return;
      }
      else {
            Integer element = l.remove(0);
            reverse(l);
            l.add(element);
           }
      
   }
   public static void main(String[] args) {
      LinkedList<Integer> list = new LinkedList<>();
      list.add(1);
       list.add(2);
       list.add(3);
      list.add(4);
      System.out.println("Before reversing...");
      System.out.println(list);
      reverse(list);
      System.out.println("After reversing...");
      System.out.println(list);
   }

}
