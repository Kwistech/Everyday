package ca.kwisses.everyday.log;

import org.junit.Before;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import ca.kwisses.everyday.list.ListItem;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;

public class LogPresenterTest {

    private Log log;
    private LogPresenter logPresenter;

    @Before
    public void setup() {
        log = new Log();
        logPresenter = new LogPresenter(log);
    }

    // addToLog() Test Methods

    @Test
    public void addToLog_AddValidListItemsToLog_AddedIsTrue() {
        ListItem testListItem = new ListItem();

        List<ListItem> testListItems = new ArrayList<>();
        testListItems.add(testListItem);

        List<List<ListItem>> testLogListItems = new ArrayList<>();
        testLogListItems.add(testListItems);

        log.setLog(testLogListItems);
        boolean added = logPresenter.addToLog(testListItems);
        assertTrue(added);
    }

    @Test
    public void addToLog_AddEmptyListItemsToLog_AddedIsFalse() {
        List<ListItem> testListItems = new ArrayList<>();
        List<List<ListItem>> testLogListItems = new ArrayList<>();

        testLogListItems.add(testListItems);

        log.setLog(testLogListItems);
        boolean added = logPresenter.addToLog(testListItems);
        assertFalse(added);
    }

    // isValidListItem() Test Methods

    @Test
    public void isValidListItem_PassValidListItem_ValidIsTrue() {
        ListItem testItem = new ListItem();
        List<ListItem> testListItems = new ArrayList<>();
        testListItems.add(testItem);

        boolean valid = logPresenter.isValidListItem(testListItems);
        assertTrue(valid);
    }

    @Test
    public void isValidListItem_PassInvalidListItem_ValidIsFalse() {
        List<ListItem> testListItems = new ArrayList<>();
        boolean valid = logPresenter.isValidListItem(testListItems);
        assertFalse(valid);
    }

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
