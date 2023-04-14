//冒泡排序法
public class Maopao {
    public static void main(String[] args) {
        int[] array = {99,52,64,51,25,64,74,15,34,26,58};
        int[] retArray = Maopao.maopao(array);
        for(int i = 0;i <= retArray.length -1;i++){
            System.out.print(retArray[i] + "  ");
        }
    }

    public static int[] maopao(int[] array) {
        for(int i = array.length - 1;i >= 0;i--){
            for(int j = 0;j <= i -1; j++){
                if(array[j] > array[j+1]){
                    Maopao.exchange(array,j,j+1);
                }
            }
        }
        return array;
    }

    public static int[] exchange(int[] array,int i,int j){
        int box = array[i];
        array[i] = array[j];
        array[j] = box;
        return array;
    }
}
