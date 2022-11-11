package com.sorhive.comprojectserver.member.query.member;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <pre>
 * Class : MemberMapper
 * Comment: 클래스에 대한 간단 설명
 * History
 * ================================================================
 * DATE             AUTHOR           NOTE
 * ----------------------------------------------------------------
 * 2022-11-11       부시연           최초 생성
 * </pre>
 *
 * @author 부시연(최초 작성자)
 * @version 1(클래스 버전)
 * @see (참고할 class 또는 외부 url)
 */
@Mapper
public interface MemberMapper {
    List<MemberSummary> findAllByMemberCode(Long memberCode, Long offset);
}