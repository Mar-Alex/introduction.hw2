package school.lemon.changerequest.java.introduction.hw2;

public class Task1 {
    public static String makeTags(String tag, String text) {

        String result = String.format("<%1$s>%2$s</%1$s>", tag, text);
        return result;

    }
}
