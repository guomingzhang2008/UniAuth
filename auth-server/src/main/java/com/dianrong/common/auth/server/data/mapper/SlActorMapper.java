package com.dianrong.common.auth.server.data.mapper;

import com.dianrong.common.auth.server.data.entity.SlActor;
import com.dianrong.common.auth.server.data.entity.SlActorExample;
import com.dianrong.common.auth.server.data.entity.SlActorWithBLOBs;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SlActorMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SL$ACTOR
     *
     * @mbggenerated Thu May 05 10:43:21 CST 2016
     */
    int countByExample(SlActorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SL$ACTOR
     *
     * @mbggenerated Thu May 05 10:43:21 CST 2016
     */
    int deleteByExample(SlActorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SL$ACTOR
     *
     * @mbggenerated Thu May 05 10:43:21 CST 2016
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SL$ACTOR
     *
     * @mbggenerated Thu May 05 10:43:21 CST 2016
     */
    int insert(SlActorWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SL$ACTOR
     *
     * @mbggenerated Thu May 05 10:43:21 CST 2016
     */
    int insertSelective(SlActorWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SL$ACTOR
     *
     * @mbggenerated Thu May 05 10:43:21 CST 2016
     */
    List<SlActorWithBLOBs> selectByExampleWithBLOBs(SlActorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SL$ACTOR
     *
     * @mbggenerated Thu May 05 10:43:21 CST 2016
     */
    List<SlActor> selectByExample(SlActorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SL$ACTOR
     *
     * @mbggenerated Thu May 05 10:43:21 CST 2016
     */
    SlActorWithBLOBs selectByPrimaryKey(BigDecimal id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SL$ACTOR
     *
     * @mbggenerated Thu May 05 10:43:21 CST 2016
     */
    int updateByExampleSelective(@Param("record") SlActorWithBLOBs record, @Param("example") SlActorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SL$ACTOR
     *
     * @mbggenerated Thu May 05 10:43:21 CST 2016
     */
    int updateByExampleWithBLOBs(@Param("record") SlActorWithBLOBs record, @Param("example") SlActorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SL$ACTOR
     *
     * @mbggenerated Thu May 05 10:43:21 CST 2016
     */
    int updateByExample(@Param("record") SlActor record, @Param("example") SlActorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SL$ACTOR
     *
     * @mbggenerated Thu May 05 10:43:21 CST 2016
     */
    int updateByPrimaryKeySelective(SlActorWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SL$ACTOR
     *
     * @mbggenerated Thu May 05 10:43:21 CST 2016
     */
    int updateByPrimaryKeyWithBLOBs(SlActorWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SL$ACTOR
     *
     * @mbggenerated Thu May 05 10:43:21 CST 2016
     */
    int updateByPrimaryKey(SlActor record);
}