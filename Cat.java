public class Cat extends Animal{

    static int countCat;
    String breed;

    public Cat(int run, int swim, String name, String breed) {
        super(run, swim, name);
        this.breed = breed;
        countCat++;
    }

    @Override
    void running(int runDistance) {
        if (runDistance < run) {
            System.out.println(name + " пробежал " + runDistance + " метров");
        } else {
            System.out.println(name + " не преодолел  дистанцию!");
        }
    }

    @Override
    void swimming(int swimDistance) {
        if (swimDistance <= swim) {
            System.out.println(name + " перепрыгнул преграду");
        }else{
            System.out.println(name + " не перепрыгнул преграду!!!");
        }
        System.out.println();
    }
}