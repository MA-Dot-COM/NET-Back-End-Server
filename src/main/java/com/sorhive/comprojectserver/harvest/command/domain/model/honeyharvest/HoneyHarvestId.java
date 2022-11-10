package com.sorhive.comprojectserver.harvest.command.domain.model.honeyharvest;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * <pre>
 * Class : LikedFeedId
 * Comment: 클래스에 대한 간단 설명
 * History
 * ================================================================
 * DATE             AUTHOR           NOTE
 * ----------------------------------------------------------------
 * 2022-11-02       부시연           최초 생성
 * </pre>
 *
 * @author 부시연(최초 작성자)
 * @version 1(클래스 버전)
 */
@Embeddable
@Access(AccessType.FIELD)
public class HoneyHarvestId implements Serializable {

    @Column(name="honey_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long value;

    protected HoneyHarvestId() {}

    public HoneyHarvestId(Long value) { this.value = value; }

    public Long getValue() { return value; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HoneyHarvestId that = (HoneyHarvestId) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() { return value != null ? value.hashCode() : 0; }

    public static HoneyHarvestId of(Long value) { return new HoneyHarvestId(value); }
}