import java.util.Objects;

public class Resolution {
    private String res;
    public Resolution(String res){
        if(Objects.equals(res, "1920*1080")){
            this.res="FULL HD";
        } else if (Objects.equals(res, "1440*2560")) {
            this.res="2K";
        } else if (Objects.equals(res, "3840*2160")) {
            this.res="4K";
        }else{
            this.res="Invalid resolution";
        }
    }
    public String getRes(){
        return this.res;
    }
}
