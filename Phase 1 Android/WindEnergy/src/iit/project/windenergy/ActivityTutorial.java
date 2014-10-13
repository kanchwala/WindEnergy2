package iit.project.windenergy;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.widget.Toast;

public class ActivityTutorial extends Activity {

	
	Uri video;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_activitytutorial);

		
		 File fileBrochure = new File(Environment.getExternalStorageDirectory().getPath()+"/windactivity.blend");
		    if (!fileBrochure.exists())
		    {
		         CopyAssetsbrochure();
		    } 

		    Thread addDelay=new Thread()
		    {

		        public void run()
		        {   

		            try {
		            	
		            	//Adding the delay value here im ms
		                sleep(3000);
		                finish();
		                
		                //Intent for the Main Menu activity
		                /** Blender player code */
		    		    File file = new File(Environment.getExternalStorageDirectory().getPath()+"/windactivity.blend");        

		    		    Intent intent = new Intent(Intent.ACTION_VIEW);
		    		    intent.setDataAndType(Uri.fromFile(file),"application/blender");
		    		    intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
		    		    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		    		    try 
		    		    {
		    		        getApplicationContext().startActivity(intent);
		    		    } 
		    		    catch (ActivityNotFoundException e) 
		    		    {
		    		         Toast.makeText(ActivityTutorial.this, "No Blender Player is present", Toast.LENGTH_SHORT).show();
		    		    }
		            } 
		            
		            catch (InterruptedException e) {
		                e.printStackTrace();
		            }
		        }
		    };
		    addDelay.start();
	
	
	}

		//method to write the PDFs file to sd card
		    private void CopyAssetsbrochure() {
//		    	InputStream inputStream = getApplicationContext().getResources().openRawResource(R.raw.windactivity);
//		        InputStreamReader inputreader = new InputStreamReader(inputStream);
//		        BufferedReader buffreader = new BufferedReader(inputreader, 8192);
//
//		         int Byte = 0;
//		         FileWriter writer = null;
//		       
//		         try {
//		          writer = new FileWriter(Environment.getExternalStorageDirectory().getPath()+"/windactivity.blend");
//		          do {
//		          Byte = buffreader.read();
//		          {writer.write(Byte);}
//		          } while (Byte != -1);
//
//		         } catch (IOException e) {
//		           Log.v("Qaish"," I/O Exception 2 ");
//		         }
//		         finally {
//		    if (writer != null) {
//		     try {
//		      writer.flush();
//		      writer.close();
//		     } catch (IOException e) {
//		              Log.v("Qaish"," I/O Exception 4 ");
//		     }
//		    }
//		         }
		    	InputStream is =getApplicationContext().getResources().openRawResource(R.raw.windactivity);
		    	File outputFile = new File(Environment.getExternalStorageDirectory().getPath(), "windactivity.blend");
		    	

		    	//Now copy is to os. I'd recommend using Apache Commons IO
		    
		    }
}
		    
	

