package filter;

public class FilterImpl2 implements IFilter {
    @Override
    public int[] filter(int[] data) {
        int[] filteredImage = new int[data.length];
        for (int i = 0; i <data.length ; i++) {
            filteredImage[i] = data[i]*3-12;
        }
        System.out.println("\nFilter using Implementation 2 : ");
        return  filteredImage;
    }
}
