package Run_Application;

import POM.*;
import SetUp.LoadUrl;
import org.testng.annotations.Test;

import java.io.IOException;

public class Bookmyshow extends LoadUrl
{
    @Test(priority = 1,description = "Skip Login")
 public void runSkipSignIn()
 {
     Signin signin=new Signin(LoadUrl.app);
     signin.skipSigninPage();

 }
@Test(priority = 2)
 public void selectLocation()
 {
     Selectlocation selectlocation=new Selectlocation(LoadUrl.app);
     selectlocation.selectCities();
 }
 @Test(priority = 3)
public void selectMovie()
{
    Movie mv=new Movie(LoadUrl.app);
    mv.selectMovies();
}

@Test(priority = 4)
public void ticketsBooking()
{
    Booktickets bk=new Booktickets(LoadUrl.app);
    bk.bookTic();
}

@Test(priority = 5)
public void movieTimings()
{
    MovieDateAndTime mdt=new MovieDateAndTime(LoadUrl.app);
    mdt.timings();
}
@Test(priority = 6)
public void selectedSeates() throws InterruptedException {
    SelectSeats seats=new SelectSeats(LoadUrl.app);
    seats.selectThreeSeats();

}
@Test(priority = 7)
public void updateDetails() throws IOException, InterruptedException {
    ContactDetails cd=new ContactDetails(LoadUrl.app);
    cd.detailsFilling();
}

}
