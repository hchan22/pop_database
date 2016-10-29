package nyc.c4q.helenchan.pop_database;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by helenchan on 10/27/16.
 */
public class PopViewHolder extends RecyclerView.ViewHolder {
    private final View mView;
    private final ImageView mPopPic;

    public PopViewHolder(ViewGroup parent) {
        super(inflateView(parent));
        mView = itemView;
        mPopPic = (ImageView) mView.findViewById(R.id.pop_holder_imageview);
    }


    private static View inflateView(ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return inflater.inflate(R.layout.pop_holder, parent, false);
    }

    public void bind(PopDescription holder){
        Integer resource = holder.getPopPic();
        if (resource != null){
            mPopPic.setImageResource(resource);
        }
    }

    public void setOnClickListener(View.OnClickListener clickListener) {
        mView.setOnClickListener(clickListener);
    }
}
