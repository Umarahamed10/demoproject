Feature: Hotel Booking

@login
Scenario Outline: Login Page

Given user Lanch the Application

When user Enter The "<Username>" In Username Field

And user Entetr The "<password>" In Password Field

Then user Click On The Login Button And It Navigates to Adactin.com-Search Hotel Page

Examples:
|Username|password|
|Umarahamed1010|umar101010|

@search
Scenario: Search Hotel

When user Select The "London" Location

And user Select The "Hotel Sunshine" Hotel

And user Select The "Deluxe" Room Type

And user Select The "2" Number Of Rooms

And user Select The "2" Adult Per Room

And user Select The "2" Children Per Room

Then user Click On The Search Button And It Navigates To "Adactin.com- Select Hotel" Page

@select
Scenario: Select Hotel

When user Click on The Radio Button

Then user Click On The Continue Button And It Navigates To "Adactin.com-Book A Hotel" Page


@booking
Scenario Outline: Book A Hotel

When user Enter The "<First Name>" In First Name Field

And user Enter The "<Second Name>" In Second Name Field

And user Enter The "<Billing Address>" In Billing Address Field 

And user Enter The Credit Card No. In Credit Card No. Field

And user Select The "VISA" Credit Card Type 

And user Select The "12" Expiry Month In The Expiry Date

And user Select The "2022" Expiry Year In The Expiry Date

And user Enter The CVV Number In CVV Number Field

Then user Click On The Book Now Button And It Navigates To "Adactin.com-Booking Confirmation" Page


Examples:
|First Name|Second Name|Billing Address|
|Ahamed|Umar|EastRoad,London|

@confirmation
Scenario: Booking Confirmation

When user Click On The My Itinerary Button And It Navigates To "Adactin.com-Booked Itinerary" Page


@lagout
Scenario: Booked Itinerary

When user Click On The Lagout Button And It Navigates To "Adactin.com-Lagout" Page 



















