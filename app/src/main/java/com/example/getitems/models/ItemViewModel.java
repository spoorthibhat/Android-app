package com.example.getitems.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class ItemViewModel {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<ItemModel> ITEMS = new ArrayList<ItemModel>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, ItemModel> ITEM_MAP = new HashMap<String, ItemModel>();

    private static final int COUNT = 25;

    static {
        // Add some sample items.
        addItem(new ItemModel("Gold Sword", "Really Sharp", 1, 1, 1,"sword2.png"));
        addItem(new ItemModel("Strong Shield", "Good and Strong", 0, 0, 2,"shield4.png"));
        addItem(new ItemModel("Bunny Hat", "I Live for speed", 0, 0, 3,"hat1.png"));
    }


    private static void addItem(ItemModel item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
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
    public static class ItemModel {

        public final int Range;
        public final int Damage;
        public final int Value;
        public final String Name;
        public final String Description;
        public final String id = UUID.randomUUID().toString();
        public final String Guid = id;
        public final String ImageURI;


        public ItemModel(String Name, String Description, int Range, int Damage, int Value, String ImageURI) {
            this.Range = Range;
            this.Damage = Damage;
            this.Value = Value;
            this.Name = Name;
            this.Description = Description;
            this.ImageURI = ImageURI;
        }

        @Override
        public String toString() {
            return Name;
        }
    }
}
