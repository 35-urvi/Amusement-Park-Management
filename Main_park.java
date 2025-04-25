import java.util.*;
class Main_park
{
	Scanner sc=new Scanner(System.in);
	String name;
	long m_no;
	String password;
	String e_mail;
	int BT_e,BT_c,TJ_e,TJ_c,SM_e,SM_c,WP_e,WP_c,RD_e,RD_c;
	int TE_e,TE_c,SD_e,SD_c,RE_e,RE_c,FC_e,FC_c,TP_e,TP_c;
	int pizza,burger,pav_bhaji,sandwiches,icecream;
	int total_advanturepark,total_waterpark,total_foodpark;
	
	
	
	static
	{
		System.out.println("************************************************************************************************");
		System.out.println("----------------------------welcome to online amusement park booking----------------------------");
		System.out.println("************************************************************************************************");
	}
	
	
	Main_park()
	{
		System.out.println("Enter below details to sign in");
		System.out.println("Enter your name");
		name=sc.nextLine();
		name=name.toUpperCase();
		System.out.println("Enter your mobile no.");
		System.out.println("mobile number must have 10 digits");
		boolean temp=true;
		while(temp)
		{
		m_no=sc.nextLong();
		String t=m_no+"";
			if(t.length()==10)
			{
						temp=false;
			}
			else
			{
				System.out.println("Enter 10 digits valid Mobile number");
			}
		}
		
		sc.nextLine();
		System.out.println("Enter email id");
		int m=0;
		while(m==0)
		{
			int countd=0;
			int counta=0;
			e_mail=sc.nextLine();
			e_mail.toLowerCase();
			for(int i=0;i<e_mail.length();i++)
			{
				if(e_mail.charAt(i)=='@')
				{
					counta++;
				}
				else if(e_mail.charAt(i)=='.')
				{
					if(i!=e_mail.length()-1)
					{
						if(e_mail.charAt(i+1)=='.')
						{
							break;
						}
						else
						{
							countd++;
						}
					}
					else
					{
						countd++;
					}
				}
				else if(e_mail.charAt(i)>='a' && e_mail.charAt(i)<='z')
				{
					continue;
				}
				else if(e_mail.charAt(i)>='0' && e_mail.charAt(i)<='9')
				{
					continue;
				}
				else
				{
					counta=0;
					break;
				}
			}
			if(counta==1 && countd>=1)
			{
				m++;
			}
			else
			{
				System.out.println("Enter valid email id");
			}
		}
		System.out.println("Password length must be 6 (3 character and 3 digits)"); 
		boolean temp1=true;
		while(temp1)
		{
			password=sc.nextLine();
			int c_count=0;
			int d_count=0;
			for(int i=0;i<password.length();i++)
			{
				if((password.charAt(i)>='A' && password.charAt(i)<='Z') || (password.charAt(i)>='a' && password.charAt(i)<='z'))
				{
					c_count++;
				}
				else if(password.charAt(i)>='0' && password.charAt(i)<='9')
				{
					d_count++;
				}
			}
			if(c_count==3 && d_count==3)
			{
					temp1=false;
			}
			else
			{
				System.out.println("Enter valid password");
			}
		}
		System.out.println("confirm password");
		int temp2=0;
		while(temp2==0)
		{	
			String confirm_pass=sc.nextLine();
			if(password.equals(confirm_pass))
			{
				temp2=1;
			}
			else
			{
				System.out.println("password and confirm password must be same");
			}
		}
	System.out.println("sign in successfully");
	System.out.println("...........................................................................................");
	System.out.println("");
	}
	
	
	void login()
	{
		System.out.println("Enter below details to login");
		System.out.println("sign in details and login details must be same");
		System.out.println("Enter your mobile no.");
		long m_no1=sc.nextLong();
		boolean b1=true;
		while(b1)
		{
			if(m_no1==m_no)
			{
				b1=false;
				sc.nextLine();
			}
			else
			{
				System.out.println("your entered mobile number is does not match with sign in mobile number");
				m_no1=sc.nextLong();
				
			}
		}
		
		System.out.println("Enter your Email Id");
		String mail;
		boolean r=true;
		while(r)
		{
			mail=sc.nextLine();
			mail.toLowerCase();
			if(mail.equals(e_mail))
			{
				r=false;
			}
			else
			{
				System.out.println("your entered email is does not match with sign in e mail");
				r=true;
			}
			
		}
		
		String password1;
		boolean b2=true;
		while(b2)
		{
			System.out.println("Enter your password");
			password1=sc.nextLine();
			if(password1.equals(password))
			{
				b2=false;
			}
			
			else
			{
				System.out.println("your entered password is does not match with sign in password");
				System.out.println("Press 1 for forgot password");
				System.out.println("Press 2 for next try");
				System.out.println("Enter your choice");
				int c=sc.nextInt();
				sc.nextLine();
					switch(c)
					{
						case 1: 
							String g=forgot_pass();
							System.out.println("___________________________");
							System.out.println("your password is "+g);
							System.out.println("___________________________");
							sc.nextLine();
							b2=true;
							break;
						case 2:
							b2=true;
							break;
						default:
							System.out.println("Enter valid choice");
							break;
					}			
				
			}
		}
		System.out.println("login successfully");
		System.out.println("...........................................................................................");
	}
	
	
	String forgot_pass()
	{
		System.out.println("Press 1 to Enter your mobile no. to see your password");
		System.out.println("Press 2 to Enter your Email to see your password");
		System.out.println("Enter your choice");
		int c;
		do
		{
		c=sc.nextInt();
		switch(c)
		{
		case 1:
				System.out.println("Enter your mobile no. to see your password");
				long m_no1=sc.nextLong();
				boolean b1=true;
				while(b1)
				{
					if(m_no1==m_no)
					{
						b1=false;
					}
					else
					{
						System.out.println("your entered mobile number is does not match with sign in mobile number");
						m_no1=sc.nextLong();
						
					}
				}
				return password;
		case 2:
				sc.nextLine();
				System.out.println("Enter your Email to see your password");
				String mail=sc.nextLine();
				boolean b2=true;
				while(b2)
				{
					if(mail.equals(e_mail))
					{
						b2=false;
					}
					else
					{
						System.out.println("your entered email is does not match with sign in email");
						mail=sc.nextLine();
						
					}
				}
				return password;
		default:
				System.out.println("Enter valid choice");
				return forgot_pass();
		}
		}while(c!=1 || c!=2);
		
	}
	
