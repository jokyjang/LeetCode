public class Solution273 {
    public String numberToWords(int num) {
        String[] set1 = new String[]{
            "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
        };
        String[] set2 = new String[]{
            "Zero", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
        };
        StringBuilder sb = new StringBuilder();
        if (num < 20) {
            sb.append(set1[num]);
        } else if (num < 100) {
            sb.append(set2[num/10]);
            if (num % 10 != 0) {
                sb.append(" ");
                sb.append(numberToWords(num % 10));
            }
        } else if (num < 1000) {
            sb.append(set1[num/100]);
            sb.append(" Hundred");
            if (num % 100 != 0) {
                sb.append(" ");
                sb.append(numberToWords(num % 100));
            }
        } else if (num < 1000000) {
            sb.append(numberToWords(num / 1000));
            sb.append(" Thousand");
            if (num % 1000 != 0) {
                sb.append(" ");
                sb.append(numberToWords(num % 1000));
            }
        } else if (num < 1000000000) {
            sb.append(numberToWords(num / 1000000));
            sb.append(" Million");
            if (num % 1000000 != 0) {
                sb.append(" ");
                sb.append(numberToWords(num % 1000000));
            }
        } else {
            sb.append(numberToWords(num / 1000000000));
            sb.append(" Billion");
            if (num % 1000000000 != 0) {
                sb.append(" ");
                sb.append(numberToWords(num % 1000000000));
            }
        }
        return sb.toString();
    }
}
