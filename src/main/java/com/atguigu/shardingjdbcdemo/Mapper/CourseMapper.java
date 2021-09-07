package com.atguigu.shardingjdbcdemo.Mapper;

import com.atguigu.shardingjdbcdemo.entity.Course;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseMapper extends BaseMapper<Course> {
}
