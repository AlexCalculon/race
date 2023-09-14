public class Main {
    public static void main(String[] args) {
        task2();
        task3();
        task4();


    }
    public static void task1 () {
        System.out.println("Задача 1");
      int[] arr = new int[3];
      arr[0] = 1;
      arr[1] = 2;
      arr[2] = 3;

      double[] arr2 = {1.57, 7.654, 9.986};

      char[] arr3 = {'9', 'з', ':', '.',};
  }

    public static void task2 () {
        System.out.println("Задача 2");
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        double[] arr2 = {1.57, 7.654, 9.986};

        char[] arr3 = {'9', 'з', ':', '.',};

//        for (int i : arr) {
//            System.out.println(i);
//        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]);
            if (i < arr2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]);
            if (i < arr3.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println();
    }
        public static void task3 () {
            System.out.println("Задача 3");
            int[] arr = new int[3];
            arr[0] = 1;
            arr[1] = 2;
            arr[2] = 3;

            double[] arr2 = {1.57, 7.654, 9.986};

            char[] arr3 = {'9', 'з', ':', '.',};

//        for (int i : arr) {
//            System.out.println(i);
//        }
            for (int i = arr2.length -1; i >= 0; i--) {
                System.out.print(arr2[i]);
                if (i > 0){
                    System.out.print(", ");
                }
            }
            System.out.println();
            for (int i = arr.length -1; i >= 0; i--) {
                System.out.print(arr[i]);
                if (i > 0){
                    System.out.print(", ");
                }
            }
            System.out.println();
            for (int i = arr3.length -1; i >= 0; i--) {
                System.out.print(arr3[i]);
                if (i > 0){
                    System.out.print(", ");
                }
            }
            System.out.println();
            System.out.println();


    }
    public static void task4 () {
        System.out.println("Задача 4");
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] = arr[i] + 1;


            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }

    }
}