	void water_park()
	{
		System.out.println("Enter below deatils for water park rides");
		System.out.println("Enter total number of person above age 12 for ride Bid thunder");
		boolean u=true;
		while(u)
		{
			BT_e=sc.nextInt();
			if(BT_e>=0)
			{
				u=false;
			}
			else
			{
				System.out.println("Enter valid number of person");
			}
		}
		total_waterpark=total_waterpark+(BT_e*300);
		System.out.println("Enter total number of person below age 12 or age 12 for ride Bid thunder");
		u=true;
		while(u)
		{
			BT_c=sc.nextInt();
			if(BT_c>=0)
			{
				u=false;
			}
			else
			{
				System.out.println("Enter valid number of person");
			}
		}
		total_waterpark=total_waterpark+(BT_c*250);
		
		System.out.println("Enter total number of person above age 12 for ride Tumble Jumble");
		u=true;
		while(u)
		{
			TJ_e=sc.nextInt();
			if(TJ_e>=0)
			{
				u=false;
			}
			else
			{
				System.out.println("Enter valid number of person");
			}
		}
		total_waterpark=total_waterpark+(TJ_e*200);
		System.out.println("Enter total number of person below age 12 or age 12 for ride Tumble Jumble");
		u=true;
		while(u)
		{
			TJ_c=sc.nextInt();
			if(TJ_c>=0)
			{
				u=false;
			}
			else
			{
				System.out.println("Enter valid number of person");
			}
		}
		total_waterpark=total_waterpark+(TJ_c*180);
		
		System.out.println("Enter total number of person above age 12 for ride Splash mountaindance ");
		u=true;
		while(u)
		{
			SM_e=sc.nextInt();
			if(SM_e>=0)
			{
				u=false;
			}
			else
			{
				System.out.println("Enter valid number of person");
			}
		}
		total_waterpark=total_waterpark+(SM_e*150);
		System.out.println("Enter total number of person below age 12 or age 12 for ride Splash mountain");
		u=true;
		while(u)
		{
			SM_c=sc.nextInt();
			if(SM_c>=0)
			{
				u=false;
			}
			else
			{
				System.out.println("Enter valid number of person");
			}
		}
		total_waterpark=total_waterpark+(SM_c*120);
		
		System.out.println("Enter total number of person above age 12 for ride Wave pool ");
		u=true;
		while(u)
		{
			WP_e=sc.nextInt();
			if(WP_e>=0)
			{
				u=false;
			}
			else
			{
				System.out.println("Enter valid number of person");
			}
		}
		total_waterpark=total_waterpark+(WP_e*120);
		System.out.println("Enter total number of person below age 12 or age 12 for ride Wave pool ");
		u=true;
		while(u)
		{
			WP_c=sc.nextInt();
			if(WP_c>=0)
			{
				u=false;
			}
			else
			{
				System.out.println("Enter valid number of person");
			}
		}
		total_waterpark=total_waterpark+(WP_c*90);
		
		System.out.println("Enter total number of person above age 12 for Rain dance ");
		u=true;
		while(u)
		{
			RD_e=sc.nextInt();
			if(RD_e>=0)
			{
				u=false;
			}
			else
			{
				System.out.println("Enter valid number of person");
			}
		}
		total_waterpark=total_waterpark+(RD_e*100);
		System.out.println("Enter total number of person below age 12 or age 12 for Rain dance");
		u=true;
		while(u)
		{
			RD_c=sc.nextInt();
			if(RD_c>=0)
			{
				u=false;
			}
			else
			{
				System.out.println("Enter valid number of person");
			}
		}
		total_waterpark=total_waterpark+(RD_c*80);
	}
	
	
	void advanture_park()
	{
		System.out.println("Enter below details for advantuare park rides");			
		System.out.println("Enter total number of person above age 12 for ride Trilling Engine");
		boolean u=true;
		while(u)
		{
			TE_e=sc.nextInt();
			if(TE_e>=0)
			{
				u=false;
			}
			else
			{
				System.out.println("Enter valid number of person");
			}
		}
		total_advanturepark=total_advanturepark+(TE_e*500);
		System.out.println("Enter total number of person below age 12 or age 12 for ride Trilling Engine");
		u=true;
		while(u)
		{
			TE_c=sc.nextInt();
			if(TE_c>=0)
			{
				u=false;
			}
			else
			{
				System.out.println("Enter valid number of person");
			}
		}
		total_advanturepark=total_advanturepark+(TE_c*420);
		
		System.out.println("Enter total number of person above age 12 for ride Sky Drop");
		u=true;
		while(u)
		{
			SD_e=sc.nextInt();
			if(SD_e>=0)
			{
				u=false;
			}
			else
			{
				System.out.println("Enter valid number of person");
			}
		}
		total_advanturepark=total_advanturepark+(SD_e*300);
		System.out.println("Enter total number of person below age 12 or age 12 for ride Sky Drop");
		u=true;
		while(u)
		{
			SD_c=sc.nextInt();
			if(SD_c>=0)
			{
				u=false;
			}
			else
			{
				System.out.println("Enter valid number of person");
			}
		}
		total_advanturepark=total_advanturepark+(SD_c*270);
		
		System.out.println("Enter total number of person above age 12 for ride Racer's Edge ");
		u=true;
		while(u)
		{
			RE_e=sc.nextInt();
			if(RE_e>=0)
			{
				u=false;
			}
			else
			{
				System.out.println("Enter valid number of person");
			}
		}
		total_advanturepark=total_advanturepark+(RE_e*250);
		System.out.println("Enter total number of person below age 12 or age 12 for ride Racer's Edge");
		u=true;
		while(u)
		{
			RE_c=sc.nextInt();
			if(RE_c>=0)
			{
				u=false;
			}
			else
			{
				System.out.println("Enter valid number of person");
			}
		}
		total_advanturepark=total_advanturepark+(RE_c*230);
		
		System.out.println("Enter total number of person above age 12 for ride Flying carousel ");
		u=true;
		while(u)
		{
			FC_e=sc.nextInt();
			if(FC_e>=0)
			{
				u=false;
			}
			else
			{
				System.out.println("Enter valid number of person");
			}
		}
		total_advanturepark=total_advanturepark+(FC_e*150);
		System.out.println("Enter total number of person below age 12 or age 12 for ride Flying carousel ");
		u=true;
		while(u)
		{
			FC_c=sc.nextInt();
			if(FC_c>=0)
			{
				u=false;
			}
			else
			{
				System.out.println("Enter valid number of person");
			}
		}
		total_advanturepark=total_advanturepark+(FC_c*100);
		
		System.out.println("Enter total number of person above age 12 for Trampoline park");
		u=true;
		while(u)
		{
			TP_e=sc.nextInt();
			if(TP_e>=0)
			{
				u=false;
			}
			else
			{
				System.out.println("Enter valid number of person");
			}
		}
		total_advanturepark=total_advanturepark+(TP_e*120);
		System.out.println("Enter total number of person below age 12 or age 12 for Trampoline park");
		u=true;
		while(u)
		{
			TP_c=sc.nextInt();
			if(TP_c>=0)
			{
				u=false;
			}
			else
			{
				System.out.println("Enter valid number of person");
			}
		}
		total_advanturepark=total_advanturepark+(TP_c*80);
		
	}
	void food_park()
	{
		System.out.println("Enter below details for food park");
		System.out.println("Enter total quantity of pizza ");
		do
		{
			pizza=sc.nextInt();
			if(pizza>=0)
			{
				break;
			}
			else
			{
				System.out.println("Enter valid quantity");
			}				
		}while(pizza<0);
		total_foodpark=total_foodpark+(pizza*200);
		System.out.println("Enter total quantity of pav-bhaji");
		do
		{
			pav_bhaji=sc.nextInt();
			if(pav_bhaji>=0)
			{
				break;
			}
			else
			{
				System.out.println("Enter valid quantity");
			}				
		}while(pav_bhaji<0);
		total_foodpark=total_foodpark+(pav_bhaji*80);
		System.out.println("Enter total quantity of burger");
		do
		{
			burger=sc.nextInt();
			if(burger>=0)
			{
				break;
			}
			else
			{
				System.out.println("Enter valid quantity");
			}				
		}while(burger<0);
		total_foodpark=total_foodpark+(burger*100);
		System.out.println("Enter total quantity of sandwiches");
		do
		{
			sandwiches=sc.nextInt();
			if(sandwiches>=0)
			{
				break;
			}
			else
			{
				System.out.println("Enter valid quantity");
			}				
		}while(sandwiches<0);
		total_foodpark=total_foodpark+(sandwiches*120);
		System.out.println("Enter total quantity of icecream");
		do
		{
			icecream=sc.nextInt();
			if(icecream>=0)
			{
				break;
			}
			else
			{
				System.out.println("Enter valid quantity");
			}				
		}while(icecream<0);
		total_foodpark=total_foodpark+(icecream*50);
		
	}
	
