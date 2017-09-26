/*
    在数组里移除指定元素，并返回新的长度
 */

public class RemoveElement {
    private int[] array = new int[]{1, 2, 2, 3, 2, 4};

    public int removeElement(int[] a, int n, int elem) {
        int i = 0;
        int j = 0;
        for (i = 0; i < n; ++i) {
            if (a[i] == elem) {
                continue;
            }
            a[j] = a[i];
            j++;
        }
        return j;
    }

    public static void main(String[] args) {
        RemoveElement removeElement = new RemoveElement();
        int[] array = new int[]{1, 2, 2, 3, 2, 4};
        int newLength = removeElement.removeElement(array, array.length, 2);
        System.out.println("The new length is:" + String.valueOf(newLength));
    }
}
