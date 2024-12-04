public class EnhancedStringBuilder {
    private String data;


    public EnhancedStringBuilder(String s) {
        this.data = s;
    }


    public EnhancedStringBuilder append(EnhancedStringBuilder s) {
        this.data += s.data;
        return this;
    }


    public EnhancedStringBuilder append(int i) {
        this.data += i;
        return this;
    }


    public int length() {
        return data.length();
    }

    public char charAt(int index) {
        return data.charAt(index);
    }

    public EnhancedStringBuilder toLowerCase() {
        this.data = data.toLowerCase();
        return this;
    }

    public EnhancedStringBuilder substring(int begin, int end) {
        this.data = data.substring(begin, end);
        return this;
    }

    public String toString() {
        return data;
    }

    public static void main(String[] args) {
        EnhancedStringBuilder sb = new EnhancedStringBuilder("Nameless");
        sb.append(new EnhancedStringBuilder(" is not heroes")).append(789);
        System.out.println(sb.toString()); // Nameless is not heroes789

        sb.toLowerCase();
        System.out.println(sb.toString()); // nameless is not heroes789

        sb.substring(8, 11);
        System.out.println(sb.toString()); // is

        System.out.println(sb.length()); // 2
        System.out.println(sb.charAt(1)); // s
    }
}