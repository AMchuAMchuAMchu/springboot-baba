package com.itcast.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.convert.DataSizeUnit;
import org.springframework.boot.convert.DurationUnit;
import org.springframework.stereotype.Component;
import org.springframework.util.unit.DataSize;
import org.springframework.util.unit.DataUnit;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

/**
 * Description ==> TODO
 * BelongsProject ==> springboot-baba
 * BelongsPackage ==> com.itcast.entity
 * Version ==> 1.0
 * CreateTime ==> 2022-12-13 09:45:09
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Data
@Component
@ConfigurationProperties(prefix = "cfserver")
@Validated
public class CFServerTimeData {

    @Max(value = 20,message = "Duration 时间单位异常!!!")
    @DurationUnit(ChronoUnit.HOURS)
    private Duration timeout;

    @Min(value = 30,message = "内存配置异常!!!!")
    @DataSizeUnit(DataUnit.MEGABYTES)
    private DataSize dataSize;
}
