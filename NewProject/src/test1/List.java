package test1;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

class Guest<T> {
    private T name;

    public Guest(T name) {
        this.name = name;
    }

    public T getName() {
        return name;
    }

    @Override
    public String toString() {
        return name.toString();
    }
}

class Room<T, U> {
    private T roomNumber;
    private U guest;

    public Room(T roomNumber) {
        this.roomNumber = roomNumber;
    }

    public T getRoomNumber() {
        return roomNumber;
    }

    public void setGuest(U guest) {
        this.guest = guest;
    }

    public U getGuest() {
        return guest;
    }

    public boolean isOccupied() {
        return guest != null;
    }
}

public class List <T, U> extends ArrayList<T> {
    public static void main(String[] args) {
        meth();
    }

    public static void meth() {
        List<Integer, Guest<String>> myList = new List<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
        	System.out.println("\nҮйлдлүүд:");
            System.out.println("1. Элемент нэмэх");
            System.out.println("2. Индексээр нэмэх");
            System.out.println("3. Эрэмбэлэх");
            System.out.println("4. Элемент устгах");
            System.out.println("5. Индексээр элемент устгах");
            System.out.println("6.Гарах");

            try {
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        while (true) {
                            System.out.println("Элемент оруулна уу (Гарах бол 0)");
                            int num = scanner.nextInt();
                            if (num == -0) {
                                break;
                            }
                            myList.add(num);
                            System.out.println("");
                            System.out.println(myList);
                        }
                        break;

                    case 2:
                        while (true) {
                            System.out.println("Индекс болон элемент оруулна болон уу (Гарах бол 0)");
                            int index = scanner.nextInt();
                            if (index == -1) {
                                break;
                            }
                            int num = scanner.nextInt();

                            myList.nemeh(num, index);
                            System.out.println(myList);
                        }
                        break;
                     

                    case 3:
                        System.out.println("List: " + myList);
                        System.out.println("Эрэмбэлсны дараа: " + myList);
                        myList.sortList();
                        break;

                    case 4:
                        System.out.println("Устгах элемент оруулна уу");
                        System.out.println("List: " + myList);
                        int numToRemove = scanner.nextInt();
                        myList.removeD(numToRemove);
                        System.out.println("Устгасны дараа: " + myList);
                        break;

                    case 9:
                        System.out.println("Устгах индекс оруулна уу");
                        int indexToRemove = scanner.nextInt();
                        System.out.println("before: " + myList);
                        myList.removeBI(indexToRemove);
                        System.out.println("Устгасны дараа: " + myList);
                        break;

                    case 5:
                        // loop duusgad garah
                        break;

                    default:
                        System.out.println("Сонголт буруу.");
                }

                if (choice == 5) {
                    break; 
                }
            } catch (InputMismatchException e) {
                System.out.println("Сонголт буруу, Дахин оруулна уу");
                scanner.nextLine();
            }
        }
    }

    private void nemeh(T el, int in) {
        if (in >= -1) {
            try {
                while (size() <= in) {
                    add(null); 
                }
                set(in, el);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Индекс буруу.");
        }
    }

    private void removeD(T num) {
        System.out.println("Лист: " + this);
        removeIf(number -> number.equals(num));
        System.out.println("Лист дараа: " + this);
    }

    private void removeBI(int index) {
        if (index >= 0 && index < size()) {
            super.remove(index);
        } else {
            System.out.println("Индекс буруу.");
        }
    }
    
    public void sortList() {
        if (isEmpty()) {
            return;
        }
        System.out.println("Эрэмбэлээгүй лист: " + this);
        quickSort(0, size() - 1);
        System.out.println("Эрэмбэлсэн лист: " + this);
    }

    private void quickSort(int low, int high) {
        if (low < high) {
            int pivotIndex = partition(low, high);
            quickSort(low, pivotIndex - 1);
            quickSort(pivotIndex + 1, high);
        }
    }

    private int partition(int low, int high) {
        int pivot = Integer.valueOf(get(high).toString());
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (Integer.valueOf(get(j).toString()) <= pivot) {
                i++;
                T temp = get(i);
                set(i, get(j));
                set(j, temp);
            }
        }
        T temp = get(i + 1);
        set(i + 1, get(high));
        set(high, temp);
        return i + 1;
    }
}
