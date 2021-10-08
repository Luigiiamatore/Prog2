import java.util.List;
import java.util.LinkedList;

public class Liste {
    public static void main(String[] args) {
        List lista = new LinkedList();
        for (int i = 0; i <= 10; i++)
            lista.add(Integer.valueOf(i));

        int somma = 0;
        for (Object v: lista)
            somma += ((Integer)v).intValue();
        
        System.out.println(somma);
    }
}
