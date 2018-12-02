package com.relly.blog.mapper;

import com.relly.blog.dto.NoticeDTO;
import com.relly.blog.entity.NoticeEntity;

import java.util.List;

public interface NoticeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notice
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notice
     *
     * @mbg.generated
     */
    int insert(NoticeEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notice
     *
     * @mbg.generated
     */
    int insertSelective(NoticeEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notice
     *
     * @mbg.generated
     */
    NoticeEntity selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notice
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(NoticeEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notice
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(NoticeEntity record);

    List<NoticeDTO> getNoticeList(String userId);

    int getNoticeCountByUserId(String userId);
}