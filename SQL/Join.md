# **Join**

<div>

  #### **내부조인**

  테이블 두개를 연결할때 가장 많이 사용하는 것이 내부 조인<br>
  조인은 3개 이상의 테이블로도 할 수 있지만 대부분 2개로 조인합니다.<br>
  두 테이블을 조인할 때, 두 테이블에 모두 지정한 열 데이터가 있어야 합니다.<br>

  **내부 조인 형식**
      
      SELECT <열 목록>
      FROM   <첫 테이블>
        INNER JOIN <두번째 테이블>
        ON  <조인될 조건>
      [WHERE 검색 조건]

  **내부 조인으로 이름 주소 연락처 검색 코드**

      SELECT * FROM buy
      INNER JOIN member
      ON buy.mem_id = member.mem_id
      WHERE buy.mem_id = 'GRL';

  **간결한 내부 조인**

      SELECT buy.mem_id, mem_name, prod_name, addr, CONCAT(phone1, phone2) '연락처'
        FROM BUY
          INNER JOIN member
          ON buy.mem_id = member.mem_id;

  #### 외부조인
  두 테이블을 조인할 때 필요한 내용이 한쪽 테이블에만 있어도 결과를 추출할 수 있습니다.

  **외부 조인 형식**

      SELECT <열목록?
      FROM <첫 번째 테이블 (LEFT 테이블)>
          <LEFT | RIGTH | FULL> OUTER JOIN <두번째 테이블(RIGHT 테이블)>
          ON <조인될 조건>
      [WHERE 검색 조건];

  **LEFT OUTER JOIN (왼쪽 테이블 출력)**

      SELECT M.mem_id, M.mem_name, B.prod_name, M.addr
          FROM member M
            LEFT OUTER JOIN buy B
            ON M.mem_id = B.mem_id
          ORDER BY M.mem_id;

  **RIGHT OUTER JOIN (오른쪽 테이블 출력)**

       SELECT M.mem_id, M.mem_name, B.prod_name, M.addr
          FROM member B
            RIGHT OUTER JOIN member M
            ON M.mem_id = B.mem_id
          ORDER BY M.mem_id;

  #### **상호 조인**
  한쪽 테이블의 모든 행과 다른 쪽 테이블의 모든 행을 조인<br>
  ON 구문 사용 불가<br>
  결과 내용은 의미가 없는 이유는 랜덤으로 조인됨<br>
  상호 조인의 주 용도는 테스트를 위해 대용량 데이터를 생성할때 사용<br>

  **예시**

      sakila , inventory테이블 개수의 곱
      SELECT COUNT(*) "데이터의 개수"
          FROM sakila.inventory
              CROSS JOIN world.city;

  
  #### **자체조인**
  자신이 자신과 조인하며 1개의 테이블만 사용<br>
  
  **형식**<br>
      
      SELECT <열목록>
      FROM  <테이블>
          INNER JOIN <테이블>
          ON <조인될 조건>
      [WHERE 검색 조건]

      
  **예시**
    A.emp, B.emp B.phone은 별칭 지정 의미 
  
      SELECT A.emp "직원", B.emp "직속상관", B.phone "연락처"
            FROM emp_table A
            INNER JOIN emp_table_B
            ON A.manager = B.emp
        WHERE A.emp = '경리부장';
       

</div>
