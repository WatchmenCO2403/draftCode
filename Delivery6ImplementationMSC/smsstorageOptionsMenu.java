/*
Author: 	MSC
Date: 		21/04/2014
Purpose: 	My part of delivery 6 implementation of smartwatch application
Status: 	Language used is android/java and I still very much a newbie and android is a pain!
			I have tested every method, but not entirely sure if they are correct in terms 
			of specification or validation. It is difficult to understand a methods purpose based on one word!
Additional:	I have completed 'a' settings menu, sorry if stepped on anyone's toes (androidActivityOptionsMenu and main.xml) 
			covering(call; texts; voice mail; reply; find phone, application).
			This was part of my testing process and is different from diagram in delivery 2 because I could 
			not figure out how to implement 'Switch' button and decided to use toggleButton and customised it's appearance.

Dan Graller:			
SMSStorage
+addMessage(String)
+getMessages() : Iterable<String>
+readStorage(File)
+saveStorage(File)

OptionsMenu
+setOption(boolean)
+isOption() : boolean
// one setOption and one isOption for each option

SMSStorage:
 */
 
 
// public method for adding a new message 
// param string is the message to be appended to the file
public static void addMessage(String message)
{
	try 
	{
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("test/smsmessages.txt", true)));
		out.println(message);
		out.close();
	} catch (IOException e) {
		System.out.println("A write error has occurred");
	}
}
 
// public method for retrieving the stored messages
// Iterable<string> I am unfamiliar with and will research
// reading files line by line (not iterable?)
public static void getMessage() 
{
	try 
	{
		FileInputStream fstream = new FileInputStream("test/smsmessages.txt");
		DataInputStream in = new DataInputStream(fstream);
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		String str;
		while ((str = br.readLine()) != null) 
		{
			System.out.println(str);
		}
		in.close();
	} 
	catch (IOException e) 
	{
		System.out.println("A read error has occurred");
	}   
}        

// public method for retrieving the stored messages
// param fileAddress the name or location of file 
// returns List<string> containing messages for textual replies
public static List<String> getMessage(String fileAddress)
{
	List<String> messages = new ArrayList<>();
	try 
	{
		FileInputStream fstream = new FileInputStream(fileAddress);
		DataInputStream in = new DataInputStream(fstream);
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		String strLine;
		//Read File Line By Line
		while ((strLine = br.readLine()) != null) 
		{
			messages.add(strLine);
		}
		in.close();
	} 
	catch (IOException e) 
	{
		System.out.println("A read error has occurred");
	}
	return messages;
}



// public method for finding files names
// public method for opening directory and find files
// param fileAddress the name or location of file 
public static boolean readStorage(String fileAddress)
{
	File dir = new File(fileAddress);
        boolean bool = false;
	try
	{
            if(dir.exists())
            {
				/*
				// returns list of files in directory
				String[] files = dir.list();
				System.out.println(files.length + " files found...");
				for (int i = 0; i < files.length; i++) 
				{
					System.out.println(files[i]);
				}*/
                bool = true;
            }
            else
            {
                    System.out.println("Folder not found.");
            }
        }
	catch(Exception e)
	{
		e.printStackTrace();
	}
        
    return bool;
}


// public method for creating a file for persistent storage for messages.
// param File the name or location of file 
public static boolean saveStorage(String fileName)
{
	File dir = new File(fileName);
	boolean bool = false;
	try
	{
		if(dir.exists())
		{
			System.out.println("This file already exists!");
		}
		else
		{
			 System.out.println("File does not Exist");
			 bool = dir.createNewFile();
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
		
	return bool;
}

 
/*
OptionsMenu:
Watcher Application On/Off: toggle0
Voice Call 			On/Off: toggle1
Text Messaging 		On/Off: toggle2
Voice Mail 			On/Off:	toggle3
Instant Reply 		On/Off:	toggle4
Find Phone 			On/Off:	toggle5
 */
 
// public method for setting the Boolean value for the options:
// voice call; texts; voice mail; reply; find phone; application.
// param1: Boolean sets whether the functionality will be used on the SmartWatch
// param2: ToggleButton selects which option will be altered by param1
public static void setOption(Boolean bool, ToggleButton button)
{
	button.setChecked(bool);
}
 
 
 // public method to find the Boolean value of a settings option:
 // voice call; texts; voice mail; reply; find phone; application.
 // returns a boolean value of the state of the object
public static Boolean isOption(ToggleButton button)
{
	if (button.isChecked())
	{
		return true;
	}
	else
	{
		return false;
	}
}

 
 
 
 
 
 
 
 
 
 
 
 
 
