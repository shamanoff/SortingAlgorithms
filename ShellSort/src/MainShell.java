public class MainShell {
    public static void main(String[] args) {

        int[] mas = new int[10];
        System.out.println("Unsorted");
        for (int i = 0; i < mas.length; i++) {
            mas[i]=(int)Math.round(Math.random()*100);

            System.out.print
                    (mas[i]+" ");
        }
        ShellSorter sorter =new ShellSorter(mas);

        mas= sorter.shellSort();
        System.out.println();
        System.out.println("ShellSorter");
        for (int i = 0; i < mas.length; i++)
            System.out.print(mas[i]+" ");

    }

}
