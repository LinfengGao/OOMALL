package xmu.domain;

import java.util.Date;

//该类就是老师上课说的pojo
public class Order {
    private Integer id;
    private Integer customer_id;
    private Integer shop_id;
    private String order_sn;
    private Integer pid;
    private String consignee;
    private Integer region_id;
    private String address;
    private String mobile;
    private String message;
    private Integer order_type;
    private Integer freight_price;
    private Integer coupon_id;
    private Integer coupon_activity_id;
    private Integer discount_price;
    private Integer origin_price;
    private Integer presale_id;
    private Integer groupon_discount;
    private Integer rebate_num;
    private Date confirm_time;
    private String shipment_sn;
    private Integer state;
    private Integer substate;
    private Integer be_deleted;
    private Date gmt_create;
    private Date gmt_modified;
    private Integer groupon_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Integer customer_id) {
        this.customer_id = customer_id;
    }

    public Integer getShop_id() {
        return shop_id;
    }

    public void setShop_id(Integer shop_id) {
        this.shop_id = shop_id;
    }

    public String getOrder_sn() {
        return order_sn;
    }

    public void setOrder_sn(String order_sn) {
        this.order_sn = order_sn;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public Integer getRegion_id() {
        return region_id;
    }

    public void setRegion_id(Integer region_id) {
        this.region_id = region_id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getOrder_type() {
        return order_type;
    }

    public void setOrder_type(Integer order_type) {
        this.order_type = order_type;
    }

    public Integer getFreight_price() {
        return freight_price;
    }

    public void setFreight_price(Integer freight_price) {
        this.freight_price = freight_price;
    }

    public Integer getCoupon_id() {
        return coupon_id;
    }

    public void setCoupon_id(Integer coupon_id) {
        this.coupon_id = coupon_id;
    }

    public Integer getCoupon_activity_id() {
        return coupon_activity_id;
    }

    public void setCoupon_activity_id(Integer coupon_activity_id) {
        this.coupon_activity_id = coupon_activity_id;
    }

    public Integer getDiscount_price() {
        return discount_price;
    }

    public void setDiscount_price(Integer discount_price) {
        this.discount_price = discount_price;
    }

    public Integer getOrigin_price() {
        return origin_price;
    }

    public void setOrigin_price(Integer origin_price) {
        this.origin_price = origin_price;
    }

    public Integer getPresale_id() {
        return presale_id;
    }

    public void setPresale_id(Integer presale_id) {
        this.presale_id = presale_id;
    }

    public Integer getGroupon_discount() {
        return groupon_discount;
    }

    public void setGroupon_discount(Integer groupon_discount) {
        this.groupon_discount = groupon_discount;
    }

    public Integer getRebate_num() {
        return rebate_num;
    }

    public void setRebate_num(Integer rebate_num) {
        this.rebate_num = rebate_num;
    }

    public Date getConfirm_time() {
        return confirm_time;
    }

    public void setConfirm_time(Date confirm_time) {
        this.confirm_time = confirm_time;
    }

    public String getShipment_sn() {
        return shipment_sn;
    }

    public void setShipment_sn(String shipment_sn) {
        this.shipment_sn = shipment_sn;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getSubstate() {
        return substate;
    }

    public void setSubstate(Integer substate) {
        this.substate = substate;
    }

    public Integer getBe_deleted() {
        return be_deleted;
    }

    public void setBe_deleted(Integer be_deleted) {
        this.be_deleted = be_deleted;
    }

    public Date getGmt_create() {
        return gmt_create;
    }

    public void setGmt_create(Date gmt_create) {
        this.gmt_create = gmt_create;
    }

    public Date getGmt_modified() {
        return gmt_modified;
    }

    public void setGmt_modified(Date gmt_modified) {
        this.gmt_modified = gmt_modified;
    }

    public Integer getGroupon_id() {
        return groupon_id;
    }

    public void setGroupon_id(Integer groupon_id) {
        this.groupon_id = groupon_id;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", customer_id=" + customer_id +
                ", shop_id=" + shop_id +
                ", order_sn='" + order_sn + '\'' +
                ", pid=" + pid +
                ", consignee='" + consignee + '\'' +
                ", region_id=" + region_id +
                ", address='" + address + '\'' +
                ", mobile='" + mobile + '\'' +
                ", message='" + message + '\'' +
                ", order_type=" + order_type +
                ", freight_price=" + freight_price +
                ", coupon_id=" + coupon_id +
                ", coupon_activity_id=" + coupon_activity_id +
                ", discount_price=" + discount_price +
                ", origin_price=" + origin_price +
                ", presale_id=" + presale_id +
                ", groupon_discount=" + groupon_discount +
                ", rebate_num=" + rebate_num +
                ", confirm_time=" + confirm_time +
                ", shipment_sn='" + shipment_sn + '\'' +
                ", state=" + state +
                ", substate=" + substate +
                ", be_deleted=" + be_deleted +
                ", gmt_create=" + gmt_create +
                ", gmt_modified=" + gmt_modified +
                ", groupon_id=" + groupon_id +
                '}';
    }
}
