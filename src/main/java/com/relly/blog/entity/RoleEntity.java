package com.relly.blog.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table role
 *
 * @mbg.generated do_not_delete_during_merge
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RoleEntity extends CommonBaseEntity implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.description
     *
     * @mbg.generated
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.role
     *
     * @mbg.generated
     */
    private String role;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.createTime
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * Database Column Remarks:
     *   最后修改时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.updateTime
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     * Database Column Remarks:
     *   创建用户
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.createUser
     *
     * @mbg.generated
     */
    private String createUser;

    /**
     * Database Column Remarks:
     *   更新用户
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.updateUser
     *
     * @mbg.generated
     */
    private String updateUser;

    /**
     * Database Column Remarks:
     *   是否已删除
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.isDelete
     *
     * @mbg.generated
     */
    private Boolean isDelete;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table role
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;


}