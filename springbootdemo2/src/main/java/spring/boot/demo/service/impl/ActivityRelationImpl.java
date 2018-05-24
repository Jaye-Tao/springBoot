package spring.boot.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.boot.demo.dao.dto.ActivityRelation;
import spring.boot.demo.dao.mapper.ActivityRelationMapper;
import spring.boot.demo.service.ActivityRelationService;

/**
 * Created Jay
 * Date 2018/5/23
 */
@Service
public class ActivityRelationImpl implements ActivityRelationService {

    @Autowired
    private ActivityRelationMapper activityRelationMapper;

    @Override
    public ActivityRelation findData(Integer id) {
        ActivityRelation temp=activityRelationMapper.selectByPrimaryKey(id);
        return temp;
    }
}
