package com.hy.context.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

/**
 * 委外催收记录表
 * @author
 * @create 2017-10-24
 **/
@Entity
@Table(name = "t_out_collection_log")
public class OutCollectionLog extends BaseModel{

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer fdId;

	//操作周期
    private Integer fdCycleNumber;

    //台账单据id（新增单据ID）
    private Integer fdBillId;

    //催收操作类型(1.完成委外,2委外已复核,3、委外复核,4、委外复核 驳回)
    private Integer fdOperateType;

    //操作时间
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")     //入参
    private Date fdOperateTime;

    //操作人
    private String fdOperator;

    //备注
    @Column(length = 65536)
    private String remark;

    //附件
    private String attachment;

    public Integer getFdId() {
        return fdId;
    }

    public Integer getFdBillId() {
        return fdBillId;
    }

    public Integer getFdOperateType() {
        return fdOperateType;
    }

    public Date getFdOperateTime() {
        return fdOperateTime;
    }

    public String getFdOperator() {
        return fdOperator;
    }

    public String getRemark() {
        return remark;
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

    public void setFdOperateTime(Date fdOperateTime) {
        this.fdOperateTime = fdOperateTime;
    }

    public void setFdOperator(String fdOperator) {
        this.fdOperator = fdOperator;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }

    public String getAttachment() {
        return attachment;
    }

    public Integer getFdCycleNumber() {
        return fdCycleNumber;
    }

    public void setFdCycleNumber(Integer fdCycleNumber) {
        this.fdCycleNumber = fdCycleNumber;
    }
}
