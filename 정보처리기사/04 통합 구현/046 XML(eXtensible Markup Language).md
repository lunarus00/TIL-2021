# 046 XML(eXtensible Markup Language)

## 1 XML의 개요

- XML은 웹브라우저 간 HTML 문법이 호환되지 않는 문제와 SGML의 복잡함을 해결하기 위하여 개발된 다목적 마크업 언어이다
- 다른 목적의 마크업 언어를 만드는데 사용된다
- 유니코드를 기반으로 다국어를 지원한다
- 텍스트 형식의 데이터 포맷으로 다양한 플랫폼과 시스템에서 활용할 수 있다
- 사용자가 직접 문서의 태그를 정의할 수 있으며, 다른 사용자가 정의한 태그를 사용할 수 있다
- 트리 구조로 구성되어 있어 상위 태그는 여러 개의 하위 태그를 가질 수 있다
- 모든 태그는 종료 태그를 가져야 하며, 시작 태그와 종료 태그의 요소명은 동일해야 한다
- 속성값은 반드시 큰따옴표("")로 묶어줘야 한다
- 대소문자를 구분한다



## 2 XML의 구성

- XML의 첫 문단
  - `<?xml version="버전" encoding="언어셋" standalone="yes|no"?>`
  - XML 문서임을 알리는 문단으로 반드시 포함되어야 한다
  - `<?, ?>` : 태그는 기본적으로 `< >`를 사용하지만, 문서의 첫 문단은 '?' 기호를 포함한다
  - version : XML 문서에 사용된 XML의 버전을 명시한다
  - encoding : XML의 언어셋(Character Set)을 명시한다. 생략이 가능하며, 생략할 경우 기본값은 UTF-8 이다
  - standalone : XML 문서를 해석할 때 외부 문서의 참조 여부를 명시한다. 생략이 가능하며, 생략할 경우 기본값은 no로 외부 문서를 참조한다는 의미이다
- XML 요소(Element)의 구성
  - `<요소이름 속성1="속성값1" 속성2="속성값2" ... > 내용 </요소이름>`
  - 요소이름 : 요소의 이름으로, 사용자가 임의로 지정할 수 있다
  - 속성 = "속성값" : 요소와 관련된 속성(Attribute)과 속성값으로, 생략이 가능하다
  - 내용 : 요소의 내용으로, 생략이 가능하다



## 3 SOAP(Simple Object Access Protocol)

- SOAP는 컴퓨터 네트워크 상에서 HTTP/HTTPS, SMTP 등일 이용하여 XML을 교환하기 위한 통신 규약이다
- 웹 서비스에서 사용되는 메시지의 형식과 처리 방법을 지정한다
- 기본적으로 HTTP 기반에서 동작하기 때문에 프록시와 방화벽의 영향 없이 통신이 가능하다
- XML과 동일한 텍스트 형식의 데이터 포맷으로 다양한 플랫폼과 시스템에서 활용할 수 있다
- 최근에는 무거운 구조의 SOAP 대신 RESTful 프로토콜을 이용하기도 한다
- SOAP의 주요 요소
  - Envelope
    - XML 문서를 SOAP 메시지로 정의하는 것으로, 메시지에 대한 요소와 접근방법을 정의한다
  - Header
    - SOAP 메시지에 포함되는 웹 서비스를 정의하는 것으로, 생략이 가능하다
  - Body
    - 실제 SOAP 메시지가 포함된다



## 4 WSDL(Web Services Description Language)

- WSDL은 웹 서비스와 관련된 서식이나 프로토콜 등을 표준적인 방법으로 기술하고 게시하기 위한 언어이다

- XML로 작성되며, UDDI의 기초가 된다

- SOAP, XML 스키마와 결합하여 인터넷에서 웹 서비스를 제공하기 위해 사용된다

- 클라이언트는 WSDL 파일을 읽어 서버에서 어떠한 조작이 가능한지를 파악할 수 있다

- 주로 사용되는 버전에는 1.1과 2.0이 있으며, 버전마다 요소들의 명칭이 서로 달라 작성에 주의해야 한다

- WSDL의 주요 요소

  - | V1.1      | V2.0      | 설명                                               |
    | :-------- | :-------- | :------------------------------------------------- |
    | types     | types     | 자료형(Data Type)을 정의한다                       |
    | message   | 삭제      | 메소드의 인수와 리턴값 등을 정의한다               |
    | portType  | interface | operation을 통해 웹 서비스의 인터페이스를 정의한다 |
    | operation | operation | 메소드의 요청 및 응답 메시지를 정의한다            |
    | binding   | binding   | 웹 서비스를 이용할 때 사용할 통신 방법을 정의한다  |
    | service   | service   | port/endpoint를 통해 웹 서비스를 정의한다          |
    | port      | endpoint  | 웹 서비스의 URL과 binding을 연결한다               |



