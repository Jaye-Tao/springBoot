package spring.boot.demo.service;

import spring.boot.demo.dao.dto.ActivityRelation;

import java.util.List;

/**
 * Created Jay
 * Date 2018/5/23
 */

public interface ActivityRelationService {

    ActivityRelation findData(Integer id);
    List<ActivityRelation> findDataPage();
}
