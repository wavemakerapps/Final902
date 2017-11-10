/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.final902.salesdb;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Reps generated by WaveMaker Studio.
 */
@Entity
@Table(name = "`REPS`")
public class Reps implements Serializable {

    private Integer id;
    private String name;
    private Integer channelType;
    private String street;
    private String city;
    private String state;
    private String zip;
    private String picurl;
    private String password;
    private String role;
    private String username;
    private Channels channels;
    private List<Tasks> taskses;
    private List<Quotes> quoteses;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "`ID`", nullable = false, scale = 0, precision = 10)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "`NAME`", nullable = false, length = 32)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "`CHANNEL_TYPE`", nullable = true, scale = 0, precision = 10)
    public Integer getChannelType() {
        return this.channelType;
    }

    public void setChannelType(Integer channelType) {
        this.channelType = channelType;
    }

    @Column(name = "`STREET`", nullable = true, length = 64)
    public String getStreet() {
        return this.street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Column(name = "`CITY`", nullable = true, length = 32)
    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Column(name = "`STATE`", nullable = true, length = 2)
    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Column(name = "`ZIP`", nullable = true, length = 6)
    public String getZip() {
        return this.zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Column(name = "`PICURL`", nullable = true, length = 1024)
    public String getPicurl() {
        return this.picurl;
    }

    public void setPicurl(String picurl) {
        this.picurl = picurl;
    }

    @Column(name = "`PASSWORD`", nullable = true, length = 32)
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name = "`ROLE`", nullable = true, length = 32)
    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Column(name = "`USERNAME`", nullable = true, length = 32)
    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "`CHANNEL_TYPE`", referencedColumnName = "`ID`", insertable = false, updatable = false, foreignKey = @ForeignKey(name = "`FK_REP_CHANNEL_TYPE`"))
    public Channels getChannels() {
        return this.channels;
    }

    public void setChannels(Channels channels) {
        if(channels != null) {
            this.channelType = channels.getId();
        }

        this.channels = channels;
    }

    @JsonInclude(Include.NON_EMPTY)
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.REMOVE, mappedBy = "reps")
    public List<Tasks> getTaskses() {
        return this.taskses;
    }

    public void setTaskses(List<Tasks> taskses) {
        this.taskses = taskses;
    }

    @JsonInclude(Include.NON_EMPTY)
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.REMOVE, mappedBy = "reps")
    public List<Quotes> getQuoteses() {
        return this.quoteses;
    }

    public void setQuoteses(List<Quotes> quoteses) {
        this.quoteses = quoteses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Reps)) return false;
        final Reps reps = (Reps) o;
        return Objects.equals(getId(), reps.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}

