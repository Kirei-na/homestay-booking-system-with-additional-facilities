This Java program is a home stay booking system with additional facilities. It accepts user input through the use of JOptionPane and presents the output in a message dialog:

Primary Functions
DiscPrice(double price)

Calculates a discount on the overall price:

If the price is between RM3000 and RM5000 → 3% discount

If the price is above RM5000 → 5% discount

rental (double rent)

Returns the rental price total.

addon(double bbq, double karok, double fish, double deer, double atv)

Calculates the total cost of the additional facilities (BBQ, Karaoke, Fishing, Deer Park, ATV Rides).

Primary Program Flow
The user selects a villa (A, B, or C).

Each villa has different capacities and rental prices for weekdays, weekends, and holidays.

The user inputs the number of days they will stay.

The total cost is calculated based on the daily rate.

The user chooses whether to use additional facilities.

If "Yes," they enter the amount for:

BBQ (RM50 per stay)

Karaoke Room (RM40 daily from 10am-6pm, RM60 daily from 6pm-12am)

Fishing (RM5 per person)

Deer Park Entrance (RM10 each)

ATV Ride (RM200 per ride)

Total Overall Price Calculation:
Total Cost = Price of Villa + Facility Cost

Discount Applied (if any)

Net Price = Total Price - Discount

A booking receipt is displayed with all the details.
The user can then choose to process another receipt or exit the program.

Example Scenario
Villa A, Weekend, 2 Days:

Rent = 2 × RM2500 = RM5000

Additional Facilities:

BBQ (1x) = RM50

Karaoke (2 days) = RM40 × 2 = RM80

Fishing (5 persons) = RM5 × 5 = RM25

Total Cost of Facilities = RM155

Total Price = RM5000 + RM155 = RM5155

Discount (5%) = RM5155 × 0.05 = RM257.75

Net Price = RM5155 - RM257.75 = RM4897.25

Possible Enhancements
Use switch-case for facility pricing.

Improve error handling (e.g., invalid inputs).

Replace JOptionPane with a GUI framework for better user experience.

Store the reservations in a file or database instead of just displaying them.
