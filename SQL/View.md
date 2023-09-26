<div>

  # View

  데이터 베이스 개체중 하나이며 테이블과 유사한 구조를 가지지만 실제 데이터를 저장하지 않는 가상 테이블이비낟. 뷰는 기존의 하나 이상의 테이블에서 데이터를 추출하거나 조합하여 사용자에게 쉽게 접근하고 데이터를 조회하는 데 사용됩니다.

  #### View 특징

  - 가상테이블 : 뷰는 데이터를 저장하지 않고 데이터베이스의 다른 테이블로부터 필요한 정보를 동적으로 생성합니다. 이로써 데이터 중복성을 줄이고 데이터 일관성을 유지할 수 있습니다.
  - 단순 쿼리화 : 복잡한 SQL 쿼리를 뷰를 사용하여 단순화할 수 있습니다. 특히 여러 테이블을 조인하거나 복잡한 필터링 또는 계산을 수행해야 할 때 유용합니다.
  - 데이터 보안 : 뷰를 통해 특정 사용자나 역할에 대한 데이터 접근을 제한할 수 있습니다. 사용자가 뷰만 접근하고 데이터베이스의 실제 테이블에 직접 접근하지 못하게 할 수 있습니다.

  #### view 기본 형식
    CREATE VIEW 뷰_이름
    AS
        SELECT 문;

    View 접근 형식
    SELECT 열_이름 FROM 뷰_이름
    WHERE 조건;


  #### View 작동 방식
  - 뷰 정의 : 뷰를 생성할 때 , 뷰 정의문에 따라 어떤 데이터를 포함할지를 정의합니다. 뷰는 하나 이상의 기존 테이블 또는 따른 뷰를 기반으로 만들어집니다. 정의된 뷰는 데이터베이스 스키마에 저장되지 않고 데이터베이스 내부에서 관리됩니다.
  - 실시간 데이터 추출 : 뷰 정의에 따라 데이터 베이스에서 데이터를 추출합니다. 추출하는 것은 실시간으로 이루어지며 뷰를 쿼리할 때마다 해당 데이터를 다시 생성합니다. 따라서 뷰의 내용은 기존 테이블의 데이터 변경에 따라 동적으로 변할 수 있습니다.
  - 쿼리 수행 : 뷰는 사용자가 요청한 데이터를 동작으로 생성하여 반환합니다. 쿼리는 뷰에 대한 SELECT 문과 유사하게 작성되며, 필요한 경우 JOIN , 그룹화 등을 사용하여 원하는 데이터를 추출할 수 있스빈다.

 #### view 생성 코드
    CREATE VIEW v_test1
    AS
          SELECT B.mem_id "ID", M.mem_name AS "Name",
            B.prod_name "Product Name',
                      CONCAT(M.phone1, M.phone2) AS "Office Phone"
            FROM buy B
                  INNER JOIN member M
                  ON B.mem_id = M.mem_id;

    SELECT DISTINCT `ID`,`name` FROM v_test1;   // 뷰를 사용할때 공백이 있을때는 ``(백틱) 사용!!
#### view  수정 코드
    ALTER VIEW v_test1 // ALTER VIEW를 사용하면  한글 사용 가능
    AS
        SELECT B.mem_id '아이디', M.mem_name AS '이름',
          B.prod_name "제품이름".
                    CONCAT(M.phone1, M.phone2) AS "번호"
          FROM buy B
              INNER JOIN member M
              ON B.mem_id = M.mem_id;
#### view 삭제 코드
    DROP VIEW v_test1;
#### View 정보확인
    CREATE OR PEPLACE VIEW v_viewtest2
    AS
          SELECT mem_id, mem_name, addr FROM member;
#### DESCRIBE 기본 뷰 정보 확인
    DESCRIBE v_test1;
#### SHOW CREATE VIEW 소스 코드 확인
    SHOW CREATE VIEW v_viewtest2;
#### 데이터 수정/ 삭제
    UPDATE v_member SET addr = '서울' WHERE id ='gs';
    DELETE FROM v_member SET addr = '서울'
#### 참조하는 테이블의 삭제
    DROP TABLE IF EXISTS buy, member;
              

              
</div>
