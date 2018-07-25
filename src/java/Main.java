package java;


import java.util.Arrays;

public class Main {
    
    //    Condition task / условия задачи
    final static int[] A = {5, 2, 4, 6, 1, 3, 2, 6};
    static int p = 1, r = A.length, q;
    private static Main sort = new Main();
    //    Additional arrays
    private int[] left;
    private int[] right;
    
    public static void main(String[] args) {
        
        sort.Sort(A, p, r);
        sort.Merge(A, p, q, r);
    }
    
    void Sort(int[] A, int p, int r) {
        if (p < r) {
            q = (p + r) / 2;
            left = new int[q];
            right = new int[r - q];

//            Заполнение и сортировка частей массива
//            Sorting additional arrays

//        Левая часть / Left side
            for (int i = 0; i < left.length; i++) {
                left[i] = A[i];
            }
            Arrays.sort(left);

//        Правая часть / Right side
            for (int i = 0; i < right.length; i++) {
                right[i] = A[q + i];
            }
            Arrays.sort(right);
        }
    }
    
    /**
     * Решение задачи по разработке метода
     *
     * Метод из задачи Merge(A,p,q,r) и его реализация
     * Method from task and implementation
     */
    void Merge(int[] A, int p, int q, int r) {

//    Слияние массивов
        int i = 0, j = 0, k = 0; //счетчики
        
        while (i <= left.length - 1) {
            
            if (left[i] <= right[j]) {
                A[k] = left[i];
                i++;
                k++;
            } else {
                A[k] = right[j];
                j++;
                k++;
            }
        }
        
        while (j <= right.length - 1) {
//            уже не сравниваю - отсортировано прежде
            A[k] = right[j];
            j++;
            k++;
        }
        
        for (int each : A) {
            System.out.print(each + ":");
            
        }
    }
    
}
