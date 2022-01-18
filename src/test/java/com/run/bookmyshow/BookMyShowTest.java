package com.run.bookmyshow;


import com.seatbooking.pom.*;
import com.setup.application.LoadUrl;
import com.setup.application.RetryClass;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.IOException;

public class BookMyShowTest extends LoadUrl {
    @DataProvider(name = "Movies")
    public Object[][] dataProvFunc() {
        Object[][] data = new Object[2][2];
        data[0][0] = "Bengaluru";
        data[0][1] = "Badava Rascal";

        data[1][0] = "Hyderabad";
        data[1][1] = "Rowdy Boys";

        return data;

    }

    @Test(description = "To book movie ticket", dataProvider = "Movies", groups = "book", retryAnalyzer = RetryClass.class)
    public void bookMovieTicket(String location, String movie) throws IOException, InterruptedException {
        SignInPage signin = new SignInPage(LoadUrl.driver);
        SelectLocationPage selectlocation = new SelectLocationPage(LoadUrl.driver);
        BookTicketPage bk = new BookTicketPage(LoadUrl.driver);
        MovieDateAndTime mdt = new MovieDateAndTime(LoadUrl.driver);
        MoviePage mv = new MoviePage(LoadUrl.driver);
        SelectSeatsPage seats = new SelectSeatsPage(LoadUrl.driver);
        ContactDetailsPage cd = new ContactDetailsPage(LoadUrl.driver);
        PaymentPage pp = new PaymentPage(LoadUrl.driver);

        signin.skipSigninPage();
        selectlocation.selectCities(location);
        System.out.println(mv.isLocationSelected());
        Assert.assertTrue(mv.isLocationSelected().toLowerCase().contains(location.toLowerCase()));
        mv.selectMovies(movie);
        bk.bookTic();
        mdt.selectDate("19");
        mdt.clickTime();
        seats.selectThreeSeats(location);
        cd.detailsFilling();
        pp.paymentDetails();
        System.out.println(pp.isPaymentPageDisplayed());
        Assert.assertTrue(pp.isPaymentPageDisplayed());
    }

}
