package com.ecnudbcourse.acnhdb.service;

import com.ecnudbcourse.acnhdb.entity.Insects;
import com.ecnudbcourse.acnhdb.mapper.InsectsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class InsectsService {

    @Autowired
    private InsectsMapper insectsMapper;

    public List<Insects> findByName(String name) { return insectsMapper.findByName(name); }

    public int insertInsects(Insects insects) { return insectsMapper.insertInsects(insects); }

    public int updateInsects(Insects insects) { return insectsMapper.updateInsects(insects); }

    public int deleteById(Long id) { return insectsMapper.deleteById(id); }

    public List<Insects> getAll() { return insectsMapper.selectList(null); }

    public Insects getById(Long id) { return insectsMapper.selectById(id); }

    public List<Insects> findActiveInsects(String month, int hour) {
        List<Insects> allInsects = insectsMapper.findAllInsects();
        System.out.println("All Insects: " + allInsects.size());  // 打印所有昆虫的数据大小
        List<Insects> activeInsects = filterActiveCreatures(allInsects, month, hour);
        System.out.println("Filtered Active Insects: " + activeInsects.size());  // 打印过滤后的活跃昆虫的数据大小
        return activeInsects;
    }

    private List<Insects> filterActiveCreatures(List<Insects> creatures, String month, int hour) {
        return creatures.stream()
                .filter(insects -> isActive(insects, month, hour))
                .collect(Collectors.toList());
    }

    private boolean isActive(Insects insects, String month, int hour) {
        String timeRange = insects.getTimeRange(month);  // 使用新方法获取时间范围
        System.out.println("Time Range: " + timeRange);  // 打印时间范围
        return timeRange != null && isTimeInRange(timeRange, hour);
    }

    private boolean isTimeInRange(String timeRange, int hour) {
        if (timeRange.equalsIgnoreCase("All day")) {
            return true;
        }

        String[] times = timeRange.replace("&nbsp;", " ").split("-");
        if (times.length != 2) {
            return false;
        }
        int startHour = convertTo24Hour(times[0].trim());
        int endHour = convertTo24Hour(times[1].trim());
        System.out.println("Start Hour: " + startHour + ", End Hour: " + endHour);  // 打印开始和结束小时
        return (hour >= startHour && hour < endHour) || (endHour < startHour && (hour >= startHour || hour < endHour));
    }

    private int convertTo24Hour(String time) {
        boolean isPM = time.toUpperCase().contains("PM");
        time = time.replaceAll("[^0-9]", "");
        int hour = Integer.parseInt(time);
        if (isPM && hour != 12) {
            hour += 12;
        }
        if (!isPM && hour == 12) {
            hour = 0;
        }
        return hour;
    }
}
