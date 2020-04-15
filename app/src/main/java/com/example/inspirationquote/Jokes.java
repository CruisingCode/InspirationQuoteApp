package com.example.inspirationquote;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;


//convert json to java 

public class Jokes implements Serializable
{

    @SerializedName("categories")
    @Expose
    private List<String> categories = new ArrayList<String>();
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("icon_url")
    @Expose
    private String iconUrl;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("value")
    @Expose
    private String value;
    private final static long serialVersionUID = -496106849527531520L;

    /**
     * No args constructor for use in serialization
     *
     */
    public Jokes() {
    }

    /**
     *
     * @param createdAt
     * @param categories
     * @param iconUrl
     * @param id
     * @param value
     * @param url
     * @param updatedAt
     */
    public Jokes(List<String> categories, String createdAt, String iconUrl, String id, String updatedAt, String url, String value) {
        super();
        this.categories = categories;
        this.createdAt = createdAt;
        this.iconUrl = iconUrl;
        this.id = id;
        this.updatedAt = updatedAt;
        this.url = url;
        this.value = value;
    }

    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    public Jokes withCategories(List<String> categories) {
        this.categories = categories;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Jokes withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public Jokes withIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
        return this;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Jokes withId(String id) {
        this.id = id;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Jokes withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Jokes withUrl(String url) {
        this.url = url;
        return this;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Jokes withValue(String value) {
        this.value = value;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("categories", categories).append("createdAt", createdAt).append("iconUrl", iconUrl).append("id", id).append("updatedAt", updatedAt).append("url", url).append("value", value).toString();
    }

}