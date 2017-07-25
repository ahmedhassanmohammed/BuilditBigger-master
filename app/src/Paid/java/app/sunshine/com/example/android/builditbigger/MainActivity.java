package app.sunshine.com.example.android.builditbigger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.Jokes;

import app.sunshine.com.example.android.androidlibrary.AndroidLibActivity;

public class MainActivity extends AppCompatActivity  {


    private static final String TAG = "MainActivity";

//    private AdView mAdView;
    Jokes jokes = new Jokes();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//       mAdView = (AdView) findViewById(R.id.adView);
//        AdRequest adRequest = new AdRequest.Builder().build();
//        mAdView.loadAd(adRequest);

    }

    public void GotoJokesClicked(View view) {

        String joke = jokes.getJokes();

        Intent intent = new Intent(MainActivity.this, AndroidLibActivity.class);
        intent.putExtra("key",joke);
        startActivity(intent);


    }

    public void GotoLibJokeClicked(View view)
    {

        Intent i =new Intent(MainActivity.this,AndroidLibActivity.class);
        new EndpointsAsyncTask(i, MainActivity.this).execute();

    }
}
