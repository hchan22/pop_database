package nyc.c4q.helenchan.pop_database;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.Arrays;
import java.util.List;

/**
 * Created by helenchan on 10/27/16.
 */
public class PopListAdapter extends RecyclerView.Adapter {
    private List<PopDescription> popData = Arrays.asList(
            new PopDescription("Batman", R.drawable.funkobatman),
            new PopDescription("Shazam", R.drawable.funkoshazam),
            new PopDescription("Wonder Woman", R.drawable.funkowonderwoman),
            new PopDescription("Flash", R.drawable.funkoflash),
            new PopDescription("Batgirl", R.drawable.batgirl),
            new PopDescription("Riddler", R.drawable.riddler),
            new PopDescription("Superboy", R.drawable.funkosuperboy),
            new PopDescription("Firestorm", R.drawable.funkofirestorm),
            new PopDescription("Superman", R.drawable.funkosuperman),
            new PopDescription("Green Lantern", R.drawable.greenlantern),
            new PopDescription("Penguin", R.drawable.penguin)


    );

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new PopViewHolder(parent);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        PopViewHolder addingPops = (PopViewHolder) holder;
        PopDescription displayPops = popData.get(position);
        addingPops.bind(displayPops);
        addingPops.setOnClickListener(popClickListener(displayPops));
    }

    private View.OnClickListener popClickListener(PopDescription displayPops) {
        if (displayPops != null){
            return goToPopDescription(displayPops.getName());
        }
        return defaultClickListener();
    }



    private View.OnClickListener goToPopDescription(final String name) {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), PopView.class );
                intent.putExtra(PopView.POP_NAME, name);
                view.getContext().startActivity(intent);
            }
        };
    }

    private View.OnClickListener defaultClickListener() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        };
    }

    @Override
    public int getItemCount() {
        return popData.size();
    }

}
