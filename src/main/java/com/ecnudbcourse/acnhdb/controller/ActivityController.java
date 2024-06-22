package com.ecnudbcourse.acnhdb.controller;

import com.ecnudbcourse.acnhdb.entity.Fish;
import com.ecnudbcourse.acnhdb.entity.Insects;
import com.ecnudbcourse.acnhdb.entity.SeaCreatures;
import com.ecnudbcourse.acnhdb.service.FishService;
import com.ecnudbcourse.acnhdb.service.InsectsService;
import com.ecnudbcourse.acnhdb.service.SeaCreaturesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;



//http://localhost:53306/api/activities/active
// 注意月份是 jan , reb 的简写哦, 而且必须首字母大写, time呢, 是8am 的时间?
@RestController
@RequestMapping("/api/activities")
public class ActivityController {

    @Autowired
    private FishService fishService;

    @Autowired
    private InsectsService insectsService;

    @Autowired
    private  SeaCreaturesService seaCreaturesService;


    @GetMapping("/active") public ResponseEntity<Map<String, List<?>>> getActiveCreatures(@RequestParam String hem, @RequestParam String month, @RequestParam int hour) {
        try {
            System.out.println("Month: " + month + ", Hour: " + hour);  // 打印传入参数
            List<Fish> activeFish = fishService.findActiveFish(hem + "_" + month, hour);
            System.out.println("Active Fish: " + activeFish.size());  // 打印返回的活跃鱼的数据大小
            List<Insects> activeInsects = insectsService.findActiveInsects(hem + "_" + month, hour);
            List<SeaCreatures> activeSeaCreatures = seaCreaturesService.findActiveSeaCreatures(hem + "_" + month, hour);

            Map<String, List<?>> activeCreatures = new HashMap<>();
            activeCreatures.put("fish", activeFish);
            activeCreatures.put("insects", activeInsects);
            activeCreatures.put("seaCreatures", activeSeaCreatures);
            return new ResponseEntity<>(activeCreatures, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();  // 记录详细的异常信息
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}