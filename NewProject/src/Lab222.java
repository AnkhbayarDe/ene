
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab222 extends ArrayList<Integer> {
    public static void main(String[] args) {
        
      
        meth();
    }
    public static void meth() {
    	Lab222 myList = new Lab222();
    	  Scanner scanner = new Scanner(System.in);
        while (true) {
        	System.out.println("\nҮйлдлүүд:");
            System.out.println("1. Элемент нэмэх");
            System.out.println("2. Индексээр нэмэх");
            System.out.println("3. Хамгийн бага элемент");
            System.out.println("4. Элементүүдийн нийлбэр");
            System.out.println("5. Дундаж олох");	
            System.out.println("6. Сондгой элемент устгах");
            System.out.println("7. Эрэмбэлэх");
            System.out.println("8. Элемент устгах");
            System.out.println("9. Индексээр элемент устгах");
            System.out.println("10. Гарах");

            try {
                int choice = scanner.nextInt();

                switch (choice) {
                case 1:
                    while (true) {
                        System.out.println("Элемент оруулна уу. Гарах бол: 0");
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
                        System.out.println("Индекс оруулна уу.  Гарах бол: -1");
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
                    if (!myList.isEmpty()) {
                        int minValue = myList.min();
                        System.out.println("Бага: " + minValue);
                    } else {
                        System.out.println("Жагсаалт хоосон байна.");
                    }
                    break;

                case 4:
                    if (!myList.isEmpty()) {
                        int sumValue = myList.sum();
                        System.out.println("Нийлбэр: " + sumValue);
                    } else {
                        System.out.println("Жагсаалт хоосон байна.");
                    }
                    break;

                case 5:
                    if (!myList.isEmpty()) {
                        double avgValue = myList.average();
                        System.out.println("Дундаж: " + avgValue);
                    } else {
                        System.out.println("Жагсаалт хоосон байна.");
                    }
                    break;

                case 6:                                       
                    System.out.println("Сондгой элементүүдийн устгалаа");
                    myList.removeOdd();
                    break;

                case 7:               
                	System.out.println("Жагсаалт: " +myList);
                    System.out.println("Өсөхөөр эрэмбэллээ");
                    myList.sortList();
                    break;
                    
                case 8:
                    System.out.println("Устгах элемент оруулна уу");
                    System.out.println("Жагсаалт: " +myList);
                    int numToRemove = scanner.nextInt();
                    myList.removeD(numToRemove);
                    System.out.println("Жагсаалт 1: " +myList);
                    break;

                case 9:
                    System.out.println("Устгах элементын индекс оруулна уу");
                    int indexToRemove = scanner.nextInt();
                    System.out.println("Өмнө нь: " +myList);
                    myList.removeBI(indexToRemove);
                    System.out.println("Дараа: " +myList);
                    break;
                    
                    

                case 10:
                    // loop duusgad garah
                    break;

                    default:
                        System.out.println("Сонголт буруу, дахин оролдоно уу");
                }

                if (choice == 10) {
                    break; // Дотор loop end
                }
            } catch (InputMismatchException e) {
                System.out.println("Сонголт буруу, дахин оролдоно уу");
                scanner.nextLine();
            }
        }
}
    void nemeh(int el, int in) {
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
            System.out.println("Индекс буруу, Нэмэгдээгүй.");
        }
    }

    public void removeD(int num) {
        System.out.println("list: " + this);
        removeIf(number -> number == num);
        System.out.println("Дараа нь: " + this);
    }

    public void removeBI(int index) {
        if (index >= 0 && index < size()) {
            super.remove(index);
        } else {
            System.out.println("Индекс буруу, Элемент хасагдаагүй.");
        }
    }

    public int min() {
        if (isEmpty()) {
            System.out.println("Жагсаалт хоосон байна.");
        }

        int minNumber = get(0);
        for (int number : this) {
            if (number < minNumber) {
                minNumber = number;
            }
        }
        return minNumber;
    }

    public int sum() {
        int sum = 0;
        for (int number : this) {
            sum += number;
        }
        return sum;
    }

    public double average() {
        if (isEmpty()) {
            System.out.println("Жагсаалт хоосон байна.");
        }

        int sum = sum();
        return (double) sum / size();
    }

    public void removeOdd() {
        System.out.println("Эрэмбэлээгүй Жагсаалт: " + this);
        removeIf(number -> number % 2 != 0);
        System.out.println("Эрэмбэлсэн Жагсаалт " + this);
    }

    public void sortList() {
        if (isEmpty()) {
            return;
        }
        System.out.println("Эрэмбэлээгүй Жагсаалт: " + this);
        quickSort(0, size() - 1);
        System.out.println("Эрэмбэлээгүй Жагсаалт: " + this);
    }
    /*
     *switch (choice) {
    case 1:
        System.out.println("List 1: " + Arrays.toString(list1.toArray()));
        System.out.println("List 2: " + Arrays.toString(list2.toArray()));
        break;
    case 2:
        Chain unionResult = list1.union(list2);
        System.out.println("Union: " + Arrays.toString(unionResult.toArray()));
        break;
    case 3:
        Object b[] = {-2, 23, -34};
        list1 = list1.addRange(a, b);
        System.out.println("List 1 after adding elements: " + list1);
        break;
    case 4:
        Chain intersectionResult = list1.intersection(list2);
        System.out.println("Intersection: " + Arrays.toString(intersectionResult.toArray()));
        break;
    case 5:
        boolean sh = true;
        while (sh) {
            System.out.println("Enter an element to add to list1 (or 0 to exit): ");
            int s = scanner.nextInt();
            if (s == 0) {
                sh = false;
            } else {
                list1.add(s);
            }
        }
        System.out.println("List 1 after adding elements: " + list1);
        break;
    case 6:
        break;
    default:
        System.out.println("Songolt buruu, dahin oroldon uu");
}

     * 
     * 
     */

    private void quickSort(int low, int high) {
        if (low < high) {
            int pivotIndex = partition(low, high);
            quickSort(low, pivotIndex - 1);
            quickSort(pivotIndex + 1, high);
        }
    }

    private int partition(int low, int high) {
        int pivot = get(high);
        int i = low - 1;
    for (int j = low; j < high; j++) {
        if (get(j) <= pivot) {
            i++;
            int temp = get(i);
            set(i, get(j));
            set(j, temp);
        }
    }
    int temp = get(i + 1);
    set(i + 1, get(high));
    set(high, temp);
    return i + 1;
}

public Object[] toArray() {
    Object[] arr = new Object[size()];
    int index = 0;
    for (Integer element : this) {
        arr[index++] = element;
    }
    return arr;
}

public void addRange(Object[] elements) {
    for (Object element : elements) {
        if (element instanceof Integer) {
            add((Integer) element);
        } else {
            System.out.println("Элементийн төрөл буруу " + element.getClass().getName());
        }
    }
}

public Lab222 union(Lab222 chain) {
    Lab222 result = new Lab222();
    result.addAll(this);

        for (Integer element : chain) {
            if (!result.contains(element)) {
                result.add(element);
            }
        }

        return result;
    }

    public Lab222 intersection(Lab222 chain) {
        Lab222 result = new Lab222();

        for (Integer element : this) {
            if (chain.contains(element)) {
                result.add(element);
            }
        }

        return result; // 2:31
    }
}
