public class Robot extends Animal {

    static int countRobot;
    String breed;

    public Robot(int run, int swim, String name, String breed) {
        super(run, swim, name);
        this.breed = breed;
        countRobot++;
    }



    @Override
    void running(int runDistance) {
        if (runDistance < run) {
            System.out.println(name + " спокойно пробежал " + runDistance + " метров");
        } else {
            System.out.println(name + " Сломался при испытании");
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