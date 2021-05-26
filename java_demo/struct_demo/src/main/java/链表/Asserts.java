package 链表;

public class Asserts {
    public Asserts() {
    }

    public static void test(boolean value) {
        try {
            if (!value) {
                throw new Exception("测试未通过");
            }
        } catch (Exception var2) {
            var2.printStackTrace();
        }

    }
}
