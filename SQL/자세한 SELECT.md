# SELECT
<div>
 결과 정렬 : ORDER BY <br>
 결과의 개수를 제한 : LIMT <br>
 중복된 데이터를 제거 : DISTINCT <br>


ORDER BY 절

    SELECT 열_이름
        FROM 테이블_이름
        WHERE 조건식
        GROUP BY 열_이름
        HAVING 조건식
        ORDER BY 열_이름
        LIMIT 숫자

QUIZ<br>
debut_date 가 빠른 순서대로 출력 
(기본형)오름 차순 ASC<br>

    SELECT mem_id, mem_name, debut_date
      FROM member
      ORDER BY debut_date;

내림차순 DESC<br>

    SELECT mem_id, mem_name, debut_date
      FROM member
      ORDER BY debut_date DESC;

평균 키가 164이상인 회원들이 키가 큰 순서대로 출력

    SELECT mem_id, mem_name, debut_date, height
        FROM member
        WHERE height >= 164
        ORDER BY height DESC;

LIMT<br>
LIMT는 출력하는 개수를 제한
QUIZ<br>
회원테이블을 조회하는데 전체중 3건만 조회

    SELECT *
        FROM member
        LIMIT 3;

debut_date가 빠른 회원 3건만 추출 ORDE BY 사용

    SELECT mem_name, debut_date
        FROM member
        ORDER BY debut_date
        LIMIT 3;

평균키가 큰순으로 정렬하되, 3번째부터 2건만 조회

    SELECT mem_name, height
        FROM member
        ORDER BY height DESC
        LIMIT 3, 2;
DISTINCT<br>
QUIZ<br>
회원들의 지역을 출력

    SELECT addr FROM member;

중복된 데이터를 1개 남기고 제거

    SELECT DISTINCT addr FROM member;
GROUP BY 절
그룹을 묶어주는 역활

    SELECT 열_이름
        FROM 테이블_이름
        WHERE 조건식
        GROUP BY 열_이름
        HAVING 조건식
        ORDER BY 열_이름
        LIMIT 숫자  
집계함수 <br>
SUM = 합계 <br>
AVG = 평균 <br>
MIN = 최소값 <br>
MAX = 최대값 <br>
COUNT = 행의 개수를 셈 <br>
COUNT(DISTINCT) = 행의 개수를 셈 (중복은 1개만 인정) <br>

QUIZ <br>
회원별로 구매한 개수를 합쳐서 출력

    SELECT mem_id, SUM(amount) FROM buy GROUP BY mem_id;

회원별로 구매한 개수를 합쳐서 출력 (별칭 이용)

    SELECT mem_id "회원 아이디", SUM(amount) "총 구매 개수" FROM buy GROUP BY mem_id;

회원이 구매한 금액의 총합

    SELECT mem_id "회원 아이디", SUM(price*amount) " 총 구매 금액"
        FROM buy GROUP BY mem_id;

전체 회원이 구매한 물품 개수

    SELECT AVG(amount) "평균 구매 개수" FROM buy;
회원이 한 번 구매시 평균 몇 개를 구매했는 확인 (member_id)별로 구하며 GROUP BY절 사용

    SELECT mem_id, AVG(amount) "평균 구매 개수"
        FROM buy
        GROUP BY mem_id;

member에서 연락처가 있는 회원의 수를 카운트

    SELECT COUNT(*) FROM member;
    SELECT COUNT(phone1) "연락처가 있는 회원" FROM member;

HAVING 절<br>
QUIZ<br>
SUM()으로 회원별 총 구매액

    SELECT mem_id "회원 아이디", SUM(price*amount) "총 구매 금액"
        FROM buy
        GROP BY mem_id;

구매액이 1000이상인 회원에게만 사은품 증정
    
    SELECT mem_id "회원 아이디", SUM(price*amount) "총 구매 금액"
        FROM buy
        GROP BY mem_id
        WHERE SUM(price*amount) > 1000;


    
</div>
