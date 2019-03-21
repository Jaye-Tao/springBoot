package spring.boot.demo.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import spring.boot.demo.dao.dto.ActivityRelation;
import spring.boot.demo.service.ActivityRelationService;
import spring.boot.demo.service.CommonRedisService;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created Jay
 * Date 2018/5/23
 */
@Controller
public class Democontroller {

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private ActivityRelationService activityRelationService;

    @Autowired
    private CommonRedisService redisService;

    @Autowired
    private DemoRabbitMqSender demoRabbitMqSender;
    @Autowired
    private DemoRabbitMqReceiver demoRabbitMqReceiver;


    /**
     * 数据库连接测试 (分页测试)
     * @param mv
     * @return
     */
    @RequestMapping("/hello")
    public String main(Model mv) {
        List lis = new ArrayList();
        PageHelper.startPage(1,10);
        List<ActivityRelation> activityRelation = activityRelationService.findDataPage();
        PageInfo<ActivityRelation> appsPageInfo = new PageInfo<>(activityRelation);
        return "index";
    }

    /**
     * 日志测试
     */
    @RequestMapping("log")
    public void logTest() {
        logger.trace("I am trace log.");
        logger.debug("I am debug log.");
        logger.info("I am info log.");
        logger.warn("I am warn log.");
        logger.error("I am error log.{}", new Date());
    }

    /**
     * reids测试
     */
    @RequestMapping("redis")
    public String reidsTest(Model mv) {
        List<Object> list = new ArrayList<>();
        redisService.set("test:data","redisData");
        Object tmp = redisService.get("hah");
        logger.info(tmp + "*********************************");
        System.out.println(tmp);
        list.add(tmp);
        mv.addAttribute("name", list);
        return "index";
    }


    /**
     * 发送测试消息队列
     */
    @ApiOperation(value="发送测试消息队列", notes="addEntity")
    @RequestMapping(value = "/addRabbitMq", method = RequestMethod.GET)
    public String addEntity(Model mv) {
        String mes="test rabbitmq hello!";
        demoRabbitMqSender.send("test-quen",mes);
        logger.info("消息发送成功!");
        mv.addAttribute("mes",mes);
        return "mesMain";
    }


}
