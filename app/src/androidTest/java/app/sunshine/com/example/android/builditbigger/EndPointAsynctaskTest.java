package app.sunshine.com.example.android.builditbigger;

import android.os.AsyncTask;
import android.test.InstrumentationTestCase;

import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;
import com.google.api.client.googleapis.services.AbstractGoogleClientRequest;
import com.google.api.client.googleapis.services.GoogleClientRequestInitializer;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import app.sunshine.com.example.android.builditbigger.myApi.MyApi;

/**
 * Created by Ahmed Hassan on 7/13/2017.
 */

public class EndPointAsynctaskTest extends InstrumentationTestCase {


    private static MyApi myApiService = null;
    AsyncTask asyncTaskObject;
    String Result;
    CountDownLatch countDownLatch;


    public void test() throws Throwable {

        countDownLatch = new CountDownLatch(1);
        asyncTaskObject = new AsyncTask<Object, Void, String>() {
            @Override
            protected String doInBackground(Object... params) {
                if (myApiService == null) {  // Only do this once
                    MyApi.Builder builder = new MyApi.Builder(AndroidHttp.newCompatibleTransport(),
                            new AndroidJsonFactory(), null)
                            // options for running against local devappserver
                            // - 10.0.3.2 is localhost's IP address in Android emulator
                            // - turn off compression when running against local devappserver
                            .setRootUrl("http://10.0.3.2:8080/_ah/api/")
                            .setGoogleClientRequestInitializer(new GoogleClientRequestInitializer() {
                                @Override
                                public void initialize(AbstractGoogleClientRequest<?> abstractGoogleClientRequest) throws IOException {
                                    abstractGoogleClientRequest.setDisableGZipContent(true);
                                }
                            });
                    // end options for devappserver

                    myApiService = builder.build();
                }

//        context = params[0].first;
//        String name = params[0].second;

                try {
                    return String.valueOf(myApiService.getLibJokes().execute().getData());
                } catch (IOException e) {
                    return e.getMessage();
                }
            }

            @Override
            protected void onPostExecute(String result) {
                super.onPostExecute(result);

                Result = result;
                countDownLatch.countDown();
            }
        };

        runTestOnUiThread(new Runnable() {
            @Override
            public void run() {

                asyncTaskObject.execute();
            }});

        countDownLatch.await(10, TimeUnit.SECONDS);
        assertEquals(Result.isEmpty(), false);
    }
}

