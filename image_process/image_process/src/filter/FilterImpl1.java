package filter;

import java.util.List;

public class FilterImpl1 implements IFilter {
    @Override
    public int[] filter(int[] data) {
        int[] filteredImage = new int[data.length];
        for (int i = 0; i <data.length ; i++) {
            filteredImage[i] = data[i]*45/7;
        }
        System.out.println("\nFilter using Implementation 1 : ");
        return  filteredImage;
    }
}
