package com.semihsahinoglu.news_service.entity;

public enum NewsCategory {
    SUPER_LIG("Süper Lig"),
    TRANSFER("Transfer"),
    AVRUPA("Avrupa"),
    AVRUPA_KUPALARI("Avrupa Kupaları"),
    DUNYA_FUTBOLU("Dünya Futbolu"),
    MILLI_TAKIM("Milli Takım"),
    HAKEM("Hakem"),
    KULUPLER("Kulüpler"),
    GENEL("Genel");

    private String category;

    NewsCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return this.category;
    }
}