	void bill()
	{
		System.out.println("");
		System.out.println("water park bill:");
		System.out.println("__________________________________________________________________________________________");
		System.out.println("     Rides     "+"     Price     "+"Total person"+"     Price     "+"Total person"+"     Total");
		System.out.println("               "+"    (age>12)   "+"  (age>12)  "+"   (age<=12)   "+"  (age<=12) "+"          ");
		System.out.println("___________________________________________________________________________________________");
		System.out.println("");
		System.out.print("Big thunder    "+"      300      "+"     "+BT_e);
		String p=BT_e+"";
				for(int i=0; i<8-p.length();i++)
				{
					System.out.print(" ");
				}
				System.out.print("     250     "+"        "+BT_c);
				p=BT_c+"";
				for(int i=0; i<11-p.length();i++)
				{
					System.out.print(" ");
				}
			System.out.print((300*BT_e)+(250*BT_c));
			System.out.println("");
		System.out.print("Tumble Jumble  "+"      200      "+"     "+TJ_e);
		p=TJ_e+"";
				for(int i=0; i<8-p.length();i++)
				{
					System.out.print(" ");
				}
				System.out.print("     180     "+"        "+TJ_c);
				p=TJ_c+"";
				for(int i=0; i<11-p.length();i++)
				{
					System.out.print(" ");
				}
			System.out.print((200*TJ_e)+(180*TJ_c));
			System.out.println("");
		System.out.print("splash mountain"+"      150      "+"     "+SM_e);
		p=SM_e+"";
				for(int i=0; i<8-p.length();i++)
				{
					System.out.print(" ");
				}
				System.out.print("     120     "+"        "+SM_c);
				p=SM_c+"";
				for(int i=0; i<11-p.length();i++)
				{
					System.out.print(" ");
				}
			System.out.print((150*SM_e)+(120*SM_c));
			System.out.println("");
		System.out.print("wave pool      "+"      120      "+"     "+WP_e);
		p=WP_e+"";
				for(int i=0; i<8-p.length();i++)
				{
					System.out.print(" ");
				}
				System.out.print("     90      "+"        "+WP_c);
				p=WP_c+"";
				for(int i=0; i<11-p.length();i++)
				{
					System.out.print(" ");
				}
			System.out.print((120*WP_e)+(90*WP_c));
			System.out.println("");
		System.out.print("Rain dance     "+"      100      "+"     "+RD_e);
		p=RD_e+"";
				for(int i=0; i<8-p.length();i++)
				{
					System.out.print(" ");
				}
				System.out.print("     80      "+"        "+RD_c);
				p=RD_c+"";
				for(int i=0; i<11-p.length();i++)
				{
					System.out.print(" ");
				}
			System.out.print((100*RD_e)+(80*RD_c));
			System.out.println(""+'\n');
		System.out.println("___________________________________________________________________________________________");
		System.out.println("                                                                     Total="+total_waterpark);
		System.out.println("___________________________________________________________________________________________");
		System.out.println("");
		System.out.println("advantuare park bill:");
		System.out.println("__________________________________________________________________________________________");
		System.out.println("     Rides     "+"     Price     "+"Total person"+"     Price     "+"Total person"+"     Total");
		System.out.println("               "+"    (age>12)   "+"  (age>12)  "+"   (age<=12)   "+"  (age<=12) "+"          ");
		System.out.println("___________________________________________________________________________________________");
		System.out.println("");
		System.out.print("Trilling Engine"+"      500      "+"     "+TE_e);
				p=TE_e+"";
				for(int i=0; i<8-p.length();i++)
				{
					System.out.print(" ");
				}
				System.out.print("     420     "+"        "+TE_c);
				p=TE_c+"";
				for(int i=0; i<11-p.length();i++)
				{
					System.out.print(" ");
				}
			System.out.print((500*TE_e)+(420*TE_c));
		System.out.println("");
		System.out.print("Sky Drop       "+"      300      "+"     "+SD_e);
			p=SD_e+"";
					for(int i=0; i<8-p.length();i++)
					{
						System.out.print(" ");
					}
			System.out.print("     270     "+"        "+SD_c);
			p=SD_c+"";
					for(int i=0; i<11-p.length();i++)
					{
						System.out.print(" ");
					}
			System.out.print((300*SD_e)+(270*SD_c));
		System.out.println("");
		System.out.print("Racer's Edge   "+"      250      "+"     "+RE_e);
			p=RE_e+"";
					for(int i=0; i<8-p.length();i++)
					{
						System.out.print(" ");
					}
			System.out.print("     230     "+"        "+RE_c);
			p=RE_c+"";
					for(int i=0; i<11-p.length();i++)
					{
						System.out.print(" ");
					}
			System.out.print((250*RD_e)+(230*RE_c));
		System.out.println("");
		System.out.print("Flying carousel"+"      150      "+"     "+FC_e);
				p=FC_e+"";
					for(int i=0; i<8-p.length();i++)
					{
						System.out.print(" ");
					}
				System.out.print("     100     "+"        "+FC_c);
				p=FC_c+"";
					for(int i=0; i<11-p.length();i++)
					{
						System.out.print(" ");
					}
				System.out.print((150*FC_e)+(100*FC_c));	
		System.out.println("");
		System.out.print("Trampoline park"+"      120      "+"     "+TP_e);
				p=TP_e+"";
					for(int i=0; i<8-p.length();i++)
					{
						System.out.print(" ");
					}
				System.out.print("     80      "+"        "+TP_c);
				p=TP_c+"";
					for(int i=0; i<11-p.length();i++)
					{
						System.out.print(" ");
					}
				System.out.print((120*TP_e)+(80*TP_c));
		System.out.println(""+'\n');
		System.out.println("___________________________________________________________________________________________");
		System.out.println("                                                                     Total="+total_advanturepark);
		System.out.println("___________________________________________________________________________________________");
		System.out.println("");
		System.out.println("food park bill:");
		System.out.println("___________________________________________________________________________________________");
		System.out.println("     Items     "+""+"    Price     "+""+"  Quantity  "+"     Total");
		System.out.println("___________________________________________________________________________________________");
		System.out.println("");
		System.out.print("Pizza          "+""+"     200      "+""+"     "+pizza);
		p=pizza+"";
		for(int i=0; i<13-p.length();i++)
		{
			System.out.print(" ");
		}
		System.out.print(200*pizza);
		System.out.println("");
		System.out.print("Pav-Bhaji      "+""+"     80       "+""+"     "+pav_bhaji);
		p=pav_bhaji+"";
		for(int i=0; i<13-p.length();i++)
		{
			System.out.print(" ");
		}
		System.out.print(80*pav_bhaji);
		System.out.println("");
		System.out.print("Burger         "+""+"     100      "+""+"     "+burger);
		p=burger+"";
		for(int i=0; i<13-p.length();i++)
		{
			System.out.print(" ");
		}
		System.out.print(100*burger);
		System.out.println("");
		System.out.print("Sandwiches     "+""+"     120      "+""+"     "+sandwiches);
		p=sandwiches+"";
		for(int i=0; i<13-p.length();i++)
		{
			System.out.print(" ");
		}
		System.out.print(120*sandwiches);
		System.out.println("");
		System.out.print("Icecream       "+""+"     50       "+""+"     "+icecream);
		p=icecream+"";
		for(int i=0; i<13-p.length();i++)
		{
			System.out.print(" ");
		}
		System.out.print(50*icecream);
		System.out.println("");
		System.out.println("___________________________________________________________________________________________");
		System.out.println("                                         Total="+total_foodpark);                  
		System.out.println("___________________________________________________________________________________________");
		System.out.println("");
		System.out.println("Your amusement park total bill is "+(total_waterpark+total_advanturepark+total_foodpark));
		System.out.println("");
	}
	
