public class InsertionSorter {
    private int[]mas;

    public InsertionSorter(int[] mas) {
        this.mas=mas;
    }


    public int []insertionSort(){
        int[]resMas=mas;
        int j, temp;

//algorithm
        for (int i = 0; i < mas.length; i++) {
            temp=mas[i];
            for (j = i - 1; j >=0 && mas[j]>temp ; j--) {
                mas[j+1]=mas[j];
            }
            mas[j+1]=temp;
        }

        return resMas;
    }

}
