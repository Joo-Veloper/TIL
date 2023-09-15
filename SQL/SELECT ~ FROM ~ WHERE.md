# SELECT ~ FROM ~ WHERE

<div>

DB만들기

      DROP DATABASE IF EXISTS 'DB이름';
      CREATE DATABASE market_db;

DROP DATABASE = DB를 삭제하는 문장
CREATE DATABASE = 데이터베이스 만드는 문장

데이터 조회

      select * from member;
      select * from buy;


회원 테이블 (member)만들기

      USE db이름;
      CREATE TABLE member -- 회원 테이블 (member)
      ( mem_id       CHAR(8) NOT NULL PRIMARY KEY, --회원 아이디 (PK)
        mem_name     VARCHAR(10) NOT NULL, --이름
        mem_number   INT NOT NULL, --인원수
        addr         CHAR(2) NOT NULL, --주소
        phone1       CHAR(3), --연락처 국번
        phone2       CHAR(8), --연락처 나머지 전화번호
        height       SMALLINT, --평균 키
        debut_date   DATE -- 일자
      );

구매 테이블 (BUY) 만들기

      CREATE TABLE but -- 구매테이블
      (  num         INT AUTO_INCREMENT NOT NULL PRIMARY KEY, --순번
         mem_id      CHAR(8) NOT NULL, -- 아이디
         prod_name   CHAR(6) NOT NULL, -- 제품 이름
         group_name) CHAR(4),
         price       INT NOT NULL,
         amount      SMALLINT NOT NULL<
         FOREIGN KEY (mem_id) REFERENCE member(mem_id)
      );

INSERT 문

      INSERT INTO member VALUES('NJ' '뉴진스', 9,'서울', '02', '111111', 167, '2022.07.22');
회원 테이블에 값을 입력하며 CHAR, VARCHAR, DATE형은 작은따옴표롤 값을 묶어주며 INT형은 그냥 넣어주면 됩니다.

      INSERT INTO buy VALUES(NULL, 'BLK', '지갑', NULL, 30, 2);
구매테이블의 첫 번째 열인 순번은 자동으로 입력되므로 그 자리에 NULL이라고 쓰면 순차적으로 1,2,3으로 증가하면서 입력 되며 처음인 insert문은 1이라고 입력됩니다.

USE문

      USE 데이터베이스_이름;
use문은 실행하려면 사용할 데이터베이스를 지정해야 합니다. 

SELECT 문

      SELECT select_expr
        [FROM table_references]
        [WHERE where_condition]
        [GROUP BY {col_name | expr | position}]
        [HAVING where_condition]
        [ORDER BY {col_name | expr | position}]
        [LIMIT {[offset,] row_count | row_count OFFSET offset}]

핵심

        SELECT 열이름
          FROM 테이블 이름
          WHERE 조건식
          GROUP BY 열_이름
          HAVING 조건식
          ORDER BY 열_이름
          LIMIT 숫자
테이블에서 전체 열이 아닌 필요한 열만 가져올때

        SELECT * FROM member; -> member 테이블 나열
        SELECT mem_name FROM member; -> * 대신 mem_name 을 사용해서 member 테이블에서 mem_name 열만 이용
        SELECT addr, debut_date, mem_name FROM member; -> * 대신 addr, debut_date, mem_name 사용함으로 member 열에서 addr, debut_date, mem_name만 출력
열에 별칭 지정 가능

        SELECT addr 주소, date "날짜", mem_name FROM member; -> date의 이름을 날짜로 별칭 지정 가능

SELECT ~ FROM ~ WHERE

- WHERE 절

        * SELECT 열이름 FROM 테이블 이름 where 조건식;

        * SELECT 열이름
          FROM 테이블 이름
          WHERE 조건식;

  QUIZ<br/>
  where절을 사용해 mem_number가 4명인 결과 출력

        SELECT * FROM member WHERE mem_number = 4; -> 정수형 따옴표 x

- 관계 연산자, 논리 연산자</br>
  QUIZ<br/>
  평균 키가 162이하인 회원 검색

        SELECT mem_id, mem_name FROM member WHERE height <= 162;

  평균 키가 165 이상이면서 인원도 6명 초과인 회원 검색 (AND사용)

        SELECT mem_name, height, mem_number FROM member WHERE heigth <=165 AND mem_number > 6;
  평균 키가 165 이상이거나 인원이 6명 초과인 회원 검색 (OR 사용)

        SELECT mem_name, height, mem_number FROM member WHERE height >= 165 OR mem_number>6;

- BETWEEN ~ AND</br>
  QUIZ </br>
  AND를 사용해 평균 키 163~165인 회원 조회 (AND)

        SELECT mem_name, height FROM member WHERE height>=163 AND height <=165;
  
  AND를 사용해 평균 키 163~165인 회원 조회 (BETWEEN ~ AND)

        SELECT mem_name, height FROM member WHERE height BETWEEN 163 AND 165;

- IN</br>
  QUIZ </br>

  경기/전남/경남중 한 곳에 사는 회원 검색
  
        SELECT mem_name, addr FROM member WHERE addr = '경기' OR addr= '전남' OR addr= '경남';      
  IN() 사용
  
        SELECT mem_name, addr FROM member WHERE addr IN('경기','전남','경남'); -> 더 간결하게 작성 가능!!!!!!
        
- LIKE</br>
  QUIZ </br>
문자열 일부 글자 검색 할때 LIKE 사용
우로 시작하는 이름 검색

        SELECT * FROM member WHERE mem_name Like '우%';

한 글자와 매치 하기 위해서 _(언더바 사용)
__핑크인 회원 검색

        SELECT * FROM meber WHER mem_name LIKE '__핑크';

</div>
