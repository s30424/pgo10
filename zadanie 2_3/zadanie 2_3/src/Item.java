public class Item {
    public int identyfikator;
    public String nazwa;

    public Item(int identyfikator, String nazwa) {
        this.identyfikator = identyfikator;
        this.nazwa = nazwa;
    }
    public void show() {
        System.out.println(nazwa);
    }
}
