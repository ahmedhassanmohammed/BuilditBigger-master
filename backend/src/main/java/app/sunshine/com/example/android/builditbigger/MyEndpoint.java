/*
   For step-by-step instructions on connecting your Android application to this backend module,
   see "App Engine Java Endpoints Module" template documentation at
   https://github.com/GoogleCloudPlatform/gradle-appengine-templates/tree/master/HelloEndpoints
*/

package app.sunshine.com.example.android.builditbigger;

import com.example.Jokes;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

import javax.inject.Named;

/**
 * An endpoint class we are exposing
 */
@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "builditbigger.android.example.com.sunshine.app",
                ownerName = "builditbigger.android.example.com.sunshine.app",
                packagePath = ""
        )
)
public class MyEndpoint {

    Jokes jokes = new Jokes();
    /**
     * A simple endpoint method that takes a name and says Hi back
     */
    @ApiMethod(name = "sayHi")
    public MyBean sayHi(@Named("name") String name) {
        MyBean response = new MyBean();
        response.setData("Hi, " + name);

        return response;
    }
    @ApiMethod(name = "GetLibJokes")
    public MyBean GetLibJokes() {
        MyBean response = new MyBean();
        String joke = jokes.getJokes();
        response.setData(joke);

        return response;
    }

}
