package codingwithmitch.com.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    //vars
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<Integer> mImageUrls = new ArrayList<>();
    private ArrayList<String> intro = new ArrayList<>();
    private ArrayList<String> rec = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: started.");

        initImageBitmaps();
    }

    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls.add(R.drawable.cookie);
        mNames.add("Cookie");
        intro.add("qweqqwew \nasdasd qwqweqweqweqweqw\neqwew qeqweqwqweqweqweqweqwe qwewqeq weqw");
        rec.add("qwer\n1234\n1qaz\n2wsx");

        mImageUrls.add(R.drawable.cake);
        mNames.add("Cake");
        intro.add("asdasdasdasdasdasdasdsaasd \nzxczxczxcasdasda\n dxbzdzbdafgbga");
        rec.add("asdf\n5678\n3edc\4rfv");

        mImageUrls.add(R.drawable.bread);
        mNames.add("Bread");
        intro.add("zxczxczxczxczxczxczxcz\nasdasdx\nbbbbbb");
        rec.add("zxcv\n90-=\n5tgb\n6yhn");

        mImageUrls.add(R.drawable.pudding);
        mNames.add("Pudding");
        intro.add("tyutyutyutyutyutyutyu\ndfhndfiugbaiubhfik\nujavbsfuiawebfujwbfk");
        rec.add("tyui\n1234\n7ujm\n8ik9");


        mImageUrls.add(R.drawable.tart);
        mNames.add("Tart");
        intro.add("ghjghjghjghjghjghjghj\nzxjchbusdkaf");
        rec.add("ghjk\n5678\nol0p");

        mImageUrls.add(R.drawable.salad);
        mNames.add("Salad");
        intro.add("bnmbnmbnmbnmbnmbnmbnmbnmbn\nbasdfugvsdaufvsudkfa\nsbnavuysafgvbuawbvuki\nasidfhuiwsfhbaisu");
        rec.add("bnm,");


        initRecyclerView();
    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mNames, mImageUrls, intro, rec);
        recyclerView.setAdapter(adapter);
        recyclerView.addItemDecoration(new DividerItemDecoration(recyclerView.getContext(), DividerItemDecoration.VERTICAL));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}






















