package programmer;

public class Programmer {

    String name;
    int age;

    public String drink(String drinkType){
        return " Пьет " + drinkType;
    }

    public static void main(String[] args){
        Programmer anna = new Programmer();
        anna.name = "Anna";

        Programmer natalia = new Programmer();
        natalia.name = "Natalia";

        System.out.println("Сейчас "+anna.name + anna.drink("кофе"));
        System.out.println("Сейчас "+natalia.name + natalia.drink("чай"));

    }

}