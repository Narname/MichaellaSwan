
import java.util.LinkedList;
class ListFactorial {
    public void run(LinkedList<Integer> list) {

       // цикл для массива , list.size - длина массива
       // for each (method) пройти по массиву 
       
        for(Integer i:list){
            int h = 1;
                for(int k = 1; k <= i; k++) { // счет цифры до самого числа
        
                    h = k*h;
                        

        }
        System.out.println(h);
      }
  }
}

public class Main {
    public static void main() {

        LinkedList<Integer> list = new LinkedList<Integer>();
    list.add(5);
    list.add(3);
    list.add(7);




//link of the objece         the object
ListFactorial lf = new ListFactorial();
lf.run(list);

LinkedList<Integer> list1 = new LinkedList<Integer>();
list.add(1);

lf.run(list1);

    }
}


