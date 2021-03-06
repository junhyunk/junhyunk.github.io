---
layout: post
comments: true
title: 성능테스트 Part 2
description: 성능테스트 Part 2
header: 성능테스트 Part 2
---

### Part 2 를 읽고 성능테스트시 어떤 작업들이 필요한지 정리하시오. (Word 2 page 분량)

1. 웹 어플리케이션 성능 테스트
    - 개요
        - 어플리케이션과, 그것을 뒷받침하기 위한 시스템에 대한 성능 테스트에서 공통적이고 핵심적인 작업을 소개함.
        - 성능 테스트는 "one-size-fits-all", "one-size-fits-most" 관점으로 접근하면 효율적으로 구성할 수 없는 복잡한 작업임.
        - 7가지 핵심 활동
            - 의사 결정을 위한 최소한의 지침을 제공.
            - 프로젝트에 적합한 접근 방식을 구축할 수 있는 기반을 제시함.

    1. Activity 1. 테스트 환경 식별
        - 물리적, production(이하 프로덕션) 환경을 확인하고 팀에 도구와 자원을 제공함.
        - 물리적 환경은 HW, SW, 네트워크 환경이 포함됨.
        - 초기 단계에서 매우 중요함.
        - 프로젝트 개발주기 전반에 걸쳐서 주기적으로 재검토되어야 함.
        - 입력
            * 논리적, 물리적 프로덕션 구조
            * 논리적, 물리적 테스트 구조
            * 가용한 도구
        - 출력
            * 테스트와 제품 간 환경 비교
            * 환경 관련 문제
            * 추가적인 도구가 필요한지 결정

    2. Activity 2. 성능 허용 기준 식별
        - 응답 시간, 처리량, 자원 사용률 목표와 제약조건을 확인함.
        - 일반적으로 응답시간은 사용자, 처리량은 비즈니스, 자원 사용률은 시스템 단계에서의 문제임.
        - 입력
            * 고객의 기대사항
            * 완화되어야 할 위험
            * 비즈니스 요구사항
            * 계약상 의무
        - 출력
            * 성능 테스트 성공 기준
            * 성능 목표와 요구사항
            * 조사해야 할 핵심 영역
            * 핵심 성능 지표
            * 핵심 사업적 지표

    3. Activity 3. 테스트 계획과 설계
        - 핵심 시나리오를 식별하고, 대표적인 사용자 간 가변성과 테스트 데이터, 수집할 항목(metric)을 정의함.
        - 입력
            * 가용한 어플리케이션 기능 또는 컴포넌트
            * 어플리케이션 사용 시나리오
            * 유닛 테스트
            * 성능 통과 기준
        - 출력
            * 구상 전략(?)
            * 테스트 실행 전제조건
            * 필요한 도구와 자원
            * 실험할 어플리케이션 사용 모델
            * 테스트 구현을 위한 테스트 데이터
            * 테스트 구현 준비

    4. Activity 4. 테스트 환경 설정
        - 테스트 환경, 도구, 자원 등을 향후 테스트가 가능하도록 준비함.
        - 테스트 환경에는 자원 모니터링도 포함함.
        - 입력
            * 구상 전략
            * 가용한 도구
            * 설계된 테스트
        - 출력
            * 부하 생성 및 자원 모니터링 도구
            * 성능 테스트를 위한 환경 준비

    5. Activity 5. 테스트 설계 구현
        - 테스트 설계대로 성능 테스트 구현
        - 입력
            * 구상 전략
            * 가용한 도구/환경
            * 가용한 어플리케이션 기능 또는 컴포넌트
            * 설계된 테스트
        - 출력
            * 검증되고 실행 가능한 테스트
            * 성능 테스트를 위한 준비

    6. Activity 6. 테스트 실행
        - 테스트 실행, 모니터링
        - 테스트, 테스트 데이터, 결과물 검증
        - 입력
            * 실행 계획
            * 가용한 도구/환경
            * 가용한 어플리케이션 기능 또는 컴포넌트
            * 검증되고 실행 가능한 테스트
        - 출력
            * 테스트 실행 결과

    7. Activity 7. 결과 분석 및 테스트 재실행
        - 테스트 결과를 정리하고 공유함.
        - 결과 데이터를 개별적으로, 팀간 교차적으로 분석함.
        - 필요하다면 남은 테스트의 우선순위를 재배치하고, 다시 실행한다.
        - 모든 지표가 성능 한계 이내에 있고, 필요한 정보가 모두 수집되었다면 해당 환경에서의 시나리오는 테스트가 완료된 것임.
        - 입력
            * 실행 결과
            * 성능 허용 기준
            * 위험사항, 이슈 등등
        - 출력
            * 결과 분석
            * 권장사항
            * 보고서

