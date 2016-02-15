package com.boredream.hhhgif.base;

import java.io.Serializable;

public class BaseEntity implements Serializable {

    // 添加新数据时,返回为objectId + createdAt
    // 更新数据时,返回为updateAt

    private String objectId;
    private String createdAt;
    private String updatedAt;

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof BaseEntity) {
            BaseEntity oEntity = (BaseEntity) o;
            return this.objectId.equals(oEntity.objectId);
        }
        return super.equals(o);
    }

    @Override
    public String toString() {
        return "BaseEntity{" +
                "objectId='" + objectId + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                '}';
    }
}
