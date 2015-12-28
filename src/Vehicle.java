/**
 * JavaForBegginers created by Admin on 26.12.2015 19:11.
 */
//class and its metod
class Vehicle {
    int passengers;             // количество пассажиров
    int fuelcap;                // емкость топливного бака
    int mpg;                    // потребление топлива в милях на галлон

    // отобразить дальность действия транспортного средства
    // метод range() относится к классу Vehicle
    // обратите внимание на то, что переменная fuelcap & mpg
    // указываются напрямую без имени объекта и оператора точки.
    void range() {
        System.out.println("Range is " + fuelcap * mpg);
    }
}
    class AddMeth {
            public static void main(String args[]) {
                Vehicle minivan = new Vehicle();
                Vehicle sportcar = new Vehicle();

                int range1, range2;

                // присвоить значения полям в объекте minivan
                minivan.passengers = 7;
                minivan.fuelcap = 14;
                minivan.mpg = 21;

                // присвоить значения полям в объекте sportcar
                sportcar.passengers = 2;
                sportcar.fuelcap = 14;
                sportcar.mpg = 12;

                System.out.println("Minivan car carry " + minivan.passengers + ". ");
                minivan.range();            // отобразить дальность действия мини фургона

                System.out.println("Sportcar can carry " + sportcar.passengers + ". ");
                sportcar.range();            // отобразить дальность действия портивной машины
            }
    }
