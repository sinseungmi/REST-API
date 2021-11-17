# REST-API

### 🔎 REST
> - ::HTTP에서 필요한 자원에 접근할 때 웹의 장점을 최대한 활용하기 위한 아키텍처
> - 전송 방식을 나타내는 method 속성의 값에 따라 리소스에 대한 추가 작업을 요청
> - REST는 Ajax 기능과 연동해서 주로 사용된다.
> - JSON(Javascript Object Notation), HTML, XML 또는 일반 텍스트를 통해 몇 가지 형식으로 전송
> - URL - 데이터마다 접근할 수 있는 고유의 URL이 존재해야한다
> - Developer Console - API 사용 정보를 제공하고 키를 발급해줌(여러사이트)
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
