package java20240412;

public class example17 {
    public static void main(String[] args) {
        int [] array = new int []{1,4,5,6,7,8,3,4,36,6,105,23};
        findMaxMinNumber(array);
    }

    public static void findMaxMinNumber (int[] array){
        int maxNum = array[0];  //array의 첫번째 값부터 비교해야해서
        int minNum = array[0];
        for (int i=0; i<array.length; i++){
            maxNum = Math.max(maxNum,array[i]);
        }

        for (int i=0; i<array.length; i++){
            minNum = Math.min(minNum,array[i]);


        } System.out.println(minNum + "와" + maxNum);





    }


}
