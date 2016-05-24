public class ShellSorter {
    private int[]mas;

    public ShellSorter(int[] mas) {
        this.mas=mas;
    }

    public int []shellSort(){
        int[]resMas=mas;

        int d = mas.length/2;
        //select sorting
        for (int i = 0; i < (mas.length -d); i++) {
           int j = i;
            while ((j >= 0)&&(mas[j]>mas[j+d])){
                int temp = mas[j];
                mas[j] = mas[j + d];
                mas[j+d]=temp;
                j--;
            }
        }
        d =d/2;
        return resMas;
    }
}
