package app.sunshine.com.example.android.androidlibrary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class AndroidLibActivity extends AppCompatActivity {
    TextView textView;


///
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_lib);
        textView = (TextView) findViewById(R.id.textjoke);

    }


    public void popupJokes(View view) {

        Intent intent = getIntent();
        String jokes = intent.getStringExtra("key");
        Toast.makeText(this, jokes, Toast.LENGTH_SHORT).show();

    }

    public void ShowJokes(View view) {

        Intent intent2 = getIntent();
        String jokes = intent2.getStringExtra("myjoke");
        textView.setText(jokes);



    }
}
