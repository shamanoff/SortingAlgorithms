public class MainCocktail {
    public static void main(String[] args) {

        int[] mas = new int[10];
        System.out.println("Unsorted");
        for (int i = 0; i < mas.length; i++) {
            mas[i]=(int)Math.round(Math.random()*100);

            System.out.print
                    (mas[i]+" ");
        }
        CocktailSort sorter =new CocktailSort(mas);


        mas= sorter.cocktailSort();
        System.out.println();
        System.out.println("insertionSort");
        for (int i = 0; i < mas.length; i++)
            System.out.print(mas[i]+" ");


    }

}
