public class CocktailSort {
    private int[] mas;

    public CocktailSort(int[] mas) {
        this.mas = mas;
    }


    public int[] cocktailSort() {
        int[]resMas=mas;
        int left = 1,
                right = mas.length - 1;


//algorithm
        do {
            for (int i = right; i >= left; i--) {
                if (mas[i - 1] > mas[i]) {
                    int temp = mas[i];
                    mas[i] = mas[i - 1];
                    mas[i - 1] = temp;
                }
            }
            left++;
            for (int i = left; i <= right; i++) {
                if (mas[i - 1] > mas[i]) {
                    int temp = mas[i];
                    mas[i] = mas[i - 1];
                    mas[i - 1] = temp;
                }
            }
            right--;
        }while (left <=right);
        return resMas;
    }
}
