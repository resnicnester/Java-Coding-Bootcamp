public class Main {
    public static void main(String[] args) {
        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        long phoneNumber = 9003781369L;
        System.out.println("Integer min value = " + myMinIntValue);
        System.out.println("Integer max value = " + myMaxIntValue);
        //Overflow
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1));
        //Underflow
        System.out.println("Busted MIN value = " + (myMinIntValue - 1));

        byte minByteValue = Byte.MIN_VALUE;
        byte maxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte min value = " + minByteValue);
        System.out.println("Byte max value = " + maxByteValue);

        short minShortValue = Short.MIN_VALUE;
        short maxShortValue = Short.MAX_VALUE;
        System.out.println("Short min value = " + minShortValue);
        System.out.println("Short max value = " + maxShortValue);

        long minLongValue = Long.MIN_VALUE;
        long maxLongValue = Long.MAX_VALUE;
        System.out.println("Long min value = " + minLongValue);
        System.out.println("Long max value = " + maxLongValue);

        long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 3767;

        int myTotal = (myMinIntValue/2);
        System.out.println(myTotal);
        byte myNewByteValue = (byte) (minByteValue / 2);
        System.out.println(myNewByteValue);
        short myNewShortValue = (short) (minShortValue / 2);
        System.out.println(myNewShortValue);
    }
}
