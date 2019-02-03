package com.springboot.springbootdemo.zyr.pojo;

import java.io.Serializable;

public class Customer implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column erp_customer.CUSTOMER_ID
     *
     * @mbggenerated
     */
    private String customerId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column erp_customer.NAME
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column erp_customer.AGE
     *
     * @mbggenerated
     */
    private String age;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column erp_customer.PHONE
     *
     * @mbggenerated
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column erp_customer.ADDRESS
     *
     * @mbggenerated
     */
    private String address;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column erp_customer.QQ
     *
     * @mbggenerated
     */
    private Integer qq;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column erp_customer.WEIXIN
     *
     * @mbggenerated
     */
    private String weixin;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column erp_customer.CTIME
     *
     * @mbggenerated
     */
    private String ctime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column erp_customer.MONEY
     *
     * @mbggenerated
     */
    private Integer money;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column erp_customer.LEVEL
     *
     * @mbggenerated
     */
    private String level;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column erp_customer.REMARKS1
     *
     * @mbggenerated
     */
    private String remarks1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column erp_customer.REMARKS2
     *
     * @mbggenerated
     */
    private String remarks2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column erp_customer.USERNAME
     *
     * @mbggenerated
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table erp_customer
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column erp_customer.CUSTOMER_ID
     *
     * @return the value of erp_customer.CUSTOMER_ID
     *
     * @mbggenerated
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column erp_customer.CUSTOMER_ID
     *
     * @param customerId the value for erp_customer.CUSTOMER_ID
     *
     * @mbggenerated
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId == null ? null : customerId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column erp_customer.NAME
     *
     * @return the value of erp_customer.NAME
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column erp_customer.NAME
     *
     * @param name the value for erp_customer.NAME
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column erp_customer.AGE
     *
     * @return the value of erp_customer.AGE
     *
     * @mbggenerated
     */
    public String getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column erp_customer.AGE
     *
     * @param age the value for erp_customer.AGE
     *
     * @mbggenerated
     */
    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column erp_customer.PHONE
     *
     * @return the value of erp_customer.PHONE
     *
     * @mbggenerated
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column erp_customer.PHONE
     *
     * @param phone the value for erp_customer.PHONE
     *
     * @mbggenerated
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column erp_customer.ADDRESS
     *
     * @return the value of erp_customer.ADDRESS
     *
     * @mbggenerated
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column erp_customer.ADDRESS
     *
     * @param address the value for erp_customer.ADDRESS
     *
     * @mbggenerated
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column erp_customer.QQ
     *
     * @return the value of erp_customer.QQ
     *
     * @mbggenerated
     */
    public Integer getQq() {
        return qq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column erp_customer.QQ
     *
     * @param qq the value for erp_customer.QQ
     *
     * @mbggenerated
     */
    public void setQq(Integer qq) {
        this.qq = qq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column erp_customer.WEIXIN
     *
     * @return the value of erp_customer.WEIXIN
     *
     * @mbggenerated
     */
    public String getWeixin() {
        return weixin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column erp_customer.WEIXIN
     *
     * @param weixin the value for erp_customer.WEIXIN
     *
     * @mbggenerated
     */
    public void setWeixin(String weixin) {
        this.weixin = weixin == null ? null : weixin.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column erp_customer.CTIME
     *
     * @return the value of erp_customer.CTIME
     *
     * @mbggenerated
     */
    public String getCtime() {
        return ctime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column erp_customer.CTIME
     *
     * @param ctime the value for erp_customer.CTIME
     *
     * @mbggenerated
     */
    public void setCtime(String ctime) {
        this.ctime = ctime == null ? null : ctime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column erp_customer.MONEY
     *
     * @return the value of erp_customer.MONEY
     *
     * @mbggenerated
     */
    public Integer getMoney() {
        return money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column erp_customer.MONEY
     *
     * @param money the value for erp_customer.MONEY
     *
     * @mbggenerated
     */
    public void setMoney(Integer money) {
        this.money = money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column erp_customer.LEVEL
     *
     * @return the value of erp_customer.LEVEL
     *
     * @mbggenerated
     */
    public String getLevel() {
        return level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column erp_customer.LEVEL
     *
     * @param level the value for erp_customer.LEVEL
     *
     * @mbggenerated
     */
    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column erp_customer.REMARKS1
     *
     * @return the value of erp_customer.REMARKS1
     *
     * @mbggenerated
     */
    public String getRemarks1() {
        return remarks1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column erp_customer.REMARKS1
     *
     * @param remarks1 the value for erp_customer.REMARKS1
     *
     * @mbggenerated
     */
    public void setRemarks1(String remarks1) {
        this.remarks1 = remarks1 == null ? null : remarks1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column erp_customer.REMARKS2
     *
     * @return the value of erp_customer.REMARKS2
     *
     * @mbggenerated
     */
    public String getRemarks2() {
        return remarks2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column erp_customer.REMARKS2
     *
     * @param remarks2 the value for erp_customer.REMARKS2
     *
     * @mbggenerated
     */
    public void setRemarks2(String remarks2) {
        this.remarks2 = remarks2 == null ? null : remarks2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column erp_customer.USERNAME
     *
     * @return the value of erp_customer.USERNAME
     *
     * @mbggenerated
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column erp_customer.USERNAME
     *
     * @param username the value for erp_customer.USERNAME
     *
     * @mbggenerated
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table erp_customer
     *
     * @mbggenerated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Customer other = (Customer) that;
        return (this.getCustomerId() == null ? other.getCustomerId() == null : this.getCustomerId().equals(other.getCustomerId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getAge() == null ? other.getAge() == null : this.getAge().equals(other.getAge()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getQq() == null ? other.getQq() == null : this.getQq().equals(other.getQq()))
            && (this.getWeixin() == null ? other.getWeixin() == null : this.getWeixin().equals(other.getWeixin()))
            && (this.getCtime() == null ? other.getCtime() == null : this.getCtime().equals(other.getCtime()))
            && (this.getMoney() == null ? other.getMoney() == null : this.getMoney().equals(other.getMoney()))
            && (this.getLevel() == null ? other.getLevel() == null : this.getLevel().equals(other.getLevel()))
            && (this.getRemarks1() == null ? other.getRemarks1() == null : this.getRemarks1().equals(other.getRemarks1()))
            && (this.getRemarks2() == null ? other.getRemarks2() == null : this.getRemarks2().equals(other.getRemarks2()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table erp_customer
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCustomerId() == null) ? 0 : getCustomerId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getAge() == null) ? 0 : getAge().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getQq() == null) ? 0 : getQq().hashCode());
        result = prime * result + ((getWeixin() == null) ? 0 : getWeixin().hashCode());
        result = prime * result + ((getCtime() == null) ? 0 : getCtime().hashCode());
        result = prime * result + ((getMoney() == null) ? 0 : getMoney().hashCode());
        result = prime * result + ((getLevel() == null) ? 0 : getLevel().hashCode());
        result = prime * result + ((getRemarks1() == null) ? 0 : getRemarks1().hashCode());
        result = prime * result + ((getRemarks2() == null) ? 0 : getRemarks2().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table erp_customer
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", customerId=").append(customerId);
        sb.append(", name=").append(name);
        sb.append(", age=").append(age);
        sb.append(", phone=").append(phone);
        sb.append(", address=").append(address);
        sb.append(", qq=").append(qq);
        sb.append(", weixin=").append(weixin);
        sb.append(", ctime=").append(ctime);
        sb.append(", money=").append(money);
        sb.append(", level=").append(level);
        sb.append(", remarks1=").append(remarks1);
        sb.append(", remarks2=").append(remarks2);
        sb.append(", username=").append(username);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}