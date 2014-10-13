package iit.project.windenergy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.widget.Toast;

public class Tutorial extends Activity {
	
	Uri video;
//	private String path;
//	private String path2;
//	private String path3;
//	private FileOutputStream outputStream;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tutorial_page);
		 File fileBrochure = new File(Environment.getExternalStorageDirectory().getPath()+"/start.blend");
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
		    		    File file = new File(Environment.getExternalStorageDirectory().getPath()+"/start.blend");        

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
		    		         Toast.makeText(Tutorial.this, "No Blender Player is present", Toast.LENGTH_SHORT).show();
		    		    }
		            } 
		            
		            catch (InterruptedException e) {
		                e.printStackTrace();
		            }
		        }
		    };
		    addDelay.start();
	
//		path ="/mnt/sdcard/netra3d/eyenav_withoutinstructions.blend";
//		
//		path2="/mnt/extsd/netra3d/eyenav_withoutinstructions.blend";
//		
//		path3=Environment.getExternalStorageDirectory()+"/netra3d/eyenav_withoutinstructions.blend";
		
//		String filepath = "android.resources:"+"//"+getPackageName()+"/raw/"+"phase1521.blend";
//		video = Uri.parse("android.resource://"+getPackageName()+"/raw/filename.blend");
//		file = new File(filepath);
//		
//		inputStream = getResources.openRawResources(R.raw.resource_id);
//				// write the inputStream to a FileOutputStream
//				File file = new File("fileurl");
//				outputStream = new FileOutputStream(file);
//
//				int read = 0;
//				byte[] bytes = new byte[1024];
//
//				while ((read = inputStream.read(bytes)) != -1) {
//				       outputStream.write(bytes, 0, read);
//				}
//				outputStream.close();
//				inputStream.close();
		
		
		
		
		
		  
	
	}

		//method to write the PDFs file to sd card
		    private void CopyAssetsbrochure() {
		    	InputStream inputStream = getApplicationContext().getResources().openRawResource(R.raw.start);
		        InputStreamReader inputreader = new InputStreamReader(inputStream);
		        BufferedReader buffreader = new BufferedReader(inputreader, 8192);

		         int Byte = 0;
		         FileWriter writer = null;
		       
		         try {
		          writer = new FileWriter(Environment.getExternalStorageDirectory().getPath()+"/start.blend");
		          do {
		          Byte = buffreader.read();
		          {writer.write(Byte);}
		          } while (Byte != -1);

		         } catch (IOException e) {
		           Log.v("Qaish"," I/O Exception 2 ");
		         }
		         finally {
		    if (writer != null) {
		     try {
		      writer.flush();
		      writer.close();
		     } catch (IOException e) {
		              Log.v("Qaish"," I/O Exception 4 ");
		     }
		    }
		         }
		    }
		    
		    private class TutorialTask extends AsyncTask< Void, Void, Void>
		    {
				@Override
				protected Void doInBackground(Void... params) {
					// TODO Auto-generated method stub
					
					 File fileBrochure = new File(Environment.getExternalStorageDirectory().getPath()+"/start.blend");
					    if (!fileBrochure.exists())
					    {
					         CopyAssetsbrochure();
					    } 
					return null;
				}

				@Override
				protected void onPostExecute(Void result) {
					// TODO Auto-generated method stub
					 /** Blender player code */
	    		    File file = new File(Environment.getExternalStorageDirectory().getPath()+"/start.blend");        

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
	    		         Toast.makeText(Tutorial.this, "No Blender Player is present", Toast.LENGTH_SHORT).show();
	    		    }
					super.onPostExecute(result);
				}

				@Override
				protected void onPreExecute() {
					// TODO Auto-generated method stub
					super.onPreExecute();
				}
		    
		    }
}
		      
		    


		
		
		

		//useful code
		
		//Creating the thread for the delay
//				Thread addDelay=new Thread()
//			    {
//
//			        public void run()
//			        {   
//
//			            try {
//			            	
//			            	//Adding the delay value here im ms
//			                sleep(5000);
//			                
//			                
////			                Intent for the Main Menu activity
//			               boolean temp = file.exists();
//			                if(true)
//			        		{
//			        		Intent intent = new Intent(Intent.ACTION_VIEW);
//			        		intent.setDataAndType(Uri.fromFile(file), "application/blender");
//			        		intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
//			        		startActivity(intent);
//			        		finish();
//			        		}
//			               finish();
//			               
//			            } 
//
//			            catch (InterruptedException e) {
//			                e.printStackTrace();
//			            }
//			        }
//			    };
//			    addDelay.start();
//			}
	


