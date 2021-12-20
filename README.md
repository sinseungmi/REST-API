# REST-API

### 🔎 REST
> - ::HTTP에서 필요한 자원에 접근할 때 웹의 장점을 최대한 활용하기 위한 아키텍처
> - HTTP URI(Uniform Resource Identifier)를 통해 자원(Resource)을 명시하고, HTTP Method(POST, GET, PUT, DELETE)를 통해 해당 자원에 대한 CRUD Operation을 적용하는 것을 의미
> - 즉, REST는 자원 기반의 구조(ROA, Resource Oriented Architecture) 설계의 중심에 Resource가 있고 HTTP Method를 통해 Resource를 처리하도록 설계된 아키텍쳐를 의미
> - 웹 사이트의 이미지, 텍스트, DB 내용 등의 모든 자원에 고유한 ID인 HTTP URI를 부여한다
> - 전송 방식을 나타내는 method 속성의 값에 따라 리소스에 대한 추가 작업을 요청
> - REST는 Ajax 기능과 연동해서 주로 사용된다.
> - JSON(Javascript Object Notation), HTML, XML 또는 일반 텍스트를 통해 몇 가지 형식으로 전송
> - URL - 데이터마다 접근할 수 있는 고유의 URL이 존재해야한다
> <br>
> 
### REST API의 구성 요소 <br>
>   1. HTTP Method
>      - GET - 데이터 조회
>      - POST - 새로운 데이터 추가
>      - PUT - 데이터 전체 수정
>      - PATCH - 데이터 일부 수정
>      - DELETE - 정보 삭제
>   2. URL - 데이터 접근
>   3. Representation - 자원의 표현 
> <br>
>
> - @ResponseBody을 사용하면 데이터로 반환할 수 있다.
> - @PathVariable을 사용하면 요청 URL로 전달된 매개변수를 가져올 수 있다.
>  <br>
>  
> 1. 자원(Resource) : URL <br>
>        모든 자원에는 고유한 ID가 존재하게 되고, 이 자원은 Server에 존재한다. <br>
>        자원을 구별하는 ID는 HTTP URL로 구분하게 된다. (ex) /members/1 <br>
>     Client는 URL을 이용하여 자원을 지정하고 해당 자원에 대한 조작을 Server에 요청한다 <br>
> 2. 행위(Verb) : HTTP Method <br>
>     Client는 HTTP Method(POST, GET, DELETE, PUT)를 이용하여 지정한 자원에 대한 조작을 요청한다. <br>
> 3. 표현(Representation of Resource) <br>
>     Client가 Server에 자원에 대한 조작을 요청하면 Server는 이에 대한 적절한 응답(Representation)을 보낸다. <br>
> <br>
### REST API 설계 시 주의할 점 <br>
> * 슬래시 구분자(/)는 계층 관계를 나타낼 때 사용한다. <br>
> * URL 마지막 문자로 슬래시(/)를 포함하지 않는다. <br>
> * 하이픈(-)은 URL 가독성을 높이는데 이용한다. <br>
> * URL 경로에는 소문자가 적합하다. <br> 
> * 파일 확장자는 URL에 포함시키지 않는다. <br>
> 
> https://velog.io/@kjh107704/REST-%EC%84%9C%EB%B2%84-REST-API%EB%9E%80 (REST 설명 참고)
