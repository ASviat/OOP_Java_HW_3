package Task02;

import java.util.ArrayList;
import java.util.Iterator;

// Вам нужно реализовать один из выбранных интерфейсов 
// (Iterator<E>, Iterable<E>, Comparator<E>, Comparable<E>). 
// Вы можете выбрать любой интерфейс и предоставить свою собственную реализацию методов, соответствующих этому интерфейсу.

public class program extends DoseComparator {

    public static void main(String[] args) {

        Punished c1Punished = new Punished("Vasya", "Fentanil", "25");
        Punished c2Punished = new Punished("Valera", "Morfin", "200");

        ArrayList<Punished> myList=new ArrayList<>();
        myList.add(c1Punished);
        myList.add(c2Punished);

        Iterator<String> components1 = c1Punished;
        while (components1.hasNext()) {
            System.out.println(c1Punished.next());
        }
        System.out.println();
        Iterator<String> components2=c2Punished;
        while(components2.hasNext()){
            System.out.println(c2Punished.next());
        }

       myList.sort(new DoseComparator());
       System.out.println();

       System.out.printf("%s принял больше препарата, чем %s",myList.get(1).clientsName,myList.get(0).clientsName);
    }
}