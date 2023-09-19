# 계층

<div>
<img src = https://blog.kakaocdn.net/dn/eaL2Af/btrsc1sdpBd/r3uMden94yJZ1X3GmvAyQK/img.png width=400% height=400%>

  #### **프레젠테이션 계층**
  HTTP 요청을 받고 요청을 비즈니스 계층으로 전송하는 역활
  1. 컨트롤러 : 클라이언트 HTTP요청을 처리하고, 비즈니스 로직이나 데이터 처리와 상호작용하기 위한 중간 역할을 하며 URL 경로와 연결되는 메스드를 작성하여 요청을 처리합니다.
  2. 컨트롤러는 데이터 모델을 준비하고 뷰에 전달합니다.
  3. 뷰 : 사용자에게 정보를 표시하는 역활을하며 동적인 HTML, JSON, XML 등을 생성하고 반환합니다.
  4. 모델 : 애플리케이션의 데이터와 비즈니스 로직을 다루며 데이터를 처리하고 가공하여 뷰에 전달합니다. 스프링부트는 `@Entity`와 `@Service`를 사용해 정의 관리합니다.


    프레젠테이션 계층  
    @RestController
    public class TestController {

      @Autowired
      TestService testService;

      @GetMapping("/test")
      public List<Member< getAllMembers() {
        List<Member> members = testService.getAllMembers();
        return members;
      }
    }

  #### **비즈니스 계층**<br>
   플리케이션에서 비즈니스 계층은 애플리케이션의 핵심 `비즈니스 로직`을 다루는 계층입니다. 데이터 처리, 비즈니스 규칙, 데이터베이스와의 상호작용 등 관련이 있습니다.<br>
     1. 서비스 클래스 : 핵심 서비스 클래스입니다. 서비스 클래스는 비즈니스 로직을 구현하고, 데이터처리, 데이터 유효성 검사, 계산, 데이터베이스 업데이트 등과 같은 작업을 수행하며 `@Service`를 사용
     2. 도메인 모델 : 도메인 모델을 정의하고 관리하며 애플리케이션의 핵심 데이터 구조와 엔티티를 나타내며, 데이터베이스와 연동됩니다.
     3. 트랜잭션 관리 : 트랜잭션 관리를 담당합니다. `@Transactional`을 springboot에서 사용하며 트랜잭셩을 정의 관리할수 있습니다.
     4. 비즈니스 규칙 : 애플리케이션의 비즈니스 규칙을 적용합니다.
     5. 서비스 인터페이스 : 서비스 클래스의 메서드는 서비스 인터페이스를 통해 정의됩니다. 컨트롤러나 다른 계층에서 비즈니스 로직에 접근할 수 있습니다.
  
  #### **비즈니스 로직**<br>
   어떤 소프트웨어 애플리케이션에서 특정 업무나 도메인에 관련된 중요한 처리 규칙 또는 계산 과정을 나타내는 부분을 의미 <br>

    비즈니스 계층
    @Service
    public class TestService {

      @Autowired
      MemberRepository memberRepository;

      public List<Member> getAllMembers() {
        return memberRespository.findAll();
        }
    }

  #### **퍼시스턴스 계층**
   모든 데이터베이스 관련 로직을 처리합니다. 데이터 베이스에 접근하는 DAO 객체를 사용할 수 있으며 DAO는 데이터베이스 계층과 상호작용하기 위한 객체입니다.

    퍼시스턴스 계층
     @ NoArgsConstructor(access = AccessLevel.PROTECTED) -- 
     @ AllArgsConstructor
     @ Getter
     @ Entity
     public class Member {
       @Id
       @GeneratedValue(strategy = GenerationType.IDENTITY)
       @Column(name = "id", updatable = false)
       private Long id;

       @Column(name = "name", nullable = flase)
       private String name;
    }



</div>
