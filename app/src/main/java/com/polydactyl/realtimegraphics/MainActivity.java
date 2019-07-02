package com.polydactyl.realtimegraphics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.ArrayList;

/* FOR NOW ONLY
- Main Activity IS a Recipe
- defining a property(s) based on oils and values on this screen
 */


public class MainActivity extends AppCompatActivity {
    private ProgressBar progressBarA;
    private TextView pbAText;

    private SeekBar seekBar1;
    private SeekBar seekBar2;
    private SeekBar seekBar3;
    private TextView textView1;
    private TextView textView2;
    private TextView textView3;




    int sb1Val;
    int sb2Val;
    int sb3Val;
    double progressTotal;
    String TAG = "debug";

    int propertyA;
    Recipe recipe;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pbAText = (TextView) findViewById(R.id.pbAText);
        progressBarA = (ProgressBar) findViewById(R.id.progressBar1);
        seekBar1 = (SeekBar) findViewById(R.id.seekBar1);
        seekBar2 = (SeekBar) findViewById(R.id.seekBar2);
        seekBar3 = (SeekBar) findViewById(R.id.seekBar3);
        textView1 = (TextView) findViewById(R.id.textView1);
        textView2 = (TextView) findViewById(R.id.textView2);
        textView3 = (TextView) findViewById(R.id.textView3);




        seekBar1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                sb1Val = progress;
                calculatePercents();

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                sb2Val = progress;
                calculatePercents();

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        seekBar3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                sb3Val = progress;
                calculatePercents();


            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
    public void calculatePercents(){

        progressTotal = (double) sb1Val+sb2Val+sb3Val;
        Log.i(TAG, "Total = " + progressTotal);

        double percent1 = (double) (sb1Val/progressTotal)*100;
        double percent2 = (double) (sb2Val/progressTotal)*100;
        double percent3 = (double) (sb3Val/progressTotal)*100;

        textView1.setText("" + (int)percent1 + "%");
        textView2.setText("" +(int) percent2 + "%");
        textView3.setText("" + (int)percent3 + "%");

        // instantiate each Oil (separate class?)
        Oil lard = new Oil(0.198,	0	,6	,0,	1	,46,	28	,0,	13);
        Oil olive = new Oil(0.19,	0	,12,	1,	0,	69,	14,	0,	3);
        Oil ricebran = new Oil(0.187,	0,	34,	2,	1,	38,	22,	0,	3);
        Oil almond = new Oil(0.195,	0,	18,	0,	0,	71	,7,	0,	0);

        // instantiate recipe
        recipe = new Recipe(new ArrayList<Ingredient>());

        recipe.ingredients.add(new Ingredient(lard,sb1Val));
        recipe.ingredients.add(new Ingredient(olive,sb2Val));
        recipe.ingredients.add(new Ingredient(ricebran,sb3Val));
        recipe.ingredients.add(new Ingredient(almond,0));

        double totalBarHardness = (
                percent1*(lard.getHardness()) + percent2*(olive.getHardness()) + percent3*(ricebran.getHardness())
                );

        progressBarA.setProgress  ((int)totalBarHardness/100);
        pbAText.setText(Double.toString(totalBarHardness/100));

        }

}
