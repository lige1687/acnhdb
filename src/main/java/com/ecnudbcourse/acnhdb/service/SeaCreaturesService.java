package com.ecnudbcourse.acnhdb.service;

import com.ecnudbcourse.acnhdb.entity.SeaCreatures;
import com.ecnudbcourse.acnhdb.mapper.SeaCreaturesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SeaCreaturesService {

    @Autowired
    private SeaCreaturesMapper sea_creaturesMapper;

    public List<SeaCreatures> findByName(String name) { return sea_creaturesMapper.findByName(name); }

    public int insertSeaCreatures(SeaCreatures sea_creatures) { return sea_creaturesMapper.insertSeaCreatures(sea_creatures); }

    public int updateSeaCreatures(SeaCreatures sea_creatures) { return sea_creaturesMapper.updateSeaCreatures(sea_creatures); }

    public int deleteById(Long id) { return sea_creaturesMapper.deleteById(id); }

    public List<SeaCreatures> getAll() { return sea_creaturesMapper.selectList(null); }

    public SeaCreatures getById(Long id) { return sea_creaturesMapper.selectById(id); }


    public List<SeaCreatures> searchSeaCreaturesBySellRangeAndSort(Integer min, Integer max, String sort) {
        return sea_creaturesMapper.searchBySellRangeAndSort(min, max, sort);
    }

    public List<SeaCreatures> findActiveSeaCreatures(String month, int hour) {
        List<SeaCreatures> allSeaCreatures = sea_creaturesMapper.findAllSeaCreatures();
        System.out.println("All Sea Creatures: " + allSeaCreatures.size());  // 打印所有昆虫的数据大小
        List<SeaCreatures> activeSeaCreatures = filterActiveCreatures(allSeaCreatures, month, hour);
        System.out.println("Filtered Active Sea Creatures: " + activeSeaCreatures.size());  // 打印过滤后的活跃昆虫的数据大小
        return activeSeaCreatures;
    }

    private List<SeaCreatures> filterActiveCreatures(List<SeaCreatures> creatures, String month, int hour) {
        return creatures.stream()
                .filter(seaCreatures -> isActive(seaCreatures, month, hour))
                .collect(Collectors.toList());
    }

    private boolean isActive(SeaCreatures seaCreatures, String month, int hour) {
        String timeRange = seaCreatures.getTimeRange(month);  // 使用新方法获取时间范围
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
