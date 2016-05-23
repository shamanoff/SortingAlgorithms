public class MainSelect {
    public static void main(String[] args) {

        int[] mas = new int[10];
        System.out.println("Unsorted");
        for (int i = 0; i < mas.length; i++) {
            mas[i]=(int)Math.round(Math.random()*100);

            System.out.print
                    (mas[i]+" ");
        }
        SelectSorter sorter =new SelectSorter(mas);

        mas= sorter.selectSort();
        System.out.println();
        System.out.println("SelectSorter");
        for (int i = 0; i < mas.length; i++)
            System.out.print(mas[i]+" ");

    }

}
