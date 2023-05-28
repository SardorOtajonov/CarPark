package uz.pdp;

import java.util.Scanner;

public class AndroidUI {
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        Parking parking=new Parking();
        int rowCount=4;
        int cellCount=6;
        parking.buildPark(rowCount,cellCount);

        while (true){
            displayMenu();
            String choice=readConsole("?: ");
            switch (choice){
                case "1"->displayPark(parking);
//                case "2"->availableCellsCount(matrix);
//                case "3"->notavailableCellsCount(matrix);
                 case "4"->park(parking);
//                case "5"->out(matrix);
                case "q"->{
                    System.out.println("Bye ))");
                    System.exit(0);
                }
                default-> System.out.println("Wrong choice");
                }
        }
    }

    private static void park(Parking parking) {
      String registerNumber=  readConsole("Register Number: ");
      String carType=  readConsole("Car Type: ");
      String rowIndex=readConsole("Enter the row index: ");
      String columnIndex= readConsole("Enter the column index: ");

      Car car=new Car(registerNumber);
      parking.park(car,carType,rowIndex,columnIndex);
    }

    private static String readConsole(String hint) {
        System.out.print(hint);
       return scanner.nextLine();
    }

    private static void displayPark(Parking parking) {
    parking.displayPark();
    
    }

    private  static  void displayMenu(){
        System.out.println("Display Park              ->1");
        System.out.println("Available cells count     ->2");
        System.out.println("Not Available cells count ->3");
        System.out.println("In                        ->4");
        System.out.println("Out                       ->5");
        System.out.println("Quit                      ->q");
    }
}
