package nyc.c4q.helenchan.pop_database;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView)findViewById(R.id.imageview);

        Picasso.with(this).load("http://i.imgur.com/82JLuR0.png").into(imageView);


    }
    public void openDatabase(View view){
        Intent intent = new Intent(this, DatabaseActivity.class);
        startActivity(intent);
    }
}
