package ca.kwisses.everyday.dbhandler;

public class DBHandlerPresenter implements DBHandlerContract.Presenter{

    private DBHandler dbHandler;

    public DBHandlerPresenter(DBHandler dbHandler) {
        this.dbHandler = dbHandler;
    }

    @Override
    public void setIDs(String[] ids) {

    }

    @Override
    public String[] getIDs() {
        return new String[0];
    }

    @Override
    public boolean isValidQuery(String query) {
        return false;
    }

    @Override
    public boolean isValidID(String id) {
        return false;
    }


    @Override
    public DBHandler getDBHandler() {
        return dbHandler;
    }

    @Override
    public void setDBHandler(DBHandler dbHandler) {
        this.dbHandler = dbHandler;
    }
}
