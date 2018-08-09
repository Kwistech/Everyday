package ca.kwisses.everyday.list;

public interface ListContract {

    interface Object {

    }

    interface Presenter {

        void addListItem(ListItem listItem);

        boolean deleteListItem(ListItem listItem);

        boolean checkListItem(ListItem listItem);

        boolean uncheckListItem(ListItem listItem);

        boolean isSelected(ListItem listItem);

        boolean hasListItem(ListItem listItem);

        ListItem getListItem();

        void setListItem(ListItem listItem);

    }
}
