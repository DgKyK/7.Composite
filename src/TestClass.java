public class TestClass {
    public static void main(String[] args) {
        CompositPack backPack = new CompositPack("BackPack");
        Part pen = new Pen();
        Part pencil = new Pen();
        Part linage = new Linage();
        CompositPack penBox = new CompositPack("Pen-BOX");
        penBox.add(pen);
        penBox.add(pencil);
        penBox.add(linage);
        CompositPack myMeal = new CompositPack("My breakfast");
        backPack.add(penBox);
        backPack.add(myMeal);
        backPack.show();

    }
}
