public class QuickSorter {

    private int[]mas;

    public QuickSorter(int[] mas) {
        this.mas=mas;
    }

    public static int[] sort(int[] mas, int start, int end) {

        if (start >= end) return mas;
        int i = start;
        int j = end;
        int op = i - (i - j) / 2;


        //quick sorting

        while (i < j) {
            while ((i < op) && (mas[i] <= mas[op])) i++;
            while ((i > op) && (mas[i] >= mas[op])) i--;
            if (i < j) {
                int temp = mas[i];
                mas[i] = mas[j];
                mas[j] = temp;
                if (i == op) op = i;

            }
        }
        sort(mas, start, op);
        sort(mas, op + 1, end);
        return mas;
    }
}

