
/*
    删除一个已经排序的数组中的重复值
 */

public class RemoveElement2 {
    public int removeDuplicates(int[] a, int n) {
        if (n == 0) {
            return 0;
        }

        int j = 0;
        /*
            j记录返回的数组，i遍历所有数组
            当a[j] != a[i]时，给新数组中加入该值，更新j
         */
        for (int i = 1; i < n; ++i) {
            if (a[j] != a[i]) {
                a[++j] = a[i];
            }
        }
        return j + 1;
    }

    public int removeDuplicatesTwice(int[] a, int n) {
        if (n == 0) {
            return 0;
        }

        /*
          设置一个计数器，计算重复的次数，
          当大于2时就按上一个函数的思想处理
         */
        int j = 0;
        int num = 0;
        for (int i = 1; i < n; ++i) {
            if (a[j] == a[i]) {
                num++;
                if (num < 2) {
                    a[++j] = a[i];
                }
            } else {
                a[++j] = a[i];
                num = 0;
            }
        }
        return j + 1;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 2, 3, 3, 4, 4, 5};
        RemoveElement2 removeElement2 = new RemoveElement2();
        int length = removeElement2.removeDuplicates(a, a.length);
        for (int i = 0;i < length; ++i) {
            System.out.println(String.format("数组a: %d", a[i]));
        }

        int[] b = new int[]{1, 2, 2, 2, 3, 3, 3, 4, 4, 5};
        int length2 = removeElement2.removeDuplicatesTwice(b, b.length);
        for (int i = 0; i < length2; ++i) {
            System.out.printf("数组b: %d\n", b[i]);
        }

    }
}
