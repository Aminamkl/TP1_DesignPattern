import Compresser.CompresserImpl1;
import Compresser.Compresser;
import filter.FilterImpl1;
import filter.FilterImpl2;
import filter.IFilter;

public class FrameworkImg {
    private IFilter iFilter;
    private Compresser Compresser;

    public FrameworkImg() {
    }

    public int[] appliquerFiltre(int[] data){
        return iFilter.filter(data);
    }

    public void showImage(int []image)
    {
        for(int i=0;i<image.length;i++){
            System.out.print(image[i]+" ");
        }
    }

    public IFilter getiFilter() {
        return iFilter;
    }

    public void setiFilter(IFilter iFilter) {
        this.iFilter = iFilter;
    }

    public Compresser getCompresser() {
        return Compresser;
    }

    public void setCompresser(Compresser compresser) {
        this.Compresser = compresser;
    }
}
