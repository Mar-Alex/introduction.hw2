package school.lemon.changerequest.java.introduction.hw2;


public class Task6 {
    public static int[] reverse(int[] arr) {
        if(arr == null)
            return null;
        int[] reverse = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
            reverse[i] = arr[arr.length - 1 - i];
        return reverse;
    }
}
