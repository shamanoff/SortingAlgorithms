public class BubbleSort {

    private int[]mas;

    public BubbleSort(int[] mas) {
        this.mas=mas;
    }

//change
    private void swap (int[]mas, int index){
        int temp =mas[index-1];
        mas[index-1]=mas[index];
        mas[index]=temp;
    }


    public int []bubbleSorter(){
        int[]resMas=mas;


//algorithm
        for (int i = 1; i < mas.length; i++) {
            for (int j = resMas.length-1; j >=i; j--) {
                if(resMas[j-1]>resMas[j])swap(resMas, j);

            }

        }

        return resMas;
    }



}
