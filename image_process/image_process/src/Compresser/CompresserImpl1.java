package Compresser;

public class CompresserImpl1 extends Compresser {

    @Override
    public int[] compresser(int[] data) {
        int[] compressedImage = new int [data.length/2];
        for (int i = 0; i < compressedImage.length; i++) {
            compressedImage[i] = data[i];
        }
        System.out.println("\nCompresse using Implementation 1 : ");
        return compressedImage;
    }
}
