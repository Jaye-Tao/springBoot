package spring.boot.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.boot.demo.dao.dto.ActivityRelation;
import spring.boot.demo.service.ActivityRelationService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created Jay
 * Date 2018/5/23
 */
@Controller
public class Democontroller{

    @Autowired
    private ActivityRelationService activityRelationService;


    @RequestMapping("/hello")
    public  String main(Model mv){
        List lis= new ArrayList();
        ActivityRelation activityRelation=activityRelationService.findData(144);
        lis.add(activityRelation.getFormSn());
        lis.add(activityRelation.getParentFormNo());
        lis.add(activityRelation.getParentFormSn());
        lis.add(activityRelation.getFormNo());
        mv.addAttribute("name",lis);
        return "index";
    }
}
