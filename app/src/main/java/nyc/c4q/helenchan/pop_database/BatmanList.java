package nyc.c4q.helenchan.pop_database;

import android.support.annotation.DrawableRes;

/**
 * Created by helenchan on 10/29/16.
 */
public class BatmanList {
    private final String mName;
    private final Integer mImage;

    public BatmanList (String name){
        mName = name;
        mImage = R.drawable.funkofirestorm;
    }

    public BatmanList (String name, @DrawableRes Integer resource){
        mName = name;
        mImage = resource;
    }
    public String getName() {

        return mName;
    }


    public Integer getImageResource() {
        return mImage;
    }
}
