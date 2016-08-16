package mooc.vandy.java4android.diamonds.logic;

/**
 * Created by ahmad on 8/14/2016.
 */
public class Pyramidcreateup{
    public String prymcreat(int sizes){
        String pyramidcreates= null;
        String finalpyramstruc;

        if(sizes % 2 ==0){
            pyramidcreates = "--";
                for(int i = 2; i < sizes; i++){
                 pyramidcreates= pyramidcreates + "--";
            }
        }
            else{
            pyramidcreates = "==";
                for(int i = 2; i < sizes; i++){
                    pyramidcreates= pyramidcreates + "==";

            }
        }

        finalpyramstruc = pyramidcreates ;
        return finalpyramstruc;
    }

public  String pyrmcreatedown(int sizes){
    String pyramidcreatesdown;
    String finalpyramstrucdown;

        if(sizes %2 ==0) {
            pyramidcreatesdown = "--";
            for (int i = sizes; i > 2; i--) {
                pyramidcreatesdown = pyramidcreatesdown + "--";
            }
        }
            else {
            pyramidcreatesdown = "==";
            for (int i = sizes; i > 2; i--) {
                pyramidcreatesdown = pyramidcreatesdown + "==";

            }
        }
    finalpyramstrucdown = pyramidcreatesdown;

    return finalpyramstrucdown;
}


}

