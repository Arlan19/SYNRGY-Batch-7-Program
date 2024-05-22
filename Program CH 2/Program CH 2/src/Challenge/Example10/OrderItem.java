package Challenge.Example10;



public class OrderItem {
    private MenuItem menuItem;
    private int quatity;

    public OrderItem(MenuItem menuItem, int quatity){
        this.menuItem = menuItem;
        this.quatity = quatity;
    }

    public MenuItem getMenuItem() {
        return menuItem;
    }

    public void setMenuItem(MenuItem menuItem) {
        this.menuItem = menuItem;
    }

    public int getQuatity() {
        return quatity;
    }

    public void setQuatity(int quatity) {
        this.quatity = quatity;
    }

    public double getTotalPrice(){
        return menuItem.getPrice() * quatity;
    }
}
