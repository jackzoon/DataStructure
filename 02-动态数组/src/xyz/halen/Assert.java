package xyz.halen;

/**
 * Created By Halen 2020/5/9 21:32
 */
public class Assert {
    public static void test(boolean value) {
        try {
            if (!value) {
                throw new Exception("测试未通过");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
