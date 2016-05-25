public class MainQuick {

//public static class QuickSorter    {
//    private final int[] mas;
//
//    public QuickSorter(int[] mas) {
//        this.mas = mas;
//    }
//
//    int partition (int arr[], int left, int right)
//        {
//            int i = left, j = right;
//            int tmp;
//            int pivot = arr[(left + right) / 2];
//
//            while (i <= j) {
//                while (arr[i] < pivot)
//                    i++;
//                while (arr[j] > pivot)
//                    j--;
//                if (i <= j) {
//                    tmp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = tmp;
//                    i++;
//                    j--;
//                }
//            }
//            ;
//
//            return i;
//        }
//
//    void quickSort(int arr[], int left, int right) {
//        int index = partition(arr, left, right);
//        if (left < index - 1)
//            quickSort(arr, left, index - 1);
//        if (index < right)
//            quickSort(arr, index, right);
//    }
//
//}

    //////////
    public static void main(String[] args) {

        int[] mas = new int[10];
        System.out.println("Unsorted");
        for (int i = 0; i < mas.length; i++) {
            mas[i]=(int)Math.round(Math.random()*100);

            System.out.print
                    (mas[i]+" ");
        }


        QuickSorter sorter = new QuickSorter(mas);
        sorter.quickSort(mas, 0, mas.length-1);

        System.out.println();
        System.out.println("Quick");
        for (int i = 0; i < mas.length; i++)
            System.out.print(mas[i]+" ");

    }



}
