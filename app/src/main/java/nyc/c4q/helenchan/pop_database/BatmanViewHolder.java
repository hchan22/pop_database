package nyc.c4q.helenchan.pop_database;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by helenchan on 10/29/16.
 */
public class BatmanViewHolder extends RecyclerView.ViewHolder {
    private View batmanview;
    private TextView batmanNameText;
    private ImageView batmenImage;

    public BatmanViewHolder(ViewGroup parent) {
        super(inflateView(parent));
        batmanview = itemView;
        batmanNameText = (TextView) batmanview.findViewById(R.id.batmen_name);
        batmenImage = (ImageView) batmanview.findViewById(R.id.batmen_pics);
    }

    private static View inflateView(ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return inflater.inflate(R.layout.batman_view_holder, parent, false);
    }

    public void bind(BatmanList batman) {
        batmanNameText.setText(batman.getName());
        Integer resource = batman.getImageResource();
        if (resource != null){
            batmenImage.setImageResource(resource);
        }
    }


    public TextView getName(){

        return batmanNameText;
    }


    public void setOnClickListener(View.OnClickListener onClickListener) {
        batmanview.setOnClickListener(onClickListener);
    }
}
