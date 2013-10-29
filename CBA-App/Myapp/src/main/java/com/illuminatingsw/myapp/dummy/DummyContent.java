package com.illuminatingsw.myapp.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public static List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    static {
        //ROLAND
        // add content to list
        addItem(new DummyItem("1", "Accidents & Personal Injury"));
        addItem(new DummyItem("2", "AIDS"));
        addItem(new DummyItem("3", "Adoptions"));
        addItem(new DummyItem("4", "Age Discrimination"));
        addItem(new DummyItem("5", "Artists"));
        addItem(new DummyItem("6", "Asylum/Refugees"));
        addItem(new DummyItem("7", "Bankruptcy/Debt Collection"));
        addItem(new DummyItem("8", "Child Custody"));
        addItem(new DummyItem("9", "Child Guardianship"));
        addItem(new DummyItem("10", "Child Support"));
        addItem(new DummyItem("11", "Child Visitation"));
        addItem(new DummyItem("12", "Civil Rights"));
        addItem(new DummyItem("13", "Community-Based Organizations and Nonprofits"));
        addItem(new DummyItem("14", "Consumer Issues"));
        addItem(new DummyItem("15", "Criminal Law"));
        addItem(new DummyItem("16", "Deaf or Hard of Hearing"));
        addItem(new DummyItem("17", "Disability"));
        addItem(new DummyItem("18", "Divorce"));
        addItem(new DummyItem("19", "Domestic Violence"));
        addItem(new DummyItem("20", "Education"));
        addItem(new DummyItem("21", "Elderly"));
        addItem(new DummyItem("22", "Employment"));
        addItem(new DummyItem("23", "Eviction"));
        addItem(new DummyItem("24", "Expungement/Sealing of Criminal Records"));
        addItem(new DummyItem("25", "Family Law"));
        addItem(new DummyItem("26", "Foreclosure"));
        addItem(new DummyItem("27", "Guardianship for Disabled Adults"));
        addItem(new DummyItem("28", "Hate Crimes"));
        addItem(new DummyItem("29", "Housing"));
        addItem(new DummyItem("30", "Immigration"));
        addItem(new DummyItem("31", "Insurance Benefits"));
        addItem(new DummyItem("32", "Intellectual Property"));
        addItem(new DummyItem("33", "Juvenile Abuse and Neglect"));
        addItem(new DummyItem("34", "Juvenile Offender"));
        addItem(new DummyItem("35", "Landlord-Tenant/Eviction"));
        addItem(new DummyItem("36", "Mediation"));
        addItem(new DummyItem("37", "Prisoner Issues"));
        addItem(new DummyItem("38", "Public Benefits"));
        addItem(new DummyItem("39", "Real Estate Closings"));
        addItem(new DummyItem("40", "Small Business"));
        addItem(new DummyItem("41", "Special Education"));
        addItem(new DummyItem("42", "Taxes"));
        addItem(new DummyItem("43", "Veterans"));
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public String id;
        public String content;

        public DummyItem(String id, String content) {
            this.id = id;
            this.content = content;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}
