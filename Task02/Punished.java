package Task02;


import java.util.Iterator;

public class Punished implements Iterator<String> {
    String clientsName;
    String drugTaken;
    String doseTaken;

    int index;

    @Override
    public boolean hasNext() {

        return index++ < 3;
    }

    @Override
    public String next() {
        switch (index) {
            case 1:
                return String.format("Имя: %s", clientsName);

            case 2:
                return String.format("Средство: %s", drugTaken);

            case 3:
                return String.format("Доза: %s мг", doseTaken);

        }
        return "-1";
    }

    

    public Punished(String clientsName, String drugTaken, String doseTaken) {
        this.clientsName = clientsName;
        this.drugTaken = drugTaken;
        this.doseTaken = doseTaken;
    }

   
}