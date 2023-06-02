public class App {
    public static void main(String[] args) {
        System.out.println(flippingBits(9));
    }

    public static long flippingBits(long n) {
        // You will be given a list of 32 bit unsigned integers. Flip all the bits ( and
        // ) and return the result as an unsigned integer.

        // We need to convert unnasigned integer to binary
        String binary = String.format("%32s", Long.toBinaryString(n)).replace(' ', '0');
        StringBuilder stb = new StringBuilder();

        for (char c : binary.toCharArray()) {
            if (c == '0') {
                stb.append('1');
            } else if (c == '1') {
                stb.append('0');
            }
        }
        return Long.parseLong(stb.toString(), 2);
    }
}
