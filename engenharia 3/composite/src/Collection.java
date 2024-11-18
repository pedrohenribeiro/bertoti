import java.util.List;
import java.util.ArrayList;

class Collection implements Item {
    private String name;
    private List<Item> items = new ArrayList<>();

    public Collection(String name) {
        this.name = name;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    @Override
    public void showDetails() {
        System.out.println("Coleção: " + name);
        for (Item item : items) {
            item.showDetails();
        }
    }
}
