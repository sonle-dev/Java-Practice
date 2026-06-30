public class MEDIUM_Zigzag_Conversion {
    public static String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int currentRow = 0;
        boolean goingDown = false;

        for (char c : s.toCharArray()) {
            rows[currentRow].append(c);

            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;
            }

            // Di chuyển dòng tiếp theo
            currentRow += goingDown ? 1 : -1;
        }


        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }

    public static void main(String[] args) {

        String s1 = "PAYPALISHIRING";
        int numRows1 = 3;
        String result1 = convert(s1, numRows1);
        System.out.println("Test Case 1:");
        System.out.println("Input: s = \"" + s1 + "\", numRows = " + numRows1);
        System.out.println("Output: \"" + result1 + "\"");
        System.out.println("Expected: \"PAHNAPLSIIGYIR\"\n");

        int numRows2 = 4;
        String result2 = convert(s1, numRows2);
        System.out.println("Test Case 2:");
        System.out.println("Input: s = \"" + s1 + "\", numRows = " + numRows2);
        System.out.println("Output: \"" + result2 + "\"");
        System.out.println("Expected: \"PINALSIGYAHRPI\"");

    }
}