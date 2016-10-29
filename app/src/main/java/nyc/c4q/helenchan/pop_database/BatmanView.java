package nyc.c4q.helenchan.pop_database;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by helenchan on 10/29/16.
 */

public class BatmanView extends AppCompatActivity {
    public static final String BATMAN_NAME = "batman";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.batman_view);
        String getBatman = getIntent().getStringExtra(BATMAN_NAME);
        if(getBatman != null){
            switch (getBatman){
                case "Blue Metallic Batman":
                    getBlueMetallicBatman();
                    break;
            }
        }
    }

    private void getBlueMetallicBatman() {
        getFragmentManager().beginTransaction().add(R.id.wherethebatmangoes, new MetallicBlueBatman()).commit();
    }
}
