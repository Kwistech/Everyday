package ca.kwisses.everyday.list;

public class ListItemPresenter implements ListItemContract.Presenter {

    private ListItem listItem;

    public ListItemPresenter(ListItem listItem) {
        this.listItem = listItem;
    }

    @Override
    public void addListItem(ListItem listItem) {

    }

    @Override
    public boolean deleteListItem(ListItem listItem) {
        return false;
    }

    @Override
    public boolean checkListItem(ListItem listItem) {
        return false;
    }

    @Override
    public boolean uncheckListItem(ListItem listItem) {
        return false;
    }

    @Override
    public boolean isSelected(ListItem listItem) {
        return false;
    }

    @Override
    public boolean hasListItem(ListItem listItem) {
        return false;
    }

    @Override
    public ListItem getListItem() {
        return listItem;
    }

    @Override
    public void setListItem(ListItem listItem) {

    }
}
