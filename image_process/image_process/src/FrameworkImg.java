import Compresser.CompresserImpl1;
import Compresser.Compresser;
import filter.FilterImpl1;
import filter.FilterImpl2;
import filter.IFilter;

public class FrameworkImg {
    private IFilter iFilter;
    private Compresser iCompresser;

    public FrameworkImg() {
        this.iFilter = new FilterImpl1();
        this.iCompresser = new CompresserImpl1();
    }

    public int[] appliquerFiltre(String filterName, int[] data){
        if(filterName.equals("Filter1")){
            iFilter=new FilterImpl1();
            data=iFilter.filter(data);
        }
        if(filterName.equals("Filter2")){
            iFilter=new FilterImpl2();
            data=iFilter.filter(data);
        }
        return data;
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

    public Compresser getiCompresser() {
        return iCompresser;
    }

    public void setiCompresser(Compresser iCompresser) {
        this.iCompresser = iCompresser;
    }
}
