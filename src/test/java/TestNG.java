import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG {
    @Test
    public void sayHello(){
        int[]arr={11,22,33,44,55,};
        int max=findMax(arr);
        Assert.assertEquals(max,54,"Result is not expected");


    }
    @Test
    public void sayHello1(){

        System.out.println("love");
    }

    public static int findMax(int[]arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];


            }

        }
        return max;



    }
}
