package nyc.c4q.helenchan.pop_database;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by helenchan on 10/27/16.
 */
public class PopView extends AppCompatActivity {
    public static final String POP_NAME = "Freddy Funko";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pop_view);
        String popName = getIntent().getStringExtra(POP_NAME);
        if(popName != null){
            switch (popName){
                case "Batman":
                    showBatmanDescription();
                    break;

            }
        }
    }

    private void showBatmanDescription() {
        getFragmentManager().beginTransaction().add(R.id.popdatabaseview, new Batman()).commit();
    }
}
