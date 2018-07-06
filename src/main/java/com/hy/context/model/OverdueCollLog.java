package com.hy.context.model;

import javax.persistence.*;
import java.util.Date;

/**
 * 催收管理-催收记录
 *
 * @author
 * @create 2017-10-30
 **/
@Entity
@Table(name = "t_overdue_coll_log")
public class OverdueCollLog extends BaseModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer fdId;

    private Integer fdBillId;

    private Integer fdOperateType;     //催收类型

    private String remark;        //备注

    private String fdCreator;       //生成人

    private Date fdOperateTime;      //生成时间

    private String fdAttachement;   //附件地址

    public Integer getFdId() {
        return fdId;
    }

    public Integer getFdBillId() {
        return fdBillId;
    }

    public Integer getFdOperateType() {
        return fdOperateType;
    }

    public String getRemark() {
        return remark;
    }

    public String getFdCreator() {
        return fdCreator;
    }

    public Date getFdOperateTime() {
        return fdOperateTime;
    }

    public void setFdId(Integer fdId) {
        this.fdId = fdId;
    }

    public void setFdBillId(Integer fdBillId) {
        this.fdBillId = fdBillId;
    }

    public void setFdOperateType(Integer fdOperateType) {
        this.fdOperateType = fdOperateType;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setFdCreator(String fdCreator) {
        this.fdCreator = fdCreator;
    }

    public void setFdOperateTime(Date fdOperateTime) {
        this.fdOperateTime = fdOperateTime;
    }

    public String getFdAttachement() {
        return fdAttachement;
    }

    public void setFdAttachement(String fdAttachement) {
        this.fdAttachement = fdAttachement;
    }
}
