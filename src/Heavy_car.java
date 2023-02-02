import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Heavy_car extends Car implements Comparable {
    public int Gruz;
    public int osy;
    public Kuzov kuzov;



    public Heavy_car() { }


    @Override
    public String StringView() {
        return String.format("%s\t%s\t%s\t%s\t%s\t%s\t%s",
                this.Marka,
                this.Model,
                this.Year,
                this.Max_speed,
                this.Gruz,
                this.osy,
                this.kuzov);
    }


    @Override
    public void InputValue() {
        Scanner console = new Scanner(System.in);
        System.out.print("\nВведите марку нового грузового автомобиля: ");
        this.Marka = console.nextLine();
        System.out.print("Введите модель: ");
        this.Model = console.nextLine();
        System.out.print("Введите год выпуска: ");
        this.Year = Integer.parseInt(console.nextLine());
        System.out.print("Введите максимальную скорость: ");
        this.Max_speed = Integer.parseInt(console.nextLine());
        System.out.print("Введите грузоподъемность : ");
        this.Gruz = Integer.parseInt(console.nextLine());
        System.out.print("Введите количество осей (2 / 3): ");
        this.osy = Integer.parseInt(console.nextLine());
        if(this.osy != 2 && this.osy != 3)
        {
            System.out.println("Введено неверное число!");
            while(this.osy !=2 && this.osy != 3)
            {
                System.out.print("Введите количество осей (2 / 3): ");
                this.osy = Integer.parseInt(console.nextLine());
            }
        }
        System.out.print("Выберите тип кузова (1-Бортовой, 2-Самосвал, 3-Рефрижератор, 4-Фургон): ");
        String choice = console.nextLine();
        if (Objects.equals(choice, "1")) this.kuzov = Heavy_car.Kuzov.Бортовой;
        else if (Objects.equals(choice, "2")) this.kuzov = Heavy_car.Kuzov.Самосвал;
        else if (Objects.equals(choice, "3")) this.kuzov = Heavy_car.Kuzov.Рефрижератор;
        else this.kuzov = Heavy_car.Kuzov.Фургон;
    }

    @Override
    public int compareTo(Object o) {
        Heavy_car temp = (Heavy_car) o;
        return Integer.compare(this.Year, temp.Year);
    }

    enum Kuzov {
        Бортовой,
        Самосвал,
        Рефрижератор,
        Фургон
    }

    public static List Sort(int field, Main.sortDirections dir) {
        return new ArrayList();
    }
}
