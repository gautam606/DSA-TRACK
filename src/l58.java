public class l58 {
    public static void main(String[] args) {
        String s="hello world";
        String t="   fly me   to   the moon  ";
        String u="luffy is still joyboy";

        t.trim();
        String[]words=t.split(" ");
        String lastword=words[words.length-1];
        int len=lastword.length();
        System.out.println(len);

    }
}
