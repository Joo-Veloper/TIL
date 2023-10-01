<div>

  #### 인덱스 생성
  ```
  직접 인덱스를 생성하려면 CREATE INDEX 문을 사용
  CREATE [UNIQUE] INDEX 인덱스_이름
  ON 테이블_이름 (열_이름) [ASC|DESC]
  ```

  #### 인덱스 제거
  ```
  DROP INDEX 인덱스_이름 ON 테이블_이름
  ```
  #### 단순 보조 인덱스 생성
  단순 보조 인덱스는 중복을 허용한다는 의미
  ```
  CREATE INDEX idx_member_addr
      ON member  (addr);
  ```
  #### ANALYZE TABLE
  관계형 데이터베이스 관리 시스템에서 사용되는 데이터베이스 유지보수 작업입니다. 이 명령어의 목적은 데이터베이스 테이블과 관련된 통계 및 메타 데이터를 업데이트 하는 것 입니다.
  ```
  ANALYZE TABLE member; -- member 테이블의 통계가 최신 정보로 업데이트합니다.
  SHOW TABLE STATUS LIKE 'member';
  ```

  #### 고유 보조 인덱스
  member 테이블에 대한 고유한 인덱스를 생성하는 명령어
  ```
  CREATE UNIQUE INDEX idx_member_mem_name -- CREATE UNIQUE INDEX가 고유한 인덱스 생성 하는것을 의미
      ON member (mem_name);
  ```

#### 인덱스를 효과적으로 사용하는 방법
- 인덱스는 열 단위에 생성됩니다.
- WHERE 절에서 사용되는 열에 인덱스를 만들어야 합니다.
- WHERE 절에 사용되더라도 자주 사용해야 가치가 있습니다.
- 데이터 중복이 높은 열은 인덱스를 만들어도 효과가 없습니다.
- 클러스터형 인덱스는 테이블당 하나만 생성 가능합니다.
- 사용하지 않는 인덱스는 제거합니다.
</div>
