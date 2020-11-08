package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final int[] predictions = { R.drawable.ball1, R.drawable.ball2, R.drawable.ball3,
            R.drawable.ball4, R.drawable.ball5 };

        Button btAsk;
        final ImageView imgPredict;

        btAsk = (Button) findViewById(R.id.btAsk);
        imgPredict = (ImageView) findViewById(R.id.imgMagic);

        btAsk.setOnClickListener(new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Log.d("M8B", "In btAsk onClick");

                Random random = new Random();
                int ball = random.nextInt(4);
                int j;
                /*
                This does not wort as the refresh of the image does not work.
                Like in VB I wanted to force a UI refresh.
                I may be doable with imageView.invalidte(), but that doee not work.
                Internet says that it must somehow be done in a async thread.
                As it's not important for today, I will stop here.
                for (int i=0; i<20; i++) {
                    j=i%5;
                    Log.d ("M8B", "Runde" + j);
                    imgPredict.setImageResource(predictions[j]);
                    imgPredict.invalidate();
                    Thread.Sleep(1000);;
                }*/
                Log.d ("M8B", "Final image" + ball);
                imgPredict.setImageResource(predictions[ball]);
            }
        } );
    }
}
