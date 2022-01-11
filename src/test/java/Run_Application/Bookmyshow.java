package Run_Application;

import POM.*;
import SetUp.LoadUrl;
import org.testng.annotations.*;

import java.io.IOException;

public class Bookmyshow extends LoadUrl
{
    @BeforeTest
 public void runSkipSignIn()
 {
     Signin signin=new Signin(LoadUrl.app);
     signin.skipSigninPage();
 }

 @BeforeClass
 public void selectLocation()
 {
     Selectlocation selectlocation=new Selectlocation(LoadUrl.app);
     selectlocation.selectCities();
 }

 @BeforeMethod
public void selectMovie()
{
    Movie mv=new Movie(LoadUrl.app);
    mv.selectMovies();
}

@Test
public void ticketsBooking()
{
    Booktickets bk=new Booktickets(LoadUrl.app);
    bk.bookTic();
}

@AfterMethod
public void movieTimings()
{
    MovieDateAndTime mdt=new MovieDateAndTime(LoadUrl.app);
    mdt.timings();
}

@AfterClass
public void selectedSeates() throws InterruptedException {
    SelectSeats seats=new SelectSeats(LoadUrl.app);
    seats.selectThreeSeats();

}

@AfterTest
public void updateDetails() throws IOException, InterruptedException {
    ContactDetails cd=new ContactDetails(LoadUrl.app);
    cd.detailsFilling();
}

@AfterSuite
public void payment()
{
    PaymentPage pp=new PaymentPage(LoadUrl.app);
    pp.payMentDetails();
}

}
