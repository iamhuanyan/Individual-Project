//利用二分法进行查找
public class Erfenfa {
    public static void main(String[] args) {
        int[] array = {1,5,6,7,11,15,19,26,24,38,59,76,85,94};
        int value = 26;
        int ret = Erfenfa.fidvalue(array, value);
        if(ret == 0){
            System.out.println("查询失败，没有找到目标数字！");
        }else {
            System.out.println("查询成功，目标数字在第：" + (ret + 1) + "个");
        }
    }

    private static int fidvalue(int[] array, int value) {
        int left = 0,right = array.length,m;
        while(left <= right){
            m = (left + right) / 2;
            if(array[m] == value){
                return m;
            }else if(array[m] < value) {
                left = m + 1;
            }else {
                right = m - 1;
            }
        }
        return 0;
    }
}