2. Iteration process(이하 반복 프로세스) 기반 성능 테스트 구성
    - 개요
        - Agile Software Development, Extreme Programming(XP), Rational Unified Process(RUP) 등에서 보여지는 반복 프로세스 기반 성능 테스트에 대한 지침을 제공함.
    
    1. Activity 1. 프로젝트 비전과 맥락에 대한 이해
        - 프로젝트의 비전과 맥락을 이해하고 공유함.

    2. Activity 2. 성능을 테스트하는 것에 대한 이유 식별
        - 성능 테스트에 대한 이유를 명시적으로 식별함.

    3. Activity 3. 프로젝트에서 성능 테스트가 갖는 가치 식별
        - 프로젝트와 비즈니스 단계에서의 목표를 구체적이고, 식별 가능하고, 관리 가능한 성능테스트 활동으로 변환함.

    4. Activity 4. 테스트 환경 설정
        - 부하 생성 도구와 테스트를 수행할 시스템을 준비함.

    5. Activity 5. 태스크(작업) 식별 및 조정
        - 효율적이고 성공적인 태스크를 위해 지원, 자원, 일정의 우선순위를 정하고 조율함.

    6. Activity 6. 태스크 실행
        - 현재 반복 단계에서의 태스크를 실행함.

    7. Activity 7. 결과 분석 및 보고
        - 결과를 분석하고 팀에 공유함.

    8. Activity 8. Activity 1-3을 재시행하고 성능 허용 기준을 고려
        - 반복 단계 간에, 기반이 되는 정보는 바뀌지 않았다는 것을 보장해야 함.
        - 소비자의 피드백과 같은 새로운 정보를 반영하고, 필요하다면 전략을 수정할 것.

    9. Activity 9. 태스크 간 우선순위를 재설정
        - 테스트 결과, 새로운 정보, 기능과 컴포넌트의 가용성에 따라 태스크의 우선순위를 재설정하거나 삭제함.
        - 완료 후 Activity 5로 돌아감.

3. 애자일 성능 테스트 주기 관리
    - 개요
        - 어플리케이션의 성능 테스트를 관리하기 위한 애자일한 방법을 제공함.
        - 단어(Agile)에서 보이듯, 애자일에서의 핵심은 유연성임.
            - 유연성이 sloppiness(대충), 비효율적인 것을 의미하는 건 아님.
        - 애자일 환경에서도 효율적이고 싶다며 성능 테스트를 관리하는 데 사용했던 방법을 바꿔야 할 필요가 있음.

    - 반복 프로세스 기반 성능 테스트와 구성은 비슷함.

    1. Activity 1. 프로젝트 비전과 맥락에 대한 이해
    2. Activity 2. 성능을 테스트하는 것에 대한 이유 식별
    3. Activity 3. 프로젝트에서 성능 테스트가 갖는 가치 식별
    4. Activity 4. 테스트 환경 설정
    5. Activity 5. 태스크(작업) 식별 및 조정
    6. Activity 6. 태스크 실행
    7. Activity 7. 결과 분석 및 보고
    8. Activity 8. Activity 1-3을 재시행하고 성능 허용 기준을 고려
    9. Activity 9. 태스크 간 우선순위를 재설정
        
4. Regulated(CMMI) 환경에서의 성능 테스트 주기 관리
    - 개요
        - 오늘날의 소프트웨어 산업은, 그 복잡도와 시스템의 중요한 특성들 때문에 규제와 감독을 필요로 함.
        - Capability Maturity Model Integration(CMMI, 능력 성숙도 통합 모델)은 소프트웨어 개발 업체들의 업무능력평가 기준을 세우기 위한 평가 모델임.
        - CMMI 환경에서 성능 테스트의 핵심 활동을 제공함.
    
    - 1에서 설명한 웹 어플리케이션 성능 테스트 7단계에서 1, 3, 7번째 활동이 세분화되었음.

    1. Activity 1. 프로세스와 규정 준수 기준에 대한 이해
    2. Activity 2. 시스템과 프로젝트 계획에 대한 이해
    3. Activity 3. 성능 허용 기준 식별
    4. Activity 4. 성능 테스트 활동 계획
    5. Activity 5. 테스트 설계
    6. Activity 6. 테스트 환경 설정
    7. Activity 7. 테스트 구현
    8. Activity 8. 작업 항목 실행
    9. Activity 9. 결과 보고 및 데이터 보관
    10. Activity 10. 계획 수정 및 승인 요청
    11. Activity 11. Activity 5로 돌아가기
    12. Activity 12. 최종 보고서 준비