import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Lite_car extends Car implements Comparable {

    public Types Type;
    public int Doors_value;
    public Type_pers Type_per;
    public Types_sort Type_sort;
    public String Color;


    public Lite_car() { }


    @Override
    public String StringView() {
        return String.format("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s",
                this.Marka,
                this.Model,
                this.Year,
                this.Max_speed,
                this.Type,
                this.Doors_value,
                this.Type_per,
                this.Color);
    }


    @Override
    public void InputValue() {
        Scanner console = new Scanner(System.in);
        System.out.print("\nВведите марку нового легковового автомобиля: ");
        this.Marka = console.nextLine();
        System.out.print("Введите модель: ");
        this.Model = console.nextLine();
        System.out.print("Введите год выпуска: ");
        this.Year = Integer.parseInt(console.nextLine());
        System.out.print("Введите максимальную скорость: ");
        this.Max_speed = Integer.parseInt(console.nextLine());
        System.out.print("Выберите тип корпуса (1-Универсал, 2-Хэчбэк, 3-Седан, 4-Минивен, 5-Джип): ");
        String choice = console.nextLine();
        if (Objects.equals(choice, "1")) this.Type = Types.Универсал;
        else if (Objects.equals(choice, "2")) this.Type = Types.Хэчбэк;
        else if (Objects.equals(choice, "3")) this.Type = Types.Седан;
        else if (Objects.equals(choice, "4")) this.Type = Types.Минивен;
        else this.Type = Types.Джип;
        System.out.print("Введите количество дверей : ");
        this.Doors_value = Integer.parseInt(console.nextLine());
        System.out.print("Выберите тип коробоки передач (1-Автомат, 2-Ручная): ");
        String choice1 = console.nextLine();
        if (Objects.equals(choice1, "1")) this.Type_per = Type_pers.Автомат;
        else this.Type_per = Type_pers.Ручная;
        System.out.print("Введите цвет: ");
        this.Color = console.nextLine();
    }

    @Override
    public int compareTo(Object o) {
        Scanner console = new Scanner(System.in);
        System.out.print("Выберите тип по какому атрибуту сортировать (1-Год, 2-Скорость, 3-Количество дверей): ");
        String choice = console.nextLine();
        Lite_car temp = (Lite_car) o;
        if (Objects.equals(choice, "1")) return Integer.compare(this.Year, temp.Year);
        else if (Objects.equals(choice, "2")) return Integer.compare(this.Max_speed, temp.Max_speed);
        else return Integer.compare(this.Doors_value, temp.Doors_value);
    }


    enum Types {
        Универсал,
        Хэчбэк,
        Седан,
        Минивен,
        Джип
    }
    enum Type_pers {
        Автомат,
        Ручная
    }

    enum Types_sort {
        Марка,
        Модель,
        Год,
        Скорость,
        Корпус,
        Двери,
        Передачи,
        Цвет
    }

    public static List Sort(int field, Main.sortDirections dir) {
        return new ArrayList();
    }
}
