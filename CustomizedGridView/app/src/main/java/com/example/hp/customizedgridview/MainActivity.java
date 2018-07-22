package com.example.hp.customizedgridview;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends Activity {
    GridView gridView;

    String CakeList[] = {"Anniversary Cake", "Baby Shower Cake", "Birth Day Cake", "Christmas Special", "Kids Cake", "Mother's Day Special", "MultiLayered Cake", "Photo Cake", "Summer Short Cake", "Valentines Special", "Wedding Cake"};
    int lettersIcon[] = {R.drawable.ann, R.drawable.bbs, R.drawable.bdc, R.drawable.chsp, R.drawable.kc, R.drawable.mds, R.drawable.mmlc, R.drawable.pc, R.drawable.ssc, R.drawable.vs, R.drawable.wc };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            gridView = (GridView) findViewById(R.id.gridView);
            GridAdapter adapter = new GridAdapter(MainActivity.this, lettersIcon, CakeList);

            gridView.setAdapter(adapter);

            gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Toast.makeText(MainActivity.this, "Clicked Item -" + CakeList[position], Toast.LENGTH_LONG).show();

                }
            });
        }
    }
