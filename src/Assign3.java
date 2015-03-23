import java.util.Scanner;
import javax.swing.JOptionPane;
public class Assign3 {
		
		public static void main(String[] args)
		{int i;
		String username,password,newusername,newpassword,selection;
		Scanner keyboard=new Scanner(System.in);
		System.out.println("Create new username");
		newusername=keyboard.nextLine();
		System.out.println("Create new password");
		newpassword=keyboard.nextLine();

		String[] choices = { "Admin", "Student", "Staff"};
		String input = (String) JOptionPane.showInputDialog(null, "Choose account type...","Account Type",JOptionPane.QUESTION_MESSAGE, null,choices,choices[1]); 
		System.out.println(input);

		for (i=0;i<3;i++)
			{username=JOptionPane.showInputDialog("Enter username");
			if (username.compareTo(newusername)!=0)
				JOptionPane.showMessageDialog(null,"Username not correct");
			else 	
				{password=JOptionPane.showInputDialog("Enter password");
				if (password.compareTo(newpassword)!=0)
					JOptionPane.showMessageDialog(null,"Password not correct");
				else break;
				}
			}
		if (i==3) JOptionPane.showMessageDialog(null,"Please contact your adminstrator to unlock your account!");
		else {selection=JOptionPane.showInputDialog("Enter your account type");
			while (selection.compareTo(input)!=0)
			{selection=JOptionPane.showInputDialog("Wrong Account type. Enter your account type");}
			if(selection.compareTo("Admin")==0)
				i=1;
			else	{
				if(selection.compareTo("Student")==0)
				i=2;
				else	{
					if(selection.compareTo("Staff")==0)
					i=3;
					else i=4;
					}
				}
		switch (i) {
				case 1:
				JOptionPane.showMessageDialog(null,"Welcome Admin "+newusername+"! You can update and read file.");
				break;
				case 2:
				JOptionPane.showMessageDialog(null,"Welcome Student "+newusername+"! You can only read file.");
				break;
				case 3:
				JOptionPane.showMessageDialog(null,"Welcome Staff "+newusername+"! You can update, read, add, delete file.");
				break;
				}	
			}	
		keyboard.close();
		System.exit(0);
		}
	}