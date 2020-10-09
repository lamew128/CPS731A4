package codingwithmitch.com.recyclerview.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import codingwithmitch.com.recyclerview.R;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();
    private static ArrayList<String> mNames = new ArrayList<>();
    private static ArrayList<Integer> mImageUrls = new ArrayList<>();
    private static ArrayList<String> intro = new ArrayList<>();
    private static ArrayList<String> rec = new ArrayList<>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    //private static final int COUNT = 25;


    static {
        mImageUrls.add(R.drawable.cookie);
        mNames.add("Cookie");
        intro.add("qweqqwew \nasdasd qwqweqweqweqweqw\neqwew qeqweqwqweqweqweqweqwe qwewqeq weqw");
        rec.add("qwer\n1234\n1qaz\n2wsx");

        mImageUrls.add(R.drawable.cake);
        mNames.add("Cake");
        intro.add("asdasdasdasdasdasdasdsaasd \nzxczxczxcasdasda\n dxbzdzbdafgbga");
        rec.add("asdf\n5678\n3edc\4rfv");

        mImageUrls.add(R.drawable.bread);
        mNames.add("Bread");
        intro.add("zxczxczxczxczxczxczxcz\nasdasdx\nbbbbbb");
        rec.add("zxcv\n90-=\n5tgb\n6yhn");

        mImageUrls.add(R.drawable.pudding);
        mNames.add("Pudding");
        intro.add("tyutyutyutyutyutyutyu\ndfhndfiugbaiubhfik\nujavbsfuiawebfujwbfk");
        rec.add("tyui\n1234\n7ujm\n8ik9");


        mImageUrls.add(R.drawable.tart);
        mNames.add("Tart");
        intro.add("ghjghjghjghjghjghjghj\nzxjchbusdkaf");
        rec.add("ghjk\n5678\nol0p");

        mImageUrls.add(R.drawable.salad);
        mNames.add("Salad");
        intro.add("bnmbnmbnmbnmbnmbnmbnmbnmbn\nbasdfugvsdaufvsudkfa\nsbnavuysafgvbuawbvuki\nasidfhuiwsfhbaisu");
        rec.add("bnm,");

        for(int i = 0; i < 6; i++)
        {
            addItem(createDummyItem(i));
        }
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static DummyItem createDummyItem(int position) {
        return new DummyItem(String.valueOf(position), mNames.get(position), mImageUrls.get(position), intro.get(position), rec.get(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public final String name;
        public final int url;
        public final String intro;
        public final String rec;

        public DummyItem(String id, String name, int url, String intro,String rec) {
            this.id = id;
            this.name = name;
            this.url = url;
            this.intro = intro;
            this.rec = rec;
        }

        @Override
        public String toString() {
            return name;
        }
    }
}