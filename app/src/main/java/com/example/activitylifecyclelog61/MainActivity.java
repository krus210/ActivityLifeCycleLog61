package com.example.activitylifecyclelog61;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private final String LIFE_CYCLE = "life cycle";
    private static final String TEXTVIEW_STATE_KEY = "text view state";
    TextView textHelloWorld;
    private String msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textHelloWorld = findViewById(R.id.textHelloWorld);
//        if (savedInstanceState != null && savedInstanceState.containsKey(TEXTVIEW_STATE_KEY)) {
//            String savedText = savedInstanceState.getString(TEXTVIEW_STATE_KEY);
//            textHelloWorld.setText(savedText);
//        }
        msg = "onCreate";
        Log.d(LIFE_CYCLE, msg);
        textHelloWorld.append("\n" + msg);
    }

    @Override
    protected void onStart() {
        super.onStart();
        msg = "onStart";
        Log.d(LIFE_CYCLE, msg);
        textHelloWorld.append("\n" + msg);
    }

    @Override
    protected void onResume() {
        super.onResume();
        msg = "onResume";
        Log.d(LIFE_CYCLE, msg);
        textHelloWorld.append("\n" + msg);
    }

    @Override
    protected void onPause() {
        super.onPause();
        msg = "onPause";
        Log.d(LIFE_CYCLE, msg);
        textHelloWorld.append("\n" + msg);

    }

    @Override
    protected void onStop() {
        super.onStop();
        msg = "onStop";
        Log.d(LIFE_CYCLE, msg);
        textHelloWorld.append("\n" + msg);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        msg = "onDestroy";
        Log.d(LIFE_CYCLE, msg);
        textHelloWorld.append("\n" + msg);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        msg = "onRestart";
        Log.d(LIFE_CYCLE, msg);
        textHelloWorld.append("\n" + msg);
    }

    @Override
    public void onPostCreate(@Nullable Bundle savedInstanceState,
                             @Nullable PersistableBundle persistentState) {
        super.onPostCreate(savedInstanceState, persistentState);
        msg = "onPostCreate";
        Log.d(LIFE_CYCLE, msg);
        textHelloWorld.append("\n" + msg);
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        msg = "onPostResume";
        Log.d(LIFE_CYCLE, msg);
        textHelloWorld.append("\n" + msg);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        msg = "onKeyDown";
        Log.d(LIFE_CYCLE, msg);
        textHelloWorld.append("\n" + msg);
        return super.onKeyDown(keyCode, event);
//        return true; Don't work  onKeyLongPress and onBackPressed
    }

    @Override
    public boolean onKeyLongPress(int keyCode, KeyEvent event) {
        msg = "onKeyLongPress";
        Log.d(LIFE_CYCLE, msg);
        textHelloWorld.append("\n" + msg);
        return super.onKeyLongPress(keyCode, event);
    }

    @Override
    public void onBackPressed() {
        msg = "onBackPressed";
        Log.d(LIFE_CYCLE, msg);
        textHelloWorld.append("\n" + msg);
        super.onBackPressed();
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        msg = "onSaveInstanceState";
        Log.d(LIFE_CYCLE, msg);
        textHelloWorld.append("\n" + msg);
        outState.putString(TEXTVIEW_STATE_KEY, textHelloWorld.getText().toString());
        super.onSaveInstanceState(outState);

    }

    @Override
    public void onRestoreInstanceState(@Nullable Bundle savedInstanceState) {
        msg = "onRestoreInstanceState";
        Log.d(LIFE_CYCLE, msg);
        textHelloWorld.append("\n" + msg);
        if (savedInstanceState != null && savedInstanceState.containsKey(TEXTVIEW_STATE_KEY)) {
            String savedText = savedInstanceState.getString(TEXTVIEW_STATE_KEY);
            textHelloWorld.setText(savedText);
        }
        if (savedInstanceState != null) {
            super.onRestoreInstanceState(savedInstanceState);
        }

    }


}
