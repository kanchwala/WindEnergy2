package iit.project.windenergy;

import iit.project.windenergy.R.id;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainMenu extends Activity {
	
	private TextView mainTitle1;
	private Typeface buttonFont;
	private Typeface typeFace;
	private Button btnStart;
	private Button btnActivity;
	private Button btnConcept;
	private Button btnInformation;
	private Button btnExit;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_menu);
		
		
		//giving id value to tv and btn obj
		mainTitle1 = (TextView) findViewById(R.id.main_menu_tv_title);
		
		btnStart = (Button) findViewById(id.main_menu_btn_start);		
		btnActivity = (Button) findViewById(R.id.main_menu_btn_activity);
		btnConcept = (Button) findViewById(R.id.main_menu_btn_concept);
		btnInformation = (Button) findViewById(R.id.main_menu_btn_info);
		btnExit = (Button) findViewById(R.id.main_menu_btn_exit);
		
		//create and assign typeface of title
		buttonFont = Typeface.createFromAsset(getAssets(), "fonts/architects_daughter_general.ttf");
		btnStart.setTypeface(buttonFont);
		btnActivity.setTypeface(buttonFont);
		btnConcept.setTypeface(buttonFont);
		btnInformation.setTypeface(buttonFont);
		btnExit.setTypeface(buttonFont);
		
		//create and assign typeface of buttons
		typeFace = Typeface.createFromAsset(getAssets(), "fonts/orange_juice_title.ttf");
		mainTitle1.setTypeface(typeFace);
		
		
	}
	
	
	//on click of start
	public void onClickStart(View v){
		
		Intent intent = new Intent(MainMenu.this, Tutorial.class);
		startActivity(intent);
		
		
	}
	
	//on click of Activity
	public void onClickActivity(View v){
		
		Intent intent = new Intent(MainMenu.this, ActivityTutorial.class);
		startActivity(intent);
		
	}
	
	//on click of info
	public void onClickInformation(View v){
		
		Intent goTo = new Intent();
		goTo.setClass(MainMenu.this, Information.class);
		startActivity(goTo);
		
		
	}
	
	
	//on click of concept
	public void onClickConcept(View v){
		
		Intent goTo = new Intent();
		goTo.setClass(MainMenu.this, Concept.class);
		startActivity(goTo);
		
	}
	
	
	//on click of exit button
	public void onClickExit(View v){
		
		finish();
		
	}
	
	
	
	
	

}
