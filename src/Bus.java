import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Bus extends Car implements Comparable {
    public int Seet_value;
    public int Stand_value;
    public Tipe tipes;



    public Bus() { }


    @Override
    public String StringView() {
        return String.format("%s\t%s\t%s\t%s\t%s\t%s\t%s",
                this.Marka,
                this.Model,
                this.Year,
                this.Max_speed,
                this.Seet_value,
                this.Stand_value,
                this.tipes);
    }


    @Override
    public void InputValue() {
        Scanner console = new Scanner(System.in);
        System.out.print("\nВведите марку автобуса: ");
        this.Marka = console.nextLine();
        System.out.print("Введите модель: ");
        this.Model = console.nextLine();
        System.out.print("Введите год выпуска: ");
        this.Year = Integer.parseInt(console.nextLine());
        System.out.print("Введите максимальную скорость: ");
        this.Max_speed = Integer.parseInt(console.nextLine());
        System.out.print("Введите количество сидячих мест : ");
        this.Seet_value = Integer.parseInt(console.nextLine());
        System.out.print("Введите общее количество мест: ");
        this.Stand_value = Integer.parseInt(console.nextLine());
        if(this.Seet_value > this.Stand_value)
        {
            System.out.println("Введено неверное число! Общее количество мест не должно быть меньше, чем сидячих");
            while(this.Seet_value > this.Stand_value)
            {
                System.out.print("Введите общее количество мест: ");
                this.Stand_value = Integer.parseInt(console.nextLine());
            }
        }
        System.out.print("Выберите тип автобуса (1-Городской, 2-Рейсовый, 3-Туристический): ");
        String choice = console.nextLine();
        if (Objects.equals(choice, "1")) this.tipes = Bus.Tipe.Городской;
        else if (Objects.equals(choice, "2")) this.tipes = Bus.Tipe.Рейсовый;
        else this.tipes = Bus.Tipe.Туристический;
    }

    @Override
    public int compareTo(Object o) {
        Bus temp = (Bus) o;
        return Integer.compare(this.Stand_value, temp.Stand_value);
    }

    enum Tipe {
        Городской,
        Рейсовый,
        Туристический
    }

    public static List Sort(int field, Main.sortDirections dir) {
        return new ArrayList();
    }
}
