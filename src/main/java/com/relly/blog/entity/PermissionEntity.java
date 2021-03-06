package com.relly.blog.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table permission
 *
 * @mbg.generated do_not_delete_during_merge
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PermissionEntity extends CommonBaseEntity implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permission.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permission.name
     *
     * @mbg.generated
     */
    @NotNull(message = "权限名称不能为空")
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permission.parent_id
     *
     * @mbg.generated
     */
    private String parent_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permission.permission
     *
     * @mbg.generated
     */
    @NotNull(message = "权限不能为空")
    private String permission;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permission.resource_type
     *
     * @mbg.generated
     */
    @NotNull(message = "权限类型不能为空")
    private String resource_type;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permission.createTime
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * Database Column Remarks:
     *   最后修改时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permission.updateTime
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     * Database Column Remarks:
     *   创建用户
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permission.createUser
     *
     * @mbg.generated
     */
    private String createUser;

    /**
     * Database Column Remarks:
     *   更新用户
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permission.updateUser
     *
     * @mbg.generated
     */
    private String updateUser;

    /**
     * Database Column Remarks:
     *   是否已删除
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permission.isDelete
     *
     * @mbg.generated
     */
    private Boolean isDelete;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table permission
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;


}