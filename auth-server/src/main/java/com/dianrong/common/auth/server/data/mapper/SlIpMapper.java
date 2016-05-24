package com.dianrong.common.auth.server.data.mapper;

import com.dianrong.common.auth.server.data.entity.SlIp;
import com.dianrong.common.auth.server.data.entity.SlIpExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SlIpMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SL$IP
     *
     * @mbggenerated Thu May 05 10:43:21 CST 2016
     */
    int countByExample(SlIpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SL$IP
     *
     * @mbggenerated Thu May 05 10:43:21 CST 2016
     */
    int deleteByExample(SlIpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SL$IP
     *
     * @mbggenerated Thu May 05 10:43:21 CST 2016
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SL$IP
     *
     * @mbggenerated Thu May 05 10:43:21 CST 2016
     */
    int insert(SlIp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SL$IP
     *
     * @mbggenerated Thu May 05 10:43:21 CST 2016
     */
    int insertSelective(SlIp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SL$IP
     *
     * @mbggenerated Thu May 05 10:43:21 CST 2016
     */
    List<SlIp> selectByExample(SlIpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SL$IP
     *
     * @mbggenerated Thu May 05 10:43:21 CST 2016
     */
    SlIp selectByPrimaryKey(BigDecimal id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SL$IP
     *
     * @mbggenerated Thu May 05 10:43:21 CST 2016
     */
    int updateByExampleSelective(@Param("record") SlIp record, @Param("example") SlIpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SL$IP
     *
     * @mbggenerated Thu May 05 10:43:21 CST 2016
     */
    int updateByExample(@Param("record") SlIp record, @Param("example") SlIpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SL$IP
     *
     * @mbggenerated Thu May 05 10:43:21 CST 2016
     */
    int updateByPrimaryKeySelective(SlIp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SL$IP
     *
     * @mbggenerated Thu May 05 10:43:21 CST 2016
     */
    int updateByPrimaryKey(SlIp record);
    
    /**.
	  * 分页查询 oracle的版本 注意后期需要修改成mysql的版本 
	  * @param example example
	  * @return 结果
	  */
    List<SlIp> selectForPage_Oracle(SlIp example);
    
    /**.
  	  * 分页查询 oracle的版本 注意后期需要修改成mysql的版本 
  	  * @param example example
  	  * @return 结果
  	  */
      List<SlIp> selectForPage_MySql(SlIp example);
}