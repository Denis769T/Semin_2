public abstract class Animal {
    int run;
    int swim;
    String name;
    public static int count;

    public Animal(int run, int swim, String name) {
        this.run = run;
        this.swim = swim;
        this.name = name;
        count++;
    }
    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getSwim() {
        return swim;
    }

    public void setSwim(int swim) {
        this.swim = swim;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Animal.count = count;
    }

    abstract void running(int runDistance);
    abstract void swimming(int swimDistance);

}