package zjazd2.wyk1.zad13;

public class Animal {
    private String name;

    protected Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected void eat(){
        System.out.println("eat");
    }

    protected void voice(){
        System.out.println("voice");
    }
}
