package iit.project.windenergy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.widget.TextView;


public class SplashScreen extends Activity {

	private TextView mainTitle1;
	private Typeface typeface;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash_screen);
//		mainTitle1 = (TextView) findViewById(R.id.splash_screen_tv_title);
		typeface = Typeface.createFromAsset(getAssets(), "fonts/orange_juice_title.ttf");
//		mainTitle1.setTypeface(typeface);
		
		//Creating the thread for the delay
		
		Thread addDelay=new Thread()
	    {

	        public void run()
	        {   

	            try {
	            	
	            	//Adding the delay value here im ms
	                sleep(3000);
	                finish();
	                
	                //Intent for the Main Menu activity
	                Intent nextActivity=new Intent(SplashScreen.this,MainMenu.class);
	                startActivity(nextActivity);
	            } 

	            catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	    };
	    addDelay.start();
	}

	
}


