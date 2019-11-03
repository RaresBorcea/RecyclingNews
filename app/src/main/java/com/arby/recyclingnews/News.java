package com.arby.recyclingnews;

public class News {

    private String mTitle;
    private String mSection;
    private String mAuthorsName;
    private String mDate;
    private String mUrl;

    public News(String title, String section, String authorsName, String date, String url) {
        mTitle = title;
        mSection = section;
        mAuthorsName = authorsName;
        mDate = date;
        mUrl = url;
    }

    public String getAuthorsName() {
        return mAuthorsName;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getSection() {
        return mSection;
    }

    public String getDate() {
        return mDate;
    }

    public String getUrl() {
        return mUrl;
    }

}
