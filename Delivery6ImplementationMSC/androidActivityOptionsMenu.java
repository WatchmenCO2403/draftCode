/*
Author: 	MSConnolly
Date:		21/04/2014
Purpose:	Basic settings menu for SmartWatch Application: Watcher
Additional:	Appearance is different from design in Technical Plans of delivery 2.
			Because Switch buttons proved to be beyond the ability of the author,
			who resorted to using a customised version of toggleButtons.
*/

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.ToggleButton;

public class settingsTestWindow extends Activity {
	
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		
		//---ToggleButtons---
		ToggleButton toggleButton0 = (ToggleButton) findViewById(R.id.toggle0);
		//toggleButton5.setChecked(true); On becomes the default option
		toggleButton0.setOnClickListener(new View.OnClickListener()
		{
			public void onClick(View view)
			{
				if (((ToggleButton)view).isChecked())
					DisplayToast("Watcher Application is On");
				else
					DisplayToast("Watcher Application is Off");
			}
		}
		);
		
		ToggleButton toggleButton1 = (ToggleButton) findViewById(R.id.toggle1);
		toggleButton1.setOnClickListener(new View.OnClickListener()
		{
			public void onClick(View view)
			{
				if (((ToggleButton)view).isChecked())
					DisplayToast("Voice Call is On");
				else
					DisplayToast("Voice Call is Off");
			}
		}
		);
		
		ToggleButton toggleButton2 =	(ToggleButton) findViewById(R.id.toggle2);
		toggleButton2.setOnClickListener(new View.OnClickListener()
		{
			public void onClick(View view)
			{
				if (((ToggleButton)view).isChecked())
					DisplayToast("Text Messaging is On");
				else
					DisplayToast("Text Messaging is Off");
			}
		}
		);
		
		ToggleButton toggleButton3 = (ToggleButton) findViewById(R.id.toggle3);
		toggleButton3.setOnClickListener(new View.OnClickListener()
		{
			public void onClick(View view) 
			{
				if (((ToggleButton)view).isChecked())
					DisplayToast("Voice Mail is On");
				else
					DisplayToast("Voice Mail is Off");
			}
		}
		);
		
		ToggleButton toggleButton4 = (ToggleButton) findViewById(R.id.toggle4);
		toggleButton4.setOnClickListener(new View.OnClickListener()
		{
			public void onClick(View view) 
			{
				if (((ToggleButton)view).isChecked())
					DisplayToast("Instant Reply is On");
				else
					DisplayToast("Instant Reply is Off");
			}
		}
		);
		
		ToggleButton toggleButton5 = (ToggleButton) findViewById(R.id.toggle5);
		toggleButton5.setOnClickListener(new View.OnClickListener()
		{
			public void onClick(View view) 
			{
				if (((ToggleButton)view).isChecked())
					DisplayToast("Find Phone is On");
				else
					DisplayToast("Find Phone is Off");
			}
		}
		);
		
	}

	private void DisplayToast(String msg)
	{
		Toast.makeText(getBaseContext(), msg,
				Toast.LENGTH_SHORT).show();
	}

}