	void update_ticket()
	{
		int ch1;
		do
		{
			System.out.println("Press 1 for update regarding water park ticket");
			System.out.println("Press 2 for update regarding advantuare park ticket");
			System.out.println("Press 3 for exit");
			System.out.println("Enter your choice");
			ch1=sc.nextInt();
		switch(ch1)
		{
			case 1:
					int ch2;
					do
					{
						System.out.println("Update regarding water park ticket");
						System.out.println("Press 1 to update person of ride Big thunder");
						System.out.println("Press 2 to update person of ride Tumble Jumble");
						System.out.println("Press 3 to update person of ride Splash mountain");
						System.out.println("Press 4 to update person of ride Wave pool");
						System.out.println("Press 5 to update person of ride Rain dance");
						System.out.println("Press 6 to Exit");
						System.out.println("Enter your choice");
						ch2=sc.nextInt();
						switch(ch2)
						{
						case 1:
								total_waterpark=total_waterpark-(BT_e*300);
								total_waterpark=total_waterpark-(BT_c*250);
								System.out.println("Enter new number of person above age 12 for ride Bid thunder");
									boolean u=true;
									while(u)
									{
										BT_e=sc.nextInt();
										if(BT_e>=0)
										{
											u=false;
										}
										else
										{
											System.out.println("Enter valid number of person");
										}
									}
									total_waterpark=total_waterpark+(BT_e*300);
									System.out.println("Enter new number of person below age 12 or age 12 for ride Bid thunder");
									u=true;
									while(u)
									{
										BT_c=sc.nextInt();
										if(BT_c>=0)
										{
											u=false;
										}
										else
										{
											System.out.println("Enter valid number of person");
										}
									}
									total_waterpark=total_waterpark+(BT_c*250);
								break;
						case 2:
								total_waterpark=total_waterpark-(TJ_e*200);
								total_waterpark=total_waterpark-(TJ_c*180);
								System.out.println("Enter new number of person above age 12 for ride Tumble Jumble");
								u=true;
								while(u)
								{
									TJ_e=sc.nextInt();
									if(TJ_e>=0)
									{
										u=false;
									}
									else
									{
										System.out.println("Enter valid number of person");
									}
								}
								total_waterpark=total_waterpark+(TJ_e*200);
								System.out.println("Enter new number of person below age 12 or age 12 for ride Tumble Jumble");
								u=true;
								while(u)
								{
									TJ_c=sc.nextInt();
									if(TJ_c>=0)
									{
										u=false;
									}
									else
									{
										System.out.println("Enter valid number of person");
									}
								}
								total_waterpark=total_waterpark+(TJ_c*180);
		
								break;
						case 3:
								total_waterpark=total_waterpark-(SM_e*150);
								total_waterpark=total_waterpark-(SM_c*120);
								System.out.println("Enter new number of person above age 12 for ride Splash mountaindance ");
								u=true;
								while(u)
								{
									SM_e=sc.nextInt();
									if(SM_e>=0)
									{
										u=false;
									}
									else
									{
										System.out.println("Enter valid number of person");
									}
								}
								total_waterpark=total_waterpark+(SM_e*150);
								System.out.println("Enter new number of person below age 12 or age 12 for ride Splash mountain");
								u=true;
								while(u)
								{
									SM_c=sc.nextInt();
									if(SM_c>=0)
									{
										u=false;
									}
									else
									{
										System.out.println("Enter valid number of person");
									}
								}
								total_waterpark=total_waterpark+(SM_c*120);
								break;
						case 4:
								total_waterpark=total_waterpark-(WP_e*120);
								total_waterpark=total_waterpark-(WP_c*90);
								System.out.println("Enter new number of person above age 12 for ride Wave pool ");
								u=true;
								while(u)
								{
									WP_e=sc.nextInt();
									if(WP_e>=0)
									{
										u=false;
									}
									else
									{
										System.out.println("Enter valid number of person");
									}
								}
								total_waterpark=total_waterpark+(WP_e*120);
								System.out.println("Enter new number of person below age 12 or age 12 for ride Wave pool ");
								u=true;
								while(u)
								{
									WP_c=sc.nextInt();
									if(WP_c>=0)
									{
										u=false;
									}
									else
									{
										System.out.println("Enter valid number of person");
									}
								}
								total_waterpark=total_waterpark+(WP_c*90);
								break;
						case 5:
								total_waterpark=total_waterpark-(RD_e*100);
								total_waterpark=total_waterpark-(RD_c*80);
								System.out.println("Enter new number of person above age 12 for Rain dance ");
								u=true;
								while(u)
								{
									RD_e=sc.nextInt();
									if(RD_e>=0)
									{
										u=false;
									}
									else
									{
										System.out.println("Enter valid number of person");
									}
								}
								total_waterpark=total_waterpark+(RD_e*100);
								System.out.println("Enter new number of person below age 12 or age 12 for Rain dance");
								u=true;
								while(u)
								{
									RD_c=sc.nextInt();
									if(RD_c>=0)
									{
										u=false;
									}
									else
									{
										System.out.println("Enter valid number of person");
									}
								}
								total_waterpark=total_waterpark+(RD_c*80);
								break;
						case 6:
								System.out.println("");
								System.out.println("Update regarding water park ticket is done successfully");
								System.out.println("");
								break;
						default:
								System.out.println("");
								System.out.println("Enter valid choice");
								System.out.println("");
								break;
						
						}
					}while(ch2!=6);
					break;
			case 2: 
			
					int ch3;
					do
					{
						System.out.println("Update regarding advantuare park");
						System.out.println("Press 1 to update person of ride Thrilling Engine");
						System.out.println("Press 2 to update person of ride Sky drop");
						System.out.println("Press 3 to update person of ride Racer's Edge");
						System.out.println("Press 4 to update person of ride Flying carousel");
						System.out.println("Press 5 to update person of ride Trampoline park");
						System.out.println("Press 6 to Exit");
						System.out.println("Enter your choice");
						ch3=sc.nextInt();
						switch(ch3)
						{
						case 1:
								total_advanturepark=total_advanturepark-(TE_e*500);
								total_advanturepark=total_advanturepark+(TE_c*420);
								System.out.println("Enter new number of person above age 12 for ride Trilling Engine");
								boolean u=true;
								while(u)
								{
									TE_e=sc.nextInt();
									if(TE_e>=0)
									{
										u=false;
									}
									else
									{
										System.out.println("Enter valid number of person");
									}
								}
								total_advanturepark=total_advanturepark+(TE_e*500);
								System.out.println("Enter new number of person below age 12 or age 12 for ride Trilling Engine");
								u=true;
								while(u)
								{
									TE_c=sc.nextInt();
									if(TE_c>=0)
									{
										u=false;
									}
									else
									{
										System.out.println("Enter valid number of person");
									}
								}
								total_advanturepark=total_advanturepark+(TE_c*420);
								break;
						case 2:
								total_advanturepark=total_advanturepark-(SD_e*300);
								total_advanturepark=total_advanturepark-(SD_c*270);
								System.out.println("Enter new number of person above age 12 for ride Sky Drop");
								u=true;
								while(u)
								{
									SD_e=sc.nextInt();
									if(SD_e>=0)
									{
										u=false;
									}
									else
									{
										System.out.println("Enter valid number of person");
									}
								}
								total_advanturepark=total_advanturepark+(SD_e*300);
								System.out.println("Enter new number of person below age 12 or age 12 for ride Sky Drop");
								u=true;
								while(u)
								{
									SD_c=sc.nextInt();
									if(SD_c>=0)
									{
										u=false;
									}
									else
									{
										System.out.println("Enter valid number of person");
									}
								}
								total_advanturepark=total_advanturepark+(SD_c*270);
								break;
						case 3:
								total_advanturepark=total_advanturepark-(RE_e*250);
								total_advanturepark=total_advanturepark-(RE_c*230);
								System.out.println("Enter new number of person above age 12 for ride Racer's Edge ");
								u=true;
								while(u)
								{
									RE_e=sc.nextInt();
									if(RE_e>=0)
									{
										u=false;
									}
									else
									{
										System.out.println("Enter valid number of person");
									}
								}
								total_advanturepark=total_advanturepark+(RE_e*250);
								System.out.println("Enter new number of person below age 12 or age 12 for ride Racer's Edge");
								u=true;
								while(u)
								{
									RE_c=sc.nextInt();
									if(RE_c>=0)
									{
										u=false;
									}
									else
									{
										System.out.println("Enter valid number of person");
									}
								}
								total_advanturepark=total_advanturepark+(RE_c*230);

								break;
						case 4:
								total_advanturepark=total_advanturepark-(FC_e*150);
								total_advanturepark=total_advanturepark-(FC_c*100);
								System.out.println("Enter new number of person above age 12 for ride Flying carousel ");
								u=true;
								while(u)
								{
									FC_e=sc.nextInt();
									if(FC_e>=0)
									{
										u=false;
									}
									else
									{
										System.out.println("Enter valid number of person");
									}
								}
								total_advanturepark=total_advanturepark+(FC_e*150);
								System.out.println("Enter new number of person below age 12 or age 12 for ride Flying carousel ");
								u=true;
								while(u)
								{
									FC_c=sc.nextInt();
									if(FC_c>=0)
									{
										u=false;
									}
									else
									{
										System.out.println("Enter valid number of person");
									}
								}
								total_advanturepark=total_advanturepark+(FC_c*100);
								break;
						case 5:
								total_advanturepark=total_advanturepark-(TP_e*120);
								total_advanturepark=total_advanturepark-(TP_c*80);
								System.out.println("Enter new number of person above age 12 for Trampoline park");
								u=true;
								while(u)
								{
									TP_e=sc.nextInt();
									if(TP_e>=0)
									{
										u=false;
									}
									else
									{
										System.out.println("Enter valid number of person");
									}
								}
								total_advanturepark=total_advanturepark+(TP_e*120);
								System.out.println("Enter new number of person below age 12 or age 12 for Trampoline park");
								u=true;
								while(u)
								{
									TP_c=sc.nextInt();
									if(TP_c>=0)
									{
										u=false;
									}
									else
									{
										System.out.println("Enter valid number of person");
									}
								}
								total_advanturepark=total_advanturepark+(TP_c*80);
								break;
						case 6:
								System.out.println("");
								System.out.println("Update regarding advantuare park");
								System.out.println("");
								break;
						default:
									System.out.println("");
									System.out.println("Enter valid choice");
									System.out.println("");
									break;
						}
					}while(ch3!=6);
					break;
			case 3:
					System.out.println("");
					System.out.println("Update regarding  ticket is done successfully");
					System.out.println("");
					break;
			default:
					System.out.println("");
					System.out.println("Enter valid choice");
					System.out.println("");
					break;
		}
		}while(ch1!=3);
			
	}
	void update_quantity()
	{
		
		int ch;
		do
		{
			System.out.println("Press 1 to update quantity of pizza");
			System.out.println("Press 2 to update quantity of pav-bhaji");
			System.out.println("Press 3 to update quantity of burger");
			System.out.println("Press 4 to update quantity of sandwiches");
			System.out.println("Press 5 to update quantity of icecream");
			System.out.println("Press 6 to exit from update regarding food quantity");
			System.out.println("Enter your choice");
			ch=sc.nextInt();
		switch(ch)
		{
			case 1:
					total_foodpark=total_foodpark-(200*pizza);
					System.out.println("Enter new quantity of pizza");
					do
					{
						pizza=sc.nextInt();
						if(pizza>=0)
						{
							break;
						}
						else
						{
							System.out.println("Enter valid quantity");
						}				
					}while(pizza<0);
					total_foodpark=total_foodpark+(pizza*200);
					break;
			case 2:
					total_foodpark=total_foodpark-(80*pav_bhaji);
					System.out.println("Enter new quantity of pav_bhaji");
					int a=0;
					do
					{
						pav_bhaji=sc.nextInt();
						if(pav_bhaji>=0)
						{
							a++;
						}
						else
						{
							System.out.println("Enter valid quantity");
						}				
					}while(a==0);
					total_foodpark=total_foodpark+(pav_bhaji*80);
					break;
			case 3:
					total_foodpark=total_foodpark-(burger*100);
					System.out.println("Enter new quantity of burger");
					do
					{
						burger=sc.nextInt();
						if(burger>=0)
						{
							break;
						}
						else
						{
							System.out.println("Enter valid quantity");
						}				
					}while(burger<0);
					total_foodpark=total_foodpark+(burger*100);
					break;
			case 4:
					total_foodpark=total_foodpark-(sandwiches*120);
					System.out.println("Enter new quantity of sandwiches");
					do
					{
						sandwiches=sc.nextInt();
						if(sandwiches>=0)
						{
							break;
						}
						else
						{
							System.out.println("Enter valid quantity");
						}				
					}while(sandwiches<0);
					total_foodpark=total_foodpark+(sandwiches*120);
					break;
			case 5:
					total_foodpark=total_foodpark-(icecream*50);
					System.out.println("Enter new quantity of icecream");
					do
					{
						icecream=sc.nextInt();
						if(icecream>=0)
						{
							break;
						}
						else
						{
							System.out.println("Enter valid quantity");
						}				
					}while(icecream<0);
					total_foodpark=total_foodpark+(icecream*50);
					break;
			case 6:
					System.out.println("");
					System.out.println("Update regarding food quantity done successfully");
					System.out.println("");
					break;
			default:
					System.out.println("Enter valid choice");
					System.out.println("");
					break;
		}
		}while(ch!=6);
	}
}
	

