package karman.com.googleanalytics;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;


public class SecondActivity extends AppCompatActivity {

    private static String TAG = MainActivity.class.getSimpleName ();

    private Toolbar mToolbar;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_second);
        mToolbar = (Toolbar) findViewById (R.id.toolbar);
        setSupportActionBar (mToolbar);
        getSupportActionBar ().setDisplayShowHomeEnabled (true);
    }
}