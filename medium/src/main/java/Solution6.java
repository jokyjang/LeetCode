public interface Solution6 {
    String convert(String s, int numRows);

    class Buffer implements Solution6 {
        @Override
        public String convert(String s, int numRows) {
            StringBuilder[] sbs = new StringBuilder[numRows];
            for (int i = 0; i < sbs.length; ++i) {
                sbs[i] = new StringBuilder();
            }

            int index = 0;
            boolean inc = true;
            for (int i = 0; i < s.length(); ++i) {
                sbs[index].append(s.charAt(i));
                if (inc && index == numRows - 1) {
                    index = Math.max(0, index - 1);
                    inc = false;
                } else if (inc && index != numRows - 1) {
                    index++;
                } else if (!inc && index == 0) {
                    index = Math.min(index + 1, sbs.length - 1);
                    inc = true;
                } else {
                    index--;
                }
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < sbs.length; ++i) {
                sb.append(sbs[i].toString());
            }
            return sb.toString();
        }
    }

    class Mathmatical implements Solution6 {
        @Override
        public String convert(String s, int numRows) {
            if (numRows == 1) {
                return s;
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < numRows; ++i) {
                int index = i;
                boolean up = false;
                while (index < s.length()) {
                    sb.append(s.charAt(index));
                    if (!up && index != index + 2 * (numRows - 1 - i)) {
                        index = index + 2 * (numRows - 1 - i);
                        up = !up;
                    } else if (up && index != index + 2 * i) {
                        index = index + 2 * i;
                        up = !up;
                    } else if (!up && index == index + 2 * (numRows - 1 - i)) {
                        index = index + 2 * i;
                    } else {
                        index = index + 2 * (numRows - 1 - i);
                    }
                }
            }
            return sb.toString();
        }
    }
}
