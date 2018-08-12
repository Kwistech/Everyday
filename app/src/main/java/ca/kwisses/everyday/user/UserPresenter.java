package ca.kwisses.everyday.user;

public class UserPresenter implements UserContract.Presenter {

    private User user;

    public UserPresenter(User user) {
        this.user = user;
    }

    @Override
    public User getUser() {
        return user;
    }

    @Override
    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public void getUserData() {

    }

    @Override
    public void setUserData() {

    }
}
