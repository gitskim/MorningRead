package com.logicdevil.morningread;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.logicdevil.morningread.api.cache.RedditCache;
import com.logicdevil.morningread.api.controller.RedditController;
import com.logicdevil.morningread.api.events.FetchedArticlesEvent;
import com.logicdevil.morningread.api.response.Response4Content;

import butterknife.InjectView;


public class MainActivity extends ActionBarActivity {
    @InjectView(R.id.id_text_view)
    protected TextView mTextView;
    private static final String TAG = MainActivity.class.getSimpleName();
    private static RedditController mRedditController = RedditController.getsInstance();
    private static RedditCache mRedditCache = RedditCache.getsInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRedditController.fetchRedditArticles();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    //region EventBus
    @SuppressWarnings("UnusedDeclaration")
    public void onEventMainThread(FetchedArticlesEvent event) {
        //TODO: hideLaoding as well as showLoading
        if (event.isSuccess()) {
            Log.d(TAG, "event success");
            Response4Content response4Content = mRedditCache.loadResponse();
                mTextView.setText(response4Content.getDomain());
        } else {
            Log.d(TAG, "could not get response 4");
        }

    }
    //endregion
}
