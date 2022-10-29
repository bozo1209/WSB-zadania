package zjazd2.wyk1.zad13;

public class Dog extends Animal{

    public Dog(String name){
        super(name);
    }

    @Override
    public void voice() {
        System.out.println("new voice");
        super.voice();
    }
}
