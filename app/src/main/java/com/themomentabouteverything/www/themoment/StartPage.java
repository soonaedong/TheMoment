package com.themomentabouteverything.www.themoment;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import java.io.InputStream;

public class StartPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_page);
        AssetManager am = getResources().getAssets();
        InputStream is = null;
        try{
            is = am.open("StartPage.jpg");
            Bitmap bm = BitmapFactory.decodeStream(is) ;

            ImageView imageView = (ImageView) findViewById(R.id.StartPage) ;
            imageView.setImageBitmap(bm) ;
            imageView.setLeft(40);
            is.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(is != null)
        {
            try
            {
                is.close();
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
