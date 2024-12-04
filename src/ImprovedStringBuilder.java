
public class ImprovedStringBuilder {
    private String data;

    public ImprovedStringBuilder() {
        this.data = "";
    }


    public ImprovedStringBuilder(char[] chars) {
        this.data = new String(chars);
    }


    public ImprovedStringBuilder(String s) {
        this.data = s;
    }


    public ImprovedStringBuilder insert(int offset, ImprovedStringBuilder s) {
        this.data = new StringBuilder(this.data).insert(offset, s.data).toString();
        return this;
    }


    public ImprovedStringBuilder reverse() {
        this.data = new StringBuilder(this.data).reverse().toString();
        return this;
    }

    public ImprovedStringBuilder substring(int begin) {
        this.data = this.data.substring(begin);
        return this;
    }


    public ImprovedStringBuilder toUpperCase() {
        this.data = this.data.toUpperCase();
        return this;
    }


    public String toString() {
        return data;
    }

    public static void main(String[] args) {
        ImprovedStringBuilder sb1 = new ImprovedStringBuilder();
        System.out.println(sb1.toString()); // ""

        char[] chars = {'N', 'a', 'm', 'e', 'l', 'e', 's', 's'};
        ImprovedStringBuilder sb2 = new ImprovedStringBuilder(chars);
        System.out.println(sb2.toString());

        ImprovedStringBuilder sb3 = new ImprovedStringBuilder(" Hero");
        System.out.println(sb3.toString());
        sb2.insert(7, sb3);
        System.out.println(sb2.toString());

        sb2.reverse();
        System.out.println(sb2.toString());

        sb2.substring(4);
        System.out.println(sb2.toString());

        sb2.toUpperCase();
        System.out.println(sb2.toString());
    }
}