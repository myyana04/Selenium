public class MyClass {

    public static void main(String[] args) {

        sayHello();
        int[]arr={11,22,33,44,55,};
        System.out.println(findMax(arr));
        int[]arr1={10,11,12,34,56,78,43,99};
        System.out.println(findMax(arr1));

    }

    public static void sayHello() {
        System.out.println("hello world");
    }


    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];


            }

        }
        return max;


    }
}