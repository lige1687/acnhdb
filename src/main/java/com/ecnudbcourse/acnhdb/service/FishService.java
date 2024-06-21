package com.ecnudbcourse.acnhdb.service;

import com.ecnudbcourse.acnhdb.entity.Fish;
import com.ecnudbcourse.acnhdb.mapper.FishMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class FishService {

    @Autowired
    private FishMapper fishMapper;

    public List<Fish> findByName(String name) { return fishMapper.findByName(name); }

    public int insertFish(Fish fish) { return fishMapper.insertFish(fish); }

    public int updateFish(Fish fish) { return fishMapper.updateFish(fish); }

    public int deleteById(Long id) { return fishMapper.deleteById(id); }

    public List<Fish> getAll() { return fishMapper.selectList(null); }

    public Fish getById(Long id) { return fishMapper.selectById(id); }
    public List<Fish> getActiveFish(String month, String time) {
        return fishMapper.findActiveFish(month, time);
    }
    public List<Fish> findActiveFish(String month, int hour) {
        List<Fish> allFish = fishMapper.findAllFish();
        System.out.println("All Fish: " + allFish.size());  // 打印所有鱼的数据大小
        List<Fish> activeFish = filterActiveCreatures(allFish, month, hour);
        System.out.println("Filtered Active Fish: " + activeFish.size());  // 打印过滤后的活跃鱼的数据大小
        return activeFish;
    }

    private List<Fish> filterActiveCreatures(List<Fish> creatures, String month, int hour) {
        return creatures.stream()
                .filter(fish -> isActive(fish, month, hour))
                .collect(Collectors.toList());
    }

    private boolean isActive(Fish fish, String month, int hour) {
        String timeRange = fish.getTimeRange(month);  // 使用新方法获取时间范围
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
