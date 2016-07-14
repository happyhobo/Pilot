package us.pilot;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void playGame(View v){
        setContentView(R.layout.game);
    }

    public void gamePlay(){
        int castleHealth = 20;
        int wallHealth = 10;

    }
}
