package com.admin.mapper;

import com.admin.entity.Customers;
import com.admin.entity.CustomersExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;

public interface CustomersMapper {
    /**
     *
     * @mbggenerated
     */
    @SelectProvider(type=CustomersSqlProvider.class, method="countByExample")
    int countByExample(CustomersExample example);

    /**
     *
     * @mbggenerated
     */
    @DeleteProvider(type=CustomersSqlProvider.class, method="deleteByExample")
    int deleteByExample(CustomersExample example);

    /**
     *
     * @mbggenerated
     */
    @Delete({
        "delete from customers",
        "where cust_id = #{custId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer custId);

    /**
     *
     * @mbggenerated
     */
    @Insert({
        "insert into customers (user_id, cust_name, ",
        "cust_phone, cust_email, ",
        "cust_job, cust_credit)",
        "values (#{userId,jdbcType=INTEGER}, #{custName,jdbcType=VARCHAR}, ",
        "#{custPhone,jdbcType=VARCHAR}, #{custEmail,jdbcType=VARCHAR}, ",
        "#{custJob,jdbcType=VARCHAR}, #{custCredit,jdbcType=INTEGER})"
    })
    @Options(useGeneratedKeys=true,keyProperty="custId")
    int insert(Customers record);

    /**
     *
     * @mbggenerated
     */
    @InsertProvider(type=CustomersSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="custId")
    int insertSelective(Customers record);

    /**
     *
     * @mbggenerated
     */
    @SelectProvider(type=CustomersSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="cust_id", property="custId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="cust_name", property="custName", jdbcType=JdbcType.VARCHAR),
        @Result(column="cust_phone", property="custPhone", jdbcType=JdbcType.VARCHAR),
        @Result(column="cust_email", property="custEmail", jdbcType=JdbcType.VARCHAR),
        @Result(column="cust_job", property="custJob", jdbcType=JdbcType.VARCHAR),
        @Result(column="cust_credit", property="custCredit", jdbcType=JdbcType.INTEGER)
    })
    List<Customers> selectByExampleWithRowbounds(CustomersExample example, RowBounds rowBounds);

    /**
     *
     * @mbggenerated
     */
    @SelectProvider(type=CustomersSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="cust_id", property="custId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="cust_name", property="custName", jdbcType=JdbcType.VARCHAR),
        @Result(column="cust_phone", property="custPhone", jdbcType=JdbcType.VARCHAR),
        @Result(column="cust_email", property="custEmail", jdbcType=JdbcType.VARCHAR),
        @Result(column="cust_job", property="custJob", jdbcType=JdbcType.VARCHAR),
        @Result(column="cust_credit", property="custCredit", jdbcType=JdbcType.INTEGER)
    })
    List<Customers> selectByExample(CustomersExample example);

    /**
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "cust_id, user_id, cust_name, cust_phone, cust_email, cust_job, cust_credit",
        "from customers",
        "where cust_id = #{custId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="cust_id", property="custId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="cust_name", property="custName", jdbcType=JdbcType.VARCHAR),
        @Result(column="cust_phone", property="custPhone", jdbcType=JdbcType.VARCHAR),
        @Result(column="cust_email", property="custEmail", jdbcType=JdbcType.VARCHAR),
        @Result(column="cust_job", property="custJob", jdbcType=JdbcType.VARCHAR),
        @Result(column="cust_credit", property="custCredit", jdbcType=JdbcType.INTEGER)
    })
    Customers selectByPrimaryKey(Integer custId);

    /**
     *
     * @mbggenerated
     */
    @UpdateProvider(type=CustomersSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Customers record, @Param("example") CustomersExample example);

    /**
     *
     * @mbggenerated
     */
    @UpdateProvider(type=CustomersSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Customers record, @Param("example") CustomersExample example);

    /**
     *
     * @mbggenerated
     */
    @UpdateProvider(type=CustomersSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Customers record);

    /**
     *
     * @mbggenerated
     */
    @Update({
        "update customers",
        "set user_id = #{userId,jdbcType=INTEGER},",
          "cust_name = #{custName,jdbcType=VARCHAR},",
          "cust_phone = #{custPhone,jdbcType=VARCHAR},",
          "cust_email = #{custEmail,jdbcType=VARCHAR},",
          "cust_job = #{custJob,jdbcType=VARCHAR},",
          "cust_credit = #{custCredit,jdbcType=INTEGER}",
        "where cust_id = #{custId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Customers record);
}