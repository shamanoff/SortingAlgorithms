public class MainQuick {


    public static void main(String[] args) {

        int[] mas = new int[10];
        System.out.println("Unsorted");
        for (int i = 0; i < mas.length; i++) {
            mas[i]=(int)Math.round(Math.random()*100);

            System.out.print
                    (mas[i]+" ");
        }

        QuickSorter qu = new QuickSorter(mas);
        mas= sort(mas, 0, mas.length-1);

        System.out.println();
        System.out.println("SelectSorter");
        for (int i = 0; i < mas.length; i++)
            System.out.print(mas[i]+" ");

    }

    private static int[] sort(int[] mas, int i, int i1) {
        return mas;
    }


}