class aapno
{
	 public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Main_park a=new Main_park();
		a.login();
		int ch;
		int n1=0;
		int n2=0;
		int n3=0;
		do
		{
			System.out.println("Press 1 for water park ticket");
			System.out.println("Press 2 for advantuare park ticket");
			System.out.println("Press 3 for food park");
			System.out.println("Press 4 for update regarding ticket");
			System.out.println("Press 5 for update regarding food quantity");
			System.out.println("Press 6 for view bill");
			System.out.println("Press 7 for exit");
			System.out.println("Enter your choice:");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
					if(n1==0)
					{
					System.out.println("--------------------------water park--------------------------");
					System.out.println("______________________________________________________________");
					System.out.println("     Rides     "+"     "+"Price(age>12)"+"     "+"Price(age<=12)");
					System.out.println("______________________________________________________________");
					System.out.println("Big thunder    "+"     "+"     300     "+"     "+"     250");
					System.out.println("Tumble Jumble  "+"     "+"     200     "+"     "+"     180");
					System.out.println("splash mountain"+"     "+"     150     "+"     "+"     120");
					System.out.println("wave pool      "+"     "+"     120     "+"     "+"     90");
					System.out.println("Rain dance     "+"     "+"     100     "+"     "+"     80");
					System.out.println("______________________________________________________________");
					a.water_park();
					System.out.println("Your total bill for water park is "+a.total_waterpark);
					
					n1++;
					}
					else
					{
						System.out.println("You alredy entered no. of person for water park ticket");
						System.out.println("If you want to change no. of person then go for step 4 update regarding ticket");
					}
					break;
			case 2:
					if(n2==0)
					{
					System.out.println("------------------------advantuare park-----------------------");
					System.out.println("______________________________________________________________");
					System.out.println("     Rides     "+"     "+"Price(age>12)"+"     "+"Price(age<=12)");
					System.out.println("______________________________________________________________");
					System.out.println("Trilling Engine"+"     "+"     500     "+"     "+"     420");
					System.out.println("Sky Drop       "+"     "+"     300     "+"     "+"     270");
					System.out.println("Racer's Edge   "+"     "+"     250     "+"     "+"     230");
					System.out.println("Flying carousel"+"     "+"     150     "+"     "+"     100");
					System.out.println("Trampoline park"+"     "+"     120     "+"     "+"     80");
					System.out.println("______________________________________________________________");
					a.advanture_park();
					System.out.println("Your total bill for advantuare park is "+a.total_advanturepark);
					
					n2++;
					}
					else
					{
						System.out.println("You alredy entered no. of person for advanture park ticket");
						System.out.println("If you want to change no. of person then go for step 4 update regarding ticket");
					}
					break;
			case 3:
					if(n3==0)
					{
					System.out.println("--------------food park--------------");
					System.out.println("____________________________________");
					System.out.println("     Items     "+"     "+"    Price    ");
					System.out.println("____________________________________");
					System.out.println("Pizza          "+"     "+"     200");
					System.out.println("Pav-Bhaji      "+"     "+"     80");
					System.out.println("Burger         "+"     "+"     100");
					System.out.println("Sandwiches     "+"     "+"     120");
					System.out.println("Icecream       "+"     "+"     50");
					System.out.println("____________________________________");
					a.food_park();
					System.out.println("Your total bill for food park is "+a.total_foodpark);
					
					n3++;
					}
					else
					{
						System.out.println("You alredy entered quantity for food");
						System.out.println("If you want to change quantity then go to step 5 update regarding food quantity");
					}
					break;
			case 4:
					System.out.println("Enter below data to update regarding ticket ");
					a.update_ticket();
					break;
			case 5:
					System.out.println("Enter below data to update regarding food quantity");
					a.update_quantity();
					break;
			case 6:
					System.out.println("*******************************************Bill*******************************************");
					System.out.println();
					System.out.println("Name: "+a.name);
					System.out.println("M No.: "+a.m_no);
					System.out.println("E-mail ID: "+a.e_mail);
					a.bill();
					System.out.println("******************************************************************************************");
					break;
			case 7:
					System.out.println("Thank you!");
					break;
			default:
					System.out.println("Enter valid choice");
					System.out.println("");
					break;
			}		
		}while(ch!=7);
	}
}

