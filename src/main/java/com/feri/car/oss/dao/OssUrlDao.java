package com.feri.car.oss.dao;

import com.feri.car.oss.entity.OssUrl;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface OssUrlDao {
    //添加
    @Insert("insert into t_ossurl(objname,url,ctime,endtime)values(#{objname},#{url},now(),#{endtime})")
    @Options(useGeneratedKeys = true,keyProperty = "id")
    int insert(OssUrl url);

    //查询
    @Select("select id,objname,url,ctime,endtime from t_ossurl order by id desc")
    @ResultType(OssUrl.class)
    List<OssUrl> selectAll();

    //删除
    @Delete("delete from t_ossurl where objname=#{name}")
    int delete(String name);
}
