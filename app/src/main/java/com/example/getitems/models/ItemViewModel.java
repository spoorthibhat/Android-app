package com.example.getitems.models;

import com.example.getitems.AttributeEnum;
import com.example.getitems.ItemLocationEnum;

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
        addItem(new ItemModel("Viking Helmet", "Really Strong", 1, 1, 1,"helmet", ItemLocationEnum.Head, AttributeEnum.Attack));
        addItem(new ItemModel("Heat Shield", "Good and Strong", 0, 0, 2,"heat_shield", ItemLocationEnum.OffHand, AttributeEnum.Defense));
        addItem(new ItemModel("Muffler", "Protects from cold", 0, 0, 3,"muffler", ItemLocationEnum.Necklass, AttributeEnum.Defense));
    }


    private static void addItem(ItemModel item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
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
        public final ItemLocationEnum Location;
        public final AttributeEnum Attribute;


        public ItemModel(String Name, String Description, int Range, int Damage, int Value, String ImageURI, ItemLocationEnum location, AttributeEnum Attribute) {
            this.Range = Range;
            this.Damage = Damage;
            this.Value = Value;
            this.Name = Name;
            this.Description = Description;
            this.ImageURI = ImageURI;
            this.Location = location;
            this.Attribute = Attribute;
        }

        @Override
        public String toString() {
            return Name;
        }
    }
}
