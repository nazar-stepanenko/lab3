package lab3;

class GildedRose {

    Item[] items;
    NameCheck nameCheck = new NameCheck();
    QualityControl qualityControl = new QualityControl();
    SellInControl sellInControl = new SellInControl();
    UpdateQuality updateQuality = new UpdateQuality();
    UpdateSellIn updateSellIn = new UpdateSellIn();

    public GildedRose(Item[] items) {

        this.items = items;
    }

    public void updateQuality() {

        for (int i = 0; i < items.length; i++) {

            nameCheck.nameCheck1(items[i], qualityControl, updateQuality);
            nameCheck.nameCheck2(items[i], updateQuality);
            qualityControl.qualityControl_50(items[i], updateQuality);
            nameCheck.nameCheck3(items[i], sellInControl, qualityControl);
            sellInControl.sellInControl_11(items[i], qualityControl);
            sellInControl.sellInControl_6(items[i], qualityControl);
            nameCheck.nameCheck4(items[i], sellInControl);
            qualityControl.qualityControl_0(items[i], nameCheck, updateQuality);
            sellInControl.sellInControl_0(items[i], nameCheck);
            updateQuality.updateQualityMinus(items[i]);
            updateQuality.updateQualityPlus(items[i]);
            updateQuality.updateQuality_1(items[i]);
            updateSellIn.updateSellInMinus(items[i]);
        }
    }
}

class NameCheck {

    public void nameCheck1(Item item, QualityControl qualityControl, UpdateQuality updateQuality) {

        if (!item.name.equals("Aged Brie") && !item.name.equals("Backstage passes to a TAFKAL80ETC concert"))
            qualityControl.qualityControl_0(item, this, updateQuality);
    }

    public void nameCheck2(Item item, UpdateQuality updateQuality) {

        if (!item.name.equals("Sulfuras, Hand of Ragnaros"))
            updateQuality.updateQualityMinus(item);
    }

    public void nameCheck3(Item item, SellInControl sellInControl, QualityControl qualityControl) {

        if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            sellInControl.sellInControl_11(item, qualityControl);
            sellInControl.sellInControl_6(item, qualityControl);
        }
    }

    public void nameCheck4(Item item, SellInControl sellInControl) {

        if (!item.name.equals("Aged Brie"))
            sellInControl.sellInControl_0(item, this);
    }
}

class QualityControl {

    public void qualityControl_0(Item item, NameCheck nameCheck, UpdateQuality updateQuality) {
        if (item.quality > 0)

            nameCheck.nameCheck2(item, updateQuality);
    }

    public void qualityControl_50(Item item, UpdateQuality updateQuality) {
        if (item.quality < 50)

            updateQuality.updateQualityPlus(item);
    }
}

class SellInControl {
    public void sellInControl_11(Item item, QualityControl qualityControl) {

        if (item.sellIn < 11)
            qualityControl.qualityControl_50(item, new UpdateQuality());
    }

    public void sellInControl_6(Item item, QualityControl qualityControl) {

        if (item.sellIn < 6)
            qualityControl.qualityControl_50(item, new UpdateQuality());}
    }

    public void sellInControl_0(Item item, NameCheck nameCheck) {

        if (item.sellIn < 0)
            nameCheck.nameCheck4(item, this);
    }
}

class UpdateQuality {

    public void updateQualityMinus(Item item) {
        item.quality = item.quality - 1;
    }

    public void updateQualityPlus(Item item) {

        item.quality = item.quality + 1;
    }

    public void updateQuality_1(Item item) {

        item.quality = 0;
    }
}

class UpdateSellIn {

    public void updateSellInMinus(Item item) {

        item.sellIn = item.sellIn - 1;
    }
}
