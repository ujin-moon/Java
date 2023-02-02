import java.util.*;

public class Main {

    public static enum sortDirections {}

    public static void main(String[] args) {

        ArrayList<Car> items = new ArrayList<>();

        Scanner console = new Scanner(System.in);
        System.out.print("\nДобавить машину? (1-Да, 2-Нет): ");

        // Ввод данных
        while (console.nextInt() == 1) {
            console = new Scanner(System.in);
            System.out.print("Выберите тип машины (1-Легковая, 2-Грузовик, 3-Автобус): ");
            String choice = console.nextLine();
            if (Objects.equals(choice, "1")) {
                Lite_car lite = new Lite_car();
                lite.InputValue();
                items.add(lite);
            }
            else if (Objects.equals(choice, "2")) {
                Heavy_car heavy = new Heavy_car();
                heavy.InputValue();
                items.add(heavy);
            }
            else {
                Bus bus = new Bus();
                bus.InputValue();
                items.add(bus);
            }
            System.out.print("\nДобавить новую машину? (1-Да, 2-Нет): ");
        }
        System.out.println("\n\n");

        // Вывод отсортированных легковых
        ArrayList<Lite_car> temp_lite = new ArrayList<>();
        for (Car f : items) {
            try { temp_lite.add((Lite_car) f); }
            catch (ClassCastException ignored) {  }
        }
        for (Lite_car c : SortLite_cars(temp_lite))
            System.out.println(c.StringView());

        // Вывод отсортированных грузовых
        ArrayList<Heavy_car> temp_heavy = new ArrayList<>();
        for (Car f : items) {
            try { temp_heavy.add((Heavy_car) f); }
            catch (ClassCastException ignored) {  }
        }
        for (Heavy_car t : SortHeavy_cars(temp_heavy))
            System.out.println(t.StringView());

        // Вывод отсортированных автобусов
        ArrayList<Bus> temp_bus = new ArrayList<>();
        for (Car f : items) {
            try { temp_bus.add((Bus) f); }
            catch (ClassCastException ignored) {  }
        }
        for (Bus l : SortBus(temp_bus))
            System.out.println(l.StringView());

    }


    // Сортировка легковых машин
    private static ArrayList<Lite_car> SortLite_cars(ArrayList<Lite_car> array) {
        boolean isSorted = false;
        Lite_car buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.size() - 1; i++) {
                if (array.get(i).compareTo(array.get(i + 1)) > 0){
                    isSorted = false;

                    buf = array.get(i);
                    array.set(i, array.get(i + 1));
                    array.set(i + 1, buf);
                }
            }
        }
        return array;
    }


    // Сортировка грузовых автомобилей
    private static ArrayList<Heavy_car> SortHeavy_cars(ArrayList<Heavy_car> array) {
        boolean isSorted = false;
        Heavy_car buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.size() - 1; i++) {
                if (array.get(i).compareTo(array.get(i + 1)) > 0){
                    isSorted = false;

                    buf = array.get(i);
                    array.set(i, array.get(i + 1));
                    array.set(i + 1, buf);
                }
            }
        }
        return array;
    }


    // Сортировка автобусов
    private static ArrayList<Bus> SortBus(ArrayList<Bus> array) {
        boolean isSorted = false;
        Bus buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.size() - 1; i++) {
                if (array.get(i).compareTo(array.get(i + 1)) > 0){
                    isSorted = false;

                    buf = array.get(i);
                    array.set(i, array.get(i + 1));
                    array.set(i + 1, buf);
                }
            }
        }
        return array;
    }
}
