package Batch_05.Utlity;

public class MyFunc {


    public static void Bekle(int sn)
    {
        try {
            Thread.sleep(1000*sn); // ms beklediği
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }



}
