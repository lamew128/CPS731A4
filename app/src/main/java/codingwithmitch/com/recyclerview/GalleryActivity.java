package codingwithmitch.com.recyclerview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * Created by User on 1/2/2018.
 */

public class GalleryActivity extends AppCompatActivity {

    private static final String TAG = "GalleryActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        Log.d(TAG, "onCreate: started.");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getIncomingIntent();
    }

    private void getIncomingIntent(){
        Log.d(TAG, "getIncomingIntent: checking for incoming intents.");

        if(getIntent().hasExtra("image_url") && getIntent().hasExtra("rec")){
            Log.d(TAG, "getIncomingIntent: found intent extras.");

            int imageUrl = getIntent().getIntExtra("image_url",0);
            String rec = getIntent().getStringExtra("rec");

            setImage(imageUrl, rec);
        }
    }


    private void setImage(int imageUrl, String rec){
        Log.d(TAG, "setImage: setting te image and name to widgets.");

        TextView name = findViewById(R.id.image_description);
        name.setText(rec);

        ImageView image = findViewById(R.id.image);
        image.setImageDrawable(getResources().getDrawable(imageUrl));
    }

}


















