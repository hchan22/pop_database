package nyc.c4q.helenchan.pop_database;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by helenchan on 10/28/16.
 */
public class Batman extends Fragment {
    private RecyclerView batmanRecyclerView;
    private RecyclerView.LayoutManager layoutManager;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.batman_description, container, false);
        batmanRecyclerView = (RecyclerView) view.findViewById(R.id.batman_recycler_view);
        layoutManager = new GridLayoutManager(getActivity(),1, GridLayoutManager.HORIZONTAL, false);
        batmanRecyclerView.setLayoutManager(layoutManager);
        batmanRecyclerView.setAdapter(new BatmanAdapter());
        return view;

    }

}
