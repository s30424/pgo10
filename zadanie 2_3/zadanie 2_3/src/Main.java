import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<Item> Predmety = new ArrayList<>();
        Predmety.add(new Item(525,"Dlugopis"));
        Predmety.add(new Item(42,"Ksiazka"));
        Predmety.add(new Item(575,"Kufel"));
        Predmety.add(new Item(458,"Kubek"));
        Predmety.add(new Item(242,"Tacka"));

        for (int i = 0; i < Predmety.size(); i++) {
            Predmety.get(i).show();

        }
        HashMap<Integer,String> map = new HashMap<>();
        for (Item item : Predmety) {
            map.put(item.identyfikator, item.nazwa);
        }
        for(Map.Entry<Integer,String> entry : map.entrySet())
            System.out.println("ID: " + entry.getKey() + " NAZWA: " + entry.getValue());
        ArrayList<Item> Predmety2 = new ArrayList<>();
            Predmety2.add(new Item(42556,"Tacka"));
            Predmety2.add(new Item(63,"Micro"));
            Predmety2.add(new Item(633,"GIga"));
            Predmety2.add(new Item(2,"Google"));
            Predmety2.add(new Item(21,"Yahoo"));
            Predmety2.add(new Item(12,"Yandex"));
            Predmety2.add(new Item(1,"Monket"));
            Predmety2.add(new Item(5,"Ukkrrrra"));
            Predmety2.add(new Item(423355,"Yessssss"));

            List<Item> Predmety3 = Predmety2.subList(0,4);
            HashSet<Item> items = new HashSet<>();
            for(Item item : Predmety3){
                items.add(item);
            }
        }
       }
