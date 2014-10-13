package iit.project.windenergy;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class Information extends Activity {
	
	private TextView tvGoalTitle;
	private TextView tvGoal;
	private TextView tvInspiration;
	private TextView tvInspirationTitle;
	private TextView tvJourney;
	private TextView tvJourneyTitle;
	private Typeface tvFont;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_information);
		tvInspirationTitle = (TextView) findViewById(R.id.info_tv_inspiration_title);
		tvInspiration = (TextView) findViewById(R.id.info_tv_inspiration);
		tvJourneyTitle = (TextView) findViewById(R.id.info_tv_journey_title);
		tvJourney = (TextView) findViewById(R.id.info_tv_journey);
		tvGoalTitle = (TextView) findViewById(R.id.info_tv_goal_title);
		tvGoal = (TextView) findViewById(R.id.info_tv_goal);
		
		
		tvFont = Typeface.createFromAsset(getAssets(), "fonts/architects_daughter_general.ttf");
		tvJourneyTitle.setTypeface(tvFont);
		tvJourney.setTypeface(tvFont);
		tvInspirationTitle.setTypeface(tvFont);
		tvInspiration.setTypeface(tvFont);
		tvGoalTitle.setTypeface(tvFont);
		tvGoal.setTypeface(tvFont);
		
		
	}

}
