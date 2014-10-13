package iit.project.windenergy;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class Concept extends Activity {

	private TextView tvWindBack;
	private TextView tvWindToElec;
	private Typeface tf;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_concept);
		tf = Typeface.createFromAsset(getAssets(), "fonts/architects_daughter_general.ttf");
		tvWindBack = (TextView) findViewById(R.id.concept_tv_windback);
		tvWindToElec = (TextView) findViewById(R.id.concept_tv_windtoelec);
		tvWindBack.setTypeface(tf);
		tvWindToElec.setTypeface(tf);
	}

}
