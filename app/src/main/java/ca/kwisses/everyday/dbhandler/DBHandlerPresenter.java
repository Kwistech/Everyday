package ca.kwisses.everyday.dbhandler;

public class DBHandlerPresenter implements DBHandlerContract.Presenter{

    private DBHandler dbHandler;
    private String[] ids;

    public DBHandlerPresenter(DBHandler dbHandler) {
        this.dbHandler = dbHandler;
        ids = null;
    }

    @Override
    public String[] getIDs() {
        return ids;
    }

    @Override
    public void setIDs(String[] ids) {
        this.ids = ids;
    }

    @Override
    public DBHandler getDBHandler() {
        return dbHandler;
    }

    @Override
    public void setDBHandler(DBHandler dbHandler) {
        this.dbHandler = dbHandler;
    }

    @Override
    public boolean isValidQuery(String query) {
        return query.length() != 0;
    }

    @Override
    public boolean isValidID(String id) {
        return id.length() != 0;
    }

    @Override
    public boolean stringArrayIsOfCertainLength(String[] strings, int length) {
        return strings.length == length;
    }
}
