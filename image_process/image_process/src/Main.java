import Compresser.CompresserImpl1;
import Compresser.CompresserImpl2;
import Compresser.ICompresser;
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


        Filterdimage=framework.appliquerFiltre("Filter1",myimage);
        framework.showImage(Filterdimage);

        Filterdimage=framework.appliquerFiltre("Filter2",myimage);
        framework.showImage(Filterdimage);

        framework.setiCompresser(new CompresserImpl1());
        Compressedimage=framework.getiCompresser().compresser(myimage);
        framework.showImage(Compressedimage);


        framework.setiCompresser(new CompresserImpl2());
        Compressedimage=framework.getiCompresser().compresser(myimage);
        framework.showImage(Compressedimage);


    }
}
