package Compresser;

public class CompresserImpl2 extends Compresser {

    @Override
    public int[] compresser(int[] data) {
        int[] compressedImage = new int [data.length/3];
        for (int i = 0; i < compressedImage.length; i++) {
            compressedImage[i] = data[i];
        }
        System.out.println("\nCompresse using Implementation 2 : ");
        return compressedImage;
    }
}
