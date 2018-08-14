package ca.kwisses.everyday.dbhandler;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;

public class DBHandlerTest {

    private DBHandler dbHandler;

    @Before
    public void setup() {
        dbHandler = new DBHandler(null, null);
    }

    // initQuery Test Methods

    @Test
    public void initQuery_CallMethodInConstructor_QueryNotNull() {
        String query = dbHandler.getQuery();
        assertNotNull(query);
    }

    @Test
    public void initQuery_CallMethodInConstructor_QueryIsValid() {
        DBHandlerPresenter dbHandlerPresenter = new DBHandlerPresenter(dbHandler);
        String query = dbHandler.getQuery();
        boolean valid = dbHandlerPresenter.isValidQuery(query);
        assertTrue(valid);

    }

    // parseIDs() Test Methods

    @Test
    public void parseIDs_() {

    }

    @Test
    public void parseIDs() {

    }

    // parseDatabase() Test Methods

    @Test
    public void parseDatabase_() {

    }

    @Test
    public void parseDatabase() {

    }

    // getContentValues() Test Methods

    @Test
    public void getContentValues_() {

    }

    @Test
    public void getContentValues() {

    }

    // getDateFromDatabase() Test Methods

    @Test
    public void getDataFromDatabase_() {

    }

    @Test
    public void getDataFromDatabase() {

    }

}
