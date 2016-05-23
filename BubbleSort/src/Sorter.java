public class Sorter {

    private int[]mas;

    public Sorter(int[] mas) {
        this.mas=mas;
    }
    //swap in sorting
    public void swap(int[] mas, int index) {
        int temp = mas[index -1];
        mas[index-1]=mas[index];
        mas[index]=temp;
    }
    public int []bubbleSort(){
        int[]resMas=mas;
        //bubble sorting
        for (int i = 1; i < resMas.length; i++) {
            for (int j = resMas.length-1; j >= i ; j--) {
                if (resMas[j-1]>resMas[j])swap(resMas,j);
            }
        }
        return resMas;
    }
}
