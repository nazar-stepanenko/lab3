package lab3;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            nameCheck1(i);
            nameCheck2(i);
            qualityControl_50(i);
            nameCheck3(i);
            sellInControl_11(i);
            sellInControl_6(i);
            nameCheck4(i);
            qualityControl_0(i);
            sellInControl_0(i);
            updateQualityMinus(i);
            updateQualityPlus(i);
            updateQuality_1(i);
            updateSallinMinus(i);
        }
    }

    public void nameCheck1(int i) {
        if (!items[i].name.equals("Aged Brie")
                && !items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            qualityControl_0(i);
        }
    }

    public void nameCheck2(int i) {
        if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
            updateQualityMinus(i);
        }
    }

    public void nameCheck3(int i) {
        if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            sellInControl_11(i);
            sellInControl_6(i);
        }
    }

    public void nameCheck4(int i) {
        if (!items[i].name.equals("Aged Brie")) {
            sellInControl_0(i);
        }
    }

    public void qualityControl_0(int i) {
        if (items[i].quality > 0) {
            nameCheck2(i);
        }
    }

    public void qualityControl_50(int i) {
        if (items[i].quality < 50) {
            updateQualityPlus(i);
        }
    }

    public void sellInControl_11(int i) {
        if (items[i].sellIn < 11) {
            qualityControl_50(i);
        }
    }

    public void sellInControl_6(int i) {
        if (items[i].sellIn < 6) {
            qualityControl_50(i);
        }
    }

    public void sellInControl_0(int i) {
        if (items[i].sellIn < 0) {
            nameCheck4(i);
        }
    }

    public void updateQualityMinus(int i) {
        items[i].quality = items[i].quality - 1;
    }

    public void updateQualityPlus(int i) {
        items[i].quality = items[i].quality + 1;
    }

    public void updateQuality_1(int i) {
        items[i].quality = 0;
    }

    public void updateSallinMinus(int i) {
        items[i].sellIn = items[i].sellIn - 1;
    }
}

