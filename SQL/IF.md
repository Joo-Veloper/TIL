# **IF**

<div>

  **기본 IF**
  
      IF <조건> THEN
          SQL 문장
      END IF;

  **BEGIN ~ END**

      DROP PROCECURE IF EXISTS ifProc1; -- ifProc1()을 만든 적이 있다면 삭제
      DELIMITER $$  -- ;으로 SQL의 끝읹, 스토어드 포르시저의 끝인지 구별할 수 없어서 $$를 사용
      CREATE PROCEDURE ifProc1() -- 프로시저 이름 ifProc1()
      BEGIN
          IF 100 = 100 THEN
              SELECT `100은 100과 같습니다.`;
            END IF;
          END $$ -- 100과 100이 같은지 비교했습니다.
          DELIMITER ;
          CALL ifProc1(); --CALL로 호출하면 ifProc1이 실행

  **IF ~ ELSE**

      DROP PROCEDURE IF EXISTS if Proc2;
      DELIMITER $$
      CREATE PROCEDURE ifProc2()
      BEGIN
        DECLARE myNum INT;
        SET myNum = 200;
        IF myNum = 100 THEN
          SELECT `100입니다.`;
        ELSE
          SELECT `100이 아닙니다.`;
        END IF;
      END $$
      DELIMITER;
      CALL ifProc2();

  **CASE** (다른  프로그래밍 언어 SWITCH ~ CASE와 비슷)

      CASE
          WHEN 조건1  THEN
            SQL 문장1
          WHEN 조건2  THEN
            SQL 문장2
          WHEN  조건3  THEN
            SQL 문장3
          ELSE
            SQL 문장4
      END CASE;


      시험 점수 출력 예
      DROP PROCEDURE IF EXISTS caseProc;
      DELIMITER $$
      CREATE PROCEDURE caseProc()
      BEGIN
          DECLARE poin INT;
          DECLARE credit CHAR(1);
          SET point = 88;

          CASE
            WHEN point >= 90 THEN
                SET credit = 'A';
            WHEN point >= 80 THEN
                SET credit = 'B';
            WHEN point >= 70 THEN
                SET credit = 'C';
            WHEN point >= 60 THEN
                SET credit = 'D';
            ELSE
                SET credit = 'F';
          END CASE;
          SELECT CONCAT('취득점수 ==>', point), CONCAT('학점 ==>',credit);
      END $$
      DELIMITER;
      CALL caseProc();

  **CASE 활용**

      SELECT mem_id, SUM(price*amount) "총구매액"
        FROM buy
        GROP BY mem_id
        ORDER BY SUM(price*amount) DESC;

  회원 이름 출력 하지만 회원테이블과 구매 테이블 조인

      SELECT B.mem_id, M.mem_name,
            SUM(price*amount) "총 구매액"
        FROM buy B
            INNER JOIN member M
            ON B.mem_id= M.mem_id
        GROUP BY B.mem_id
        ORDER BY SUM(price*amount) DESC;

  **WHILE문**

      WHILE <조건식> DO
          SQL 문장들
      END WHILE;

  1~100까지 값을 더하는 WHILE

      DROP PROCEDURE IF EXISTS whileProc;
      DELIMITER $$
      CREATE PROCEDURE whileProc()
      BEGIN
        DECLARE i INT;
        DECLARE hap INT;
        SET i = 1;
        SET hap = 0;

        WHILE (i<=100) DO
          SET hap = hap + i;
          SET i = i + 1;
        END WHILE;
          SELECT '1부 100까지의 합 ==>', hap;
        END $$
        DELIMITER ;
        CALL whileProc();
</div>
