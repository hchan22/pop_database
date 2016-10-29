package nyc.c4q.helenchan.pop_database;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.Arrays;
import java.util.List;

import static android.R.attr.name;

/**
 * Created by helenchan on 10/29/16.
 */
public class BatmanAdapter extends RecyclerView.Adapter {
    private List<BatmanList> batmanList = Arrays.asList(
            new BatmanList("Batman", R.drawable.funkobatman),
            new BatmanList("Flashpoint Batman", R.drawable.flashpointbatman),
            new BatmanList("Blue Rainbow Batman", R.drawable.bluerainbatman),
            new BatmanList("Orange Rainbow Batman", R.drawable.orangerainbatman),
            new BatmanList("Pink Rainbow Batman", R.drawable.pinkrainbatman),
            new BatmanList("Yellow Batman", R.drawable.yellowrainbowbatman),
            new BatmanList("Purple Rainbow Batman", R.drawable.purplerainbatman),
            new BatmanList("Green Rainbow Batman", R.drawable.greenrainbatman),
            new BatmanList("SDCC Metallic Blue Batman", R.drawable.metallic_batman),
            new BatmanList("Batman Beyond Metallic", R.drawable.batmanbeyondmetallic),
            new BatmanList("Dark Knight Trilogy Batman", R.drawable.darkknightbatman),
            new BatmanList("Dark Knight Trilogy Patina Batman", R.drawable.drkpatinabatman)
    );

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new BatmanViewHolder(parent);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        BatmanViewHolder viewHolder = (BatmanViewHolder) holder;
        BatmanList batman = batmanList.get(position);
        viewHolder.bind(batman);
        viewHolder.setOnClickListener(batmanClickListener(batman));

    }

    private View.OnClickListener batmanClickListener(BatmanList batman){
        if(batman != null){
            return new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), BatmanView.class);
                    intent.putExtra(BatmanView.BATMAN_NAME, name);
                    view.getContext().startActivity(intent);
                }
            };
        }
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        };
    }


    @Override
    public int getItemCount() {
        return batmanList.size();
    }
}
