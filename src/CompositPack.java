import java.util.ArrayList;
import java.util.List;

public class CompositPack implements Component{
    private String name;
    private List<Component> composit;

    public CompositPack(String name) {
        this.name = name;
        this.composit = new ArrayList<>();
    }

    public void remove(Component componentToRemove) {
        this.composit.remove(componentToRemove);
    }

    public void add(Component componentToAdd) {
        this.composit.add(componentToAdd);
    }

    @Override
    public void show() {
        System.out.println("Pack : " + name + " size of Pack : " +  composit.size());
        for(Component current : composit) {
            current.show();
        }
    }
}
