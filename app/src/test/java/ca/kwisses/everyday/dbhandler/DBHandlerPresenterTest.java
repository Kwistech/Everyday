package ca.kwisses.everyday.dbhandler;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class DBHandlerPresenterTest {

    private DBHandler dbHandler;
    private DBHandlerPresenter dbHandlerPresenter;

    @Before
    public void setup() {
        dbHandler = new DBHandler(null, null);
        dbHandlerPresenter = new DBHandlerPresenter(dbHandler);
    }

    // isValidQuery() Test Methods

    @Test
    public void isValidQuery_PassValidQuery_ValidIsTrue() {
        String query = "CREATE TABLE_NAME TEST QUERY";
        boolean valid = dbHandlerPresenter.isValidQuery(query);
        assertTrue(valid);
    }

    @Test
    public void isValidQuery_PassEmptyInvalidQuery_ValidIsFalse() {
        String query = "";
        boolean valid = dbHandlerPresenter.isValidQuery(query);
        assertFalse(valid);
    }

    // isValidID() Test Methods

    @Test
    public void isValidID_PassValidID_ValidIsTrue() {
        String id = "1";
        boolean valid = dbHandlerPresenter.isValidID(id);
        assertTrue(valid);
    }

    @Test
    public void isValidID_PassEmptyInvalidID_ValidIsFalse() {
        String id = "";
        boolean valid = dbHandlerPresenter.isValidID(id);
        assertFalse(valid);
    }

    // stringArrayIsOfCertainLength() Test Methods

    @Test
    public void stringArrayIsOfCertainLength_PassEqualLengthStringArray_CertainLengthIsTrue() {
        String[] strings = {"zero", "one", "two", "three", "four", "five"};
        int length = 6;
        boolean certainLength = dbHandlerPresenter.stringArrayIsOfCertainLength(strings, length);
        assertTrue(certainLength);
    }

    @Test
    public void stringArrayIsOfCertainLength_PassShorterLengthStringArray_CertainLengthIsFalse() {
        String[] strings = {"zero", "one", "two"};
        int length = 5;
        boolean certainLength = dbHandlerPresenter.stringArrayIsOfCertainLength(strings, length);
        assertFalse(certainLength);
    }

    @Test
    public void stringArrayIsOfCertainLength_PassLongerLengthStringArray_CertainLengthIsFalse() {
        String[] strings = {"zero", "one", "two", "three", "four", "five", "six", "seven"};
        int length = 2;
        boolean certainLength = dbHandlerPresenter.stringArrayIsOfCertainLength(strings, length);
        assertFalse(certainLength);
    }

}
