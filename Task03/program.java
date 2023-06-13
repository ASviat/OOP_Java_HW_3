package Task03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Написать функцию, которая принимает список объектов и 
// компаратор для сортировки объектов по заданному критерию. 
// Вы должны возвращать отсортированный список объектов. 
// Это может быть реализовано, например, с использованием метода Collections.sort() и переданного компаратора.
public class program {

    public static void main(String[] args) {
        ArrayList<Pen> myArray = new ArrayList<>(
                List.of(new Pen("Parker", 15, 100), new Pen("Berlingo", 16, 10), new Pen("Daryish", 20, 150)));
        myArray.sort(new PriceComparator());

        Collections.sort(myArray, new PriceComparator());

        System.out.println(myArray.toString());
    }
}