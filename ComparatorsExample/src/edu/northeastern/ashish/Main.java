package edu.northeastern.ashish;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

//        int[] arr = {1,4,-5,10,3,6,1,2};
//        String[] strArray = {"Ashish", "Mark","Tom", "Bill"};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        Arrays.sort(strArray);
//        System.out.println(Arrays.toString(strArray));

        Employee ashish = new Employee("Ashish", 21);
        Employee mark = new Employee("Mark", 72);
        Employee tom = new Employee("Tom", 21);
        Employee bill = new Employee("Bill", 35);
        Employee peter = new Employee("Peter", 20);

        Employee[] employees = {ashish, mark, tom, bill, peter};


        Arrays.sort(employees);
        for (Employee emp : employees) {
            System.out.println(emp.name + " Age: " + emp.age);
        }

        System.out.println(ashish.compareTo(peter));

        System.out.println();

        Car mercedes = new Car("Mercedes", "C300", 2017, 49000, 1200, 1);
        Car tesla = new Car("Tesla", "X", 2020, 89000,234, 4);
        Car bmw = new Car("BMW", "3", 2015, 43000, 234534,3);
        Car audi = new Car("Audi", "Q5", 2018, 57000,232, 18);
        Car honda = new Car("Honda", "CRV", 2017, 32000, 1224,2);
        Car toyota = new Car("Toyota", "Tercel", 2018, 31000, 456,1);
        Car nissan = new Car("Nissan", "Altima", 2022, 29000,3466, 16);

        Car[] cars = {mercedes, tesla, bmw, audi, honda, toyota, nissan};

//        Comparator<Car> comparatorMake =  new Comparator<Car>() {
//            @Override
//            public int compare(Car car1, Car car2) {
//                return car1.getMake().compareTo(car2.getMake());
//            }
//        };
        Comparator<Car> comparatorMake = (car1, car2) -> car1.getMake().compareTo(car2.getMake());
        Comparator<Car> comparatorPrice = (car1, car2) -> Integer.compare(car1.getPrice(), car2.getPrice());
        Comparator<Car> comparatorMiles = ( car1,  car2) ->  Integer.compare(car1.getMilesDriven(), car2.getMilesDriven());
        Comparator<Car> comparatorYear = (car1, car2) -> Integer.compare(car1.getYear(), car2.getYear());

        System.out.println("************");
        printCars(cars);
        Arrays.sort(cars, comparatorMake);
        System.out.println("************");
        printCars(cars);
        Arrays.sort(cars, comparatorPrice(false));
        System.out.println("************");
        printCars(cars);



    }

    private static void printCars(Car[] cars){
        System.out.println("[Make,\tModel,\tPrice,\t,Miles\t,Color");
        for (Car car: cars) {
            System.out.println(
                            car.getMake() + "\t" +
                            car.getModel() + "\t" +
                            car.getPrice() + "\t" +
                            car.getMilesDriven() + "\t" +
                            car.getColor()
            );
        }
    }

    private static Comparator<Car> comparatorPrice(boolean lowestFirst){
        if(lowestFirst){
            return  (car1, car2) -> Integer.compare(car1.getPrice(), car2.getPrice());
        }
        return (car1, car2) -> Integer.compare(car2.getPrice(), car1.getPrice());
    }
}
