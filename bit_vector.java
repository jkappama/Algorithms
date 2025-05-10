class Main {
    public static void main(String[] args) {
        System.out.println(isUniqueChars("sosmetthing"));
    }
    
    static int add(int num1, int num2) {
        // Method body
        int sum = num1 + num2;
        // Return statement
        return sum;
    }
    static boolean isUniqueChars(String str) {
        // Method body
        int checker = 0;
        for(int i = 0; i < str.length(); i++) {
            String checker_b = convertIntegerToBinary(checker);
            System.out.println(checker_b);
            // System.out.println(str.charAt(i));
            // System.out.println(checker);
            int val = str.charAt(i) - 'a';
            // System.out.println(val);
            int test_val = 1 << val;
            String test_val_b = convertIntegerToBinary(test_val);
            System.out.println(test_val_b);
            // System.out.println(test_val);
            int bit_op_one = checker & (1 << val);
            String bit_op_one_b = convertIntegerToBinary(bit_op_one);
            System.out.println(bit_op_one_b);
            boolean bool_op_one = (checker & (1 << val)) > 0;
            System.out.println(bool_op_one);
            if ((checker & (1 << val)) > 0) {
                return false;
            }
            checker |= (1 << val);
            String checker_b_2 = convertIntegerToBinary(checker);
            System.out.println(checker_b_2);
            // System.out.println(checker);
        }
        // Return statement
        return true;
    }
    
    public static String convertIntegerToBinary(int n) {
        if (n == 0) {
            return "0";
        }
        StringBuilder binaryNumber = new StringBuilder();
        while (n > 0) {
            int remainder = n % 2;
            binaryNumber.append(remainder);
            n /= 2;
        }
        binaryNumber = binaryNumber.reverse();
        return binaryNumber.toString();
    }
    
    
}
