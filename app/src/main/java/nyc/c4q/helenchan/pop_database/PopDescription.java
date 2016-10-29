package nyc.c4q.helenchan.pop_database;

import android.support.annotation.DrawableRes;

/**
 * Created by helenchan on 10/27/16.
 */

public class PopDescription {
    private final String popName;
    private final Integer popPic;

    public PopDescription(String name) {
        popName = name;
        popPic = R.drawable.funkoflash;
    }

    public PopDescription(String name, @DrawableRes Integer resource) {
        popName = name;
        popPic =resource;
    }

    public String getName(){
        return popName;
    }

    public Integer getPopPic() {

        return popPic;
    }
}
