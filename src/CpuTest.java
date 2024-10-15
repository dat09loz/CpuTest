import java.text.DecimalFormat;

public class CpuTest {
    public static void main(String[] args) {
        new CpuTest().test();
    }

    private void test() {
        int x = 0;
        final long start = System.currentTimeMillis();
        for (int i = 0; i < 1000001; ++i) {
            System.out.println(x);
            ++x;
        }
        final long end = System.currentTimeMillis();
        final float elapsedTime = (end - start) / 1000.0f;
        System.out.println("CPU stress test completed");
        DecimalFormat timeFormat = new DecimalFormat("#0.000");
        System.out.printf("Runtime: " + timeFormat.format(elapsedTime) + " seconds.");
    }

}