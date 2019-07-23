public class Solution165 {
    public int compareVersion(String version1, String version2) {
        int from1 = 0, from2 = 0;
        while (from1 < version1.length() || from2 < version2.length()) {
            if (from1 >= version1.length()) {
                int to2 = version2.indexOf(".", from2);
                if (to2 == -1) {
                    to2 = version2.length();
                }
                int v2 = Integer.valueOf(version2.substring(from2, to2));
                if (v2 != 0) {
                    return -1;
                }
                from2 = to2 + 1;
                continue;
            } else if (from2 >= version2.length()) {
                int to1 = version1.indexOf(".", from1);
                if (to1 == -1) {
                    to1 = version1.length();
                }
                int v1 = Integer.valueOf(version1.substring(from1, to1));
                if (v1 != 0) {
                    return 1;
                }
                from1 = to1 + 1;
                continue;
            }
            int to1 = version1.indexOf(".", from1);
            int to2 = version2.indexOf(".", from2);
            if (to1 == -1) {
                to1 = version1.length();
            }
            if (to2 == -1) {
                to2 = version2.length();
            }
            int v1 = Integer.valueOf(version1.substring(from1, to1));
            int v2 = Integer.valueOf(version2.substring(from2, to2));
            if (v1 != v2) {
                return v1>v2 ? 1 : -1;
            }
            from1 = to1 + 1;
            from2 = to2 + 1;
        }
        return 0;
    }
}
