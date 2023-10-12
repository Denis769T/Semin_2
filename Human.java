public class Human extends Animal {
    static int countRobot;
    String breed;

    public Human(int run, int swim, String name, String breed) {
        super(run, swim, name);
        this.breed = breed;
        count++;
    }



    @Override
    void running(int runDistance) {
        if (runDistance < run) {
            System.out.println(name + " спокойно пробежал " + runDistance + " метров");
        } else {
            System.out.println(name + " не преодолел сухопутную дистанцию.");
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