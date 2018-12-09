package com.wechat_springboot.standand.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Resource {
    @Id
    private String resourceurl;
    private String resourceid;
    private String resourcename;
    private String courseid;

    @Override
    public String toString() {
        return "Resource{" +
                "resourceurl='" + resourceurl + '\'' +
                ", resourceid='" + resourceid + '\'' +
                ", resourcename='" + resourcename + '\'' +
                ", courseid='" + courseid + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Resource resource = (Resource) o;
        return Objects.equals(resourceurl, resource.resourceurl) &&
                Objects.equals(resourceid, resource.resourceid) &&
                Objects.equals(resourcename, resource.resourcename) &&
                Objects.equals(courseid, resource.courseid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceurl, resourceid, resourcename, courseid);
    }

    public String getResourceurl() {
        return resourceurl;
    }

    public void setResourceurl(String resourceurl) {
        this.resourceurl = resourceurl;
    }

    public String getResourceid() {
        return resourceid;
    }

    public void setResourceid(String resourceid) {
        this.resourceid = resourceid;
    }

    public String getResourcename() {
        return resourcename;
    }

    public void setResourcename(String resourcename) {
        this.resourcename = resourcename;
    }

    public String getCourseid() {
        return courseid;
    }

    public void setCourseid(String courseid) {
        this.courseid = courseid;
    }
}
