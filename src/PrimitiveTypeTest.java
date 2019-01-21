import com.sun.org.apache.xpath.internal.operations.Bool;

public class PrimitiveTypeTest {
    public static byte byteDefault;
    public static short shortDefault;
    public static int intDefault;
    public static long longDefault;
    public static float floatDefault;
    public static double doubleDefault;
    public static char charDefault;
    public static boolean booleanDefault;
    public static void main(String[] args) {
        System.out.println("byte型最大值" + Byte.MAX_VALUE);
        System.out.println("byte型最小值" + Byte.MIN_VALUE);
        System.out.println("byte型默认值" + byteDefault);
        System.out.println("short型最大值" + Short.MAX_VALUE);
        System.out.println("short型最小值" + Short.MIN_VALUE);
        System.out.println("short型默认值" + shortDefault);
        System.out.println("int型最大值" + Integer.MAX_VALUE);
        System.out.println("int型最小值" + Integer.MIN_VALUE);
        System.out.println("int型默认值" + intDefault);
        System.out.println("long型最大值" + Long.MAX_VALUE);
        System.out.println("long型最小值" + Long.MIN_VALUE);
        System.out.println("long型默认值" + longDefault);
        System.out.println("float型最大值" + Float.MAX_VALUE);
        System.out.println("float型最小值" + Float.MIN_VALUE);
        System.out.println("float型默认值" + floatDefault);
        System.out.println("double型最大值" + Double.MAX_VALUE);
        System.out.println("double型最小值" + Double.MIN_VALUE);
        System.out.println("double型默认值" + doubleDefault);
        System.out.println("char型最大值" + (int)Character.MAX_VALUE);
        System.out.println("char型最小值" + (int)Character.MIN_VALUE);
        System.out.println("char型默认值" + (int)charDefault);
        System.out.println("boolean型最大值" + Boolean.TRUE);
        System.out.println("boolean型最小值" + Boolean.FALSE);
        System.out.println("boolean型默认值" + booleanDefault);
    }
}
