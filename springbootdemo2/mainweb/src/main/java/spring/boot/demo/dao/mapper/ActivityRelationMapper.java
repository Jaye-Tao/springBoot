package spring.boot.demo.dao.mapper;

import org.springframework.stereotype.Repository;
import spring.boot.demo.dao.dto.ActivityRelation;

import java.util.List;

@Repository
public interface ActivityRelationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ActivityRelation record);

    int insertSelective(ActivityRelation record);

    ActivityRelation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ActivityRelation record);

    int updateByPrimaryKey(ActivityRelation record);

    List<ActivityRelation> findDataPage();
}