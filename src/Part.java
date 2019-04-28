public abstract class Part implements Component {
    private String name;

    public Part(String name) {
        this.name = name;
    }

    @Override
    public void show() {
        System.out.println("      " + this.name + " is here!");
    }
}
