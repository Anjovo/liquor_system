package com.sys.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Administrator on 2017/6/6.
 */
@Entity
@Table(name = "goods", schema = "liquor_system", catalog = "")
public class GoodsEntity {
    private int id;
    private String productName;
    private String classifyName;
    private Timestamp timeIn;
    private Integer isVisible;
    private String tag;
    private String img;
    private String goodsTitle;
    private String goodsDetails;
    private String content;
    private Integer isCampaign;
    private String oldPrices;
    private String newPrices;
    private String goodsDescribe;
    private String goodsCount;
    private Integer goodsSales;
    private String contactsName;
    private String contactsTell;
    private String contactsCompany;
    private String operator;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "product_name", nullable = true, length = -1)
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Basic
    @Column(name = "classify_name", nullable = true, length = -1)
    public String getClassifyName() {
        return classifyName;
    }

    public void setClassifyName(String classifyName) {
        this.classifyName = classifyName;
    }

    @Basic
    @Column(name = "time_in", nullable = true)
    public Timestamp getTimeIn() {
        return timeIn;
    }

    public void setTimeIn(Timestamp timeIn) {
        this.timeIn = timeIn;
    }

    @Basic
    @Column(name = "is_visible", nullable = true)
    public Integer getIsVisible() {
        return isVisible;
    }

    public void setIsVisible(Integer isVisible) {
        this.isVisible = isVisible;
    }

    @Basic
    @Column(name = "tag", nullable = true, length = 255)
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    @Basic
    @Column(name = "img", nullable = true, length = -1)
    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Basic
    @Column(name = "goods_title", nullable = true, length = -1)
    public String getGoodsTitle() {
        return goodsTitle;
    }

    public void setGoodsTitle(String goodsTitle) {
        this.goodsTitle = goodsTitle;
    }

    @Basic
    @Column(name = "goods_details", nullable = true, length = -1)
    public String getGoodsDetails() {
        return goodsDetails;
    }

    public void setGoodsDetails(String goodsDetails) {
        this.goodsDetails = goodsDetails;
    }

    @Basic
    @Column(name = "content", nullable = true, length = -1)
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "is_campaign", nullable = true)
    public Integer getIsCampaign() {
        return isCampaign;
    }

    public void setIsCampaign(Integer isCampaign) {
        this.isCampaign = isCampaign;
    }

    @Basic
    @Column(name = "old_prices", nullable = true, length = -1)
    public String getOldPrices() {
        return oldPrices;
    }

    public void setOldPrices(String oldPrices) {
        this.oldPrices = oldPrices;
    }

    @Basic
    @Column(name = "new_prices", nullable = true, length = -1)
    public String getNewPrices() {
        return newPrices;
    }

    public void setNewPrices(String newPrices) {
        this.newPrices = newPrices;
    }

    @Basic
    @Column(name = "goods_describe", nullable = true, length = -1)
    public String getGoodsDescribe() {
        return goodsDescribe;
    }

    public void setGoodsDescribe(String goodsDescribe) {
        this.goodsDescribe = goodsDescribe;
    }

    @Basic
    @Column(name = "goods_count", nullable = true, length = -1)
    public String getGoodsCount() {
        return goodsCount;
    }

    public void setGoodsCount(String goodsCount) {
        this.goodsCount = goodsCount;
    }

    @Basic
    @Column(name = "goods_sales", nullable = true)
    public Integer getGoodsSales() {
        return goodsSales;
    }

    public void setGoodsSales(Integer goodsSales) {
        this.goodsSales = goodsSales;
    }

    @Basic
    @Column(name = "contacts_name", nullable = true, length = -1)
    public String getContactsName() {
        return contactsName;
    }

    public void setContactsName(String contactsName) {
        this.contactsName = contactsName;
    }

    @Basic
    @Column(name = "contacts_tell", nullable = true, length = -1)
    public String getContactsTell() {
        return contactsTell;
    }

    public void setContactsTell(String contactsTell) {
        this.contactsTell = contactsTell;
    }

    @Basic
    @Column(name = "contacts_company", nullable = true, length = -1)
    public String getContactsCompany() {
        return contactsCompany;
    }

    public void setContactsCompany(String contactsCompany) {
        this.contactsCompany = contactsCompany;
    }

    @Basic
    @Column(name = "operator", nullable = true, length = -1)
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GoodsEntity that = (GoodsEntity) o;

        if (id != that.id) return false;
        if (productName != null ? !productName.equals(that.productName) : that.productName != null) return false;
        if (classifyName != null ? !classifyName.equals(that.classifyName) : that.classifyName != null) return false;
        if (timeIn != null ? !timeIn.equals(that.timeIn) : that.timeIn != null) return false;
        if (isVisible != null ? !isVisible.equals(that.isVisible) : that.isVisible != null) return false;
        if (tag != null ? !tag.equals(that.tag) : that.tag != null) return false;
        if (img != null ? !img.equals(that.img) : that.img != null) return false;
        if (goodsTitle != null ? !goodsTitle.equals(that.goodsTitle) : that.goodsTitle != null) return false;
        if (goodsDetails != null ? !goodsDetails.equals(that.goodsDetails) : that.goodsDetails != null) return false;
        if (content != null ? !content.equals(that.content) : that.content != null) return false;
        if (isCampaign != null ? !isCampaign.equals(that.isCampaign) : that.isCampaign != null) return false;
        if (oldPrices != null ? !oldPrices.equals(that.oldPrices) : that.oldPrices != null) return false;
        if (newPrices != null ? !newPrices.equals(that.newPrices) : that.newPrices != null) return false;
        if (goodsDescribe != null ? !goodsDescribe.equals(that.goodsDescribe) : that.goodsDescribe != null)
            return false;
        if (goodsCount != null ? !goodsCount.equals(that.goodsCount) : that.goodsCount != null) return false;
        if (goodsSales != null ? !goodsSales.equals(that.goodsSales) : that.goodsSales != null) return false;
        if (contactsName != null ? !contactsName.equals(that.contactsName) : that.contactsName != null) return false;
        if (contactsTell != null ? !contactsTell.equals(that.contactsTell) : that.contactsTell != null) return false;
        if (contactsCompany != null ? !contactsCompany.equals(that.contactsCompany) : that.contactsCompany != null)
            return false;
        if (operator != null ? !operator.equals(that.operator) : that.operator != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (productName != null ? productName.hashCode() : 0);
        result = 31 * result + (classifyName != null ? classifyName.hashCode() : 0);
        result = 31 * result + (timeIn != null ? timeIn.hashCode() : 0);
        result = 31 * result + (isVisible != null ? isVisible.hashCode() : 0);
        result = 31 * result + (tag != null ? tag.hashCode() : 0);
        result = 31 * result + (img != null ? img.hashCode() : 0);
        result = 31 * result + (goodsTitle != null ? goodsTitle.hashCode() : 0);
        result = 31 * result + (goodsDetails != null ? goodsDetails.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (isCampaign != null ? isCampaign.hashCode() : 0);
        result = 31 * result + (oldPrices != null ? oldPrices.hashCode() : 0);
        result = 31 * result + (newPrices != null ? newPrices.hashCode() : 0);
        result = 31 * result + (goodsDescribe != null ? goodsDescribe.hashCode() : 0);
        result = 31 * result + (goodsCount != null ? goodsCount.hashCode() : 0);
        result = 31 * result + (goodsSales != null ? goodsSales.hashCode() : 0);
        result = 31 * result + (contactsName != null ? contactsName.hashCode() : 0);
        result = 31 * result + (contactsTell != null ? contactsTell.hashCode() : 0);
        result = 31 * result + (contactsCompany != null ? contactsCompany.hashCode() : 0);
        result = 31 * result + (operator != null ? operator.hashCode() : 0);
        return result;
    }
}
