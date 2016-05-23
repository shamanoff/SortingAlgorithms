public class SelectSorter {
    private int[]mas;

    public SelectSorter(int[] mas) {
        this.mas=mas;
    }

    public int []selectSort(){
        int[]resMas=mas;

        int index = 0, min =0;
        //select sorting
        for (int i = 0; i < resMas.length; i++) {
            min= resMas[i];
            index =i;
            for (int j = i+1; j <resMas.length ; j++) {
                if(resMas[j]<min){
                    index =j;
                    min=resMas[j];
                }
            }
            if(resMas[i]!=resMas[index]) {
                resMas[index] = resMas[i];
                resMas[i] = min;
            }
        }
        return resMas;
    }
}
