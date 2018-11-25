package com.relly.blog.mapper;

import com.relly.blog.common.model.PageObject;
import com.relly.blog.common.model.PageResult;
import com.relly.blog.dto.ArticleDTO;
import com.relly.blog.entity.ArticleEntity;
import com.relly.blog.entity.PermissionEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ArticleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article
     *
     * @mbg.generated
     */
    int insert(ArticleEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article
     *
     * @mbg.generated
     */
    int insertSelective(ArticleEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article
     *
     * @mbg.generated
     */
    ArticleEntity selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ArticleEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ArticleEntity record);

    List<ArticleDTO> getArticleListByUser(@Param("userId") String userId);

    int gettMyArticleListCount(@Param("userId") String userId);

    List<ArticleDTO> getMyArticleListMore(@Param("userId") String userId, @Param("pageObject")PageObject pageObject);

    ArticleDTO getArticleDetail(@Param(("articleId")) String articleId);
}