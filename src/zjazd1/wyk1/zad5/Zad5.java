package zjazd1.wyk1.zad5;

public class Zad5 {
    public static void main(String[] args) {
        int age = 5;
        String animal = "dog";

        System.out.printf("you are %s %s", oldOrYoung(age), animalType(animal));

    }

    private static String oldOrYoung(int age){
        return age > 8 ? "old" : "young";
    }

    private static String animalType(String animal){
        return switch (animal.toUpperCase()){
            case "DOG" -> "dog";
            case "CAT" -> "cat";
            default -> "";
        };
    }
}
