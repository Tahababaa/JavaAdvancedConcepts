import java.util.LinkedList;

public class RecentlyViewedItems {
    private LinkedList<Items> recentlyViewed;
    public RecentlyViewedItems(){
        recentlyViewed = new LinkedList<>();
    }
    public void addRecentlyViewedItem(Items item){

        if (recentlyViewed.contains(item)) {
            recentlyViewed.remove(item);
        }

        if (recentlyViewed.size() >= 10) {
            recentlyViewed.removeLast();
        }

        recentlyViewed.addFirst(item);
    }
}
