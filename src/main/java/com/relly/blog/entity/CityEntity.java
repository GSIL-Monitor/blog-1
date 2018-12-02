package com.relly.blog.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table city
 *
 * @mbg.generated do_not_delete_during_merge
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CityEntity implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column city.provinceId
     *
     * @mbg.generated
     */
    private String provinceId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column city.province
     *
     * @mbg.generated
     */
    private String province;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column city.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column city.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table city
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

}