import javax.swing.JOptionPane;
public class individual{

	public static double DiscPrice(double price){
		double discount,total;
		total=0;
		discount=0;
		if(price>=3000&&price<=5000)
		{
			discount=price*0.03;

		}
		else if(price>5000)
		{
			discount=price*0.05;

		}
		total=discount;
		return total;
	}

	public static double sewa(double rent)
	{
		double totalday;
		totalday=rent;
		return totalday;
	}

	public static double addon(double bbq,double karok,double fish,double deer,double atv)
	{
		double totaladd;
		totaladd=bbq+karok+fish+deer+atv;
		return totaladd;
	}
	public static void main(String[]args){

		String end;
		int tamat=0;
		do
		{
		String villa,day,rent,pilihan;
		double tempah=0,totalday=0,BBQ=0,KAROK=0,FISH=0,DEER=0,ATV=0,jumlah,purata,keseluruhan,fasiliti,netprice=0;
		int hari,option;

		System.out.println("Type of       Pax per       Per Day/       Per Day/       Holidays\nHomestay       Villa        Weekdays        Weekend");

		System.out.println("\nVilla A      14-20 Pax     RM2300.00      RM2500.00      RM2755.00");
		System.out.println("Villa B        24 Pax      RM2300.00      RM2500.00      RM2755.00");
		System.out.println("Villa C        30 Pax      RM3500.00      RM3700.00      RM2955.00\n");

		villa=JOptionPane.showInputDialog(null,"Choose Type of Homestay");

		switch(villa)
		{
			case "A":
			{
				day=JOptionPane.showInputDialog(null,"1. Weekdays \n2. Weekend \n3. Holidays");
				hari=Integer.parseInt(day);
				if(hari==1)
				{
					rent=JOptionPane.showInputDialog(null,"How long you want to stay");
					tempah=Double.parseDouble(rent);

					totalday=tempah*2300;
				}
				else if(hari==2)
				{
					rent=JOptionPane.showInputDialog(null,"How long you want to stay");
					tempah=Double.parseDouble(rent);

					totalday=tempah*2500;
				}
				else if(hari==3)
				{
					rent=JOptionPane.showInputDialog(null,"How long you want to stay");
					tempah=Double.parseDouble(rent);

					totalday=tempah*2755;
				}
				break;
			}

			case "B":
			{
				day=JOptionPane.showInputDialog(null,"1. Weekdays \n2. Weekend \n3. Holidays");
				hari=Integer.parseInt(day);
				if(hari==1)
				{
					rent=JOptionPane.showInputDialog(null,"How long you want to stay");
					tempah=Double.parseDouble(rent);

					totalday=tempah*3100;
				}
				else if(hari==2)
				{
					rent=JOptionPane.showInputDialog(null,"How long you want to stay");
					tempah=Double.parseDouble(rent);

					totalday=tempah*3300;
				}
				else if(hari==3)
				{
					rent=JOptionPane.showInputDialog(null,"How long you want to stay");
					tempah=Double.parseDouble(rent);

					totalday=tempah*3555;
				}
				break;
			}

			case "C":
			{
				day=JOptionPane.showInputDialog(null,"1. Weekdays \n2. Weekend \n3. Holidays");
				hari=Integer.parseInt(day);
				if(hari==1)
				{
					rent=JOptionPane.showInputDialog(null,"How long you want to stay");
					tempah=Double.parseDouble(rent);

					totalday=tempah*3500;
				}
				else if(hari==2)
				{
					rent=JOptionPane.showInputDialog(null,"How long you want to stay");
					tempah=Double.parseDouble(rent);

					totalday=tempah*3700;
				}
				else if(hari==3)
				{
					rent=JOptionPane.showInputDialog(null,"How long you want to stay");
					tempah=Double.parseDouble(rent);

					totalday=tempah*3955;
				}
				break;
			}
		}
		totalday=sewa(totalday);

		pilihan=JOptionPane.showInputDialog(null,"You want to use other facilities?\n1.Yes\n2.No");
		option=Integer.parseInt(pilihan);
		if(option==1)
		{
		System.out.println("\nOther facilities");
		System.out.println("BBQ – RM50/Stay\nKaraoke Room – RM40/day\n(10am-6pm)\nKaraoke Room – RM60/day\n(6pm-12am)\nFishing – RM5/person\nDeer Park – RM10/entry\nATV Rides – RM200/ride");
		BBQ=Double.parseDouble(JOptionPane.showInputDialog(null,"How much do you want to rent for BBQ?"));
		BBQ=BBQ*50;
		KAROK=Double.parseDouble(JOptionPane.showInputDialog(null,"How long do you want to use for karaoke room?"));
		KAROK=KAROK*40;
		FISH=Double.parseDouble(JOptionPane.showInputDialog(null,"How many people want to fishing?"));
		FISH=FISH*5;
		DEER=Double.parseDouble(JOptionPane.showInputDialog(null,"How much do you want to entry for Deer Park?"));
		DEER=DEER*10;
		ATV=Double.parseDouble(JOptionPane.showInputDialog(null,"How much ride do you need for ATV?"));
		ATV=ATV*200;
		}

		fasiliti=addon(BBQ,KAROK,FISH,DEER,ATV);
		purata=fasiliti+totalday;
		keseluruhan=DiscPrice(purata);
		netprice=purata-keseluruhan;

		JOptionPane.showMessageDialog(null,"BOOKING RECEIPT\n"+
			"Type Villa:"+villa+
			"\nDay rent:"+tempah+
			"\nVilla Cost:"+totalday+
			"\nFacilities Cost:"+fasiliti+
			"\nTotal Cost:"+purata+
			"\nDiscount:"+keseluruhan+
			"\nNet Price:"+netprice);
		end=JOptionPane.showInputDialog("Do you want to process the receipt?\n1)yes\n2)no");
		tamat=Integer.parseInt(end);
		}while(tamat==1);

	}
}