import Compresser.CompresserImpl1;
import Compresser.CompresserImpl2;
import Compresser.Compresser;
import filter.FilterImpl1;
import filter.FilterImpl2;

public class Main {
    public static void main(String[] args) {
        int [] myimage=new int[10];
        int [] Filterdimage, Compressedimage;
        for (int i=0; i<10; i++){
            myimage[i]=(i+10)*6/2;
        }
        System.out.print("My image is : ");
        for (int i=0; i<10; i++){
            System.out.print(myimage[i] + "\t");
        }

        FrameworkImg framework=new FrameworkImg();

        framework.setiFilter(new FilterImpl1());
        Filterdimage=framework.appliquerFiltre(myimage);
        framework.showImage(Filterdimage);

        framework.setiFilter(new FilterImpl2());
        Filterdimage=framework.appliquerFiltre(myimage);
        framework.showImage(Filterdimage);

        framework.setCompresser(new CompresserImpl1());
        Compressedimage=framework.getCompresser().compresser(myimage);
        framework.showImage(Compressedimage);


        framework.setCompresser(new CompresserImpl2());
        Compressedimage=framework.getCompresser().compresser(myimage);
        framework.showImage(Compressedimage);


    }
}
