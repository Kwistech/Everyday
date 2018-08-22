package ca.kwisses.everyday.log;

import org.junit.Before;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

public class LogPresenterTest {

    private Log log;
    private LogPresenter logPresenter;

    @Before
    public void setup() {
        log = new Log();
        logPresenter = new LogPresenter(log);
    }

    // addToLog() Test Methods

    // isValidListItem() Test Methods

    // getCurrentDate() Test Methods

    @Test
    public void getCurrentDate_CallMethod_DateIsCorrect() {
        String date = logPresenter.getCurrentDate();
        Date c = Calendar.getInstance().getTime();
        SimpleDateFormat df = new SimpleDateFormat("dd-MMM-yyyy");
        String formattedDate = df.format(c);
        assertEquals(formattedDate, date);
    }

    @Test
    public void getCurrentDate_CallMethod_DateNotNull() {
        String date = logPresenter.getCurrentDate();
        assertNotNull(date);
    }
}
